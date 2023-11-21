public class Scope {
	
 private static int x = 1;

  public static void main(String []  args) {
	  int x = 4;
	  
	  System.out.printf("the main is %d%n" , x);
	  
	  useLocalVariable();
	  useField();
	  useLocalVariable();
	  useField();

	  System.out.printf("the main is %d%n" , x);
  }
  public static void useLocalVariable() {
	int x = 70;
	  System.out.printf("the localVariable is %d%n" , x);
	 x++;
	 System.out.printf("the localVariable before exiting the method is %d%n" , x);

  }
  
  
  public static void useField() {
	  System.out.printf("the initial field is %d%n" , x);
	  x*=10;
	  System.out.printf("the final field is %d%n" , x);
  }
}


