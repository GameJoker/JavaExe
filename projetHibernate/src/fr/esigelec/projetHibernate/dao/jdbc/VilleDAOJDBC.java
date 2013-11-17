package fr.esigelec.projetHibernate.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import fr.esigelec.projetHibernate.dao.IVilleDAO;
import fr.esigelec.projetHibernate.dto.ville;

public class VilleDAOJDBC implements IVilleDAO{
	
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	public VilleDAOJDBC() throws Exception{
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch(ClassNotFoundException cnfe) {
			System.err.println("Error loading driver: " + cnfe);
		}
		try{
			connect = DriverManager
			          .getConnection("jdbc:mysql://localhost/geographie"
			        		  +"user=root&password=");
			statement = connect.createStatement();
		} catch(Exception e){
			throw e;			
		}
	}
	@Override
	public void ajouter(ville v){
		// TODO Auto-generated method stub
		try{
			preparedStatement = connect
			          .prepareStatement("insert into  ville values (default, ?, ?, ?)");
			preparedStatement.setString(1, v.getNom());
			preparedStatement.setString(2, v.getNb_habitants());
			preparedStatement.setInt(3, v.getId_pays());
			preparedStatement.executeUpdate();
		}catch(Exception e){
			System.err.println("Error loading driver: " + e);
		}
	}

	@Override
	public ville getVille(int id) {
		// TODO Auto-generated method stub
		ville v =null;
		try{
			preparedStatement = connect
		          .prepareStatement("SELECT * from ville where id = ? ;");
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			resultSet = preparedStatement.executeQuery();
			v = result(resultSet);		
		} catch(Exception e){
			System.err.println("Error loading driver: " + e);
		} 
		return v;
	}

	@Override
	public List<ville> getVilles() {
		// TODO Auto-generated method stub
		try {

		}catch(Exception e){
			System.err.println("Error loading driver: " + e);
		} 
		return null;
	}

	@Override
	public void update(ville v) {
		// TODO Auto-generated method stub
		try {
			preparedStatement = connect
			          .prepareStatement("update ville set nom = ?,nb_habitants = ?,id_pays = ? where id = ?;");
			preparedStatement.setString(1, v.getNom());
			preparedStatement.setString(2, v.getNb_habitants());
			preparedStatement.setInt(3, v.getId_pays());
			preparedStatement.setInt(4, v.getId());
			preparedStatement.executeUpdate();
		}catch(Exception e){
			System.err.println("Error loading driver: " + e);
		} 
	}

	@Override
	public void delete(ville v) {
		// TODO Auto-generated method stub
		try {
			preparedStatement = connect
					.prepareStatement("delete from ville where id= ? ; ");
			preparedStatement.setInt(1, v.getId());
			preparedStatement.executeUpdate();			
		}catch(Exception e){
			System.err.println("Error loading driver: " + e);
		} 
	}

	@Override
	public void refresh(ville v) {
		// TODO Auto-generated method stub
		try {
			
		}catch(Exception e){
			System.err.println("Error loading driver: " + e);
		} 
	}
	public ville result (ResultSet resultSet) throws SQLException
	{
		 int id = resultSet.getInt("id");
	     String nom = resultSet.getString("nom");
	     String nb_habitants = resultSet.getString("nb_habitants");
	     int id_pays = resultSet.getInt("id_pays");
	     ville v = new ville(id,nom,nb_habitants,id_pays);
		return v;
	}
	public void close()
	{
		try {
		      if (resultSet != null) {
		        resultSet.close();
		      }

		      if (statement != null) {
		        statement.close();
		      }

		      if (connect != null) {
		        connect.close();
		      }
		    } catch (Exception e) {

		    }
	}

}

