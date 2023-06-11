package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonViewListener3 implements ActionListener{
	WindowFrame frame;

	public ButtonViewListener3(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		AdressViewer viewer = frame.getAdressViewer();
		frame.setupPanel(viewer);
	}
}
