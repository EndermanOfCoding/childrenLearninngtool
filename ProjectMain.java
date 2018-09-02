import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ProjectMain {

	public static void main(String[] args) {
		
		JFrame mainFrame = new JFrame();
		JTabbedPane tabpane = new JTabbedPane();
		alphabetPage a1 = new alphabetPage();
		Exam exam=new Exam();
		
		mainFrame.setSize(1200,800);
		mainFrame.setResizable(false);
		mainFrame.setLayout(null);
		
		tabpane.setBounds(0,0, 1200, 800);
		tabpane.addTab("alphaPage", a1);
		tabpane.addTab("exam", exam);
		mainFrame.add(tabpane);
		mainFrame.setVisible(true);
		mainFrame.setTitle("FUN LEARNING");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
