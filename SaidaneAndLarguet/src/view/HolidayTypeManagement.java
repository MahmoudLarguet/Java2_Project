package view;

import java.awt.*;
import javax.swing.*;

public class HolidayTypeManagement extends JPanel {
	private JPanel searchPane,holidayPane;
	private JTextField searchField;
	private JLabel holidayLabel;
	private JButton searchButton, cancelSearchButton,addHolidayType;
	private Font font;
	public HolidayTypeManagement() {
		// Declaring and Setting the Components  
		searchPane = new JPanel();
		holidayLabel = new JLabel("Holiday Types Management");
		searchField = new JTextField();
		searchButton = new JButton("Search");
		cancelSearchButton = new JButton("Clear");
		holidayPane = new JPanel(new BorderLayout());
		addHolidayType = new JButton("Add Holiday Type");
		// Declaring and Setting the options
		Dimension perectSize = new Dimension(150,30);
		GridBagConstraints rule = new GridBagConstraints();
		font = new Font("Arial",Font.PLAIN,24);
		rule.insets = new Insets(5,5,5,5); 
		
		
		// Setting the Layouts 
		setLayout(new BorderLayout());
		searchPane.setLayout(new GridBagLayout());
		
		// Search Section
		//Adding the Title
		rule.gridx = 0;
		rule.gridy = 0;
		holidayLabel.setFont(font);
		searchPane.add(holidayLabel,rule);
		// Adding the search Bar
		rule.gridx = 0;
		rule.gridy = 1;
		rule.gridwidth = 2;
		rule.fill = GridBagConstraints.HORIZONTAL;
		searchField.setPreferredSize(perectSize);
		searchPane.add(searchField,rule);
		
		//Adding the search Button
		rule.gridx = 0;
		rule.gridy = 2;
		rule.gridwidth = 1;
		rule.fill = GridBagConstraints.NONE;
		
		searchPane.add(searchButton,rule);
		
		//Adding the clear Button
		rule.gridx = 1;
		rule.gridy = 2;
		searchPane.add(cancelSearchButton,rule);
		
		//Adding The Search  Pane 
		add(searchPane,"North");
		
		// Profile Section
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(addHolidayType);
		holidayPane.add(buttonPanel);
		add(holidayPane,"Center");
		
	}
}
