//hybrid inheritance
class C
{
public void disp()
{
System.out.println("Method of class class C");
}
}
class A extends C
{
public void disp()
{
System.out.println("Method of class class A");
}
}
class B extends C
{
public void disp()
{
System.out.println("Method of class class C");
}
}
class D extends A
{
public void disp()
{
System.out.println("Method of class D");
}
public static void main(String args[])
{
D d=new D();
d.disp();
}
}




