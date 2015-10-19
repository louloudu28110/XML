package version1;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionBoutonValider extends AbstractAction {
	private FenetreSaisieTaille fenetre;
	
	public ActionBoutonValider(FenetreSaisieTaille fenetre, String texte) {
		super(texte);
		this.fenetre = fenetre;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Matrice matrice = new Matrice(fenetre.getTextFieldNomMatrice().getText(), Integer.parseInt(fenetre.getTextFieldNbLigne().getText()), Integer.parseInt(fenetre.getTextFieldNbColonne().getText()));
		fenetre.dispose();
		FenetreMatrice fenetreM = new FenetreMatrice(matrice);
		fenetreM.setVisible(true);
	}

}
