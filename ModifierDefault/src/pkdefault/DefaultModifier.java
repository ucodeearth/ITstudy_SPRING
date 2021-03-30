package pkdefault;
  class DefaultModifier {
  String d = "default";
  String m() {
		return d + "modifier";	
		
	   }
}
       class Test {
    	   public static void main(String[] args) {
    		   DefaultModifier dm = new DefaultModifier();
    		   System.out.println(dm.d);
    		   System.out.println(dm.m());
    		   
    		   // default available in the same package
	    }	 
 }

 