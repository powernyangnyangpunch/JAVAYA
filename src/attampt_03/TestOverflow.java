package attampt_03;

public class TestOverflow {

	public static void main(String[] args) {
		//데이터 오버플로우 테스트
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
		
		//byte bnum = 128; // 저장가능범위를 벗어나므로 에러 발생
		
		byte bnum = 127;
		bnum += 1;
		System.out.println("byte의 최대값 + 1 = " + bnum);
		
		bnum = -128;
		bnum -= 1;
		System.out.println("byte의 최소값 - 1 = " + bnum);
		
		int num1 = 100000;
		int num2 = 30000;
	
		int result = num1 * num2;
		System.out.println("result의 값 = " + result);
		//int의 저장 가능범위는  약 21억이므로 30억이라는 값을 대입하면 오버플로우 발생
		
		long result1 = (long)num1 * num2; //강제형변환
		System.out.println("result1의 값 = " + result1);
	}

}
