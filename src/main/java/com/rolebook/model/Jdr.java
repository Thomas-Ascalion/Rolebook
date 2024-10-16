package com.rolebook.model;

public class Jdr {
	private int idJdr;
	private String nomJeux;
	private String edition;
	
	
	public Jdr() {
		super();
	}


	public Jdr(int idJdr, String nomJeux, String edition) {
		super();
		this.idJdr = idJdr;
		this.nomJeux = nomJeux;
		this.edition = edition;
	}


	public int getIdJdr() {
		return idJdr;
	}


	public void setIdJdr(int idJdr) {
		this.idJdr = idJdr;
	}


	public String getNomJeux() {
		return nomJeux;
	}


	public void setNomJeux(String nomJeux) {
		this.nomJeux = nomJeux;
	}


	public String getEdition() {
		return edition;
	}


	public void setEdition(String edition) {
		this.edition = edition;
	}
	
}
