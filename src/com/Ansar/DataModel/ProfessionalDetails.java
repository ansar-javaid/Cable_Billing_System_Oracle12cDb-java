package com.Ansar.DataModel;

abstract class ProfessionalDetails {
    private int customerId;
    private int employeeId;
    private String Name;
    private double amount;
    //Constructors------------------------------------------------------------------------------------------------------
    /**
     * @param customerId
     */
    public ProfessionalDetails(int customerId) {
        this.customerId=customerId;
    }

    /**
     * @param employeeId
     * @param customerId
     * @param amount
     */
    public ProfessionalDetails(int employeeId, int customerId, double amount) {
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.amount = amount;
    }

    /**
     * @param customerId
     * @param name
     * @param employeeId
     */
    public ProfessionalDetails(int customerId, String name, int employeeId) {
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.Name = name;
    }

    /**
     * @param employeeId
     * @param name
     */
    public ProfessionalDetails(int employeeId, String name) {
        this.employeeId = employeeId;
        Name = name;
    }

    /**
     * @param customerId
     * @param amount
     */
    public ProfessionalDetails(int customerId, double amount) {
        this.customerId = customerId;
        this.amount = amount;
    }
    //Getters-----------------------------------------------------------------------------------------------------------
    public int getCustomerId() { return customerId; }
    public int getEmployeeId() { return employeeId; }
    public String getName() { return Name; }
    public double getAmount() { return amount; }
    //Setters-----------------------------------------------------------------------------------------------------------
    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setName(String name) { Name = name; }
    public void setAmount(double amount) { this.amount = amount; }
    //==================================================================================================================
}
