package view;
import javax.swing.*;
import java.awt.*;
public class HolidayCalendar extends JPanel {
	private String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private String[] years;
	private JComboBox yearsSelection,monthsSelection;
	
	public HolidayCalendar() {
		setYears();
		yearsSelection = new JComboBox<>(years);
		yearsSelection.setMaximumRowCount(5);
		monthsSelection = new JComboBox<>(months);
		monthsSelection.setMaximumRowCount(5);
		add(yearsSelection);
		add(monthsSelection);
		
	}
	
	
	
	
	
	
	private void setYears() {
		years = new String[20];
		for(int i = 0 ; i < 20;i++) {
			years[i]= Integer.toString(i+2020);
		}
		
	}
}
