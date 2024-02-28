import com.workintech.company.HRManager;
import com.workintech.company.JuniorDeveloper;
import com.workintech.company.MidDeveloper;
import com.workintech.company.SeniorDeveloper;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Cuboid;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1, 3);
        System.out.println("area = " + cylinder.getArea());
        System.out.println("volume = " + cylinder.getVolume());


        Cuboid cuboid = new Cuboid(2, 3, 2);
        System.out.println("area = " + cuboid.getArea());
        System.out.println("volume = " + cuboid.getVolume());


        JuniorDeveloper junior1 = new JuniorDeveloper(1, "alpay");
        JuniorDeveloper junior2 = new JuniorDeveloper(2, "ali");

        junior1.work();
        junior2.work();

        System.out.println(junior1);
        System.out.println(junior2);

        MidDeveloper mid1 = new MidDeveloper(3,"alpay");
        MidDeveloper mid2 = new MidDeveloper(4,"alpay");

        mid1.work();
        mid2.work();

        System.out.println(mid1);
        System.out.println(mid2);

        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(5, "alpay");
        SeniorDeveloper seniorDeveloper2 = new SeniorDeveloper(6, "alpay");

        seniorDeveloper1.work();
        seniorDeveloper2.work();

        System.out.println(seniorDeveloper1);
        System.out.println(seniorDeveloper2);

        HRManager hrManager = new HRManager( 7, "alpay", new JuniorDeveloper[5], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1, junior2);
        hrManager.addEmployee(0,mid1);
        hrManager.addEmployee(1,mid2);
        hrManager.addEmployee(0, seniorDeveloper1);

        System.out.println(hrManager);


    }
}