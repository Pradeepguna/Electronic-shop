package project;

public class Electronicshop {
	String name,mbl;
	int price;
	float discount;
	int total;
	static float amount;
	float pay;
	
	
	public Electronicshop(String string, String string2, int i, float f, int j) {
	 name=string;
     mbl= string2;
	 price=i;
	 discount=f;
	this.total=j;
	}

	public static void main(String[] args) {
Electronicshop shop=new Electronicshop("pradeep","9943482389",35000,(float)7.5, 150000);
amount=shop.discount();
shop.display();

	}

	private void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Discount:"+discount);
		System.out.println("Total:"+amount);
}

	private float discount() 
	{
	if(price<=25000)
	{
		pay= (float)(total-(total*0.05));
		return pay;
		}
	else if(price>=25001 && price<=50000 )
	{
	pay= (float)(total-(total*0.075));
	 return pay;

}
	else if(price>=50001 && price<=100000)
	{
		pay=(float)(total-(total*0.1));
		return pay;

}
	else if(price>=100001)
	{
		pay=(float) (total-(total*0.15));
	return pay;
	}
	return 0;
	}

}
