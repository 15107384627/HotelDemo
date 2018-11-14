package com.tsl.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.tsl.utils.FileUtil;

@Controller
@RequestMapping(value = "/file")
public class FileController {

	@RequestMapping(value = "/fileUpload")
	@ResponseBody
	public boolean fileUpload(HttpServletRequest request,String gr_num,String gr_name,String gr_des,float gr_price, @RequestParam("gr_img")MultipartFile uploadfile) {
		System.out.println(gr_num);
		System.out.println("==============="+uploadfile.getName());
		/*if (!uploadfile.isEmpty() && uploadfile.size() > 0) {
			String dirPath = "E:\\Program\\Hohel\\WebContent\\public\\data\\img";
			int i = FileUtil.fileUpload(uploadfile, dirPath);
			System.out.println("=============="+i);
			if(i>0) {
				return true;
			}else {
				return false;
			}
		}*/
		return false;
	}
}
