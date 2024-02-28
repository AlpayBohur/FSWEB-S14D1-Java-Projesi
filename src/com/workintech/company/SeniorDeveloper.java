package com.workintech.company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @java.lang.Override
    public void work() {
        setSalary(55000);
        System.out.println(getName() + "senior basladı");
    }
}
