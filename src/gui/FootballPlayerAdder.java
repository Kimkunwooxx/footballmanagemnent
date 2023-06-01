package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FootballPlayerAdder extends JFrame {
	
	public FootballPlayerAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelAge = new JLabel("Age : ", JLabel.TRAILING);
		JTextField fieldAge = new JTextField(10);
		labelAge.setLabelFor(fieldAge);
		panel.add(labelAge);
		panel.add(fieldAge);
		
		JLabel labelNationality = new JLabel("Nationality : ", JLabel.TRAILING);
		JTextField fieldNationality = new JTextField(10);
		labelNationality.setLabelFor(fieldNationality);
		panel.add(labelNationality);
		panel.add(fieldNationality);
		
		JLabel labelWeight = new JLabel("Weight : ", JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelWeight.setLabelFor(fieldWeight);
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		JLabel labelHeight = new JLabel("Height : ", JLabel.TRAILING);
		JTextField fieldHeight = new JTextField(10);
		labelHeight.setLabelFor(fieldHeight);
		panel.add(labelHeight);
		panel.add(fieldHeight);
		
		panel.add(new JButton("SAVE"));
		panel.add(new JButton("CANCEL"));
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
