package view;
import javax.swing.*;
import java.awt.*;
import view.MenuBar;

public class MainFrame extends JFrame {
	private MenuBar menuBar ;
	private TabMenu tabs;
	public MainFrame() {
		super("Gestion Des Employes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		initComponents();
		
		
	}
	public void initComponents() {
		menuBar = new MenuBar();
		tabs = new TabMenu();
		Font f = new Font("Serif",Font.BOLD,25);
		setFont(f);
		setSize(1600,1400);
		setJMenuBar(menuBar);
		add(tabs);
	}
	public void initComponentsTest() {
		
	}
	public static void main(String[] args) {
		JFrame myFrame = new MainFrame();
		
	}
}