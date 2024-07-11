package Abstract_Factory;

public class Sol {
    public static void main(String[] args) {


        // Display winDis = new WindowsFactory().getDisplay();
        // KeyBinding winBin = new WindowsFactory().getKeyBinding();
        //  ****** never do this ******see we are bound to use windows in it

        PlatformAbstarctFactory factory = new MacFactory();
        Display winDis = factory.getDisplay();
        KeyBinding winBin = factory.getKeyBinding();

        winDis.displayMechanism();
        winBin.KeyBindingMechanism();
    }
}



// *******************************************************************************************************

interface PlatformAbstarctFactory{
    public Display getDisplay();
    public KeyBinding getKeyBinding();

}

class WindowsFactory implements PlatformAbstarctFactory{
    public Display getDisplay(){
        return new WindowsDisplay();
    }
    public KeyBinding getKeyBinding(){
        return new WindowsKeyBinding();
    }

}

class MacFactory implements PlatformAbstarctFactory{
    public Display getDisplay(){
        return new MacDisplay();
    }
    public KeyBinding getKeyBinding(){
        return new MacKeyBinding();
    }
    
}

class linuxFactory implements PlatformAbstarctFactory{
    public Display getDisplay(){
        return new LinuxDisplay();
    }
    public KeyBinding getKeyBinding(){
        return new LinuxKeyBinding();
    }
    
}

// *******************************************************************************************************




// *******************************************************************************************************

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
interface Display{
    public void displayMechanism();
}

class WindowsDisplay implements Display{
    public void displayMechanism(){
    System.out.println("Windows Display ");
    }

}

class MacDisplay implements Display{
    public void displayMechanism(){
    System.out.println("Mac Display ");
        
    }

}

class LinuxDisplay implements Display{
    public void displayMechanism(){
    System.out.println("Linux Display ");
        
    }

}
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++



// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++

interface KeyBinding{
    public void KeyBindingMechanism();
}

class WindowsKeyBinding implements KeyBinding{
    public void KeyBindingMechanism(){
    System.out.println("Windows Keybindings ");
        
    }

}

class MacKeyBinding implements KeyBinding{
    public void KeyBindingMechanism(){
    System.out.println("Mac Keybindings ");
         
    }

}

class LinuxKeyBinding implements KeyBinding{
    public void KeyBindingMechanism(){
        System.out.println("Linux Keybindings ");
    }

}
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++


// *******************************************************************************************************






