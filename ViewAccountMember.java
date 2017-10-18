import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewAccountMember extends JPanel {
 private AccountMember member;
 private JLabel displayName;

 public ViewAccountMember() {
  member = new AccountMember("Auston Rogers");
  displayName = new JLabel(member.getName());
  this.add(displayName);
  this.setVisible(true);
  this.setPreferredSize(new Dimension(500, 500));
 }

 public static void main(String[] args) {
  JFrame test = new JFrame();
  test.setVisible(true);
  test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  test.add(new ViewAccountMember());
  test.pack();
 }
}
