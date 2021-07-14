package com.Ansar.DataModel;


import java.sql.Date;

public class Bills extends ProfessionalDetails{

  private int billId;
 // private int employeeId; //This
 // private int customerId; //This
  private java.sql.Date dateOfBilling;
  private java.sql.Date dueDate;
 // private double amount; //This

    /**
     * @param billId
     * @param employeeId
     * @param customerId
     * @param dateOfBilling
     * @param dueDate
     * @param amount
     */
    public Bills(int billId, int employeeId, int customerId,  Date dateOfBilling, Date dueDate, double amount) {
        super(employeeId,customerId, amount);
        this.billId = billId;
        this.dateOfBilling = dateOfBilling;
        this.dueDate = dueDate;
    }

    //Getters & Setters-------------------------------------------------------------------------------------------------
    public int getBillId() { return billId; }
    public void setBillId(int billId) { this.billId = billId; }
    public Date getDateOfBilling() { return dateOfBilling; }
    public void setDateOfBilling(Date dateOfBilling) { this.dateOfBilling = dateOfBilling; }
    public Date getDueDate() { return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }
    //==================================================================================================================
}
