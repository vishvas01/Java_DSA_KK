package advance_java;
class Book {
     int book_num;
     Double book_price;
     String book_name;

    Book(int book_num, String book_name, Double book_price) {
        this.book_num = book_num;
        this.book_name = book_name;
        this.book_price = book_price;
    }

    void display() {
        System.out.println(this.book_num + ". " + this.book_name + " for " + this.book_price + "$");
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
        Double discount_price = this.book_price - (this.book_price * this.discount) / 100;
        System.out.println("The new price after discount is " + discount_price + "$.");
    }
}

class QuestionTwoBooks {
    public static void main(String[] args) {
        Book b = new Book(1, "Almond", 99.59);
        b.display();
        SpecialEditionBook bs = new SpecialEditionBook(2, "special Almond", 99.59, 15.25);
        bs.display();

    }
}