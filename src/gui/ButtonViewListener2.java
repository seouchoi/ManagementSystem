package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonViewListener2 implements ActionListener {
	WindowFrame frame;

	public ButtonViewListener2(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		AdressAdder adder = frame.getAdressAdder();
		frame.setupPanel(adder);
	}
}
