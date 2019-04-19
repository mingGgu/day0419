package day0419;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

public class WordCount03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = args[0];
		File file = new File(fname);
		try {
			
			FileInputStream fis = new FileInputStream(fname);
			byte[] bytesArray = new byte[(int)file.length()];
			fis.read(bytesArray);
			String s = new String(bytesArray);
			HashMap ts = new HashMap();
			
			String [] tokens = s.split(" ");
			
		for (int i = 0; i <tokens.length; i++)
		{
			int count = 1;
			if(ts.get(tokens[i])!= null)
			{
				count = (int)ts.get(tokens[i])+1;
			}
			ts.put(tokens[i],count);
		}
		System.out.println("단어 : "+ts);
		System.out.println("총 단어수 : "+ts.size());
		}catch(Exception e) {
		}
	}
}
