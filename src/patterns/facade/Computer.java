package patterns.facade;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void run() {
        cpu.processData();
        memory.load();
        hardDrive.readData();
    }
}
