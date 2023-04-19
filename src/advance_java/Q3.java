package advance_java;
class QuadSides {
    QuadSides(int s1) {
        System.out.println("This is a square of side " + s1);
    }

    QuadSides(int s1, int s2) {
        System.out.println("This is a rectangle of sides " + s1 + " and " + s2);
    }

    QuadSides(int s1, int s2, int s3, int s4) {
        System.out.println("This is a quadrilateral of sides " + s1 + ", " + s2 + ", " + s3 + " ,and " + s4);
    }
}

class Q3 {
    public static void main(String[] args) {
        QuadSides q1 = new QuadSides(10);
        QuadSides q2 = new QuadSides(3, 5);
        QuadSides q3 = new QuadSides(5, 2, 5, 4);
    }
}