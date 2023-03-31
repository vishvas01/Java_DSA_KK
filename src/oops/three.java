package oops;

class Animal 
{
 void eat()
 {
  System.out.println("I eat fish");
 }
}

class cat extends Animal 
{
 void sound()
 {
  System.out.println("meowww");
 }
}

class Inheritance 
{
 public static void main(String args[])
 {
  cat d = new cat();
  d.eat();
  d.sound();
 }
}
