package advance_java;
class VoterIdAgeRestriction extends Exception {
    public VoterIdAgeRestriction(String message) {
        super(message);
    }
}

class Q6 {

    public static void checkVoterAge(int age) {
        if (age < 18) {
            try {
                throw new VoterIdAgeRestriction("Not valid age, not eligible to vote");
            } catch (VoterIdAgeRestriction e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("You are eligible to vote");
        }
    } 

    public static void main(String[] args) {
        int age = 12;
        checkVoterAge(age);
    }
}