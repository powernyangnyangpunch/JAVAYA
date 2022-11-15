package attampt_03;

public class Test_final {

	public static void main(String[] args) {
		// 상수 : (컴퓨터<JAVA>에서는 한번만 저장(기록)할 수 있는 메모리 의미
		int size;
		final int SIZE;
		size = 10;
		SIZE = 10;
		
		System.out.println("===값 변경 전===");
		System.out.println("size =" + size);
		System.out.println("SIZE =" + SIZE);
		
		//변수의 값 변경
		
		size = 20; //변경 가능
		//SIZE = 20; //변경 오류. 상수는 초기화 이후 다른 값을 대입 불가
		
		System.out.println("===값 변경 ===");
		System.out.println("size =" + size);
		System.out.println("SIZE =" + SIZE);
		

	}

}
