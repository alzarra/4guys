import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewAccountMember extends JPanel {
 private AccountMember member;
 private JLabel displayName, displayTotal;
 NumberFormat x = NumberFormat.getCurrencyInstance();

 public ViewAccountMember() {
  this.setLayout(new GridLayout(4, 1));
  member = new AccountMember("Auston Rogers");
  displayName = new JLabel("Account Member: " + member.getName());
  displayTotal = new JLabel("Account Total: " + x.format(member.getTotal()));
  this.add(displayName);
  this.add(displayTotal);
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
