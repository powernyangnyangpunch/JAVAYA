package attampt_03;

import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		
	
		 /* 실습문제2
		 * 키보드로 길이가 5인 문자열을 입력받아 각각의 문자의 유니코드를 출력하시오
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요.");
		String str = scan.nextLine();
		char ch0 = str.charAt(0);
		char ch1 = str.charAt(1);
		char ch2 = str.charAt(2);
		char ch3 = str.charAt(3);
		char ch4 = str.charAt(4);
		int str0 = ch0; int str1 = ch1; int  str2 = ch2; int str3 = ch3; int str4 = ch4;
		System.out.println(str0 + ", " + str1 + ", " + str2 + ", " + str3 + ", " + str4);
		
		System.out.println();
		
		System.out.println(str.charAt(0) + " : " + (int)str.charAt(0));
		System.out.println(str.charAt(1) + " : " + (int)str.charAt(1));
		System.out.println(str.charAt(2) + " : " + (int)str.charAt(2));
		System.out.println(str.charAt(3) + " : " + (int)str.charAt(3));
		System.out.println(str.charAt(4) + " : " + (int)str.charAt(4));
		
		scan.close();

	}

}
