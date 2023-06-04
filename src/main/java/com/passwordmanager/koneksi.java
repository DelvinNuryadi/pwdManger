/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.passwordmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author me
 */
public class koneksi {
    private static String url = "jdbc:mysql://localhost:3306/passwordmanager";
    private static String user = "root";
    private static String pass = "";
    
    public static Connection getKoneksi() throws SQLException{
        return DriverManager.getConnection(url, user, pass);
    }
    
}
