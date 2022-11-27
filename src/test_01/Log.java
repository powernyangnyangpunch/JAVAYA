package test_01;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Log {
	private ArrayList<StudentLog> slogs = new ArrayList<StudentLog>(); //StudentLog클래스의 slogs라는 이름의 ArrayList를 필드 값으로 선언
	private String date;//String타입의 date라는 변수를 필드 값으로 선언
	
	public Log(ArrayList<StudentLog> stdLogs, String date) { //Log라는 이름의 메서드를 구현, 매개변수로는 StdLogs라는 ArrayList와 String타입의 date를 설정
		this.date = date; //date값을 받아서 Log객체 date에 대입
		this.slogs = stdLogs;//원래는 깊은 복사는 해야 하는데 간단하게 얕은 복사를 이용
	}
}
