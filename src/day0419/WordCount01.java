package day0419;

import java.io.File;
import java.io.FileInputStream;

public class WordCount01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = args[0];
		File file = new File(fname);
		try {
			int count = 0;
			FileInputStream fis = new FileInputStream(file);
			byte[] bytesArray = new byte[(int)file.length()];
			fis.read(bytesArray);
			String s = new String(bytesArray);
			String [] data = s.split(" ");
		for(int i = 0; i < data.length; i++)
		{
			count++;
		}
		System.out.print("모든 단어의 수는 ==> "+count);
		}catch(Exception e) {
		
		}
	}
}
