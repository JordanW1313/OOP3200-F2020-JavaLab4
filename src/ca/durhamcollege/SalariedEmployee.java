package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    // INSTANCE VARIABLES
    private double yearlySalary;

    public SalariedEmployee(String id, String fullName, LocalDate birthDate, double salary)
    {
        super(id, fullName, birthDate);
        setYearlySalary(salary);
    }

    public double getYearlySalary()
    {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary)
    {
        this.yearlySalary = yearlySalary;
    }

    @Override
    public double calculatePayDay()
    {
        double weeklyPay;

        weeklyPay = this.getYearlySalary() / 52;

        return weeklyPay;
    }
}
