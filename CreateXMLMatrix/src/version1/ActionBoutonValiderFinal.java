package version1;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ActionBoutonValiderFinal extends AbstractAction {

	private FenetreMatrice fenetre;
	private Matrice matrice;



	public ActionBoutonValiderFinal(FenetreMatrice fenetre,String texte, Matrice matrice) {
		super(texte);
		this.fenetre = fenetre;
		this.matrice = matrice;
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int i, j;
		int x=0;
		for(i=0; i<matrice.getMatrice().length; i++) {
			for(j=0; j<matrice.getMatrice()[i].length; j++) {
				matrice.setMatrice(i,j,fenetre.getListTextField().get(x).getText());
				x++;
			}
		}
		creationXmlMatrice();
		creationXmlMatriceGrav();
		creationXmlMatriceProb();
		fenetre.dispose();

	}

	public void creationXmlMatrice(){
		Document document = null;
		DocumentBuilderFactory fabrique=null;
		
		try{
			fabrique = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = fabrique.newDocumentBuilder();
			document = builder.newDocument();
			Element racine = (Element) document.createElement("matrice");
			racine.setAttribute("nom", matrice.getNom());
			racine.setAttribute("nbLigne", Integer.toString(matrice.getNbLigne()));
			racine.setAttribute("nbColonne", Integer.toString(matrice.getNbColonne()));
			document.appendChild(racine);
			
			for(int i=0; i<matrice.getMatrice().length; i++) {
				for(int j=0; j<matrice.getMatrice()[i].length; j++) {
					Element cell = (Element) document.createElement("cell");
					cell.appendChild(document.createTextNode(matrice.getMatrice()[i][j]));
					racine.appendChild(cell);
				}
			}
			
			XMLSerializer ser = new XMLSerializer(System.out, new OutputFormat("xml", "UTF-8",true));
			ser.serialize(document);
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public void creationXmlMatriceGrav(){
		Document document = null;
		DocumentBuilderFactory fabrique=null;
		
		try{
			fabrique = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = fabrique.newDocumentBuilder();
			document = builder.newDocument();
			Element racine = (Element) document.createElement("informationGravite");
			racine.setAttribute("nom", matrice.getNom());
			racine.setAttribute("nbLigne", Integer.toString(matrice.getNbColonne()-1));
			racine.setAttribute("nbColonne", Integer.toString(2));
			document.appendChild(racine);
			
			for(int i=0; i<matrice.getInfoGravite().length; i++) {
					Element ligne = (Element) document.createElement("ligne");
					Element gravite = (Element) document.createElement("gravite");
					gravite.appendChild(document.createTextNode(matrice.getInfoGravite()[i][0]));
					ligne.appendChild(gravite);
					Element description = (Element) document.createElement("description");
					description.appendChild(document.createTextNode(matrice.getInfoGravite()[i][1]));
					ligne.appendChild(description);
					racine.appendChild(ligne);
			}
			
			XMLSerializer ser = new XMLSerializer(System.out, new OutputFormat("xml", "UTF-8",true));
			ser.serialize(document);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void creationXmlMatriceProb(){
		Document document = null;
		DocumentBuilderFactory fabrique=null;
		
		try{
			fabrique = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = fabrique.newDocumentBuilder();
			document = builder.newDocument();
			Element racine = (Element) document.createElement("informationProbabilite");
			racine.setAttribute("nom", matrice.getNom());
			racine.setAttribute("nbLigne", Integer.toString(matrice.getNbLigne()-1));
			racine.setAttribute("nbColonne", Integer.toString(2));
			document.appendChild(racine);
			
			for(int i=0; i<matrice.getInfoProbabilite().length; i++) {
					Element ligne = (Element) document.createElement("ligne");
					Element proba = (Element) document.createElement("probabilite");
					proba.appendChild(document.createTextNode(matrice.getInfoProbabilite()[i][0]));
					ligne.appendChild(proba);
					Element description = (Element) document.createElement("description");
					description.appendChild(document.createTextNode(matrice.getInfoProbabilite()[i][1]));
					ligne.appendChild(description);
					racine.appendChild(ligne);
			}
			
			XMLSerializer ser = new XMLSerializer(System.out, new OutputFormat("xml", "UTF-8",true));
			ser.serialize(document);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}
