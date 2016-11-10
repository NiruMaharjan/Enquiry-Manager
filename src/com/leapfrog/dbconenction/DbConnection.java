/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dbconenction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class DbConnection {

    private Connection con;
    private PreparedStatement stmt;

    public void open() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/enquiry_manager1", "root", "");
    }

    public PreparedStatement initStatement(String sql) throws SQLException {
        stmt = con.prepareStatement(sql);
        return stmt;
    }

    public int executeUpdate() throws SQLException {
        return stmt.executeUpdate();
    }

    public ResultSet executeQuery() throws SQLException {
        return stmt.executeQuery();
    }

    public void close() throws SQLException {
        if ((con != null) && (!con.isClosed())) {
            con.close();
            con = null;
        }
    }

}
