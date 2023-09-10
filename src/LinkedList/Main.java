public class Main {
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.addfirst(5);
        l1.addfirst(4);
        l1.display();
        l1.addlast(0);
        l1.display();
        l1.add(3, 3);
        l1.display();
        l1.add(10, 4);
        l1.display();
        l1.remove(0);
        l1.remove(3);
        l1.display();
        
    }
}
