package view;
import java.awt.Color;
import java.awt.Component;

import javax.swing.*;
public class PHManagement extends JSplitPane {
	private static ProfileManagement profilePane ;
	private static HolidayTypeManagement holidayPane;
	public PHManagement() {
		super(JSplitPane.HORIZONTAL_SPLIT);
		profilePane = new ProfileManagement();
		holidayPane = new HolidayTypeManagement();
		setDividerLocation(600);
		setLeftComponent(profilePane);
		setRightComponent(holidayPane);
		
      

	}
}
