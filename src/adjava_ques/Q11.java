package adjava_ques;
import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private String regNo;
    private String branch;
    private double cgpa;
    
    public Student() {
        // default constructor
    }

    public Student(String name, String regNo, String branch, double cgpa) {
        this.name = name;
        this.regNo = regNo;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Vishvas Patel");
        s.setRegNo("E12345");
        s.setBranch("Computer Science");
        s.setCgpa(8.5);
        
        System.out.println("Student Name: " + s.getName());
        System.out.println("Registration Number: " + s.getRegNo());
        System.out.println("Branch: " + s.getBranch());
        System.out.println("CGPA: " + s.getCgpa());
    }
}




