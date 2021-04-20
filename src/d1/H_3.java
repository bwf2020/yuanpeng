package d1;

import java.io.File;

public class H_3{
	
	public static void deleteFiles(File file) {
	 //判断此文件是否存在
	 if(file.exists()) {
		 //判断是否是文件夹
		 if(file.isDirectory()) {
			 
			 File[] files = file.listFiles();
			 //判断文件夹里面是否有文件
			 if(files.length >= 1) {
				 for (File file2 : files) {
					if(file2.isFile()) {
						//判断是文件就直接删除
						file2.delete();
					}else {
						//是文件夹就继续递归删除
						deleteFiles(file2);
					}
				}
				 //此时文件夹为空 直接删除
				 file.delete();
			 }else {
				 file.delete();
			 }
			 
		 }else {
			 //不是文件夹  而是文件 直接删除
			 file.delete();
		 }
	 }else {
		 //文件不存在
		 System.out.println("文件不存在");
	 }
 }
	public static void main(String[] args){
	 File file = new File("c:/file");
	 deleteFiles(file);
	 }
 }



