package com.Ansar.DataModel;

import java.awt.image.BufferedImage;
import java.sql.Blob;

public class UserImages {
    private String UserName;
    private String Passwords;
    private BufferedImage Image;
    public UserImages(String userName, String passwords, BufferedImage image) {
        UserName = userName;
        Passwords=passwords;
        Image = image;
    }
    //Getters-----------------------------------------------------------------------------------------------------------

    public String getUserName() {
        return UserName;
    }

    public BufferedImage getImage() {
        return Image;
    }
}
