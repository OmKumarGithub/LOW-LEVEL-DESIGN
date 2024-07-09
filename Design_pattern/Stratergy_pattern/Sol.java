package Stratergy_pattern;

public class Sol {
    Same1 behaviour1;

    Sol(Same1 parBehaviour1){
        this.behaviour1= parBehaviour1;
    }
}

interface Same1{
   public void  behaviour1();
}

class ConcreteClass1 implements Same1{
    public void behaviour1(){
        // implementation 
    }
}




class Child1 extends Problem{
   Child1(){
    super(ConcreteClass1);
   }
}

class Child2 extends Problem{
    Child1(){
        super(ConcreteClass1);
       }
}