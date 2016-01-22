package JUnit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Santer on 21.01.2016.
 */
public class TestEmployeeDetails {

    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails empployee = new EmployeeDetails();

    @Test
    public void testCalculateAppriasal() {
        empployee.setName("Alex");
        empployee.setAge(23);
        empployee.setMounthlySalary(100500);

        double appRaise = empBusinessLogic.calculateAppraisal(empployee);
        Assert.assertEquals(1000, appRaise, 0.0);
    }

    @Test
    public void testCalcYear(){
        empployee.setName("bla");
        empployee.setMounthlySalary(1000);
        double sal = empBusinessLogic.calculateYearSalary(empployee);

        Assert.assertEquals(12000, sal, 10);
    }
}
