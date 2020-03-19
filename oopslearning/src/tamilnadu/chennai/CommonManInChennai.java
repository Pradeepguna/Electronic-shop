package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules {

	public static void main(String[] args) {
		CommonManInChennai ch=new CommonManInChennai();
		ch.goByBicycle();
		ch.goByBicycle();

	}

	@Override
	public void goByDieselVehicle() {
		System.out.println("Lorry");
	}

	@Override
	public void goByBicycle() {
		System.out.println("Hercules");
	}

}
