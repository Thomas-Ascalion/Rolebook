package com.rolebook.model;

public class Requete {
	private int idRequete;
	private String nom;
	private String prenom;
	private String email;
	private String objetMessage;
	private String message;
	
	
	public Requete() {
		super();
	}


	public Requete(int idRequete, String nom, String prenom, String email, String objetMessage, String message) {
		super();
		this.idRequete = idRequete;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.objetMessage = objetMessage;
		this.message = message;
	}


	public int getIdRequete() {
		return idRequete;
	}


	public void setIdRequete(int idRequete) {
		this.idRequete = idRequete;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getObjetMessage() {
		return objetMessage;
	}


	public void setObjetMessage(String objetMessage) {
		this.objetMessage = objetMessage;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	
}
