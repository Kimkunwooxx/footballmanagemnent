package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import footballplayer.FootballPlayerInput;
import manager.PlayerManager;

public class FootballPlayerViewer extends JPanel{
	
	WindowFrame frame;
	PlayerManager manager;

	public FootballPlayerViewer(WindowFrame frame, PlayerManager manager) {
		this.frame = frame;
		this.manager = manager;
		
		System.out.println("***" + manager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("AGE");
		model.addColumn("NATIONALITY");
		model.addColumn("WEIGHT");
		model.addColumn("HEIGHT");
		
		for(int i=0; i<manager.size(); i++) {
			Vector row = new Vector();
			FootballPlayerInput si = manager.get(i);
			row.add(si.getId());
			row.add(si.getName());
			row.add(si.getAge());
			row.add(si.getNationality());
			row.add(si.getWeight());
			row.add(si.getHeight());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
