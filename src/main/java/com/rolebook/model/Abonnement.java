package com.rolebook.model;

public class Abonnement {
	private int idAbo;
	private TypeAbonnement type;
	private String dateDebut;
	private String dateFin;
	
    // Enumération pour le type d'abonnement
    public enum TypeAbonnement {
        MENSUEL, ANNUEL
    }

	public Abonnement() {
		super();
	}

	public Abonnement(int idAbo, TypeAbonnement type, String dateDebut, String dateFin) {
		super();
		this.idAbo = idAbo;
		this.type = type;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public int getIdAbo() {
		return idAbo;
	}

	public void setIdAbo(int idAbo) {
		this.idAbo = idAbo;
	}

	public TypeAbonnement getType() {
		return type;
	}

	public void setType(TypeAbonnement type) {
		this.type = type;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
    
}
