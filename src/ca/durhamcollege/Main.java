package ca.durhamcollege;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        // Demo for ID that is not 8 characters in length
        try
        {
            SalariedEmployee demo = new SalariedEmployee("1234567", "Bob Smith", LocalDate.now(), 20000);
        }
        catch(IllegalArgumentException i)
        {
            System.out.println(i.toString());
        }
        // Demo for hourly rate less than 17
        try
        {
            HourlyWorker demo2 = new HourlyWorker("69758445", "Bert Johnson", LocalDate.of(1993, 1, 8), 16, 25);
        }
        catch(IllegalArgumentException i)
        {
            System.out.println(i.toString());
        }
        // Demo for hourly rate greater that 48
        try
        {
            HourlyWorker demo3 = new HourlyWorker("69758445", "Brent Johnson", LocalDate.of(1993, 1, 8), 17, 50);
        }
        catch(IllegalArgumentException i)
        {
            System.out.println(i.toString());
        }
        // Demo for hourly rate less than 0
        try
        {
            HourlyWorker demo4 = new HourlyWorker("69758445", "Brent Johnson", LocalDate.of(1993, 1, 8), 17, -1);
        }
        catch(IllegalArgumentException i)
        {
            System.out.println(i.toString());
        }
        // Demo for negative salary
        try
        {
            SalariedEmployee demo3 = new SalariedEmployee("12345678", "Bob Smith", LocalDate.now(), -1);
        }
        catch(IllegalArgumentException i)
        {
            System.out.println(i.toString());
        }
        System.out.println();


        // Salaried employee with appropriate attributes
        SalariedEmployee salary1 = new SalariedEmployee("37501489", "John Smith", LocalDate.of(1992, 12, 10), 20000);

        // salary1's salary to console
        System.out.printf("salary1's Salary: $%.2f", salary1.getYearlySalary());
        System.out.println();


        // Change salary1's salary and print to console
        salary1.setYearlySalary(60000);
        System.out.printf("salary1's new Salary: $%.2f", salary1.getYearlySalary());
        System.out.println();
        System.out.println();

        // Hourly worker with appropriate attributes
        HourlyWorker hourly1 = new HourlyWorker("94252546", "Bob Johnson", LocalDate.of(1992, 12, 10), 18, 40);

        // hourly1's hours and rate to console
        System.out.printf("hourly1's Hourly Rate: $%.2f", hourly1.getHourlyRate());
        System.out.println();
        System.out.println("hourly1's Weekly Hours: " + hourly1.getWeeklyHours());
        System.out.println();

        // Change and display hourly1's hours and rate
        hourly1.setWeeklyHours(30);
        hourly1.setHourlyRate(19);
        System.out.printf("hourly1's new Hourly Rate: $%.2f", hourly1.getHourlyRate());
        System.out.println();
        System.out.println("hourly1's new Weekly Hours: " + hourly1.getWeeklyHours());
        System.out.println();

        try
        {
            // Two salaried employees with appropriate attributes
            SalariedEmployee salary2 = new SalariedEmployee("37536689", "John Carter", LocalDate.of(1992, 12, 10), 20000);
            SalariedEmployee salary3 = new SalariedEmployee("94461659", "Kayla Smith", LocalDate.of(1998, 8, 15), 30000);

            // Three hourly workers with appropriate attributes
            HourlyWorker hourly2 = new HourlyWorker("69758445", "Bert Johnson", LocalDate.of(1993, 1, 8), 18, 25);
            HourlyWorker hourly3 = new HourlyWorker("45216845", "Luke Smith", LocalDate.of(1994, 10, 23), 19, 30);
            HourlyWorker hourly4 = new HourlyWorker("12354865", "Kyle Ross", LocalDate.of(1996, 5, 11), 17, 48);

            // Employee array with above employees
            Employee[] employeeArray = {salary2, salary3, hourly2, hourly3, hourly4};


            // Pay report
            System.out.println("     Pay Report");
            System.out.println("------------------------");

            // Loop to display employee infor
            for (Employee var : employeeArray)
            {
                System.out.println("Employee ID: " + var.getEmployeeID());
                System.out.println("Employee Name: " + var.getName());
                System.out.printf("Employee Pay For The Week: $%.2f", var.calculatePayDay());
                System.out.println();
                System.out.println();

            }
        }
        catch (IllegalArgumentException i)
        {
            System.out.println(i.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
