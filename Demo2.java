//super constructor
class Animal
{
Animal()
{
System.out.println("Animal is created");
}
}
class Dog extends Animal
{
Dog()
{
super();
System.out.println("Dog is created");
}
}
class Demo2
{
public static void main(String args[])
{
Dog d=new Dog();
}
}


