package test_02;

import java.util.ArrayList;
import java.util.Scanner;

public class boardMain {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*  - 게시글 종류는 자유, 공지는 기본

			- 게시글 종류는 추가 가능

			- 게시글을 회원만 작성 가능

			- 회원 가입, 로그인 기능 필요

			- 비회원은 작성, 수정 불가능, 조회 가능

			- 회원 정보와 게시글을 파일에 저장하여 관리
		 */
		
		/* 1. 메뉴 선택창을 띄운다
		 *   1. 게시글 작성
		 *    1-1 로그인창을 띄운다
		 *    1-2 로그인 성공시 게시글 작성 
		 *   2. 게시글 조회
		 *    2-1 조회하려는 게시글의 번호를 입력받는다.
		 *   3. 게시글 수정
		 *    3-1 로그인창을 띄운다
		 *    3-2 로그인 성공시 수정
		 *   4. 회원가입
		 *    
		 *   5. 종료		
		 */
		ArrayList<boardMember> memberList = new ArrayList<boardMember>();
		ArrayList<board> boardList = new ArrayList<board>();
		ArrayList<boardMember> idList = new ArrayList<boardMember>();
		int menu = -1;
		String name, id, pw;
		
		do {
			printStr("======== 메뉴 선택 창 ========");
			printStr("1. 게시글 작성");
			printStr("2. 게시글 조회");
			printStr("3. 게시글 수정");
			printStr("4. 회원가입");
			printStr("5. 종료");
			printStr("===========================");
			printStr("메뉴 선택: ");
			menu = scan.nextInt();
			scan.nextLine();
			switch(menu) {
			case 1: 
				printStr("ID를 입력해주세요.");
				id = scan.nextLine();
				printStr("password를 입력해주세요.");
				pw = scan.nextLine();
				
				//if()
				
				break;
			case 2:
				printStr("2. 게시글 조회");
				break;
			case 3:
				printStr("3. 게시글 수정");
				break;
			case 4:
				printStr("4. 회원가입");
				printStr("이름을 입력해주세요.");
				name = scan.nextLine();
				printStr("아이디를 입력해주세요.");
				id = scan.nextLine();
				printStr("비밀번호를 입력해주세요.");
				pw = scan.nextLine();
				boardMember member = new boardMember(name, id, pw);
				if(memberList.contains(member)) {
					printStr("이미 존재하는 아이디입니다.");
				}else {
					memberList.add(member);
					printStr("회원가입이 완료되었습니다.");
				}
				break;
			case 5:
				printStr("프로그램을 종료합니다.");
				printBar();
				break;
			default:
				printStr("잘못된 선택입니다.");
			}
			
		}while(menu != 5);
	}
	public static void printStr(String str) {
		System.out.println(str);
	}
	public static void printBar() {
		System.out.print("===========================");
	}

}
