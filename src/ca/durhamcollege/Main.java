package ca.durhamcollege;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        SalariedEmployee test = new SalariedEmployee("12345678", "Bob Smith", LocalDate.now(), 60000);

        System.out.println("ID: " + test.getEmployeeID() + " Name: " + test.getName() + " Birth Date: " + test.getBirthDate() + " Salary: " + test.getYearlySalary());
        System.out.println(test.calculatePayDay());
    }
}
