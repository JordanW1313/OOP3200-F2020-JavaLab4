package ca.durhamcollege;

import java.time.LocalDate;

public abstract class Employee extends Person
{
    // PRIVATE INSTANCE VARIABLES
    final private String ID;

    // CONSTRUCTOR
    public Employee(String id, String fullName, LocalDate birthDate)
    {
        super(fullName, birthDate);
        try
        {
            if(id.length() == 8)
            {
                ID = id;
            }
            else
            {

                ID = id;
            }
        }
        catch(IllegalArgumentException i)
        {

        }



    }

    // MUTATORS
    public String getEmployeeID()
    {
        return ID;
    }
}
