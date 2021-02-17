import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class InternalHeaderPanel extends JPanel {	
	public InternalHeaderPanel() {
		setLayout(new BorderLayout());
		setBackground(Color.LIGHT_GRAY);
		setBorder(BorderFactory.createLoweredBevelBorder());
		add(new JButton("mines"), BorderLayout.WEST);
		add(new JButton("face"), BorderLayout.CENTER);
		add(new JButton("timer"), BorderLayout.EAST);
		
	}
}
