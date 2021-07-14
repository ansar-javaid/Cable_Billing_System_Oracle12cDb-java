package com.Ansar.Database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    public static Connection Connect()
    {
        try
        {
            //DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/CABLETVPDB","CABLE_MANAGER","Hr20Cable");
            return connection;
        }
        catch(Exception e)
        {
            ImageIcon icon = new ImageIcon("images\\error.png");
            JOptionPane.showMessageDialog(null, e, "Failed", JOptionPane.ERROR_MESSAGE,icon);
        }
        return null;
    }
}
