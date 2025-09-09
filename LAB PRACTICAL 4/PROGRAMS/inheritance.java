class A {
    A() {
        System.out.println("Hello I am A");
    }
}

class B extends A {
    B() {
        System.out.println("Hello I am B");
    }
}

class C extends B {
    C() {
        System.out.println("Hello I am C");
    }
}

public class inheritance {
    public static void main(String[] args) {
        C obj = new C();
    }
}