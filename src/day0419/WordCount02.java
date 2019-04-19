package day0419;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;

public class WordCount02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = args[0];
		File file = new File(fname);
		try {
			int count = 0;
			FileInputStream fis = new FileInputStream(fname);
			byte[] bytesArray = new byte[(int)file.length()];
			fis.read(bytesArray);
			String s = new String(bytesArray);
			HashSet ts = new HashSet();
			String [] tokens = s.split(" ");
		for (int i = 0; i <tokens.length; i++)
		{
			ts.add(tokens[i]);
		}
		System.out.println("단어 : "+ts);
		System.out.println("단어의 개수 : "+ts.size());
		}catch(Exception e) {
			
		}
	}
}
