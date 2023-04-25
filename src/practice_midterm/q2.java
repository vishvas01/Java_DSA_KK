package practice_midterm;

class a{
    void show(){
        System.out.println("this is parent class method");
    }
}

class b extends a{
    @Override
    void show(){
        super.show();
        System.out.println("this is child class method");
    }
}

class demo{
    public static void main(String[] args) {
        a one = new b();
        one.show();
    }
}