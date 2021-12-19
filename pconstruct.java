class s
{
  public s(int a, int b)
 {
	System.out.println("constructor="+a);
 
 public s(int c, String d)
{
        System.out.println("constructor="+c);
}
  public s()
	{
	  System.out.println("default constructor=");
	}
public static void main(String args[])
{
  s s1=new s(4,5);
}
}