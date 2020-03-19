package oopsdate2;

public class Sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sumofseries Digits=new Sumofseries();
	int c=	Digits.cell(5);
	System.out.println(c);
	int d=Digits.cell(10);
	System.out.println(d);
	int e=Digits.cell(15);
		System.out.println(e);
	

	}

	private int cell(int j) 
	{
		// TODO Auto-generated method stub
		int i=1,sum=0;
		for(i=1;i<=j;i++)
		{
			sum=sum+i;
			}
		return sum;
	}

}
