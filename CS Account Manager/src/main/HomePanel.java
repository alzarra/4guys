import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class HomePanel extends JFrame {
	
	private JPanel contentPane;
    
	
	public static void main(String[] args ) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					HomePanel frame = new HomePanel();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	protected JButton View_Accounts, Add_Account, View_Transaction, Logout;
	public HomePanel() {
		
		setTitle("CS-AccountManager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(300,300));
		this.pack();
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		GridLayout grid = new GridLayout(5,1);
		
		JPanel panelLayout = new JPanel(grid);
		JPanel VA_Panel = new JPanel();
		JPanel AA_Panel = new JPanel();
		JPanel VT_Panel = new JPanel();
		JPanel LO_Panel = new JPanel();

		
		View_Accounts = new JButton("Voew Accounts");
		Add_Account = new JButton("Add Account");
		View_Transaction = new JButton("View Transactions");
		Logout = new JButton("Log out");
		
		this.add(panelLayout, BorderLayout.CENTER);
		VA_Panel.add(View_Accounts);
		panelLayout.add(VA_Panel);
		
		AA_Panel.add(Add_Account);
		panelLayout.add(AA_Panel);
		
		VT_Panel.add(View_Transaction);
		panelLayout.add(VT_Panel);
		
		LO_Panel.add(Logout);
		panelLayout.add(LO_Panel);
		
		View_Accounts.addActionListener(new BL());
		Add_Account.addActionListener(new BL());
		View_Transaction.addActionListener(new BL());
		Logout.addActionListener(new BL());
		
		
		
		//by Ali "Logo" "will added to each frame"
		  JPanel LogoPanel = new JPanel();
		  LogoPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		  this.add(LogoPanel, BorderLayout.SOUTH);
		  LogoPanel.setPreferredSize(new Dimension(this.getWidth(), 16));
		  LogoPanel.setLayout(new BoxLayout(LogoPanel, BoxLayout.X_AXIS));
		  JLabel LogoLabel = new JLabel("Developed by 4Guys");
		  LogoPanel.add(LogoLabel);
		
		
		
	}
	
	private class BL implements ActionListener {
		
		public void actionPerformed (ActionEvent argo0) {
			
			if (argo0.getSource() == Logout ) 
			{
			System.exit(0);
			}
			
		}
	}
	

}
