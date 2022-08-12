package com.lowz.study.algorithms.file;

	import java.io.*;

public class DocGhiFile {
	public static void main(String[] args) throws IOException {
		File file = new File("text.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		int c = fileInputStream.read();
		while (c != -1) {
			System.out.print((char)c);
			c = fileInputStream.read();
		}
		fileInputStream.close();
		
		
		//Ghi du lieu vao file
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		String s = "hello";
		fileOutputStream.write(s.getBytes());
		fileOutputStream.close();
	}
}
