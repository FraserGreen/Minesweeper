import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ExternalHeaderPanel extends JPanel {
	public ExternalHeaderPanel() {
		add(new InternalHeaderPanel());
	}
	
}
