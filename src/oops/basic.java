package oops;

public class basic {
    public static void main(String[] args) {
        student vishvas = new student();
        vishvas.reg_no = 10993;
        vishvas.name= "Vishvas Patel";
        vishvas.marks= 96.5f;
        System.out.println(vishvas.reg_no+" "+vishvas.name+" "+vishvas.marks);
    }
}

class student{
    int reg_no;
    String name;
    float marks;
}