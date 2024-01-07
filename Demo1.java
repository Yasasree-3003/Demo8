// super method
class A
{
void eat()
{
System.out.println("starving");
}
}
class Animal extends A
{
void eat()
{
super.eat();
System.out.println("eating....");
}
}
class Dog extends Animal
{
void eat()
{
super.eat();
System.out.println("eating bread....");
}
void bark()
{
System.out.println("barking....");
}
void work()
{
eat();
bark();
}
}
class Demo1
{
public static void main(String args[])
{
Dog d=new Dog();
d.work();
//d.eat();
}
}


