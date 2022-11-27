package test_01;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Attendance { //Attendance라는 클래스를 만든다.
	private ArrayList<Student> stds = new ArrayList<Student>();//Attendance클래스의 필드로 Student클래스의 객체들을 순차적으로 저장,보관하는 stds라는 ArrayList를 선언
	private ArrayList<Log> logs = new ArrayList<Log>();//Attendance클래스의 필드로 Log클래스의 객체들을 순차적으로 저장하는 logs라는 ArrayList를 선언
	
	
}

/* - ArrayList<객체타입> 이름으로 지정하며, 설정한 객체타입만 저장가능// ArrayList와 베열의 차이는 저장용량을 초과하면 저장용량이 늘어난다는 점
 *  - ArrayList<String> a = new ArrayList<String>(); >> String 타입만 add가능
 *  - ArrayList<Student> a = new ArrayList<Student>(); >> Student객체만 사용가능
 *  - ArrayList<Integer> a = new ArrayList<Integer>(); >> int 타입만 add가능 (int는 객체타입이 아니고 데이터타입이라 사용할 수 없음)
 *  - ArrayList<Integer> a = new ArrayList<>(); >> new에서 타입 파라미터 생략가능
 *  - ArrayList<Integer> a = new ArrayList<Integer>(5); >> 초기용량 지정가능 (굳이 왜 초기용량 지정? 초과하면 늘어나나?)
 *  - ArrayList<Integer> a = new ArrayList<Integer>(Array.asList(1, 2, 3)); >> 생성시 값을 추가해줄 수 있음
 */
