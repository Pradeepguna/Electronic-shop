package project;

public abstract class Factorydemo extends smartphone{
	boolean isoriginalpiece = false;
	static int price=0;
	abstract void verifyFingerprint();
	abstract void providePattern();
	void browse(){
		System.out.println("factory demo browsing");
	}
}
