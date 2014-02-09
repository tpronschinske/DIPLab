/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab1;

/**
 *
 * @author Celeste
 */
public class SalariedPlusCommissionEmployee implements Employee {
    
    private double employeeAnnualSalary;
    private double employeeAnnualSales;
    private double employeeSales = 0;
    

    public SalariedPlusCommissionEmployee(double employeeAnnualSalary, double employeeAnnualSales) {
        this.employeeAnnualSalary = employeeAnnualSalary;
        this.employeeAnnualSales = employeeAnnualSales;
    }

    public final double getEmployeeAnnualSalary() {
        return employeeAnnualSalary;
    }

    public final void setEmployeeAnnualSalary(double employeeAnnualSalary) {
        this.employeeAnnualSalary = employeeAnnualSalary;
    }

    public final double getEmployeeAnnualSales() {
        return employeeAnnualSales;
    }

    public final void setEmployeeAnnualSalesCommission(double employeeAnnualSalesCommission) {
        this.employeeAnnualSales = employeeAnnualSales;
    }
    
    @Override
    public double getEmployeeAnnualWages(){
        return employeeAnnualSalary + (employeeAnnualSales * employeeSales);
    }
    
    
}
