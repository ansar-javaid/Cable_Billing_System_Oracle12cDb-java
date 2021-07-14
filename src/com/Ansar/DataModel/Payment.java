package com.Ansar.DataModel;


import java.sql.Date;

public class Payment extends ProfessionalDetails{

  private int paymentId;
  private java.sql.Date paymentDate;
 // private double amount; //This
  private String paymentMethod;
 // private int customerId; //This

    /**
     * @param paymentId
     * @param paymentDate
     * @param amount
     * @param paymentMethod
     * @param customerId
     */
    public Payment(int paymentId, Date paymentDate, double amount, String paymentMethod, int customerId) {
        super(customerId,amount);
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }
  //Getters & Setters---------------------------------------------------------------------------------------------------
    public int getPaymentId() { return paymentId; }
    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }
    public Date getPaymentDate() { return paymentDate; }
    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
  //====================================================================================================================
}
