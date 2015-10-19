package version1;

import java.awt.Color;

public class Matrice {

	private String nom;
	private int nbLigne;
	private int nbColonne;
	private String[][] matrice;
	private String[][] infoGravite;
	private String[][] infoProbabilite;
	private Color[][] couleur;

	public Matrice(String nom, int nbLigne, int nbColonne) {
		super();
		this.nom = nom;
		this.nbLigne = nbLigne;
		this.nbColonne = nbColonne;
		this.matrice = new String[nbLigne][nbColonne];
		this.infoGravite = new String[nbColonne-1][2];
		this.infoProbabilite = new String[nbLigne-1][2];
		this.couleur = new Color[nbLigne][nbColonne];
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

	public Color[][] getCouleur() {
		return couleur;
	}

	public void setCouleur(int i, int j, Color couleur) {
		this.couleur[i][j] = couleur;
	}








}
