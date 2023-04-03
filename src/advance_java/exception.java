package advance_java;
 class AssertionTest {
    public static void main(String[] args) {
       int number = -5;    // assumed number is not negative
       // This assert also serve as documentation
       assert (number >= 0) : "number is negative: " + number;
       // do something
       System.out.println("The number is " + number);
    }
 }