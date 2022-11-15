package attampt_03;

public class TestCasting {

	public static void main(String[] args) {
		/*
		 * 컴퓨터의 값 처리원칙
		 * 1.같은 종류의 자료형만 대입 가능
		 * 2.같은 종류의 자료형만 계산 가능
		 * 3.계산의 결과도 같은 종류의 값이 나와야함
		 * 
		 * 자동 형변환 > 컴파일러가 자동으로 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환
		 * byte > short, char > int > long > float > double
		 * 단, byte와 short 자료형 값의 계산결과는 무조건 int로 처리한다. short와 byte의 결과값을 얻기 위해선 강제 형변환 필요.
		 */
		boolean bool = true;
		//bool = 1; 형변환불가
	
		//char -> int : 자동 형변환
		int num = 'A';
		System.out.println("num : " + num);
		
		//char에 정수값 저장 가능(숫자에 해당하는 유니코드 문자)
		char ch = 66;
		System.out.println("ch : " + ch);
		//ch = -66; 음수는 불가능
		
		//int -> char : 강제 형변환
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);

	}

}
