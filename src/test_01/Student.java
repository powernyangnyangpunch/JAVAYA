package test_01;

import lombok.Data;

@Data
public class Student { //Student 클래스를 만듬
	private String name; //필드 값으로 name과 birthday라는 변수 선언
	private String birthday;
	
	public Student(String name, String birthday) { //name과 birthday를 받아 객체를 만드는 생성자 메서드를 만듬 
		this.name = name;
		this.birthday = birthday;
	}

	public Student(Student std) { //student의 객체 std를 매개변수로 받아 Student의 객체를 생성하는 메서드를 만듬
		this.name = std.name;
		this.birthday = std.birthday;
	}
	
}
