import javax.swing.*;
public class Aufgabe1Neu {
    public static void main (String[] args)
    {
        String name = JOptionPane.showInputDialog("Geben Sie bitte Ihren Namen ein!");

        int alter = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte Ihr Alter ein!"));

        if (alter > 17) {
            JOptionPane.showMessageDialog(null,"Sie sind volljährig!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Sie sind nicht volljährig!");
        }
    }
}
