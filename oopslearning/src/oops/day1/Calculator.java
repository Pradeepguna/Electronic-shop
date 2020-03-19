package oops.day1;

public class Calculator {

	static String brand ="ABC";
	static int price=650;
//	private static boolean true;
	static boolean isscientific=true;
	String owner="kumar";
	
public static void main(String[] args) 
{
	Calculator calc =new Calculator();
	calc.add();
	int a=calc.subtract(50,20.5f);
	int result=calc.subtract(50,20.5f);
	System.out.println(result);
	calc.isscientific();	
}

private void isscientific() {
	System.out.println(brand);
	System.out.println(price);
	System.out.println("kumar");
	System.out.println(isscientific);
}

private int subtract(int i, float f) 
{
int c=50;
float d=20.5f;
float a=c-d;
System.out.println(a);
	return 0;
}

private void add() {
	int a=10;
	int b=20;
	int total=a+b;
	System.out.println(total);
	System.out.println();
	
}

}