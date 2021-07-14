package com.Ansar.Database;

import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Savepoint;

public class UpdateDataInDatabase {
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
     * @param accountNumber
     * @param accountDetail
     * @param accountType
     * @param customerId
     * @return true or false
     */
    public boolean UpdateInAccount(int accountNumber, String accountDetail, String accountType,int customerId)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="UPDATE ACCOUNT SET ACCOUNT_DETAIL=? ,ACCOUNT_TYPE=? ,CUSTOMER_ID=? where ACCOUNT_NUMBER=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,accountDetail);
            preparedStatement.setString(2,accountType);
            preparedStatement.setInt(3,customerId);
            preparedStatement.setInt(4,accountNumber);
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
     * @param billId
     * @param employeeId
     * @param customerId
     * @param dateOfBilling
     * @param dueDate
     * @param amount
     * @return true false
     */
    public boolean UpdateInBills(int billId, int employeeId, int customerId,  Date dateOfBilling, Date dueDate, double amount)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="UPDATE BILLS SET EMP_ID=? ,CUSTOMER_ID=? ,DATE_OF_BILLING=? ,DUE_DATE=? ,AMMOUNT=? where BILL_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,employeeId);
            preparedStatement.setInt(2,customerId);
            preparedStatement.setDate(3,dateOfBilling);
            preparedStatement.setDate(4,dueDate);
            preparedStatement.setDouble(5,amount);
            preparedStatement.setInt(6,billId);
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
     * @param commentId
     * @param commentDetails
     * @param paymentId
     * @param customerId
     * @return true or false
     */
    public boolean UpdateINComment(int commentId, String commentDetails, int paymentId,int customerId)
    {
        connection=DataBaseConnection.Connect();
        try {
            //String query="INSERT INTO Coment(COMMENT_DETAILS,PAYMENT_ID,CUSTOMER_ID) Values ( ?, ?, ?)";
            String query="UPDATE COMENT SET COMMENT_DETAILS=? ,PAYMENT_ID=? ,CUSTOMER_ID=? where COMMENT_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,commentDetails);
            preparedStatement.setInt(2,paymentId);
            preparedStatement.setInt(3,customerId);
            preparedStatement.setInt(4,commentId);
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
     * @param Name
     * @param employeeId
     * @param address
     * @return true or false
     */
    public boolean UpdateINCustomer(int customerId, String Name, int employeeId, String address)
    {
        connection=DataBaseConnection.Connect();
        try {
            //String query="INSERT INTO Customer VALUES (CUSTOMER_ID_SEQ.NEXTVAL, ? , ? , ? )";
            String query="UPDATE CUSTOMER SET CUSTOMER_NAME=? ,EMP_ID=? ,ADDRESS=? where CUSTOMER_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,Name);
            preparedStatement.setInt(2,employeeId);
            preparedStatement.setString(3,address);
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
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @param customerId
     * @param phoneNumber
     * @param OldCustomerID
     * @param OldPhone
     * @return true or false
     */
    public boolean UpdateINCustomerPhone(int customerId, String phoneNumber,int OldCustomerID,String OldPhone)
    {
        connection=DataBaseConnection.Connect();
        try {
            //String query="INSERT INTO Customer_phone VALUES ( ? , ?)";
            String  query="UPDATE CUSTOMER_PHONE SET PHONE_NUMBER=? ,CUSTOMER_ID=? where CUSTOMER_ID=? AND PHONE_NUMBER=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setDouble(1,Double.parseDouble(phoneNumber));
            preparedStatement.setInt(2,customerId);
            preparedStatement.setInt(3,OldCustomerID);
            preparedStatement.setDouble(4,Double.parseDouble(OldPhone));
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
     * @param Name
     * @param salary
     * @return
     */
    public boolean UpdateInEmployee(int employeeId, String Name, double salary)
    {

        connection=DataBaseConnection.Connect();
        try {
            String query="UPDATE EMPLOYEE SET EMP_NAME=? ,SALARY=? where EMP_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,Name);
            preparedStatement.setDouble(2,salary);
            preparedStatement.setInt(3,employeeId);
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
     * @param orderId
     * @param customerId
     * @param orderDate
     * @param serviceId
     * @return
     */
    public boolean UpdateInOrder(int orderId, int customerId, Date orderDate, int serviceId)
    {

        connection=DataBaseConnection.Connect();
        try {
            //String query="INSERT INTO Oder VALUES (CABLE_MANAGER.ISEQ$$_72882.NEXTVAL,?,?,?)";
            String query="UPDATE ODER SET CUSTOMER_ID=? ,ORDER_DATE=? ,SERVICE_ID=? where ORDER_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,customerId);
            preparedStatement.setDate(2,orderDate);
            preparedStatement.setInt(3,serviceId);
            preparedStatement.setInt(4,orderId);
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
     * @param paymentId
     * @param paymentDate
     * @param amount
     * @param paymentMethod
     * @param customerId
     * @return
     */
    public boolean UpdateInPayment(int paymentId, Date paymentDate, double amount, String paymentMethod, int customerId)
    {
        connection=DataBaseConnection.Connect();
        try {
            //String query="INSERT INTO Payment VALUES (CABLE_MANAGER.PAYMENT_ID.NEXTVAL, ? , ? , ? , ?)";
            String query="UPDATE PAYMENT SET PAYMENT_DATE=? ,AMMOUNT=? ,PAYMENT_MWTHOD=? ,CUSTOMER_ID=? where PAYMENT_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setDate(1,paymentDate);
            preparedStatement.setDouble(2,amount);
            preparedStatement.setString(3,paymentMethod);
            preparedStatement.setInt(4,customerId);
            preparedStatement.setInt(5,paymentId);
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
     * @param serviceId
     * @param serviceName
     * @return true or false
     */
    public boolean UpdateInServices(int serviceId, String serviceName)
    {
        connection=DataBaseConnection.Connect();
        try {
            //String query="INSERT INTO Services VALUES (SERVICES_ID.NEXTVAL, ?)";
            String query="UPDATE SERVICES SET SERVICE_NAME=? where SERVICE_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,serviceName);
            preparedStatement.setInt(2,serviceId);
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
     * @param OldServiceID
     * @param OldServiceType
     * @return
     */
    public boolean UpdateInServiceType(int serviceId, String serviceType, int OldServiceID, String OldServiceType)
    {
        connection=DataBaseConnection.Connect();
        try {
            //String query="INSERT INTO Services_Type VALUES ( ?, ? )";
            String query="UPDATE SERVICES_TYPE SET SERVICE_ID=? ,SERVICE_TYPE=? where SERVICE_ID=? AND SERVICE_TYPE=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,serviceId);
            preparedStatement.setString(2,serviceType);
            preparedStatement.setInt(3,OldServiceID);
            preparedStatement.setString(4,OldServiceType);
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

    public void commit()
    {
        connection=DataBaseConnection.Connect();
        try {

            assert connection != null;
            connection.setAutoCommit(false);
            connection.commit();
            if(resultSet.next())
            {
                System.out.println("True");
            }

        }catch (Exception e)
        {
            fetchError(e);
        }
    }
    //==================================================================================================================

    public void rollBack()
    {
        connection=DataBaseConnection.Connect();
        try {

            assert connection != null;
            try {
                connection.setAutoCommit(false);
            }catch (SQLException exception) {
                connection.rollback();
                fetchError(exception);
            }
        }catch (SQLException e)
        {
            fetchError(e);
        }
    }
}
