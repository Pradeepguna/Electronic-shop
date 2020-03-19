package oops.day1;

public class hotel {
	static String name=" Saravana bhavan";
	static int doorno=7;
	int mealsrate=100;
	public static void main(String args[])
	{
		hotel customer1=new hotel();
		customer1.eat();
		preparefood();
		float box=customer1.paybill(200);
		System.out.println(box);
	}
		

	private static  void preparefood() {
		// TODO Auto-generated method stub
		System.out.println("rice");
	}
	private void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat well");
		//paybill();
		}
	private float paybill(int i) 
	{
		System.out.println("paybill");
		System.out.println(i);
	float balance=35.7f;
	return (int) balance;
	}
	
	
		
	}
		


