package com.workintech.company;

public class HRManager  extends Employee {

    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;
    public HRManager(long id, String name, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    @java.lang.Override
    public void work() {
        setSalary(60000);
        System.out.println(getName() + "İşe basladı");
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {
            if (juniors[index] == null) {
                juniors[index] = juniorDeveloper;
            } else {
                System.out.println("ındex ıs full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("ındex net found: " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper mid) {
        try {
            if (mids[index] == null) {
                mids[index] = mid;
            } else {
                System.out.println("ındex ıs full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("ındex net found: " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper senior) {
        try {
            if (seniors[index] == null) {
                seniors[index] = senior;
            } else {
                System.out.println("ındex ıs full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("ındex net found: " + index);
        }
    }

    @java.lang.Override
    public String toString() {
        return super.toString() + "HRManager{" +
                "juniors=" + java.util.Arrays.toString(juniors) +
                ", mids=" + java.util.Arrays.toString(mids) +
                ", seniors=" + java.util.Arrays.toString(seniors) +
                '}';
    }
}
