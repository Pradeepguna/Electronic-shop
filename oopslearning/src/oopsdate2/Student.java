package oopsdate2;

public class Student {
	int mark;
	int mark1;


	

	public Student(int i, int j) {
		mark=i;
		mark1=j;
		// TODO Auto-generated constructor stub
	}




	public static void main(String[] args) 
	{
Student siva=new Student(90,80);
siva.mark();
Student kumar=new Student(97,80);
kumar.mark1();
	


	
	}




	private void mark1() {
		// TODO Auto-generated method stub
		System.out.printf(mark+" "+mark1);
	}




	private void mark() {
		// TODO Auto-generated method stub
	System.out.println(mark+""+mark1);
	}

}
