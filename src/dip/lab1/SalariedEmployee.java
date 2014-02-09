package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {

    private double employeeAnnualSalary;

    public SalariedEmployee(double employeeAnnualSalary) {
        this.employeeAnnualSalary = employeeAnnualSalary;
    }

    public double getEmployeeAnnualWages(){
        return employeeAnnualSalary;
    }
    
    
    public final double getEmployeeAnnualSalary() {
        return employeeAnnualSalary;
    }

    public final void setEmployeeAnnualSalary(double employeeAnnualSalary) {
        this.employeeAnnualSalary = employeeAnnualSalary;
    }

    
 

    
}
