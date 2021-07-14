package com.Ansar.FileUpload;

import com.Ansar.Database.InsertDataInDatabase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Uploader {
    private InsertDataInDatabase inDatabase=new InsertDataInDatabase();

    public void loadAccounts(String path) throws IOException {
        FileReader readPatients = new FileReader(path);
        BufferedReader bufferPatients = new BufferedReader(readPatients);
        String line = "";
        while ((line = bufferPatients.readLine()) != null) {
            String[] separationCsvByColumn = line.split(",");
            inDatabase.InsertAccount(separationCsvByColumn[0],separationCsvByColumn[1],Integer.parseInt(separationCsvByColumn[2]));
        }
        readPatients.close();

    }
}
