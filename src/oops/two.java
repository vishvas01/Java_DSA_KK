package oops;
abstract class Car
{
 Car()
 {
  System.out.println("Car constructed");
 }
 abstract void drive();
} 

class honda extends Car
 {
  void drive()
  {
   System.out.println("have nice journey");
  }
 }

class Abstraction 
 {
  public static void main (String args[])
  {
   Car obj = new honda();
   obj.drive();
  }
 }