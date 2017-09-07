package bank;
class A{
	static int i = 1111;
	static {
		i = i-- - --i;
	}
	{
		i = i++ + ++i;
	}
}
class B extends A{
	static {
		i = --i - i--;
	}
	{
		i = ++i + i++;
	}
	
}
public class Cal {

	public static void main(String []vin) {
		A a = new A();
			System.out.println(a.i);
	}

}
