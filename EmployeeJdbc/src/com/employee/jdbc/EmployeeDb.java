package com.employee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDb {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String HOST = "192.168.0.156";
    private static final String DATABASE = "tushar";
    public static Connection con;

    public void insertRecord(String name, String email, int phonenumber, String employeetype, double salary)
            throws SQLException {

        String sql = "insert into employee(name,email,phonenumber,employeetype,salary) values(?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, email);
//        pstmt.setInt(3, id);
        pstmt.setInt(3, phonenumber);
        pstmt.setString(4, employeetype);
        pstmt.setDouble(5, salary);

        int rows = pstmt.executeUpdate();
        if (rows > 0)
            System.out.println("Record Inserted Sucessully");
    }

    public void deleteRecord(String name) throws SQLException {

        String sql = String.format("delete from employee where name = \"%s\"", name);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(sql);

        if (rows > 0)
            System.out.println("Record is deleted sucessfully");
    }

    public void showRecord(String name) throws SQLException {
//        String sql = "Select * from employee where name = ?" + name;
        String sql = String.format("select * from employee where name=\"%s\"", name);
        Statement st = con.createStatement();
        ResultSet set = st.executeQuery(sql);

        while (set.next()) {
//            int id = set.getInt(1);
            String name1 = set.getString(1);
            String email = set.getString(2);
            int phonenumber = set.getInt(3);
            String employeetype = set.getString(4);
            String salary = set.getString(5);

            System.out.println("NAME : " + name1);
            System.out.println("EMAIL : " + email);
            System.out.println("PHONE NUMBER : " + phonenumber);
            System.out.println("EMPLOYEE TYPE : " + employeetype);
            System.out.println("SALARY : " + salary);
            System.out.println("---------------------");

        }

    }

    public void createConnection() {
        String url = String.format("jdbc:mysql://%s:3306/%s", HOST, DATABASE);
        System.out.println(url);
        try {
            con = DriverManager.getConnection(url, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
