package 박유민;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProgramBasic_360 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			boolean b = false;
			double d = 165.8;
			String str = "This is a test";
			
			dos.writeBoolean(b);
			dos.writeDouble(d);
			dos.writeChars(str);
			
			dos.close();
			System.out.println("성공적으로 쓰기를 마쳤습니다.");
			
			FileInputStream fis = new FileInputStream("test.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			boolean b2 = dis.readBoolean();
			System.out.println(b2);
			double d2 = dis.readDouble();
			System.out.println(d2);
			char c;
			while(dis.available() > 0) {
				c = dis.readChar();
				System.out.println(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

