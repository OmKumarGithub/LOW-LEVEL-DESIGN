package Factory.Sol;

import java.util.Random;



// Everything should be an interface because it gives an overview and it binds the child classes to use those methods so try to use interface everywhere............

class Solution {

    public static void main(String[] args) {
        Animal variabAnimal = new RandomAnimalFactory().factoryMethod();
        Animal variAnimal2 = new StateFullAnimalFactory().factoryMethod();
        System.out.println(variabAnimal);
        System.out.println(variAnimal2);
    }
}



// factory method as a result jo dega wo idhar defined hai **********************************************************************
interface Animal {
    public void brain();

    public void species();
}

// Concrete classed
class Dog implements Animal {
    public void brain() {
        System.err.println("dog brain yes");
    }

    public void species() {
        System.err.println("dog soecies");
    }
    // can add some extra methods
}

class Cat implements Animal {
    public void brain() {
        System.err.println("cat brain yes");
    }

    public void species() {
        System.err.println("cat soecies");
    }
    // can add some extra methods

}


// **********************************************************************


// factory method **********************************************************************

interface AnimalFactory {
     public Animal factoryMethod();
}

class RandomAnimalFactory implements AnimalFactory {
     public Animal factoryMethod() {
        Random rand = new Random();
        int num = rand.nextInt(2);
        if (num == 1) {
            return new Cat();
        } else {
            return new Dog();
        }
    }
}

class StateFullAnimalFactory implements AnimalFactory {
 boolean state = false;

 public Animal factoryMethod() {
        if (state == false) {
            state = true;
            return new Cat();
        } else {
            return new Dog();
        }
    }
}

// *********************************************************************