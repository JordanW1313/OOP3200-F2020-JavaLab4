package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    // INSTANCE VARIABLES
    private double yearlySalary;

    // CONSTRUCTOR
    public SalariedEmployee(String id, String fullName, LocalDate birthDate, double salary)
    {
        super(id, fullName, birthDate);
        setYearlySalary(salary);
    }

    // MUTATORS AND ACCESSORS
    public double getYearlySalary()
    {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary)
    {
        if(yearlySalary >= 0)
        {
            this.yearlySalary = yearlySalary;
        }
        else
        {
            throw new IllegalArgumentException("Yearly salary can not beb a negative number.");
        }

    }

    // PUBLIC METHODS
    @Override
    public double calculatePayDay()
    {
        double weeklyPay;

        weeklyPay = this.getYearlySalary() / 52;

        return Math.round(weeklyPay * 100.0) / 100.0;
    }
}
