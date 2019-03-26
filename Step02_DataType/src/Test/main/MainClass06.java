package Test.main;

public class MainClass06 {
	
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		// 참조 데이터 type 을 담을수 있는 빈 변수 만들기 // 참조데이터 값안에는 데이터가 아니고, 데이터 참조값이 들어간다. ex key값 key 갑없는건 null
		String myName=null; // null 을 대입하면 된다.
		
		boolean isRun=false;
		
		if(isRun) {
			myName="김구라";
		}
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
