package version1;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenetreMatrice extends JFrame {

	private ArrayList<JTextField> listTextField;
	private Matrice matrice;	
	
	public FenetreMatrice(Matrice matrice) {
		super();
		this.matrice = matrice;
		build();
	}

	private void build() {
		// TODO Auto-generated method stub
		setTitle("Veuillez renseigner la matrice"); 
		setSize(400,240); 
		setLocationRelativeTo(null); 
		setResizable(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setContentPane(constructFenetreMatrice());
	}

	private JPanel constructFenetreMatrice() {
		listTextField = new ArrayList<JTextField>();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(matrice.getNbLigne(),matrice.getNbColonne()));
		for(int i=0;i<matrice.getNbColonne()*matrice.getNbLigne();i++){
			listTextField.add(new JTextField());
			panel2.add(listTextField.get(listTextField.size()-1));
		}
		panel.add(panel2);
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
		JButton bouton = new JButton(new ActionBoutonValiderFinal(this, "Valider", this.matrice));
		JButton bouton1 = new JButton(new ActionBoutonRenseigner(this, "Renseigner les informations sur les probabilit�s et gravit�s de cette matrice ", this.matrice));
		panel3.add(bouton);
		panel3.add(bouton1);
		panel.add(panel3);
		return panel;
	}

	public ArrayList<JTextField> getListTextField() {
		return listTextField;
	}

	public Matrice getMatrice() {
		return matrice;
	}
	
	

}
