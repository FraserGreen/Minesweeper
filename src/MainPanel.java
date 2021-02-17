import java.awt.BorderLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {
	public MainPanel() {
		setLayout(new BorderLayout());
		add(new ExternalHeaderPanel(), BorderLayout.NORTH);
	}

}
