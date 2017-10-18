import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewAccountMember extends JPanel {
 private AccountMember member;
 private JLabel displayName;
 private JButton logOut;

 public ViewAccountMember() {
  member = new AccountMember("Auston Rogers");// initializes a new member
  displayName = new JLabel(member.getName());// sets the label text to the member's name
  logOut = new JButton("Log Out");// initializes the Log Out button
  this.add(displayName);// add the label to the panel
  this.add(logOut);// add the Log Out button to the panel
  this.setVisible(true);// panel is visible
  this.setPreferredSize(new Dimension(500, 500));
  logOut.addActionListener(new ButtonListener());
 }

 private class ButtonListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent arg0) {
   // We will need to create a method that, when the logout button is pressed,
   // transfers focus to the Login panel
   System.out.println("Button pressed");
  }

 }

 public static void main(String[] args) {// the main method below is for unit testing
  JFrame testFrame = new JFrame();
  ViewAccountMember x = new ViewAccountMember();
  testFrame.getContentPane().add(x);
  testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  testFrame.setVisible(true);
  testFrame.pack();
 }
}
