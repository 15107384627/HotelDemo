package com.tsl.controller;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.tsl.config.Config;
import com.tsl.dao.GestroomDao;
import com.tsl.dao.UserDao;
import com.tsl.daoimpl.GestroomDaoImpl;
import com.tsl.daoimpl.UserDaoImpl;
import com.tsl.mapper.GestroomMapper;
import com.tsl.po.GestroomPo;
import com.tsl.po.UserPo;
import com.tsl.utils.FileUtil;

@Controller
@RequestMapping(value="/gestroom")
public class GestroomController {
	
	@Autowired
	private GestroomMapper gestroomMapper;
	
	@RequestMapping(value="/info")
	public String info(Map<String, Object> map,String gr_num) {
		GestroomPo gestroom=new GestroomPo();
		gestroom.setGr_num(gr_num);
		List<GestroomPo> gestrooms=gestroomMapper.findAllGestroom(gestroom);
		System.out.println(gestrooms.toString());
		map.put("gestrooms", gestrooms);
		return "gestroomInfo";
	}
	
	@RequestMapping(value="/add")
	public String add() {
		return "gestroomAdd";
	}
	
	@RequestMapping(value="/gestroomAdd")
	@ResponseBody
	public boolean gestroomAdd(HttpServletRequest request ,String gr_num,String gr_name,String gr_des,float gr_price,@RequestParam("gr_img")List<MultipartFile> uploadfile) {
		
		String gr_img=Config.updateImg+uploadfile.get(0).getOriginalFilename();
		GestroomPo gestroom=new GestroomPo(gr_num,gr_name,gr_des,gr_img,gr_price);
		//把图片路径改成图片名字
//		gestroom.setGr_img(gestroom.getGr_img().substring(gestroom.getGr_img().lastIndexOf("\\")+1));
//		System.out.println("+"+gestroom.toString());
		
		List<GestroomPo> gestrooms=gestroomMapper.findGestroomIsRepeat(gestroom);
		if(gestrooms.size()<=0&&!uploadfile.isEmpty() && uploadfile.size() > 0) {
			//添加图片
//			String dirPath = "E:\\Program\\TSLHotelDemo\\WebContent\\public\\data\\img\\";
			
			//虚拟空间
			String dirPath = request.getServletContext().getRealPath(Config.updateImg);
			System.out.println(dirPath);
			int i = FileUtil.fileUpload(uploadfile, dirPath);
			System.out.println("虚拟空间=============="+i);

			//本地
			String dirPath2 = "E:\\Program\\TSLHotelDemo\\WebContent\\public\\data\\img\\";
			i = FileUtil.fileUpload(uploadfile, dirPath2);
			System.out.println("本地=============="+i);
			
			i=gestroomMapper.addOneGestroom(gestroom);
			System.out.println("添加了"+i+"条数据");
			return true;
		}
		return false;
	}
	
	@RequestMapping(value="/gestroomDel")
	@ResponseBody
	public boolean delete(GestroomPo gestroom) {
		if(gestroom!=null&&gestroom.getId()!=0) {
			int i=gestroomMapper.deleteOneGestroom(gestroom.getId());
			System.out.println("删除了"+i+"条数据");
		}
		return true;
	}
}
