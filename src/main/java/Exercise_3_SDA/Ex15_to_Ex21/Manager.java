package Exercise_3_SDA.Ex15_to_Ex21;

import java.time.LocalDate;

public class Manager extends Employee{


    public Manager(String name, LocalDate dateOfBirth, double salary) {
        super(name, dateOfBirth,(salary*1.1));
    }

    @Override
    public void whoAmI (){
        System.out.println("Nazywam się "+ getClass() + " " + getName()
                + " i zarabiam " + getSalary() + " zł");
    }
}
