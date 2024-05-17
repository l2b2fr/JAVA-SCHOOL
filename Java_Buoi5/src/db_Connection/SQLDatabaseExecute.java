/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_Connection;

import java.sql.*;

/**
 *
 * @author LEMINHNAM
 */
public class SQLDatabaseExecute {

    public static String tryExcute(String sqlString) {
        ResultSet resultSet = null;
        String data = null;
        String connectionUrl
                = "jdbc:sqlserver://localhost:1433;"
                + "database=db_buoi5;"
                + "user=sa;"
                + "password=namdz2k4;"
                + "encrypt=false;"
                + "trustServerCertificate=false;";
        try (Connection connection = DriverManager.getConnection(connectionUrl); Statement statement = connection.createStatement();) {
            resultSet = statement.executeQuery(sqlString);
            data = resultSet.getString("name");
            return data;
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }
}
