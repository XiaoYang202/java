package com.hspedu.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ExtendsExercise {
    public static void main(String[] args) {
        Pc pc = new Pc("intel", 16, 500, "ibm");
        pc.printInfo();
    }


}

class Computer {
    private String CPU;
    private int memory;
    private int disk;

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    //返回computer详细信息
    public String getDetails() {
        return "cpu = " + CPU + " memory = " + memory + " disk = " + disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}


class Pc extends Computer {

    private String brand;

    public Pc(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("pc信息如下=");
        System.out.println(getDetails() + " brand = " + brand);
    }

}
