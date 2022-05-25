package com.Kel25;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JPanel loginPanel;
    private JPasswordField tfPass;
    private JButton btnSign;
    private JButton btnExit;
    private JTextField tfUser;
    private JLabel lblWelcome;
    private JLabel lblUser;
    private JLabel lblPass;

    private String username,password;

    public login(){
        JFrame frame = new JFrame();
        ImageIcon logo = new ImageIcon("logo.jpg");
        frame.setIconImage(logo.getImage());
        frame.setSize(540,270);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("MyBadminton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(loginPanel);
        frame.setVisible(true);



        username = "moonstar";
        password = "123";

        btnSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfUser.getText().equals(username) && tfPass.getText().equals(password)){
                    frame.dispose();
                    MyFrame myframe = new MyFrame("MyBadminton");
                    ImageIcon logo = new ImageIcon("logo.jpg");
                    myframe.setIconImage(logo.getImage());
                    myframe.setSize(540,500);
                    myframe.setLocationRelativeTo(null);
                    myframe.setVisible(true);

                }
                else {
                    JOptionPane.showMessageDialog(null,"Your Username or Password is Invalid!!!","Warning",JOptionPane.WARNING_MESSAGE);
                }

            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });



    }

}
