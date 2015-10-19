package version1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenetreSaisieTaille extends JFrame {
	
	private JTextField textFieldNomMatrice;
	private JTextField textFieldNbLigne;
	private JTextField textFieldNbColonne;
	
	
	public FenetreSaisieTaille() {
		super();
		build();
	}

	private void build() {
		// TODO Auto-generated method stub
		setTitle("Information sur la nouvelle matrice"); 
		setSize(580,240); 
		setLocationRelativeTo(null); 
		setResizable(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setContentPane(constructFenetreSaisie());
	}

	private JPanel constructFenetreSaisie(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,1));
		JLabel label0 = new JLabel("Quelle est le nom de votre matrice ?");
		panel1.add(label0);
		textFieldNomMatrice = new JTextField();
		panel1.add(textFieldNomMatrice);
		panel.add(panel1, BorderLayout.NORTH);
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,1));
		JLabel label1 = new JLabel("Quelle est le nombre de ligne et de colonne de votre matrice (en tete de ligne et colonne compris) ?");
		panel2.add(label1);
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(2,2));
		JLabel label2 = new JLabel("Nombre de ligne : ");
		panel3.add(label2);
		textFieldNbLigne = new JTextField();
		panel3.add(textFieldNbLigne);
		JLabel label3 = new JLabel("Nombre de colonne : ");
		panel3.add(label3);
		textFieldNbColonne = new JTextField();
		panel3.add(textFieldNbColonne);
		panel2.add(panel3);
		panel.add(panel2,BorderLayout.CENTER);
		JButton bouton = new JButton(new ActionBoutonValider(this, "Valider"));
		panel.add(bouton,BorderLayout.PAGE_END);
		return panel;
	}

	public JTextField getTextFieldNomMatrice() {
		return textFieldNomMatrice;
	}

	public JTextField getTextFieldNbLigne() {
		return textFieldNbLigne;
	}

	public JTextField getTextFieldNbColonne() {
		return textFieldNbColonne;
	}
	
	
}
