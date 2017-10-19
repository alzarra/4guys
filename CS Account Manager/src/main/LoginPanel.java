import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class LoginPanel extends JPanel {

 private JLabel unameLabel, pwdLabel;
 protected JTextField unameTField, pwdTField;
 protected JButton login;
 protected String usernameInput, passwordInput, usernameActual, passwordActual;
 public boolean match;

 public LoginPanel() {

  unameLabel = new JLabel("Username: ");
  pwdLabel = new JLabel("Password: ");
  login = new JButton("Login");
  unameTField = new JTextField("", 10);
  pwdTField = new JTextField("", 10);
  // username and password for testing purposes
  usernameActual = "user";
  passwordActual = "pass";
  setPreferredSize(new Dimension(300, 300));
  setBackground(Color.WHITE);

  this.setLayout(new BorderLayout());
  GridLayout grid = new GridLayout(4, 1);
 
  JPanel panelLayout = new JPanel(grid);
  JPanel uNamePanel = new JPanel();
  JPanel pwdPanel = new JPanel();
  JPanel lButtonPanel = new JPanel();

  this.add(panelLayout, BorderLayout.CENTER);
  uNamePanel.add(unameLabel);
  uNamePanel.add(unameTField);
  panelLayout.add(uNamePanel);

  pwdPanel.add(pwdLabel);
  pwdPanel.add(pwdTField);
  panelLayout.add(pwdPanel);

  lButtonPanel.add(login);
  panelLayout.add(lButtonPanel);

  login.addActionListener(new textListen());
  
//by Ali "Logo" "will added to each frame"
  JPanel LogoPanel = new JPanel();
  LogoPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
  this.add(LogoPanel, BorderLayout.SOUTH);
  LogoPanel.setPreferredSize(new Dimension(this.getWidth(), 16));
  LogoPanel.setLayout(new BoxLayout(LogoPanel, BoxLayout.X_AXIS));
  JLabel LogoLabel = new JLabel("Developed by 4Guys");
  LogoPanel.add(LogoLabel);

 }

 private class textListen implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent arg0) {
	  
	  if(unameTField.getText().equals(usernameActual) && pwdTField.getText().equals(passwordActual)) {
		  JOptionPane.showMessageDialog(null, "you are succefully loged in");
		  HomePanel home = new HomePanel();
		  home.setVisible(true);
		  
	  }
	  else {
		  JOptionPane.showMessageDialog(null, "Oops!! something is wrong, try again");
	  }
  }

 }
}
