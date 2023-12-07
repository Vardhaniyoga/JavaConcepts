package com.database;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class PostgreSQLDatabase {

    public static void main(String[] args) throws SQLException {
        Properties prop = new Properties();
        Connection dbConnection = null;
        Statement dbStatement = null;
        ResultSet dbResultSet = null;


        try {
            String projectPath = System.getProperty("user.dir");
            File file = new File(projectPath + "/src/main/resources/database/databaseProperties.Properties");
            FileInputStream fis = new FileInputStream(file);
            prop.load(fis);
            String dbUserName = prop.getProperty("user");
            String dbJDBCURL = prop.getProperty("dburl");
            String dbPassword = prop.getProperty("password");
            dbConnection = DriverManager.getConnection(dbJDBCURL, dbUserName, dbPassword);
            System.out.println("DB connection successful");
            dbStatement = dbConnection.createStatement();
            dbResultSet = dbStatement.executeQuery("select * from employee");
            while (dbResultSet.next()) {
                System.out.println(dbResultSet.getString("id") + "|" + dbResultSet.getString("name"));
            }


        } catch (Throwable t) {
            System.out.println(t.getMessage());

        }

    }
}


