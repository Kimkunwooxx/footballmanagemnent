package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.PlayerManager;

public class WindowFrame extends JFrame{

	PlayerManager manager;
	MenuSelection menuselection;
	FootballPlayerAdder playerAdder;
	FootballPlayerViewer playerViewer;

	public WindowFrame(PlayerManager manager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.manager = manager;
		menuselection = new MenuSelection(this);
		playerAdder = new FootballPlayerAdder(this);
		playerViewer = new FootballPlayerViewer(this, this.manager);
		

		this.setupPanel(menuselection);

		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public FootballPlayerAdder getPlayerAdder() {
		return playerAdder;
	}

	public void setPlayerAdder(FootballPlayerAdder playerAdder) {
		this.playerAdder = playerAdder;
	}

	public FootballPlayerViewer getPlayerViewer() {
		return playerViewer;
	}

	public void setPlayerViewer(FootballPlayerViewer playerViewer) {
		this.playerViewer = playerViewer;
	}

}
