package test_01;

import lombok.Data;

@Data
public class StudentLog {

	private Student std; //StudentLog클래스의 필드값으로 Student객체타입의 std를 선언
	private String state; //String타입의 state 변수 선언
	
	public StudentLog(String name, String birthday, String state) { //name, birthday, state를 매개변수로 하는 메서드 생성(생성자)
		std = new Student(name, birthday);
		this.state = state;
	}
	public StudentLog(Student std, String state) { //Student객체타입의 std와  String타입의 state를 매개변수로 하는 생성자 메소드 생성
		this.std = new Student(std);
		this.state = state;
	}
}