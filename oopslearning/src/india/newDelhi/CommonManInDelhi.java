package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules {
	public static void main(String[] args) {
		CommonManInDelhi cm=new CommonManInDelhi();
		cm.dontGoByDieselVehicle();
		cm.goByBicycle();
	}
@Override
	public void goByDieselVehicle() {
		System.out.println("Lorry");
		// TODO Auto-generated method stub
			}
	@Override
	public void goByBicycle() {
		System.out.println("Hercules");
		// TODO Auto-generated method stub
			}
@Override
	public void dontGoByDieselVehicle() {
		System.out.println("Bus");
		// TODO Auto-generated method stub
			}
}
