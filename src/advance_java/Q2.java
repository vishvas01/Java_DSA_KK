package advance_java;
import java.util.Scanner;

class Book {
     int book_num;
     String book_name;
     Double book_price;

    Book(int book_num, String book_name, Double book_price) {
        this.book_num = book_num;
        this.book_name = book_name;
        this.book_price = book_price;
    }

    void display() {
        System.out.println("Thankyou for your purchase");
        System.out.println(this.book_num + ". " + this.book_name + " for " + this.book_price + "Rs");
    }
}

class SpecialEditionBook extends Book {
    Double discount;

    SpecialEditionBook(int book_num, String book_name, Double book_price, Double discount) {
        super(book_num, book_name, book_price);
        this.discount = discount;
    }

    @Override
    void display() {
        super.display();
        Double discountPrice = this.book_price - (this.book_price * this.discount) / 100;
        System.out.println("Thankyou for your purchase\nThere is discount available");
        System.out.println("The discount price is " + discountPrice + "Rs.");
    }
}

class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] list = new String[3];
        Book b1 = new Book(1, "Almond", 99.39);
        Book b2 = new Book(2, "RD Sharma", 59.99);
        SpecialEditionBook bs1 = new SpecialEditionBook(3, "Titanic", 99.59, 25.25);
        list[0] = b1.book_num+" "+b1.book_name+" MRP: "+b1.book_price;
        list[1] = b2.book_num+" "+b2.book_name+" MRP: "+b2.book_price;
        list[2] = bs1.book_num+" "+bs1.book_name+" MRP: "+bs1.book_price+" Discount: "+bs1.discount;
        for(String a:list){
            System.out.println(a);
        }
        int num = s.nextInt();
        if(num==1){
            b1.display();
        }else if(num==2){
            b2.display();
        }else if(num==3){
            bs1.display();
        }else{
            System.out.println("Invalid number entered!");
        }

    }
}