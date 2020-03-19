package project;

public class Tamilnadu extends Southindia {
	static String capital="Chennai";
	void cultivate(){
		System.out.println("Rice and sugar cane cultivation");
	}
	void livingStyle(){
		System.out.println("Above Average development");
	}

	public Tamilnadu(String primeMinister) {
		super(primeMinister);
		
	}

	public static void main(String[] args) {
	System.out.println(India.capital);
	System.out.println(Tamilnadu.capital);
		Southindia si=new Tamilnadu(" Modiji ");
	}

	@Override
	void speaklanguage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void dress() {
		// TODO Auto-generated method stub
		
	}

}
