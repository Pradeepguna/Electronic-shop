package oopsdate2;

public class People implements Rules 
{
	void vote()
	{
		System.out.println(Rules.k);
	}

	@Override
	public void getmark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void follow(int a)
	{
	System.out.println(k);
		
		// TODO Auto-generated method stub
		
	}
public static void main(String args[])
{
	People get=new People();
	get.follow(10);
	get.getmark();
	get.vote();
}
}
