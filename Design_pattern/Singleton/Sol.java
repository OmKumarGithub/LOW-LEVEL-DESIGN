package Singleton;

public class Sol {
    public static void main(String[] args) {
        OnlyOneObject var1 = OnlyOneObject.getInstance();
        OnlyOneObject var2 = OnlyOneObject.getInstance();

        System.out.println(var1);
        System.out.println(var2);
        
    }
}

class OnlyOneObject{

    static OnlyOneObject instance = null;


    // See just declaring constructor as a private no one can make an object of this class
    // But the question is if no one can make the constructor then how we can make the initial object 
    // Answer is by static methods
    private OnlyOneObject(){};

    static OnlyOneObject getInstance(){
        if(instance==null){
            instance = new OnlyOneObject();
            return instance;
        }
        else{
            return instance;
        }
    }
}


// This method is generally not considered Best method for best design pattern
// Because you are bound the user to not create more than one instance.......
// Well there is nothing wrong in using one instance all over your project 
// But when you found user do not use any other instance you revoke user capability make another instance this is generally considered a bad practise 





// Bill Pugh vs Synchronized Singleton Implementation
