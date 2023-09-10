package com.patterns.structural.facade.impl;

import com.patterns.structural.facade.impl.complex.CPU;
import com.patterns.structural.facade.impl.complex.HardDrive;
import com.patterns.structural.facade.impl.complex.RAM;

/**
 * Facade to simplify interaction with computer components
 */
public class ComputerFacade {
    private final CPU cpu;
    private final RAM ram;
    private final HardDrive hardDrive;

    /**
     *
     */
    public ComputerFacade() {
        this.cpu = new CPU();
        this.ram = new RAM();
        this.hardDrive = new HardDrive();
    }

    /**
     *
     */
    public void start() {
        System.out.println("Starting the computer...");
        cpu.processData();
        ram.loadMemory();
        hardDrive.readData();
        System.out.println("Computer is ready to use.");
    }

    /**
     *
     */
    public void shutDown() {
        System.out.println("Shutting down the computer...");
        System.out.println("Saving data to hard drive...");
        System.out.println("Memory cleared...");
        System.out.println("Computer is powered off.");
    }
}
