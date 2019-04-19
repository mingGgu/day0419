package day0419;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceFname = args[0];
		String targetFname = args[1];
		try {
		BufferedReader br = new BufferedReader(new FileReader(sourceFname));
		BufferedWriter bw = new BufferedWriter(new FileWriter(targetFname));
		
		String lineData;
		while((lineData = br.readLine())!= null)
		{
			bw.write(lineData);
		}
		br.close();
		bw.close();
		System.out.print("파일복사됨");
		}catch(Exception e) {
		}
	}
}