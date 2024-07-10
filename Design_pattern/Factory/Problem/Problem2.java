package Factory.Problem;

public class Problem2 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "A":
                    A a = new A();
                    break;

                case "B":
                    B b = new B();
                    break;

                case "C":
                    C c = new C();
                    break;

                default:
                    break;
            }
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

// Why should I use factory design pattern if I can do this..............
// Ans
// In this example you are just switching values but suppose I have three
// classes A B and C class
// I can instantiate any class from the A B and C class..........
// But the condition is ..........Suppose I'm typing my first class as it A Then
// the most next class cannot be A It can be B and C.........
// ypu see we are creating or managing some state or some previous state so I
// have to write more code.........
// But suppose this same logic I want to use somewhere else in the project then
// what should I should I write again the same logic no it is not advisable

// Another example can be suppose user is given me some type of value(It is not
// a class like A B C ).... He's just giving me value and now at the runtime I
// have to decide from this value to which class should I instantiate
// so My perspective factory design pattern is used so that we can have
// abstraction...........The user should not know what is going on inside the
// method what is the logic they should not know
// user Would provide something and I will or developer will interpret this ...... this value
// ... they will use it secretly in an encapsulated class so That any other
// class cannot kNow what is the logic