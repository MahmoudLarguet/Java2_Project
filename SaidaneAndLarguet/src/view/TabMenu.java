package view;
import javax.swing.*;
import java.awt.*;
public class TabMenu extends JTabbedPane {
	private JPanel welcome,employeManagement,holidayManagement;
	private JSplitPane phManagement;
	public TabMenu() {
		super(JTabbedPane.TOP);
		welcome = new JPanel();
		phManagement = new PHManagement();
		employeManagement = new JPanel();
		holidayManagement = new JPanel();
		add("Welcome",welcome);
		add("Profiles/Holidays Management",phManagement);
		add("Employees Management",employeManagement);
		add("Holiday Management",holidayManagement);
	}
}
