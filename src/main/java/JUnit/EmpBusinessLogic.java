package JUnit;

/**
 * Created by Santer on 21.01.2016.
 */
public class EmpBusinessLogic {

    public double calculateYearSalary(EmployeeDetails employeeDetails) {
        double yearSal = 0;
        yearSal = employeeDetails.getMounthlySalary() * 12;
        return yearSal;
    }

    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraiSal = 0;
        if (employeeDetails.getMounthlySalary() < 10000) {
            appraiSal = 500;
        } else appraiSal = 1000;
        return appraiSal;
    }

}
