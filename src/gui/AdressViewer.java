package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdressViewer extends JPanel{
	
	WindowFrame frame;
	
	public AdressViewer(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("District");
		model.addColumn("City");
		model.addColumn("Street Number");
		model.addColumn("Detail Adress");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		
	}
}
