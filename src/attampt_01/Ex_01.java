package attampt_01;

import java.util.Scanner;

public class Ex_01 {

	public void initVariable() {
		//변수 선언과 동시에 초기화
		
		//논리형 : 1byte
		//2단어 이상의 변수명 : 낙타등 표기법사용
		 boolean isTrue = true;
		 boolean isFalse = false;
		 
		 //문자 : 2byte
		 char ch = 'a'; //''싱글 쿼테이션 사용
		 
		 //문자열 : 참조형(주소값을 저장하고 그것을 사용)
		 String str = "안녕하세요.";
		 
		 //숫자형
		 //정수
		 byte bnum = 1; // 1byte
		 short snum = 2; // 2byte
		 int inum = 4; // 4byte
		 long lnum = 8L; // 8byte
		 
		 //실수
		 float fnum = 4.0f; // 4byte
		 double dnum = 8.0; // 8byte
		 
		 //변수에 저장된 값 출력하기
		 System.out.println("isTrue의 값 : " + isTrue);
		 System.out.println("isFalse의 값 : " + isFalse);
		 System.out.println("ch의 값 : " + ch);
		 System.out.println("str의 값 : " + str);
		 System.out.println("bnum의 값 : " + bnum);
		 System.out.println("snum의 값 : " + snum);
		 System.out.println("inum의 값 : " + inum);
		 System.out.println("lnum의 값 : " + lnum);
		 System.out.println("fnum의 값 : " + fnum);
		 System.out.println("dnum의 값 : " + dnum);

	}
	public void changeValue() {
		//변수값 변경 테스트
		String name;
		char gender;
		int age;
		double height;
		
		name = "김영희";
		gender = 'F';
		age = 20;
		height = 171.5;
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		//키보드로 값을 입력받아 변수에 저장된 값을 변경
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요.");
		name = scan.nextLine();
		System.out.print("성별을 입력하세요.");
		gender = scan.next().charAt(0); //문자를 읽어오는 메소드는 제공하지 않기 때문에 첫번째 문자를 가져오는 charAt을 이용한다.
		System.out.print("나이를 입력하세요.");
		age = scan.nextInt();
		System.out.print("키를 입력하세요.");
		height = scan.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		scan.close();
		
		
	}

}
