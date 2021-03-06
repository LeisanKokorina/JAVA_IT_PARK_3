package ru.itpark;

import java.sql.*;
import java.util.Scanner;

public class DBMethods {
    public static Connection connection()throws SQLException{
        String name = "postgres";
        String password = "passslon42";
        String url = "jdbc:postgresql://localhost:5432/Task13_db";

        return DriverManager.getConnection(url, name, password);
    }
    public void addOwner(String ownerName, int age){
       try {
           Connection connection = DBMethods.connection();
           PreparedStatement preparedStatement = connection
                   .prepareStatement("INSERT INTO owner(name, age) VALUES (?, ?)");
           preparedStatement.setString(1, ownerName);
           preparedStatement.setInt(2, age);
           preparedStatement.execute();
       }catch (SQLException e1){
           throw new IllegalArgumentException(e1);
       }
    }
    public  void addCar(String model, int number, int ownerId, String color){
        try {
            Connection connection = DBMethods.connection();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO car(number, model, color, owner_id) VALUES (?, ?, ?, ?)");
            preparedStatement.setInt(1, number);
            preparedStatement.setString(2, model);
            preparedStatement.setString(3, color);
            preparedStatement.setInt(4, ownerId);
            preparedStatement.execute();
        } catch (SQLException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
    public void showOwners(){
        try{
            Connection connection = DBMethods.connection();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM owner ORDER BY id");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.println(" " + resultSet.getString("name"));
            }

        }catch (SQLException e3){
            throw new IllegalArgumentException(e3);
        }
    }
    public void showCars(){
        try{
            Connection connection = DBMethods.connection();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM car JOIN owner ON car.owner_id = owner.id ORDER BY car.id");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") +" " + resultSet.getString("model")+" "
                        + resultSet.getString("color")+ " " + resultSet.getInt("number")+" "
                        + resultSet.getInt("owner_id") + " - " + resultSet.getString("name"));
            }

        }catch (SQLException e4){
            throw new IllegalArgumentException(e4);
        }
    }
    public void allCarsOfTheOwner(int ownerId){
        try {
            Connection connection = DBMethods.connection();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM car JOIN owner ON owner.id = car.owner_id WHERE owner_id = (?)");
            preparedStatement.setInt(1, ownerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               System.out.println(resultSet.getString("model")+" " + resultSet.getInt("number")+" "+ resultSet.getString("name"));
            }
        } catch (SQLException e5) {
            throw new IllegalArgumentException(e5);
        }
    }
    public void showCarsByColor(String color){
        try{
            Connection connection = DBMethods.connection();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM car WHERE color = ?");
            preparedStatement.setString(1, color);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("model")+" " + resultSet.getInt("number")+resultSet.getString("color"));
            }


        } catch (SQLException e6) {
            throw new IllegalArgumentException(e6);
        }
    }



}
