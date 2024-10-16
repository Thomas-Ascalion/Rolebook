package com.rolebook.model;

public class HistoriqueModifs {

    private int idModifs;
    private String dateModif;
    private String champModif;
    private String ancienneValeur;
    private String nouvelleValeur;
    
    
	public HistoriqueModifs() {
		super();
	}


	public HistoriqueModifs(int idModifs, String dateModif, String champModif, String ancienneValeur,
			String nouvelleValeur) {
		super();
		this.idModifs = idModifs;
		this.dateModif = dateModif;
		this.champModif = champModif;
		this.ancienneValeur = ancienneValeur;
		this.nouvelleValeur = nouvelleValeur;
	}


	public int getIdModifs() {
		return idModifs;
	}


	public void setIdModifs(int idModifs) {
		this.idModifs = idModifs;
	}


	public String getDateModif() {
		return dateModif;
	}


	public void setDateModif(String dateModif) {
		this.dateModif = dateModif;
	}


	public String getChampModif() {
		return champModif;
	}


	public void setChampModif(String champModif) {
		this.champModif = champModif;
	}


	public String getAncienneValeur() {
		return ancienneValeur;
	}


	public void setAncienneValeur(String ancienneValeur) {
		this.ancienneValeur = ancienneValeur;
	}


	public String getNouvelleValeur() {
		return nouvelleValeur;
	}


	public void setNouvelleValeur(String nouvelleValeur) {
		this.nouvelleValeur = nouvelleValeur;
	}
  
}
