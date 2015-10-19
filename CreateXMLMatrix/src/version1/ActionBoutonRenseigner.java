package version1;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionBoutonRenseigner extends AbstractAction {

	private FenetreMatrice fenetre;
	private Matrice matrice;
	
	
	public ActionBoutonRenseigner(FenetreMatrice fenetre, String texte, Matrice matrice) {
		super(texte);
		this.fenetre = fenetre;
		this.matrice = matrice;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		FenetreInformation fenetreI = new FenetreInformation(matrice);
		fenetreI.setVisible(true);
	}

}
