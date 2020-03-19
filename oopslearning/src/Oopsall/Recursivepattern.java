package Oopsall;

public class Recursivepattern {
	public static void main(String agrs[])
	{
		Recursivepattern p=new Recursivepattern();
		p.matrix(5);
	}
int r=1;
	private int matrix(int i) 
	{
		int j=i;
		if(r>i*j)
		{
			return 1;
		}
		if(r%j==1)
		{
			
			System.out.println( );
		}
		System.out.print(r+" ");
		r++;
		int a=matrix(i);
		return a;
	}
	
}

