package attampt_02;

public class Ex_01 {

	public static void main(String[] args) {
		// 정수, 실수, 문자, 문자열, 논리형 변수를 각각 선언하고, 아래의
		// 값으로 초기화한 후 그  값을 출력하고, 변수의 값을 변경하여 변경한
		// 값을 출력하는 코드를 작성하시오.
		
		/*
		 * 초기화 후 : 100, 234.567, A, Hello World, true
		 * 값 변경 후 : 10000, 567.123456789, B, Welcome to JAVA, false
		 */
		int inum = 100; double dnum = 234.567; char ch = 'A'; String str = "Hello World"; boolean bool = true;
		System.out.println("초기화 한 후: " + inum + ", " + dnum + ", " + ch + ", " + str + ", " + bool);
		inum = 10000; dnum = 567.123456789; ch = 'B'; str = "Welcome to JAVA"; bool = false;
		System.out.println("값 변경 후: " + inum + ", " + dnum + ", " + ch + ", " + str + ", " + bool);
	}

}
