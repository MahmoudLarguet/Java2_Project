package view;
import javax.swing.*;
import java.awt.*;
public class Welcome extends JPanel {
	private JLabel image;
	public Welcome() {
		setBackground(Color.gray);
		setLayout(new GridBagLayout());
		ImageIcon pic = new ImageIcon("image/welcome.jpg");
		image = new JLabel(pic);
		image.setHorizontalAlignment(JLabel.CENTER);
	    image.setVerticalAlignment(JLabel.CENTER);
	    GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0; // Expand horizontally
        gbc.weighty = 1.0; // Expand vertically
        gbc.anchor = GridBagConstraints.CENTER;
		add(image,gbc);
		
	}

	
}
