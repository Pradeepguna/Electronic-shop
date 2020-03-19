package project;

public class ActorSivaKumar implements Actor {

	static String address="coimbatore";
	public ActorSivaKumar(int i, String string) {
		i=65;
		string="Audi Car";
	}
	public static void main(String[] args) {
		ActorSivaKumar as=new ActorSivaKumar(65,"Audi Car");
	as.speaking();
	Actor dc=new ActorSivaKumar(0, address);
	as.act();
	as.dance();
	as.sing();
	System.out.println(dc.address);
			}
private void speaking() {
		}
@Override
	public void act() {
		System.out.println("Comedy with mokka");
}
@Override
	public void dance() {
		System.out.println("Nagini");
}
@Override
	public void sing() {
		System.out.println("Rock with CSK");
		}
}
