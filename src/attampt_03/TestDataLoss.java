package attampt_03;

public class TestDataLoss {

	public static void main(String[] args) {
		//데이터 손실 테스트
		
		//정수 -> 실수 : 자동 형변환
		long lnum = 100;
		float fnum = lnum;
		System.out.println("fnum : " + fnum);
		
		//실수 -> 정수 : 강제 형변환
		//소수점이하를 절삭하기때문에 데이터 손실이 발생함
		double dnum = 10.5;
		int inum = (int)dnum;
		System.out.println("inum : " + inum);
		
		int num = 290;
		System.out.println("num : " + num);
		byte bnum = (byte)num;
		System.out.println("bnum : " + bnum);

	}

}
