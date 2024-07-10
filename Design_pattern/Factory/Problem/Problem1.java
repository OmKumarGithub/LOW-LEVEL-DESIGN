package Factory.Problem;

public class Problem1 {
    public static void main(String[] args) {

        // suppose right now i dont know ......which class to make
        // ................whatever user will type that will be our class
        // so we cant do this .............. new A()..........bcoz right now we are not
        // aware of which class to make
        // Idea-------- just use newInstance().......from that we can use dynamic type
        // object
        // NOTE::::: new is used to create object dynamically .......but object will be
        // the same object which we would be defining at the time of development,
        // so to use dynamic type of object with new we use newInstance

        try {
            // reflection ka use ho rha hai
            for (int i = 0; i < args.length; i++) {
                Class<?> clazz = Class.forName("Factory." + args[i]);
                Object obj = clazz.getDeclaredConstructor().newInstance();
            }

        } catch (Exception e) {
            System.out.println("Error creating instance: " + e.getMessage());
        }
    }
}

class A {
    A() {
        System.out.println("a created");
    }
}

class B {
    B() {
        System.out.println("b created");
    }
}

class C {
    C() {
        System.out.println("c created");
    }
}
