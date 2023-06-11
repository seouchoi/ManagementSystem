package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	AdressSelection adressSelection;
	MenuSelection menuselection;
	AdressAdder adressAdder;
	AdressViewer adressViewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.adressAdder = new AdressAdder(this);
		this.adressViewer = new AdressViewer(this);
		this.adressSelection = new AdressSelection(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AdressAdder getAdressAdder() {
		return adressAdder;
	}

	public void setAdressAdder(AdressAdder adressAdder) {
		this.adressAdder = adressAdder;
	}

	public AdressViewer getAdressViewer() {
		return adressViewer;
	}

	public void setAdressViewer(AdressViewer adressViewer) {
		this.adressViewer = adressViewer;
	}
	public AdressSelection getAdressSelection() {
		return adressSelection;
	}
	public void setAdressSelection(AdressSelection adressSelection) {
		this.adressSelection = adressSelection;
	}

	
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
}
