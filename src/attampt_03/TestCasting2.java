package attampt_03;

public class TestCasting2 {

	public static void main(String[] args) {
		//int와 long의 연산
		int inum = 4;
		long lnum = 8L;
		
		//1. int의 결과
		int isum  = (int)(inum + lnum); //롱에서 인트로 8바이트 > 4바이트로 내려갈때는 강제 형변환
		isum = inum + (int)lnum;
		System.out.println("isum : " + isum);
		
		//2. long의 결과
		long lsum = inum + lnum; //인트에서 롱으로 4바이트 > 8바이트로 올라갈때는 자동 형변환
		System.out.println("lsum : " + lsum);
		
		//byte, short의 연산 결과: int
		byte bnum = 1;
		short snum = 2;
		int sum1 = bnum + snum;
		System.out.println("sum1 : " + sum1);
		
		//byte와 short의 값을 얻기 위해서는 강제 형변환
		short sum2 = (short)(bnum + snum);
		System.out.println("sum2 : " + sum2);

	}

}
