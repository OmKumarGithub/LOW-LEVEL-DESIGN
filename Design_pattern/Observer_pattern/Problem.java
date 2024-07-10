// polling is a  bad technique ........................leetcode intenally uses this technique ........it constantly ask its server if the code execution is completed or not ...........the better architecture would be server telling ........i have the result to the frontend  

package Observer_pattern;

public class Problem {
    int state=1;

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

}


class Observer extends Problem{
    int obsState ;
    Problem par;

    Observer(Problem par){
        this.obsState = par.getState();
        this.par = par;

    }

    // public void Continous(){
    //  for(int i =0 ; ; i++){
    //     if(obsState!= par.getState()){
    //         this.obsState =par.getState();
    //         break;
    //     }
    //  }
    //  Continous();
    // }

    //  Stackoverflow ki problem mein fas jayega ........ye nhi /

    public void Continous(){
        while (true) {
            if(this.obsState != par.getState()){
                this.obsState = par.getState();
                System.out.println("Observer detected change. ");

            }
            System.out.println("just checking chillll ");

        

            try{
                Thread.sleep(1000);///////////////sleep throws exception
            }catch(Exception e){
                System.out.println(e);
                break;
            }
            
        }
    }
    public static void main(String[] args) {
        Problem problem = new Problem();
        Observer observer = new Observer(problem);
        observer.Continous();
    }
}


