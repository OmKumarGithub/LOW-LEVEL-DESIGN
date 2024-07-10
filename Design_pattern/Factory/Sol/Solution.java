package Factory.Sol;

abstract class Abs {
    // abstarct isliye because we can define some functionalty which should be in all 
    public abstract void display();
}


// Concrete Abss
class ConcreteAbsA extends Abs {
    
    public void display() {
        System.out.println("This is Concrete Abs A.");
    }
}
 
class ConcreteAbsB extends Abs {
        public void display() {
        System.out.println("This is Concrete Abs B.");
    }
}
 
// Creator Abstract Class
abstract class Creator {
    public abstract Abs factoryMethod();
}
 
// Concrete Creators
class ConcreteCreatorA extends Creator {
    public Abs factoryMethod() {
        return new ConcreteAbsA();
    }
}
 
class ConcreteCreatorB extends Creator {
    public Abs factoryMethod() {
        return new ConcreteAbsB();
    }
}
 
// main function...........
public class Solution {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Abs AbsA = creatorA.factoryMethod();
        AbsA.display();
 
        Creator creatorB = new ConcreteCreatorB();
        Abs AbsB = creatorB.factoryMethod();
        AbsB.display();
    }
}