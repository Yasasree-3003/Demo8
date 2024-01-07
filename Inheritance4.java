class Animal
{
String name="Dog";
void eat()
{
System.out.println("eating....");
}
}
class Dog extends Animal
{
void display()
{
System.out.println("barking....");
}
}
class Inheritance3
{
public static void main(String args[])
{
Dog labrador=new Dog();
System.out.println("Name is:"+labrador.name);
labrador.eat();
labrador.display();
}
}
