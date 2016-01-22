package JUnit;

/**
 * Created by Santer on 21.01.2016.
 * POJO class, s, Business logic class and a test class which will be run by test runner.
 */

public class EmployeeDetails {
    private String name;
    private double mounthlySalary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMounthlySalary() {
        return mounthlySalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMounthlySalary(double mounthlySalary) {
        this.mounthlySalary = mounthlySalary;
    }
}
