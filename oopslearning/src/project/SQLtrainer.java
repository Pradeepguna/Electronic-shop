package project;

public class SQLtrainer extends Trainer{

	public SQLtrainer(String string, String string2) {
		super(string, string2);
		}
public static void main(String[] args) {
		SQLtrainer ram=new SQLtrainer("PCE","JCT");
		String G=ram.dept;
		String H=ram.institute;
		int I=ram.getSalary();
		System.out.println(G);
System.out.println(H);
System.out.println(I);
}
}
