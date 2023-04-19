package advance_java;
class Name {
     String firstName;
     String lastName;

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getName() {
        System.out.println("Name: " + this.firstName + (this.lastName != null ? (" " + this.lastName) : ""));
    }
}

class Q4 {
    public static void main(String[] args) {
        Name person1 = new Name();
        person1.setName("Vishvas");
        person1.getName();
        Name person2 = new Name();
        person2.setName("Vishvas", "Patel");
        person2.getName();
    }
}