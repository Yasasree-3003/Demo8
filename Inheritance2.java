class Animal
{
void eat()
{
System.out.println("eating....");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("barking....");
}
}
class BabyDog extends Dog
{
void weep()
{
System.out.println("weeping....");
}
}
class Inheritance1
{
public static void main(String args[])
{
BabyDog d=new BabyDog();
d.bark();
d.eat();
d.weep();
}
}

