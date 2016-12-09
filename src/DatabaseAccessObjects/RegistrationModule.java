/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseAccessObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HACKER
 */
public class RegistrationModule {

    public static void registerUsers(String firstName,String lastName,String middleName,String email,String password) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamsManagement", "root", "")) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users VALUES(?,?,?,?)");
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void registerStudents(String firstName,String lastName,String middleName,String regNo) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamsManagement", "root", "")) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users VALUES(?,?,?,?)");
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void registerLecturer(String firstName,String middleName,String lastName,String course,String depertment ) {
         try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamsManagement", "root", "")) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users VALUES(?,?,?,?)");
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void registerExamsCoordinator(String firstName,String middleName,String email,String password) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamsManagement", "root", "")) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users VALUES(?,?,?,?)");
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.setString(1, null);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
                    
                    
                    
                    