package day0419;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;

public class WordCount04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//$ java day0419.WordCount04 news.txt
		// 터미널에 위 처럼 작성하는데 끝에 news.txt는 args에 담기는 것. 
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
			//count를 for문 밖에서 초기화 시키면 for문 안에서는 새 단어가 와도 더해진 count에 계속 더하게된다. 
			int count = 1;
			if(ts.get(tokens[i])!= null)
			{
				//key값인 ts.get(token[i]) 를 호출하면 key의 value값인 count가 출력됨
				// count는 위에서 제네릭을 안넣어줬기때문에 형변환(int)를 해줘야함.정
				// 만약 위에서 HashMap<String, Integer> 라고 제네릭을 설정해준다고하면
				// 형변환을 해주지 않아도 된다.
				
				//그리고 count는 for문 위에서 초기화 되지만 if문을 타면 key값의 value인 count가 count로 들어가기때문에
				//key값에 들어있던 count에 1을 더하는 샘이 되는것.
				count = (int)ts.get(tokens[i])+1;
			}
			ts.put(tokens[i],count);
		}
		//System.out.println("단어 : "+ts);
		Iterator keys = ts.keySet().iterator();
		while(keys.hasNext())
		{
			String key = (String)keys.next();
			Integer value = (int)ts.get(key);
			System.out.println(key + "\t" +value);
		}
		System.out.println("총 단어수 : "+ts.size());
		}catch(Exception e) {
		}
	}
}
