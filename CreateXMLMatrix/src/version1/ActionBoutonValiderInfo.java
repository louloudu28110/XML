package version1;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionBoutonValiderInfo extends AbstractAction {

	private FenetreInformation fenetre;
	private Matrice matrice;
	
	public ActionBoutonValiderInfo(FenetreInformation fenetre,String texte, Matrice matrice) {
		super(texte);
		this.fenetre = fenetre;
		this.matrice = matrice;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int i, j;
		int x=0;
		for(i=0; i<matrice.getInfoGravite().length; i++) {
			for(j=0; j<matrice.getInfoGravite()[i].length; j++) {
				matrice.setInfoGravite(i,j,fenetre.getListTextFieldGravite().get(x).getText());
				x++;
			}
		}
		x=0;
		for(i=0; i<matrice.getInfoProbabilite().length; i++) {
			for(j=0; j<matrice.getInfoProbabilite()[i].length; j++) {
				matrice.setInfoProbabilite(i,j,fenetre.getListTextFieldProbabilite().get(x).getText());				
				x++;
			}
		}
		fenetre.dispose();
	}


	

}
