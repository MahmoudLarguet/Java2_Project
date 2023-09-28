package view;
import javax.swing.*;
import java.awt.*;

public class EmployeesManagement extends JPanel {
	private JPanel topPane, centerPane,bottomPane;
	private JComboBox selectSearch;
	private JButton search, cancelSearch,addEmployee;
	private JButton cin,firstName,lastName,position,status,birthDate;
	private JLabel action,resultsNumber;
	private Insets margin = new Insets(10,0,10,0);
	private JTextField searchField ;
	private JLabel title;
	public EmployeesManagement() {
		initTopPane();
		initCenterPane();
		initBottomPane();
		setLayout(new BorderLayout());
		add(topPane,"North");
		add(centerPane,"Center");
		add(bottomPane,"South");
	}
	public void initTopPane() {
		topPane = new JPanel();
		topPane.setLayout(new GridLayout(2,1));
		topPane.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
		
		// Adding The title
		title = new JLabel("Employees Management");
		title.setFont(new Font("Arial",Font.PLAIN,30));
		title.setHorizontalAlignment(JLabel.CENTER);
	    title.setVerticalAlignment(JLabel.CENTER);
		topPane.add(title);
		
		// Adding The Search 
		GridBagConstraints gc = new GridBagConstraints();
		JSplitPane searchSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		JPanel selectPane = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel searchPane = new JPanel(new FlowLayout());
		// Adding the select
		JLabel searchBy = new JLabel("Search By: ");
		String[] searchByItems = {"ID","First Name","Last Name","Profile","Status"};
		
		selectSearch = new JComboBox<>(searchByItems);
		selectPane.setPreferredSize(new Dimension(50,40));
		selectPane.add(searchBy);
		selectPane.add(selectSearch);
		searchSplitPane.setDividerLocation(200);
		searchSplitPane.setLeftComponent(selectPane);
		
		
		
		// Adding the search field
		
		searchField = new JTextField();
		search = new JButton("Search");
		cancelSearch  = new JButton("Cancel Search");
		
		searchField.setPreferredSize(new Dimension(130,20));
		searchPane.add(searchField,gc);
		searchPane.add(search,gc);
		searchPane.add(cancelSearch,gc);
		searchSplitPane.setRightComponent(searchPane);
		searchSplitPane.setDividerSize(0);
		gc.gridx = 0;
		gc.gridy = 1;
		gc.gridwidth = 2;
		gc.fill = GridBagConstraints.HORIZONTAL;
		searchField.setPreferredSize(new Dimension(180,30));
		searchPane.add(searchField);
		
		//Adding the search Button
		gc.gridx = 0;
		gc.gridy = 2;
		gc.gridwidth = 1;
		gc.fill = GridBagConstraints.NONE;
		
		searchPane.add(search);
		
		//Adding the clear Button
		gc.gridx = 1;
		gc.gridy = 2;
		searchPane.add(cancelSearch);
		topPane.add(searchSplitPane);
		
		
		
		
		

		
		
		
	}
	
	public void initCenterPane() {
		centerPane = new JPanel(new BorderLayout());
		JPanel topContainer = new JPanel(new GridLayout(2,1));
		GridBagConstraints c = new GridBagConstraints();
		JPanel addEmpPane = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JPanel tableHeaderPane = new JPanel(new GridLayout());
		
		
		cin = new JButton("CIN");
		firstName = new JButton("First Name");
		lastName = new JButton("Last Name");
		position = new JButton("Position");
		status = new JButton("Status");
		birthDate = new JButton("BirthDate");
		action = new JLabel("Action");
		action.setHorizontalAlignment(JLabel.CENTER);
	    action.setVerticalAlignment(JLabel.CENTER);
		addEmployee = new JButton("+");
		addEmployee.setFont(new Font("Arial",Font.PLAIN,24));
		addEmpPane.add(addEmployee);
		
       
		centerPane.add(addEmpPane);
		tableHeaderPane.add(cin);
		tableHeaderPane.add(firstName);
		tableHeaderPane.add(lastName);
		tableHeaderPane.add(position);
		tableHeaderPane.add(status);
		tableHeaderPane.add(birthDate);
		tableHeaderPane.add(action);
		
		topContainer.add(addEmpPane);
		topContainer.add(tableHeaderPane);
		centerPane.add(topContainer,"North");
	
	}
	
	public void initBottomPane() {
		bottomPane = new JPanel();
		resultsNumber = new JLabel("0 Reults");
		bottomPane.add(resultsNumber);
	}
}

