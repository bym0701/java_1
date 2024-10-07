package ¹ÚÀ¯¹Î;

import java.io.FileInputStream;
import java.io.*;

public class ExceptionDemo_307 {
	public static void main(String[] args) {
		/*
		FileInputStream fis = null;
		fis = new FileInputStream("C:/test.txt");
		
		int c;
		while((c = fis.read()) != -1) {
			System.out.println((char)c);
		}
		
		fis.close(); */
		try {
			FileInputStream fis = null;
			fis = new FileInputStream("C:/test.txt");
			
			int c;
			while((c = fis.read()) != -1) {
				System.out.println((char)c);
			}
			fis.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("The specified file is not present at the given path");
		}
		catch(IOException e) {
			System.out.println("I/O error occure: " + e);
		}
	}
}
