package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 
		MainClass02.showMsg("�ȳ��ϼ���");
		
		String atr="�� ��������~";
		MainClass02.showMsg(atr);
	}
	// MainClass02 �� static �ɹ� �޼ҵ�
	public static void showMsg(String msg) {
		System.out.println("msg:"+msg);
	}
}
	