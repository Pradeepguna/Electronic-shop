package oopsdate2;

public class reverse {

	public static void main(String[] args) {
		reverse value = new reverse();
		int c = value.act(5);
		System.out.println(c);
		int d = value.act(10);
		System.out.println(d);
		int e = value.act(20);
		System.out.println(e);
     }

	public int act(int i) {
		int j = i;

		while (j >= 1) {

			System.out.println(j);
			j--;

		}
		return j;

	}

}
