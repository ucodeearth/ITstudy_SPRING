class PrivateModifier {
	private String p = "Private";
	private String m(){
		return p + "Modifier";	
	}
}

class Test{
	 public static void main(String args[]) {
		 PrivateModifier pm = new PrivateModifier();
		 System.out.println(pm.p);
		 System.out.println(pm.m()); 
		 
		 
	// private������ �������� ���� Ŭ�����ȿ����� ���ٰ���
    // �ٸ�Ŭ������ test ���� private ������ p,m ���ٽ��з� ����
		 
	 } 
 }
