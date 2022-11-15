package attampt_04;

public class Operator {

	public static void main(String[] args) {
		//증감 연산자 연습하기
		int a = 5;
		int b = 10;
		
		
		int c = (++a) + b; // a:6, b:10, c:16
		int d = c / a; // d:2
		int e = c % a; // e:4
		int f = e++; // f:4, e:5
		int g = (--b) + (d--); // b:9, g:11, d:1
		int h = 2; 
		h *= e; // h:10
		
		System.out.println("a = " +  a); //6
		System.out.println("b = " +  b); //9
		System.out.println("c = " +  c); //16
		System.out.println("d = " +  d); //1
		System.out.println("e = " +  e); //5
		System.out.println("f = " +  f); //4
		System.out.println("g = " +  g); //11
		System.out.println("h = " +  h); //10
		
		
		

	}

}
