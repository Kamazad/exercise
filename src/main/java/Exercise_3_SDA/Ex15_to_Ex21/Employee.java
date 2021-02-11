package Exercise_3_SDA.Ex15_to_Ex21;

import java.time.LocalDate;

public class Employee extends Person {
    private String name;
    private final LocalDate dateOfBirth;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, LocalDate dateOfBirth, double salary) {
        this.name = name;
        if (dateOfBirth.isBefore(LocalDate.parse("1900-01-01"))) {
            this.dateOfBirth = LocalDate.parse("0000-01-01");
        } else if (dateOfBirth.isAfter(LocalDate.parse("2020-12-31"))) {
            this.dateOfBirth = LocalDate.parse("0000-01-01");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
        this.salary = salary;


    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void whoAmI() {
        System.out.println("Nazywam się manager" + getName() + " i zarabiam " + getSalary() + " zł");
    }

}
