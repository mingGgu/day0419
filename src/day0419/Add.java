package day0419;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int r = a+b;
		System.out.println("결과: "+r);
		}catch(Exception e){
			System.out.println("두개의 변수를 확인해 주세요");
		}finally {
			System.out.println("작업종료");
		}
	}
}
