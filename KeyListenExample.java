package events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenExample extends JFrame implements KeyListener {
    JLabel lbName=new JLabel("Name");

    JTextField tfName=new JTextField(8);
    JButton btOK=new JButton("OK ");

    public KeyListenExample(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(lbName);
        add(tfName);
        add(btOK);

        tfName.addKeyListener(this);
        setLocation(400, 150);
        setSize(400,200);

        setVisible(true);
    }

    public static void main(String[] args){
    KeyListenExample frame=new KeyListenExample();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("\nkeyType");
        System.out.println(tfName.getText());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("\nkeyPressed");
        System.out.println(tfName.getText());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("\nkeyReleased");
        System.out.println(tfName.getText());

    }
}
