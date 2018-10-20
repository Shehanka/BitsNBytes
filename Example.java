/**
 * @author chamodshehanka on 10/20/2018
 * @project BitsNBytes
 **/

class A{
    int a = 5;
    int b = 10;

    void method(){
        a = 5;
        b = 10;
    }
}

class B extends A{
    void method(){
        a = 45;
        b = 55;
    }
}
public class Example {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.a);
        System.out.println(b.a);
    }
}
