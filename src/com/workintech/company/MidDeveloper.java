package com.workintech.company;

public class MidDeveloper extends Employee {

    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @java.lang.Override
    public void work() {
        setSalary(40000);
        System.out.println(getName() + "Mid işe başladı");
    }
}
