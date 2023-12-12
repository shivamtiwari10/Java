package Exception_handling;

public class multiple_catch {
public static void main(String[]args) {
	
	try {
		int a[]=new int[5];
		a[5]=30/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("arithmetic exception occurs");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bound exception occurs");
	}
	catch(Exception e) {
		System.out.println("parent exception occurs");
	}
	System.out.println("rest of the code");
}
}
