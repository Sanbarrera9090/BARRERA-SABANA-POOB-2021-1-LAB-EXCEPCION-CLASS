package edu.sabana.poob.sabanapayroll;

import java.util.UUID;

public abstract class Employee {

    private UUID id;
    private String name;
    private String lastName;
    private Department department;

    public Employee(String name, String lastName, Department department) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.department = department;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s, department %s, salary $%s,", this.name, this.lastName, this.department.getName(), this.calculateSalary());
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

}
