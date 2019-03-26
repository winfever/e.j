package test.main;

public class MainClass04 {
	public static void main(String[] args) {
	
		MainClass04.showSum(8, 10);
		MainClass04.showSum(20,30);
		// 동일한 클래스의 맴버 메소드를 호출할때는
		// 클래스명 생략 가능!
		showSum(30, 40);
		
	}
	
	/*
	 *  메소드 명 : showSum
	 *  전달받는 인자의 갯수 :2 개
	 *  전달받는 인자의 데이터 type : 2개 모두 int type
	 *  메소드 내에서의 동작: 전달받은 2개 정수의 합을 출력
	 */
	public static void showSum(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("두수의 합 : "+sum);
	}

}
