package ca.durhamcollege;

import java.time.LocalDate;

public abstract class Employee extends Person {
    // PRIVATE INSTANCE VARIABLES
    final private String ID;

    // CONSTRUCTOR
    public Employee(String id, String fullName, LocalDate birthDate) {
        super(fullName, birthDate);
        if (id.length() != 8) {
            throw new IllegalArgumentException("Length error");
        } else {
            ID = id;

        }

    }

    // MUTATORS
    public String getEmployeeID() {
        return ID;
    }

    public double calculatePayDay()
    {
        return 0.0;
    }
}
