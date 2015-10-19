package version1;

import java.util.ArrayList;

public class Matrice {

	private String nom;
	private int nbLigne;
	private int nbColonne;
	private String[][] matrice;
	private String[][] infoGravite;
	private String[][] infoProbabilite;
	
	public Matrice(String nom, int nbLigne, int nbColonne) {
		super();
		this.nom = nom;
		this.nbLigne = nbLigne;
		this.nbColonne = nbColonne;
		this.matrice = new String[nbLigne][nbColonne];
		this.infoGravite = new String[nbColonne-1][2];
		this.infoProbabilite = new String[nbLigne-1][2];
	}

	public String getNom() {
		return nom;
	}

	public int getNbLigne() {
		return nbLigne;
	}

	public int getNbColonne() {
		return nbColonne;
	}

	public String[][] getMatrice() {
		return matrice;
	}

	public void setMatrice(int i, int j, String value) {
		this.matrice[i][j] = value;
	}

	public String[][] getInfoGravite() {
		return infoGravite;
	}

	public void setInfoGravite(int i, int j, String value) {
		this.infoGravite[i][j] = value;
	}

	public String[][] getInfoProbabilite() {
		return infoProbabilite;
	}

	public void setInfoProbabilite(int i, int j, String value) {
		this.infoProbabilite[i][j] = value;
	}
	
	
	
	
	
	
}
