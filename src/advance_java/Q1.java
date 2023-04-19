package advance_java;
class Shape {
    int l;
    int b;
    int h;

    Shape(int l, int b) {
        this.l = l;
        this.b = b;
    }

    Shape(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    
    public int volume() {
        int volume = this.l * this.b * this.h;
        return volume;
    }
    public int area() {
        int area=this.l * this.b;
        return area;
    }

}

class Q1 {
    public static void main(String[] args) {
        Shape s1 = new Shape(15, 10);
        Shape s2 = new Shape(5,7,9);
        System.out.println("Area of length "+s1.l+" and breadth "+s1.b+" shape is : " + s1.area());
        System.out.println("volume of length "+s2.l+" , breadth "+s2.b+" and height "+s2.h+" shape is : " + s2.volume());
    }
}