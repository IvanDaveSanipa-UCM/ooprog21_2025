import javax.swing.*;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter your name:");

            if (name == null) {
                System.exit(0);
            }

            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to display your name: " + name + "?",
                    "Confirm Name",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name);
                break;  
           }
        }
    }
}


