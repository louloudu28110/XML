package version1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FenetreInformation extends JFrame {

	private ArrayList<JTextField> listTextFieldProbabilite;
	private ArrayList<JTextField> listTextFieldGravite;
	private Matrice matrice;
	
	public FenetreInformation(Matrice matrice) throws HeadlessException {
		super();
		this.matrice = matrice;
		build();
	}

	private void build() {
		// TODO Auto-generated method stub
		setTitle("Veuillez renseigner les informations"); 
		setSize(400,240); 
		setLocationRelativeTo(null); 
		setResizable(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setContentPane(constructFenetreInformation());
	}

	private JPanel constructFenetreInformation() {
		listTextFieldGravite = new ArrayList<JTextField>();
		listTextFieldProbabilite = new ArrayList<JTextField>();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(new JButton(new ActionBoutonValiderInfo(this, "Valider", this.matrice)), BorderLayout.SOUTH);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,2));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(new JLabel("Veuillez renseignez pour chaque gravité sa description"),BorderLayout.NORTH);
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(matrice.getNbColonne()-1,2));
		for(int i=0;i<(matrice.getNbColonne()-1)*2;i++){
			listTextFieldGravite.add(new JTextField());
			panel3.add(listTextFieldGravite.get(listTextFieldGravite.size()-1));
		}
		panel2.add(panel3,BorderLayout.CENTER);
		panel1.add(panel2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new BorderLayout());
		panel4.add(new JLabel("Veuillez renseigner pour chaque probabilité sa description"),BorderLayout.NORTH);
		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridLayout(matrice.getNbLigne()-1,2));
		for(int j=0;j<(matrice.getNbLigne()-1)*2;j++){
			listTextFieldProbabilite.add(new JTextField());
			panel5.add(listTextFieldProbabilite.get(listTextFieldProbabilite.size()-1));
		}
		panel4.add(panel5,BorderLayout.CENTER);
		panel1.add(panel4);
		
		panel.add(panel1,BorderLayout.CENTER);
		return panel;
	}

	public ArrayList<JTextField> getListTextFieldProbabilite() {
		return listTextFieldProbabilite;
	}

	public ArrayList<JTextField> getListTextFieldGravite() {
		return listTextFieldGravite;
	}
	
	
	
	
}
