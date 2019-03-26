// 이 클래스가 속한 패키지를 표시한다.
package Test.main; // package name 이 된다.

public class MainClass07 { // 클래스 명이 된다. 
	// run 했을때 실행순서가 시작되는 특별한 메소드 클래스안에 동작을 정의. 
	public static void main(String[] args) { // 메소드 명이된다. (main)
		System.out.println("main 메소드가 시작됨");
		
		// int type num 이라는 지역변수 만들어서
		// 10 대입하기
		int num = 10;
		
		// boolean type isRun 이라는 지역변수 만들어서
		// true 대입하기
		boolean isRun=true;
		
		// String type name 이라는 지역변수 만들어서
		// String type의 참조값 대입하기
		String name = "김구라";
		
		num = 20;
		
		name="해골";
		String name2=null;
		name=null;
				
	}
}
