package Stratergy_pattern;
class Problem {

    public  void behaviour1() {}
}

class Child1 extends Problem{
    @Override
    public  void behaviour1(){
        // same implementaion as child2
    }
}

class Child2 extends Problem{
    @Override
    public  void behaviour1(){
        // same implementaion as child1
    }
}


// we r duplicating the the behaviour 1 implementaion