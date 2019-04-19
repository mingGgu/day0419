package day0419;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
		File file = new File("/home/hadoop/javatest/day0419/bin/news.txt");
		input = new FileInputStream(file);
		output = new FileOutputStream(new File("/home/hadoop/javatest/day0419/bin/r.txt"));
		int a = 0;
		byte[] buffer = new byte[1000];
		while((a = input.read(buffer))!= -1)
		{
			output.write(buffer, 0,a);			
		}
		input.close();
		output.close();
		}catch(Exception e) {
		}
	}
}
