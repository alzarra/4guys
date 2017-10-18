import javax.swing.JFrame;

public class AccountFrame {

 public static void main(String[] args) {

  JFrame aFrame = new JFrame("CS-AccountManager");
  aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  LoginPanel Lpanel = new LoginPanel();
  ViewAccountMember accountView = new ViewAccountMember();
  aFrame.getContentPane().add(Lpanel);
  aFrame.pack();
  aFrame.setVisible(true);
  aFrame.getContentPane().add(accountView);
  accountView.setVisible(false);
  // the method below checks for a username/password match; if they match, the
  // initial view will replace the login panel
  if (Lpanel.match == true) {
   Lpanel.setVisible(false);
   // accountView.setVisible(true);
  }

 }
}
