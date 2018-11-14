package com.tsl.utils;

import java.io.File;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {

	private static int i=0;
	public static int fileUpload(List<MultipartFile> files,String dirPath) {
		
		for(MultipartFile file:files) {
			String filename=file.getOriginalFilename();
//			dirPath="E:/";
//			String dirPath=request.getServletContext().getRealPath("/WebContent/public/images/");
			File filePath =new File(dirPath);
			if(!filePath.exists()) {
				filePath.mkdirs();
			}
			try {
				file.transferTo(new File(dirPath+filename));
				System.out.println(dirPath+filename);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			i++;
		}
		return i;
	}
}
