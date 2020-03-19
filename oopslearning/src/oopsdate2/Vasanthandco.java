package oopsdate2;

public class Vasanthandco
{
	static String branch="chennai";
	static int code=3456;
	int discount,pdtprice;
	
	

	public Vasanthandco(int i, int j)
	{
		System.out.println("check me");
		System.out.println(i+""+j);
		pdtprice=i;
		discount=j;
	}



	public Vasanthandco(int i)
	{
			pdtprice=i;
	}



	public Vasanthandco() 
	{
	System.out.println("calender free");	
	}



	public static void main(String[] args) {
		Vasanthandco tv=new Vasanthandco(10000,10);
				tv.purchase();
		Vasanthandco ac=new Vasanthandco(30000,10);
				ac.purchase();
				Vasanthandco fan=new Vasanthandco(2000);
				fan.purchase();
				Vasanthandco calander=new Vasanthandco();
				
		
	}



	private void purchase() {
	int price=pdtprice-((pdtprice*discount)/100);
	System.out.println("pls pay"+price);
		
		
		
	}
}
