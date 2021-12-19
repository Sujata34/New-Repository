package inface;                           // with same mtd nm & var
interface A
{
	int a=20;
	public void show();
}
interface B
{
	int a=50;
	public void show();
}
public class Mulinterface implements A,B {

	@Override
	public void show() {
		System.out.println("multiple interface");
		System.out.println("implements multiple interface");// TODO Auto-generated method stub
		
	}
	public static void main(String []jsahd)
	{
		//System.out.println(x);
		System.out.println(A.a);
		System.out.println(B.a);
		A a =new Mulinterface();
		B b=new Mulinterface();
		a.show();
		b.show();
	}
}
