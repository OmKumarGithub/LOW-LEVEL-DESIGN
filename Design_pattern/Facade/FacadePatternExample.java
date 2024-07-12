package Facade;

//facade you can  apply everywhere because it means ,it is just an abstraction you can hide your complex logic
//  and give the user the most simplified version of calling it and this function which is the most simplified is known as facade

// *************************************
class CPU {
    public void freeze() {
        System.out.println("CPU is frozen.");
    }

    public void jump(long position) {
        System.out.println("CPU jumps to position " + position);
    }

    public void execute() {
        System.out.println("CPU is executing.");
    }
}
// ************************************

class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data at position " + position);
    }
}

// *****************************************
class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading " + size + " bytes from LBA " + lba);
        return new byte[size];
    }
}

// Facade class
class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
    }
}

public class FacadePatternExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
    }
}
