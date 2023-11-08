// Define an interface
interface MyInterface {
    void interfaceMethod();
}

// Create a class that implements the interface
class InterfaceClass implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Rayon sport");
    }
}

// Create a superclass
class SuperClass {
    void superMethod() {
        System.out.println("Apr fc");
    }
}

// Create a subclass that extends SuperClass
class SubClass extends SuperClass {
    void subMethod() {
        System.out.println("Barcelona");
    }
}

// Create another class
class AnotherClass {
    void anotherMethod() {
        System.out.println("Liverpool");
    }
}

public class ader {
    public static void main(String[] args) {
        // Create objects of each class
        InterfaceClass interfaceObj = new InterfaceClass();
        SubClass subObj = new SubClass();
        AnotherClass anotherObj = new AnotherClass();

        // Call methods on the objects
        interfaceObj.interfaceMethod();
        subObj.superMethod();
        subObj.subMethod();
        anotherObj.anotherMethod();
    }
}
