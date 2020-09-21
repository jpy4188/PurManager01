package com.hp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBHelper {
    private  static   String  Driver_Class="com.mysql.jdbc.Driver";
    private  static   String  url="jdbc:mysql://localhost:3306/nihao";
    private  static   String  username="root";
    private  static   String  password="123456";

    public static Connection getcconn() {
        try {
            Class.forName(Driver_Class);
            return DriverManager.getConnection(url,username,password);
        }catch (Exception  e){
            e.printStackTrace();

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getcconn());
    }

    public static void close(Connection  conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs!=null){
                rs.close();
            }
            close(conn,ps);
        }catch (Exception  e){
            e.printStackTrace();

        }
    }

    public static void close(Connection conn, PreparedStatement ps) {
        try {
            if (ps!=null){
                ps.close();
            }
            if (conn!=null){
                conn.close();
            }

        }catch (Exception  e){
            e.printStackTrace();

        }
    }
}