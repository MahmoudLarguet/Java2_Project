package view;

import java.awt.*;
import javax.swing.*;

public class ProfileManagement extends JPanel {
	private JPanel searchPane,profilePane;
	private JTextField searchField;
	private JLabel profileLabel;
	private JButton searchButton, cancelSearchButton,addProfile;
	private Font font;
	public ProfileManagement() {
		// Declaring and Setting the Components  
		searchPane = new JPanel();
		profileLabel = new JLabel("Profile Management");
		searchField = new JTextField();
		searchButton = new JButton("Search");
		cancelSearchButton = new JButton("Clear");
		profilePane = new JPanel(new BorderLayout());
		addProfile = new JButton("Add Profile");
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
		profileLabel.setFont(font);
		searchPane.add(profileLabel,rule);
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
		buttonPanel.add(addProfile);
		profilePane.add(buttonPanel);
		add(profilePane,"Center");
		
	}
}
