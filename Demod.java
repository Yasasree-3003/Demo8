//super keyword is used to access the data member of parent class when the variables are same
class Animal
{
String color="White";
}
class Dog extends Animal
{
String color="Black";
void printcolor()
{
System.out.println(color);
System.out.println(super.color);
}
}
class Demo
{
public static void main(String args[])
{
Dog d=new Dog();
d.printcolor();
}
}