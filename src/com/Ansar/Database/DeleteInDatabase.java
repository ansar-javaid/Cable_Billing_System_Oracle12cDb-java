package com.Ansar.Database;

import com.Ansar.DataModel.*;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

import javax.swing.*;
import java.sql.Connection;


public class DeleteInDatabase {
    static Connection connection=null;
    static OraclePreparedStatement preparedStatement=null;
    static OracleResultSet resultSet=null;
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    private void fetchError(Exception exception)
    {
        ImageIcon icon = new ImageIcon("images\\error.png");
        JOptionPane.showMessageDialog(null, exception, "Failed", JOptionPane.ERROR_MESSAGE,icon);
    }
    //------------------------------------------------------------------------------------------------------------------
    public boolean DeleteInAccount(int accountNumber)
    {
        connection=DataBaseConnection.Connect();
        try {
            String query="DELETE from ACCOUNT where ACCOUNT_NUMBER=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,accountNumber);
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

    public boolean DeleteInBill(int BillID)
    {
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="DELETE from BILLS where BILL_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,BillID);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //==================================================================================================================

    public boolean DeleteINComment(int CommentID)
    {

        connection=DataBaseConnection.Connect();
        try
        {
            final String query="DELETE from COMENT where COMMENT_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,CommentID);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //==================================================================================================================
    public boolean DeleteInCustomer(int CustomerId)
    {

        connection=DataBaseConnection.Connect();
        try
        {
            final String query="DELETE from CUSTOMER where CUSTOMER_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,CustomerId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return true;

    }
    //==================================================================================================================
    public boolean DeleteINCustomerPhone(int CustomerId, double phone)
    {

        connection=DataBaseConnection.Connect();
        try
        {
            final String query="DELETE from CUSTOMER_PHONE where CUSTOMER_ID=? AND PHONE_NUMBER=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,CustomerId);
            preparedStatement.setDouble(2,phone);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //==================================================================================================================

    public boolean DeleteINEmployee(int EmployeeId)
    {

        connection=DataBaseConnection.Connect();
        try
        {
            final String query="DELETE from Employee where EMP_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,EmployeeId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //==================================================================================================================

    public boolean DeleteInOrder(int OrderID)
    {
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="DELETE from ODER where ORDER_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,OrderID);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //==================================================================================================================
    public boolean DeleteInPayment(int PaymentId)
    {
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="DELETE from PAYMENT where PAYMENT_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,PaymentId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //==================================================================================================================
    public boolean DeleteInService(int ServiceId)
    {

        connection=DataBaseConnection.Connect();
        try
        {
            final String query="DELETE from SERVICES where SERVICE_ID=? ";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,ServiceId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //==================================================================================================================
    public boolean DeleteInServiceType(int ServiceID,String ServiceType)
    {
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="DELETE from SERVICES_TYPE where SERVICE_ID=? AND SERVICE_TYPE=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,ServiceID);
            preparedStatement.setString(2,ServiceType);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("True");
                return true;
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return false;
    }
    //==================================================================================================================
}
