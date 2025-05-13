import Figury2D.Kolo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Figury_2D extends JFrame{
    private JPanel contentPane;
    private JButton figury2DButton;
    private JButton figury3DButton;
    private JTabbedPane tabbedPane1;
    private JTextField podajPromienTextField;
    private JTextArea textArea1;
    private JButton obliczPoleButton;
    private JButton obliczObwodButton;
    private JTextField wynikTextField;


    public Figury_2D(){


        obliczPoleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = Integer.parseInt(textArea1.getText());
                Kolo kolo = new Kolo();
                kolo.setPromien(r);
                kolo.obliczPole();
                wynikTextField.setText(kolo.toString());

            }
        });










    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Figury 2D");
        frame.setSize(920, 380);
        frame.setContentPane(new Figury_2D().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
