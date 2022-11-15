package attampt_02;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		/*
		 * 키보드로 원의 반지름(5)값을 정수형으로 입력 받고 
		 * 원의 둘레와 면적을 계산하여 소수점 이하 1자리까지만 출력하는
		 * 코드를 작성하시오.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("원의 반지름을 입력해주세요.");
		int num = scan.nextInt();
		System.out.println("원의 둘레 = " + 2 * num * 3.14);
		System.out.println("원의 면적 = " + num * num * 3.14);
		double pi = 3.14;
		
		/*
		 * 출력메소드 System.out.printf("%형식, 변수등);
		 * ->정해져 있는 형식에 맞춰서 그 형식에 맞는 값(변수)을 줄바꿈 하지 않고 출력
		 * %d -> 정수형, %c -> 문자, %s -> 문자열, %f -> 실수, %b -> 논리형
		 * %o -> 8진수, %x -> 10진수, %A -> 16진수 실수
		 * %5d: 5칸을 확보하고 오른쪽 정렬
		 * %-5d: 5칸을 확보하고 왼쪽 정렬
		 * %.2f: 소수점 아래 2자리까지만 표시 
		 */
		System.out.printf("원의 반지름이%5d인 원의 둘레 = %.1f\n", num, 2*num*pi);
		System.out.printf("원의 반지름이%-5d인 원의 면적 = %.1f\n", num, num*num*pi);
		scan.close();

	}

}
