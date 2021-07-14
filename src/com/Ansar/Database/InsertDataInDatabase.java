package com.Ansar.Database;

import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;

public class InsertDataInDatabase {
    static Connection connection=null;
    static OraclePreparedStatement preparedStatement=null;
    static OracleResultSet resultSet=null;
    //------------------------------------------------------------------------------------------------------------------
    private void fetchError(Exception exception)
    {
        ImageIcon icon = new ImageIcon("images\\error.png");
        JOptionPane.showMessageDialog(null, exception, "Failed", JOptionPane.ERROR_MESSAGE,icon);
    }
    //------------------------------------------------------------------------------------------------------------------
    public  java.sql.Date stringToDate(String date)  {
        return Date.valueOf(date);
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param accountDetail
     * @param accountType
     * @param customerId
     * @return true or false
     */
    public boolean InsertAccount(String accountDetail, String accountType,int customerId)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO Account Values (ACCOUNT_ID.NEXTVAL, ? , ? , ?)";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,accountDetail);
            preparedStatement.setString(2,accountType);
            preparedStatement.setInt(3,customerId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param employeeId
     * @param customerId
     * @param dateOfBilling
     * @param dueDate
     * @param amount
     * @return true or false
     */
    public boolean InsertBills(int employeeId, int customerId, Date dateOfBilling, Date dueDate, double amount)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO Bills(EMP_ID,CUSTOMER_ID,DATE_OF_BILLING,DUE_DATE,AMMOUNT) Values ( ?, ? , ? , ? , ? )";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,employeeId);
            preparedStatement.setInt(2,customerId);
            preparedStatement.setDate(3,dateOfBilling);
            preparedStatement.setDate(4,dueDate);
            preparedStatement.setDouble(5,amount);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param commentDetails
     * @param paymentId
     * @param customerId
     * @return true or false
     */
    public boolean InsertComment(String commentDetails, int paymentId,int customerId)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO Coment(COMMENT_DETAILS,PAYMENT_ID,CUSTOMER_ID) Values ( ?, ?, ?)";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,commentDetails);
            preparedStatement.setInt(2,paymentId);
            preparedStatement.setInt(3,customerId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param Name
     * @param employeeId
     * @param address
     * @return true or false
     */
    public boolean InsertCustomer(String Name, int employeeId, String address)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO Customer VALUES (CUSTOMER_ID_SEQ.NEXTVAL, ? , ? , ? )";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,Name);
            preparedStatement.setInt(2,employeeId);
            preparedStatement.setString(3,address);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param customerId
     * @param phoneNumber
     * @return true or false
     */
    public boolean InsertCustomerPhone(int customerId, String phoneNumber)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO Customer_phone VALUES ( ? , ?)";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,customerId);
            preparedStatement.setDouble(2,Double.parseDouble(phoneNumber));
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param Name
     * @param salary
     * @return true or false
     */
    public boolean InsertEmployee(String Name, double salary)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO EMPLOYEE VALUES (EMPLOYEE_ID.NEXTVAL, ? , ? )";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,Name);
            preparedStatement.setDouble(2,salary);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param customerId
     * @param orderDate
     * @param serviceId
     * @return true or false
     */
    public boolean InsertOrder(int customerId, Date orderDate, int serviceId)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO Oder VALUES (CABLE_MANAGER.ISEQ$$_72882.NEXTVAL,?,?,?)";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,customerId);
            preparedStatement.setDate(2,orderDate);
            preparedStatement.setInt(3,serviceId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return true;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param paymentDate
     * @param amount
     * @param paymentMethod
     * @param customerId
     * @return true or false
     */
    public boolean InsertPayment(Date paymentDate, double amount, String paymentMethod, int customerId)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO Payment VALUES (CABLE_MANAGER.PAYMENT_ID.NEXTVAL, ? , ? , ? , ?)";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setDate(1,paymentDate);
            preparedStatement.setDouble(2,amount);
            preparedStatement.setString(3,paymentMethod);
            preparedStatement.setInt(4,customerId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return  false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param serviceName
     * @return true or false
     */
    public boolean InsertServices(String serviceName)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO Services VALUES (SERVICES_ID.NEXTVAL, ?)";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,serviceName);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param serviceId
     * @param serviceType
     * @return true or false
     */
    public boolean InsertServicesType(int serviceId,String serviceType)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="INSERT INTO Services_Type VALUES ( ?, ? )";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,serviceId);
            preparedStatement.setString(2,serviceType);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //==================================================================================================================
}
