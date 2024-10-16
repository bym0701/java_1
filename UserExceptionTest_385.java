package ¹ÚÀ¯¹Î;

import java.io.*;
import java.util.*;

public class UserExceptionTest_385 {
	public static void main(String[] args) throws IOException {
		try {
			File in = new File("test.txt");
			Scanner sc = new Scanner(in);
			int i = sc.nextInt();
			String s = sc.next();
			System.out.println(i + ", " + s);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
