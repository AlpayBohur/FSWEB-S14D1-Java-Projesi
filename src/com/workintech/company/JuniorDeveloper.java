package com.workintech.company;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @java.lang.Override
    public void work() {
        setSalary(32000);
        System.out.println(getName() + "İŞE BASLADI...");
    }
}
