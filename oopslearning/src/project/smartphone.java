package project;

public abstract class smartphone{
	abstract int call(int sec);
	abstract void sendMessage();
	abstract void receviecall();
	void browser(){
		System.out.println("internet");
	}
	public smartphone(){
		System.out.println("Smartphone under development");
	}
	
	
	
}


