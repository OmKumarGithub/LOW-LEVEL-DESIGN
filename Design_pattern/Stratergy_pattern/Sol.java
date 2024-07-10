package Stratergy_pattern;

public class Sol {
    Same1 behaviour1;

    Sol(Same1 parBehaviour1){
        this.behaviour1= parBehaviour1;
    }
}

interface Same1{                                   ////////////////we will call it as stratergy interface
   public void  behaviour1();
}

class ConcreteClass1 implements Same1{          ////////////////////we will call it as a stratergy class 
    public void behaviour1(){
        // implementation 
    }
}




class Child1 extends Sol{
   Child1(){
    super(new ConcreteClass1());
   }
}

class Child2 extends Sol{
    Child2(){
        super(new ConcreteClass1());
       }
}