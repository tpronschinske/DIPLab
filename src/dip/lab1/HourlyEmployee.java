package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    
    public double employeeHours;
    public double employeePayRate;

    public HourlyEmployee(double employeeHours, double employeePayRate) {
        this.employeeHours = employeeHours;
        this.employeePayRate = employeePayRate;
    }

    public final double getEmployeeAnnualWages(){
        return employeeHours * employeePayRate; 
    }
    
    
    public final double getEmployeeHours() {
        return employeeHours;
    }

    public final void setEmployeeHours(double employeeHours) {
        this.employeeHours = employeeHours;
    }

    public final double getEmployeePayRate() {
        return employeePayRate;
    }

    public final void setEmployeePayRate(double employeePayRate) {
        this.employeePayRate = employeePayRate;
    }
    
  



}
