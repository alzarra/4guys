
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CreateMemberPanel extends JPanel {



 private JLabel firstNameLabel, lastNameLabel;
 private JTextField firstNameTField, lastNameTField;
 private JButton submit, home;
 public String firstName, lastName;

 public CreateMemberPanel() {

  System.out.println("Here");

  firstNameLabel = new JLabel("First Name:");
  lastNameLabel = new JLabel("Last Name:");
  firstNameTField = new JTextField(10);
  lastNameTField = new JTextField(10);


  submit = new JButton("Submit");
  home = new JButton("Home");

  ButtonListener listener = new ButtonListener();
  submit.addActionListener(listener);
  home.addActionListener(listener);

  setPreferredSize(new Dimension(500, 500));
  setBackground(Color.WHITE);

  this.setLayout(new BorderLayout());
  GridLayout grid = new GridLayout(4, 1);
  JPanel panelLayout = new JPanel(grid);
  JPanel firstNamePanel = new JPanel();
  JPanel lastNamePanel = new JPanel();
  JPanel sButtonPanel = new JPanel();
  JPanel hButtonPanel = new JPanel();

  this.add(panelLayout, BorderLayout.CENTER);
  firstNamePanel.add(firstNameLabel);
  firstNamePanel.add(firstNameTField);
  panelLayout.add(firstNamePanel);

  lastNamePanel.add(lastNameLabel);
  lastNamePanel.add(lastNameTField);
  panelLayout.add(lastNamePanel);

  sButtonPanel.add(submit);
  panelLayout.add(sButtonPanel);

  hButtonPanel.add(home);
  panelLayout.add(hButtonPanel);

  firstName = firstNameTField.getText();
  lastName = lastNameTField.getText();

 }

 private class ButtonListener implements ActionListener
 {

   public void actionPerformed(ActionEvent event)
   {
    if (event.getSource() == home)
    System.out.println("home");
    else
    validateInput();
    System.out.println("submit");

   }
 }

 private void validateInput()
 {
   String text1 = firstName;
   String text2 = lastName;

   System.out.println("invalid");

   if ((text1.length() == 0) || (text2.length() == 0))
   {
     System.out.println("invalid");
   }
   else
   {
     System.out.println("valid");
   }
 }

}
