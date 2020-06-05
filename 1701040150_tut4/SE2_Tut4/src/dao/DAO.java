package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Acessories;
import model.Dress;
import model.Shirt;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provshirtshirtIDes 
 * CRUD (CREATE - READ - UPDATE - DELETE) database operations 
 * for the table Shirt in the database
 */
public class DAO {

	public DAO() {
	}

	public List<Shirt> selectAllShirts() {

		List<Shirt> Shirts = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_ShirtS = "SELECT * FROM Shirt";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ShirtS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int shirtID = rs.getInt("shirtID");
				String shirtStyle = rs.getString("shirtStyle");
				String shirtName = rs.getString("shirtName");		
				double Price = rs.getDouble("Price");
				Shirts.add(new Shirt(shirtID, shirtName, shirtStyle, Price));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Shirts;
	}
	
	public List<Dress> selectAllDreses() {

		List<Dress> Dresses = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_Dresses = "SELECT * FROM dress";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Dresses);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int dressID = rs.getInt("dressID");
				String dressStyle = rs.getString("dressStyle");
				String dressName = rs.getString("dressName");		
				double Price = rs.getDouble("Price");
				Dresses.add(new Dress(dressID, dressName, dressStyle, Price));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Dresses;
	}
	
	public List<Acessories> selectAllAcessories() {

		List<Acessories> Acessories = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_Acessories = "SELECT * FROM Acessories";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Acessories);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int acessID = rs.getInt("acessID");
				String acessStyle = rs.getString("acessStyle");
				String acessName = rs.getString("acessName");		
				double Price = rs.getDouble("Price");
				Acessories.add(new Acessories(acessID, acessName, acessStyle, Price));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Acessories;
	}
}
