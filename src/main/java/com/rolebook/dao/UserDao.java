package com.rolebook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.rolebook.model.User;

//Déclaration de la classe UserDao. 
//Elle contient des attributs pour la connexion 
//à la base de données (con), une chaîne de requête 
//(query), des objets pour exécuter des requêtes 
//(PreparedStatement, ResultSet, Statement).

public class UserDao {
	//Déclaration d'une variable pour la connection
	private Connection connect;
	//Déclaration d'une variable pour stocker la requête SQL
	private String query;
	//Déclaration pour exécuter des requêtes rs et st
	private ResultSet rs;
	private PreparedStatement pst;
	private Statement st;

		//Création du constructeur ( sa permet de déclarer et initialiser
		//les données de la classe ainsi que permettre par la suite les différentes
		//opérations.
	
		//ce constructeur permet d'initialiser l'objet avec une connexion à la base de donnée (con)
	public UserDao(Connection con) {
		this.connect = con;
	}
	
	//Déclaration de la méthode userLogin qui prend en 
	//paramètres l'email et le mot de passe de l'utilisateur.
	
	public User userLogin(String email, String password) {
		
	//Initialisation d'un objet User à null.
		User user = null;
		
	//Bloc try pour gérer les exceptions SQL. Si elle 
	//est mal faites alors l'exception va s'afficher
		try {
	
	//Définition de la requête SQL pour sélectionner un 
	//utilisateur avec l'email et le mot de passe fournis.
			query= "select * from users where email=? and password=?";
		
	//Préparation de la requête pour éviter les injections SQL.
			pst = this.connect.prepareStatement(query);
			
	//Remplacement du premier ? par l'email.
	//Remplacement du deuxiéme ? par password.
			pst.setString(1, email);
			pst.setString(2, password);
			
	//Exécution de la requête et récupération des résultats.
			rs = pst.executeQuery();
	//Si un utilisateur correspondant est trouvé, on entre dans le bloc.
			if(rs.next()) {
				
	//création d'un nouvel utilisateur
				user = new User();
				user.setId(rs.getInt("idUsers"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setUserName(rs.getString("username"));
				user.setMobileNumber(rs.getString("mobilenumber"));
				user.setSecurityQuestion(rs.getString("securityQuestion"));
				user.setAnswer(rs.getString("answer"));
				user.setAutorisation(rs.getString("autorisation"));
				user.setFirstname(rs.getString("firstname"));
				user.setAdress(rs.getString("address"));
				user.setCp(rs.getString("cp"));
				user.setCity(rs.getString("city"));
				user.setCountry(rs.getString("country"));
				user.setProfileImg(rs.getString("profilimg"));
			}
			//Bloc catch pour gérer les exceptions SQL.
		} catch (SQLException e) {
			//Affichage du message d'erreur en cas d'exception.
			System.out.print(e.getMessage());
		}
		//Retourne l'objet User trouvé ou null si aucun utilisateur n'est trouvé.
		return user;
	}

	//méthode pour l'oubli du mot de passe
	public User userForgotPassword(String email, String mobileNumber, String securityQuestion, String answer, String passwordSHA1) {
		int check = 0;
		User user =null;
		
		try {
			query = "SELECT * from users WHERE email='"+email+"' and mobileNumber='"+mobileNumber+"' and securityQuestion='"+securityQuestion+"' and answer='"+answer+"'  ;";
			st =  this.connect.createStatement();
			rs = st.executeQuery(query);
			
			
			while(rs.next()) {
				check=1;
				st.executeUpdate("UPDATE users set password= '"+passwordSHA1+"' WHERE email= '"+email+"' ;");
				System.out.println("password updated !");
			}
			
			if (check == 0){
				System.out.println("password not updated !");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	
}
}




