package Observer_pattern.Sol;

import java.util.ArrayList;

public class Sol {
    public static void main(String[] args) {
        C_ObservEE obse = new C_ObservEE();
        FakeSensor fs = new FakeSensor(obse);
        C_ObservER obser = new C_ObservER(obse);

        obse.add(obser);

    }
}

interface I_ObservE {
    public void add(I_ObservER a);

    public void remove(I_ObservER b);

    // Ohh now you're thinking about it why I have Named it as customNotify rather than notify
    // Because notify is a object class method and it is also final which means we cannot override it........
    public void CustomNotify();

}

interface I_ObservER {
    public void update();
}




class C_ObservEE implements I_ObservE {
   private int omstate;

    static ArrayList<I_ObservER> list = new ArrayList<I_ObservER>();

    public void add(I_ObservER a) {
        list.add(a);
    }

    public void remove(I_ObservER b) {
        list.remove(b);
    }

    public void CustomNotify() {
        for (int i = 0; i < list.size(); i++) {
            // list.get(i).update(omstate);
            list.get(i).update();
        }
    }

    public synchronized int getState() {
        return this.omstate;
    }

    public void setState(int state) {
        this.omstate = state;
        CustomNotify();
    }

}


class C_ObservER implements I_ObservER {
    C_ObservEE inst;

    C_ObservER(C_ObservEE inst) {
        this.inst = inst;
    }
    // public void update(int c) {

    // System.err.println(" it just got updated" + c);

    // }

    // We would not use this pattern because it bounds the observee To give Value when updated ...
    // But suppose our observer doesn't need that value ..it just need that it is updated or not..... so this means we are not utilizing our resources properly
    // Because of this we would just notify our observers that changed happened and now it is observer responsibility whether to fetch the values or whether not to fetch the value
    // If observer wants the value .......Then it definately Need to pass the observe reference in the constructor..........Because if we not pass that reference then how we can call get state method on the observee

    public void update() {
        System.out.println(inst.getState());
    }
}
