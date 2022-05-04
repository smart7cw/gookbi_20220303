package casting;

public class Main01 {

	public static void main(String[] args) {

		short s = 100;	// 100
		int i = s;		// 100
		long l = i;		// 100
		float f = l;	// 100.0
		double d = f;	// 100.0
		
		System.out.println("short : "+ s);
		System.out.println("int : "+ i);
		System.out.println("long : "+ l);
		System.out.println("float : "+ f);
		System.out.println("double : "+ d);
		System.out.println("-----------------");
		
		int myage1 = 20;		// 20
		double myage2 = myage1;	// 20.0
		System.out.println("myage1 = " + myage1);
		System.out.println("myage2 = " + myage2);


	}

}
