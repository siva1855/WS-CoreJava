package siva01.jse.unary;

public class UnaryOperator {

	public static void main(String[] args) {
         //postfix
		int a = 10;
		System.out.println(a++);
		int aa = 10;
		aa++;
		System.out.println(aa);

		int b = 10;
		System.out.println(b--);
		int bb = 10;
		bb--;
		System.out.println(bb);
		
        //prefix
		int c = 10;
		System.out.println(++c);
		int cc = 10;
		++cc;
		System.out.println(cc);

		int d = 10;
		System.out.println(--d);
		int dd = 10;
		--dd;
		System.out.println(dd);

		
		
		int e = 10;
		System.out.println(~e);
		int f = -10;
		System.out.println(~f);

		boolean g = true;
		System.out.println(!g);
		boolean h = false;
		System.out.println(!h);
	}

}
