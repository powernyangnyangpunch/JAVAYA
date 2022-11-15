package attampt_03;

import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		/*
		 * 실습문제
		 * 학생들의 신장 평균을 조사하려고 한다. 
		 * 세 명의 학생의 키를 실수형으로 입력 받아 키의 평균을 정수형으로 출력하시오.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생들의 신장을 입력해주세요.");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		int average = (int)(a + b + c)/3;
		System.out.println("a와 b와 c의 평균값은 : " + average);
		
		/*
		 * 실습문제2
		 * 키보드로 길이가 5인 문자열을 입력받아 각각의 문자의 유니코드를 출력하시오
		 */
		System.out.println("문자를 입력해주세요.");
		String str = scan.nextLine();
		char ch0 = str.charAt(0);
		char ch1 = str.charAt(1);
		char ch2 = str.charAt(2);
		char ch3 = str.charAt(3);
		char ch4 = str.charAt(4);
		int str0 = ch0; int str1 = ch1; int  str2 = ch2; int str3 = ch3; int str4 = ch4;
		System.out.println(str0 + ", " + str1 + ", " + str2 + ", " + str3 + ", " + str4);
		
		scan.close();

	}

}
