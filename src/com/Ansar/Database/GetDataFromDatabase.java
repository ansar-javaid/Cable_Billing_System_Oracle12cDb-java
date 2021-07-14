package com.Ansar.Database;

import com.Ansar.DataModel.*;
import com.Ansar.LinkedList.LinkedList;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;

public class GetDataFromDatabase {
    static Connection connection=null;
    static OraclePreparedStatement preparedStatement=null;
    static OracleResultSet resultSet=null;
    //==================================================================================================================
    public void fetchError(Exception e)
    {
        ImageIcon icon = new ImageIcon("images\\error.png");
        JOptionPane.showMessageDialog(null, e, "Failed", JOptionPane.ERROR_MESSAGE,icon);
    }

    /**
     * @return LinkedList
     * <p>Fetch the whole Employees table data from Database.<p/>
     */
    public LinkedList<Employee> getEmployees()
    {
        LinkedList<Employee> employeeLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from Employee";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int EMP_ID=resultSet.getInt("EMP_ID");
                String Name=resultSet.getString("EMP_NAME");
                double Salary=resultSet.getInt("SALARY");
                employeeLinkedList.add(new Employee(EMP_ID,Name,Salary));
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return employeeLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return LinkedList
     *  <p>Fetch the whole Customer table data from Database.<p/>
     */
    public LinkedList<Customer> getCustomer()
    {
        LinkedList<Customer> customerLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from CUSTOMER";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                String Name=resultSet.getString("CUSTOMER_NAME");
                int EMP_ID=resultSet.getInt("EMP_ID");
                String ADDRESS=resultSet.getString("ADDRESS");
                customerLinkedList.add(new Customer(CUSTOMER_ID,Name,EMP_ID,ADDRESS));
            }
        }
        catch (Exception e)
        {
           fetchError(e);
        }
        return customerLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @return LinkedList
     * <p>Fetch the whole Customer_Phone table data from Database.<p/>
     */
    public LinkedList<CustomerPhone> getCustomerPhone()
    {
        LinkedList<CustomerPhone> customerPhoneLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from CUSTOMER_PHONE";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int CUSTOMER_ID=Integer.parseInt(resultSet.getString("CUSTOMER_ID"));
                String CUSTOMER_PHONE=resultSet.getString("PHONE_NUMBER");
                customerPhoneLinkedList.add(new CustomerPhone(CUSTOMER_ID,CUSTOMER_PHONE));
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return customerPhoneLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @return LinkedList
     * <p>Fetch the whole Order table data from Database.<p/>
     */
    public LinkedList<Oder> getOrder()
    {
        LinkedList<Oder> oderLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from ODER";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int ORDER_ID=resultSet.getInt("ORDER_ID");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                Date ORDER_DATE=resultSet.getDate("ORDER_DATE");
                int SERVICE_ID=resultSet.getInt("SERVICE_ID");
                oderLinkedList.add(new Oder(ORDER_ID,CUSTOMER_ID,ORDER_DATE,SERVICE_ID));
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return oderLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @return LinkedList
     * <p>Fetch the whole Payment table data from Database.<p/>
     */
    public LinkedList<Payment> getPayment()
    {
        LinkedList<Payment> paymentLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from PAYMENT";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int PAYMENT_ID=resultSet.getInt("PAYMENT_ID");
                Date PAYMENT_DATE=resultSet.getDate("PAYMENT_DATE");
                double AMOUNT=resultSet.getDouble("AMMOUNT");
                String PAYMENT_METHOD=resultSet.getString("PAYMENT_MWTHOD");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                paymentLinkedList.add(new Payment(PAYMENT_ID,PAYMENT_DATE,AMOUNT,PAYMENT_METHOD,CUSTOMER_ID));
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return paymentLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @return LinkedList
     * <p>Fetch the whole Services table data from Database.<p/>
     */
    public LinkedList<Services> getServices()
    {
        LinkedList<Services> servicesLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from SERVICES";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int SERVICE_ID=resultSet.getInt("SERVICE_ID");
                String SERVICE_NAME=resultSet.getString("SERVICE_NAME");
                servicesLinkedList.add(new Services(SERVICE_ID,SERVICE_NAME));
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return servicesLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @return LinkedList
     * <p>Fetch the whole Services_TYPE table data from Database.<p/>
     */
    public LinkedList<ServicesType> getServicesType()
    {
        LinkedList<ServicesType> servicesTypeLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from SERVICES_TYPE";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int SERVICE_ID=resultSet.getInt("SERVICE_ID");
                String SERVICE_TYPE=resultSet.getString("SERVICE_TYPE");
                servicesTypeLinkedList.add(new ServicesType(SERVICE_ID,SERVICE_TYPE));

            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return servicesTypeLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @return LinkedList
     *<p>Fetch the whole Account table data from Database.<p/>
     */
    public LinkedList<Account> getAccount()
    {
        LinkedList<Account> accountLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from ACCOUNT";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int ACCOUNT_NUMBER=resultSet.getInt("ACCOUNT_NUMBER");
                String ACCOUNT_DETAIL=resultSet.getString("ACCOUNT_DETAIL");
                String ACCOUNT_TYPE=resultSet.getString("ACCOUNT_TYPE");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                accountLinkedList.add(new Account(ACCOUNT_NUMBER,ACCOUNT_DETAIL,ACCOUNT_TYPE,CUSTOMER_ID));
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return accountLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @return LinkedList
     * <p>Fetch the whole Bills table data from Database.<p/>
     */
    public LinkedList<Bills> getBill()
    {
        LinkedList<Bills> billsLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from BILLS";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int BILL_ID=resultSet.getInt("BILL_ID");
                int EMP_ID=resultSet.getInt("EMP_ID");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                Date DATE_OF_BILLING=resultSet.getDate("DATE_OF_BILLING");
                Date DUE_DATE=resultSet.getDate("DUE_DATE");
                double AMOUNT=resultSet.getDouble("AMMOUNT");
                billsLinkedList.add(new Bills(BILL_ID,EMP_ID,CUSTOMER_ID,DATE_OF_BILLING,DUE_DATE,AMOUNT));
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return billsLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------

    public LinkedList<Comment> getComment()
    {
        LinkedList<Comment> commentLinkedList=new LinkedList<>();
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from COMENT";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int COMMENT_ID=resultSet.getInt("COMMENT_ID");
                String COMMENT_DETAILS=resultSet.getString("COMMENT_DETAILS");
                int PAYMENT_ID=resultSet.getInt("PAYMENT_ID");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                commentLinkedList.add(new Comment(COMMENT_ID,COMMENT_DETAILS,PAYMENT_ID,CUSTOMER_ID));
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return commentLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------
    public UserImages getImage(String userName,String password)
    {
        connection=DataBaseConnection.Connect();
        java.sql.Blob blobImage = null;
        String Name=null;
        String Password=null;
        try
        {
            final String query="Select * from USER_IMAGE where USER_NAME=? AND PASSWORDS=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,password);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            if(resultSet.next())
            {
                Name=resultSet.getString("USER_NAME");
                Password=resultSet.getString("PASSWORDS");
                blobImage=resultSet.getBLOB("USER_IMAGE");
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        try{
            assert blobImage != null;
            InputStream in = blobImage.getBinaryStream();
            BufferedImage image = ImageIO.read(in);
            return new UserImages(Name,Password,image);
        }
        catch (Exception e){
            System.out.println(Name+"  "+Password);
            System.out.println("Error");
        }
        return null;
    }
    //==================================================================================================================

    public Account getSingleAccount(int AccountNumber)
    {
        Account account = null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from ACCOUNT where ACCOUNT_NUMBER=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,AccountNumber);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int ACCOUNT_NUMBER=resultSet.getInt("ACCOUNT_NUMBER");
                String ACCOUNT_DETAIL=resultSet.getString("ACCOUNT_DETAIL");
                String ACCOUNT_TYPE=resultSet.getString("ACCOUNT_TYPE");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                account=new Account(ACCOUNT_NUMBER,ACCOUNT_DETAIL,ACCOUNT_TYPE,CUSTOMER_ID);
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return account;
    }
    //==================================================================================================================

    public Bills getSingleBill(int BillID)
    {
        Bills bills=null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from BILLS where  BILL_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,BillID);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int BILL_ID=resultSet.getInt("BILL_ID");
                int EMP_ID=resultSet.getInt("EMP_ID");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                Date DATE_OF_BILLING=resultSet.getDate("DATE_OF_BILLING");
                Date DUE_DATE=resultSet.getDate("DUE_DATE");
                double AMOUNT=resultSet.getDouble("AMMOUNT");
                bills=new Bills(BILL_ID,EMP_ID,CUSTOMER_ID,DATE_OF_BILLING,DUE_DATE,AMOUNT);
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return bills;
    }
    //==================================================================================================================

    public Comment getSingleComment(int CommentID)
    {
        Comment comment=null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from COMENT where COMMENT_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,CommentID);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int COMMENT_ID=resultSet.getInt("COMMENT_ID");
                String COMMENT_DETAILS=resultSet.getString("COMMENT_DETAILS");
                int PAYMENT_ID=resultSet.getInt("PAYMENT_ID");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                comment=new Comment(COMMENT_ID,COMMENT_DETAILS,PAYMENT_ID,CUSTOMER_ID);
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return comment;
    }
    //==================================================================================================================
    public Customer getSingleCustomer(int CustomerId)
    {
        Customer customer=null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from CUSTOMER where CUSTOMER_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,CustomerId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                String Name=resultSet.getString("CUSTOMER_NAME");
                int EMP_ID=resultSet.getInt("EMP_ID");
                String ADDRESS=resultSet.getString("ADDRESS");
                customer=new Customer(CUSTOMER_ID,Name,EMP_ID,ADDRESS);
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return customer;

    }
    //==================================================================================================================
    public CustomerPhone getSingleCustomerPhone(int CustomerId,double phone)
    {
        CustomerPhone customerPhone=null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from CUSTOMER_PHONE where CUSTOMER_ID=? AND PHONE_NUMBER=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,CustomerId);
            preparedStatement.setDouble(2,phone);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int CUSTOMER_ID=Integer.parseInt(resultSet.getString("CUSTOMER_ID"));
                String CUSTOMER_PHONE=resultSet.getString("PHONE_NUMBER");
                customerPhone=new CustomerPhone(CUSTOMER_ID,CUSTOMER_PHONE);
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return customerPhone;
    }
    //==================================================================================================================

    public Employee getSingleEmployee(int EmployeeId)
    {
        Employee employee=null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from Employee where EMP_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,EmployeeId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int EMP_ID=resultSet.getInt("EMP_ID");
                String Name=resultSet.getString("EMP_NAME");
                double Salary=resultSet.getInt("SALARY");
                employee=new Employee(EMP_ID,Name,Salary);

            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return employee;
    }
    //==================================================================================================================

    public Oder getSingleOrder(int OrderID)
    {
        Oder oder=null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from ODER where ORDER_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,OrderID);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int ORDER_ID=resultSet.getInt("ORDER_ID");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                Date ORDER_DATE=resultSet.getDate("ORDER_DATE");
                int SERVICE_ID=resultSet.getInt("SERVICE_ID");
                oder=new Oder(ORDER_ID,CUSTOMER_ID,ORDER_DATE,SERVICE_ID);
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return oder;
    }
    //==================================================================================================================
    public Payment getSinglePayment(int PaymentId)
    {
        Payment payment=null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from PAYMENT where PAYMENT_ID=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,PaymentId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int PAYMENT_ID=resultSet.getInt("PAYMENT_ID");
                Date PAYMENT_DATE=resultSet.getDate("PAYMENT_DATE");
                double AMOUNT=resultSet.getDouble("AMMOUNT");
                String PAYMENT_METHOD=resultSet.getString("PAYMENT_MWTHOD");
                int CUSTOMER_ID=resultSet.getInt("CUSTOMER_ID");
                payment=new Payment(PAYMENT_ID,PAYMENT_DATE,AMOUNT,PAYMENT_METHOD,CUSTOMER_ID);
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return payment;
    }
    //==================================================================================================================
    public Services getSingleService(int ServiceId)
    {
        Services services=null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from SERVICES where SERVICE_ID=? ";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,ServiceId);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int SERVICE_ID=resultSet.getInt("SERVICE_ID");
                String SERVICE_NAME=resultSet.getString("SERVICE_NAME");
                services=new Services(SERVICE_ID,SERVICE_NAME);
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return services;
    }
    //==================================================================================================================
    public ServicesType getSingleServiceType(int ServiceID,String ServiceType)
    {
        ServicesType servicesType=null;
        connection=DataBaseConnection.Connect();
        try
        {
            final String query="Select * from SERVICES_TYPE where SERVICE_ID=? AND SERVICE_TYPE=?";
            assert connection != null;
            preparedStatement=(OraclePreparedStatement) connection.prepareStatement(query);
            preparedStatement.setInt(1,ServiceID);
            preparedStatement.setString(2,ServiceType);
            resultSet=(OracleResultSet) preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int SERVICE_ID=resultSet.getInt("SERVICE_ID");
                String SERVICE_TYPE=resultSet.getString("SERVICE_TYPE");
                servicesType=new ServicesType(SERVICE_ID,SERVICE_TYPE);
            }
        }
        catch (Exception e)
        {
            fetchError(e);
        }
        return servicesType;
    }
    //==================================================================================================================


}
