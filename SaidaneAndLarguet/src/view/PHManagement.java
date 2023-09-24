package view;
import java.awt.Color;
import java.awt.Component;

import javax.swing.*;
public class PHManagement extends JSplitPane {
	private static ProfileManagement profilePane =  new ProfileManagement();
	private static HolidayTypeManagement holidayPane = new HolidayTypeManagement();
	public PHManagement() {
		super(JSplitPane.HORIZONTAL_SPLIT,profilePane,holidayPane);
		setDividerLocation(700);
		
		
	}
}
