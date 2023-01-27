import java.util.Scanner;

public class MyMethod {
	public static void main(String[] args) { 
	
	    Scanner ex =new Scanner(System.in);
		System.out.println("enter first value");
		int x =ex.nextInt();

		System.out.println("enter second value");
		int y =ex.nextInt();

		System.out.println(Addition(x,y));
		System.out.println();
		System.out.println(Substraction(x,y));
		System.out.println();
		System.out.println(Multiplication(x,y));
		System.out.println();
		System.out.println(Division(x,y));
		System.out.println();
		System.out.println(Modulus(x,y));
}
       	 	 private static int Addition(int x, int y) {
	  	 System.out.println(" Addition of values " + x +" and "+y);
		 return x+y;
}
		 private static int Substraction(int x, int y) {
		 System.out.println(" Substraction of values " + x +" and "+y);
		 return x-y;
}	
		 private static int Multiplication(int x, int y) {
		 System.out.println(" Multiplication of values " + x +" and "+y);
	 	 return x*y;
}
		 private static int Division(int x, int y) {
		 System.out.println(" Division of values " + x +" and "+y);
		 return x/y;
} 
		 private static int Modulus(int x, int y) {
		 System.out.println(" Modulus of values " + x +" and "+y);
		 return x%y;
}}







	