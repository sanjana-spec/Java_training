package Basics.oops.Inheritance;

//by default all the classes are private
class A {
    void add(){
        System.out.println("This is add!");
    }
}

class B extends A{
    void sub(){
        System.out.println("This is sub!");
    }
}
// single line, multi-line, documentation string(/** this is a doc string */) --> types of comments

class C extends B{
    void mul(){
        System.out.println("This is a mul");
    }
}
class Drivercode{
    public static void main(String[] args) {
        B b = new B();
        b.sub();
        b.add();
        C c = new C();
        c.mul();
    }
}
