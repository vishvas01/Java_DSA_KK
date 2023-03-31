package oops;

public class basic {
    public static void main(String[] args) {
        student risha = new student();
        risha.rollnumber = 11013;
        risha.name= "Risha Rahaman";
        System.out.println("roll number is: "+risha.rollnumber+"\nname is: "+risha.name);
    }
}
class student{
    int rollnumber;
    String name;
}