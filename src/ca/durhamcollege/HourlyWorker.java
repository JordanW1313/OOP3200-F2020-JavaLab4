package ca.durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee
{
    // INSTANCE VARIABLES
    private double hourlyRate;
    private double weeklyHours;

    // CONSTRUCTOR
    public HourlyWorker(String id, String fullName, LocalDate birthDate, double rate, double hours)
    {
        super(id, fullName, birthDate);
    }

    // MUTATORS AND ACCESSORS
    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate)
    {
        if(hourlyRate > 17)
        {
            this.hourlyRate = hourlyRate;
        }
        else
        {
            throw new IllegalArgumentException("Hourly rate must be above $17 or above.");
        }

    }

    public double getWeeklyHours()
    {
        return weeklyHours;
    }

    public void setWeeklyHours(double weeklyHours)
    {
        if(weeklyHours <= 48.0 && weeklyHours >= 0)
        {
            this.weeklyHours = weeklyHours;
        }
        else
        {
            throw new IllegalArgumentException("Weekly hours must be between 0 and 48.");
        }


    }

    // PUBLIC METHODS

    @Override
    public double calculatePayDay()
    {
        double weeklyPay;

        weeklyPay = this.weeklyHours * this.hourlyRate;

        return Math.round(weeklyPay * 100.0) / 100.0;
    }
}
