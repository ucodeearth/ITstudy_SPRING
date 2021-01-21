
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
		 
		 
	// private제어자 설정으로 같은 클래스안에서만 접근가능
    // 다른클래스인 test 에서 private 설정된 p,m 접근실패로 오류
		 
	 } 
 }
