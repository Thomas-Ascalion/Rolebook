package com.rolebook.model;

public class Commentaires {

    private int idCom;
    private String username;
    private String contenu;
    private ValidationStatus valider;

    // Enumération pour le statut de validation
    public enum ValidationStatus {
        OUI, NON
    }

	public Commentaires() {
		super();
	}

	public Commentaires(int idCom, String username, String contenu, ValidationStatus valider) {
		super();
		this.idCom = idCom;
		this.username = username;
		this.contenu = contenu;
		this.valider = valider;
	}

	public int getIdCom() {
		return idCom;
	}

	public void setIdCom(int idCom) {
		this.idCom = idCom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public ValidationStatus getValider() {
		return valider;
	}

	public void setValider(ValidationStatus valider) {
		this.valider = valider;
	}
    
}