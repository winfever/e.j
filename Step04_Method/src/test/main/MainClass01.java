package test.main;

public class MainClass01 {
	
	// run ������ ��������� ���۵Ǵ� Ư���� �޼ҵ�
	public static void main(String[] args) { // String[]  args   args�� ��������   String[]�� ���������� Ÿ��.
		System.out.println("main() ���۵�");
		
		MainClass01.gura();
		
		System.out.println("main() �����");
	}
	// MainClass01 �� static �ɹ� �޼ҵ� gura() �޼ҵ� �����
	public static void gura() {
		System.out.println("gura() ���۵�");
		
		System.out.println("gura() �����");
		
	}
	
}
