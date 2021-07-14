package com.Ansar;

import com.Ansar.DataModel.ServicesType;
import com.Ansar.Database.DeleteInDatabase;
import com.Ansar.Database.GetDataFromDatabase;
import com.Ansar.Database.UpdateDataInDatabase;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DeleteInDatabase deleteInDatabase=new DeleteInDatabase();
        deleteInDatabase.DeleteInServiceType(12,"Connection");

    }
}
