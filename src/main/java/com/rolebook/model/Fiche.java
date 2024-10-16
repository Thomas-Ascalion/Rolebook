package com.rolebook.model;

public class Fiche {

	 private int idFiche;
	    private String nomPartie;
	    private String nomJoueur;
	    private String nomPersonnage;
	    private String classe;
	    private String race;
	    private String alignement;
	    private int niveau;
	    private int xp;
	    private int ca;
	    private int pvTotal;
	    private String desPv;
	    private String imagePersonnage;
	    private int fo;
	    private int dex;
	    private int cons;
	    private int intel;
	    private int sag;
	    private int cha;
	    private int bonusMalusFo;
	    private int bonusMalusDex;
	    private int bonusMalusCons;
	    private int bonusMalusIntel;
	    private int bonusMalusSag;
	    private String langue;
	    private String equipement;
	    private String inventaire;
	    private String description;
		
	    
	    public Fiche() {
			super();
		}


		public Fiche(int idFiche, String nomPartie, String nomJoueur, String nomPersonnage, String classe, String race,
				String alignement, int niveau, int xp, int ca, int pvTotal, String desPv, String imagePersonnage,
				int fo, int dex, int cons, int intel, int sag, int cha, int bonusMalusFo, int bonusMalusDex,
				int bonusMalusCons, int bonusMalusIntel, int bonusMalusSag, String langue, String equipement,
				String inventaire, String description) {
			super();
			this.idFiche = idFiche;
			this.nomPartie = nomPartie;
			this.nomJoueur = nomJoueur;
			this.nomPersonnage = nomPersonnage;
			this.classe = classe;
			this.race = race;
			this.alignement = alignement;
			this.niveau = niveau;
			this.xp = xp;
			this.ca = ca;
			this.pvTotal = pvTotal;
			this.desPv = desPv;
			this.imagePersonnage = imagePersonnage;
			this.fo = fo;
			this.dex = dex;
			this.cons = cons;
			this.intel = intel;
			this.sag = sag;
			this.cha = cha;
			this.bonusMalusFo = bonusMalusFo;
			this.bonusMalusDex = bonusMalusDex;
			this.bonusMalusCons = bonusMalusCons;
			this.bonusMalusIntel = bonusMalusIntel;
			this.bonusMalusSag = bonusMalusSag;
			this.langue = langue;
			this.equipement = equipement;
			this.inventaire = inventaire;
			this.description = description;
		}


		public int getIdFiche() {
			return idFiche;
		}


		public void setIdFiche(int idFiche) {
			this.idFiche = idFiche;
		}


		public String getNomPartie() {
			return nomPartie;
		}


		public void setNomPartie(String nomPartie) {
			this.nomPartie = nomPartie;
		}


		public String getNomJoueur() {
			return nomJoueur;
		}


		public void setNomJoueur(String nomJoueur) {
			this.nomJoueur = nomJoueur;
		}


		public String getNomPersonnage() {
			return nomPersonnage;
		}


		public void setNomPersonnage(String nomPersonnage) {
			this.nomPersonnage = nomPersonnage;
		}


		public String getClasse() {
			return classe;
		}


		public void setClasse(String classe) {
			this.classe = classe;
		}


		public String getRace() {
			return race;
		}


		public void setRace(String race) {
			this.race = race;
		}


		public String getAlignement() {
			return alignement;
		}


		public void setAlignement(String alignement) {
			this.alignement = alignement;
		}


		public int getNiveau() {
			return niveau;
		}


		public void setNiveau(int niveau) {
			this.niveau = niveau;
		}


		public int getXp() {
			return xp;
		}


		public void setXp(int xp) {
			this.xp = xp;
		}


		public int getCa() {
			return ca;
		}


		public void setCa(int ca) {
			this.ca = ca;
		}


		public int getPvTotal() {
			return pvTotal;
		}


		public void setPvTotal(int pvTotal) {
			this.pvTotal = pvTotal;
		}


		public String getDesPv() {
			return desPv;
		}


		public void setDesPv(String desPv) {
			this.desPv = desPv;
		}


		public String getImagePersonnage() {
			return imagePersonnage;
		}


		public void setImagePersonnage(String imagePersonnage) {
			this.imagePersonnage = imagePersonnage;
		}


		public int getFo() {
			return fo;
		}


		public void setFo(int fo) {
			this.fo = fo;
		}


		public int getDex() {
			return dex;
		}


		public void setDex(int dex) {
			this.dex = dex;
		}


		public int getCons() {
			return cons;
		}


		public void setCons(int cons) {
			this.cons = cons;
		}


		public int getIntel() {
			return intel;
		}


		public void setIntel(int intel) {
			this.intel = intel;
		}


		public int getSag() {
			return sag;
		}


		public void setSag(int sag) {
			this.sag = sag;
		}


		public int getCha() {
			return cha;
		}


		public void setCha(int cha) {
			this.cha = cha;
		}


		public int getBonusMalusFo() {
			return bonusMalusFo;
		}


		public void setBonusMalusFo(int bonusMalusFo) {
			this.bonusMalusFo = bonusMalusFo;
		}


		public int getBonusMalusDex() {
			return bonusMalusDex;
		}


		public void setBonusMalusDex(int bonusMalusDex) {
			this.bonusMalusDex = bonusMalusDex;
		}


		public int getBonusMalusCons() {
			return bonusMalusCons;
		}


		public void setBonusMalusCons(int bonusMalusCons) {
			this.bonusMalusCons = bonusMalusCons;
		}


		public int getBonusMalusIntel() {
			return bonusMalusIntel;
		}


		public void setBonusMalusIntel(int bonusMalusIntel) {
			this.bonusMalusIntel = bonusMalusIntel;
		}


		public int getBonusMalusSag() {
			return bonusMalusSag;
		}


		public void setBonusMalusSag(int bonusMalusSag) {
			this.bonusMalusSag = bonusMalusSag;
		}


		public String getLangue() {
			return langue;
		}


		public void setLangue(String langue) {
			this.langue = langue;
		}


		public String getEquipement() {
			return equipement;
		}


		public void setEquipement(String equipement) {
			this.equipement = equipement;
		}


		public String getInventaire() {
			return inventaire;
		}


		public void setInventaire(String inventaire) {
			this.inventaire = inventaire;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}

	    
	    
}
