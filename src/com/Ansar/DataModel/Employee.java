package com.Ansar.DataModel;


public class Employee extends ProfessionalDetails{

 // private int employeeId; //This
 // private String employeeName; //This
  private double salary;

 /**
  * @param employeeId
  * @param Name
  * @param salary
  */
 public Employee(int employeeId, String Name, double salary) {
  super(employeeId,Name);
  this.salary = salary;
 }
 //Getters & Setters----------------------------------------------------------------------------------------------------
 public double getSalary() { return salary; }
 public void setSalary(double salary) { this.salary = salary; }
 //=====================================================================================================================
}
