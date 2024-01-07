class Animal
{
void eat()
{
System.out.println("It can eat");
}
}
class Dog extends Animal
{
void eat()
{
System.out.println("It can drink");
}
void bark()
{
System.out.println("It is barking..");
}
}
class Test
{
public static void main(String args[])
{
Dog d=new Dog();
//Animal a=new Animal();
d.eat();
d.bark();
//a.eat();
}
}





