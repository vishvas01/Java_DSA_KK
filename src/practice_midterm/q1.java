package practice_midterm;
class shape{
    private int l;
    private int b;
    private int h;
     shape(int l,int b){
        this.l=l;
        this.b=b;
    }
     shape(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    int getl(){
        return this.l;
    }
    int getb(){
        return this.b;
    }
    int geth(){
        return this.h;
    }
    int area(){
        return this.l*this.b;
    }
    int volume(){
        return this.l*this.b*this.h;
    }
}
public class q1{
    public static void main(String[] args) {
        shape rectangle = new shape(10,20);
        shape cuboid = new shape(10,10,5);
        System.out.println("area of rectangle with length "+rectangle.getl()+" and breadth "+rectangle.getb()+" is: "+rectangle.area());
        System.out.println("volume of cuboid with length "+cuboid.getl()+", breadth "+cuboid.getb()+"and height "+cuboid.geth()+"is: "+cuboid.volume());
    }
}