package version1;

import java.awt.*;
import javax.swing.*;
import javax.swing.colorchooser.*;
import java.awt.event.*;

public class CCouleurFrame
    extends JFrame {

  JColorChooser chooser = new JColorChooser();

  public CCouleurFrame() {
    chooser.addChooserPanel(new MyChooserPanel());
    repaint();
    this.setSize(300, 300);
    setVisible(false);
    try {
      jbInit();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private void jbInit() throws Exception {
	  JColorChooser.createDialog(this,"Choissisez la couleur de la cellule",true,chooser,null,null).setVisible(true);
  }
}

class MyChooserPanel
    extends AbstractColorChooserPanel {
  // These are the methods that must be implemented
  // in order to create a color chooser panel.

  // This is called once to initialize the panel.
  public void buildChooser() {
    setLayout(new GridLayout(0, 3));
    makeAddButton("Rouge", new Color(255, 0, 0));
    makeAddButton("Orange", new Color(227, 108, 10));
    makeAddButton("Jaune", new Color(255, 204, 0));
    makeAddButton("Vert", new Color(0, 255, 0));
    makeAddButton("Bleu", new Color(0, 153, 204));
  }

  // This method is called whenever the user chooses this panel.
  // This method should retrieve the currently selected color.
  public void updateChooser() {
  }

  // This method is called to retrieve the label used
  // in the tab that selects this panel.
  public String getDisplayName() {
    return "MyChooserPanel";
  }

  // This method is currently not used.
  public Icon getSmallDisplayIcon() {
    return null;
  }

  // This method is currently not used.
  public Icon getLargeDisplayIcon() {
    return null;
  }

  // These are helper methods specifically for this example

  // Creates a color button and adds it to this panel.
  private void makeAddButton(String name, Color color) {
    JButton button = new JButton(name);
    button.setBackground(color);
    button.setAction(setColorAction);
    add(button);
  }

  // This action takes the background color of the button
  // and uses it to set the selected color.
  Action setColorAction = new AbstractAction() {
    public void actionPerformed(ActionEvent evt) {
      JButton button = (JButton) evt.getSource();

      getColorSelectionModel().setSelectedColor(button.getBackground());
    }
  };


}