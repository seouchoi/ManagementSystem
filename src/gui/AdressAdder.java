package gui;

import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AdressAdder extends JFrame {
	
	public AdressAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ",JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelDistrict = new JLabel("District: ",JLabel.TRAILING);
		JTextField fieldDistrict = new JTextField(10);
		labelDistrict.setLabelFor(fieldDistrict);
		panel.add(labelDistrict);
		panel.add(fieldDistrict);
		
		JLabel labelCity = new JLabel("City: ",JLabel.TRAILING);
		JTextField fieldCity = new JTextField(10);
		labelCity.setLabelFor(fieldCity);
		panel.add(labelCity);
		panel.add(fieldCity);
		
		JLabel labelStreetNum = new JLabel("Street Number: ",JLabel.TRAILING);
		JTextField fieldStreetNum = new JTextField(10);
		labelStreetNum.setLabelFor(fieldStreetNum);
		panel.add(labelStreetNum);
		panel.add(fieldStreetNum);
		
		JLabel labelDetailAdress = new JLabel("Detail Adress: ",JLabel.TRAILING);
		JTextField fieldDetailAdress = new JTextField(10);
		labelDetailAdress.setLabelFor(fieldDetailAdress);
		panel.add(labelDetailAdress);
		panel.add(fieldDetailAdress);
		
		panel.add(new Button("Save"));
		panel.add(new Button("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 6 ,2 ,6 ,6 ,6 ,6 );
		
		this.setSize(300,300);
		this.setContentPane(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
		

}

