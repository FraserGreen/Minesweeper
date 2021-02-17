import javax.swing.JFrame;
@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	public MainFrame() {
		setBounds(0, 0, 400, 400); //dimensions of the window - difficulty defaults to easy, should change when difficulty is updated
		setLocationRelativeTo(null); //centres the window
//		setPreferredSize(new Dimension(400, 400)); //dont know if this does anything
		add(new MainPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
