import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {

 private JLabel unameLabel, pwdLabel;
 private JTextField unameTField, pwdTField;
 private JButton login;
 private String username, password;

 public LoginPanel() {

  unameLabel = new JLabel("Username: ");
  pwdLabel = new JLabel("Password: ");
  login = new JButton("Login");
  unameTField = new JTextField("                 ");
  pwdTField = new JTextField("                  ");

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

  username = unameTField.getText();
  password = pwdTField.getText();

 }

}
