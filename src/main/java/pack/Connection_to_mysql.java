/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connection_to_mysql {
    public Connection con;
    public void setName() {
        try {
            System.out.println("Connecting to the database");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://trialrds.cpo2ge4ei0bj.ap-south-1.rds.amazonaws.com:3306/hospital","root","Monu2003");
            System.out.println("Connection occured...");
        } catch (Exception ex) {
            System.out.println("Exception occured"+ex);
        }
    }
}
