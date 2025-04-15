package Hotel.Management.System;

import javax.swing.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icons/splash.gif"));
        JLabel label=new JLabel(imageicon);
        label.setBounds(0,0,800,500);
        add(label);
        setLayout(null);
        setLocation(300,80);
        setSize(700,450);
        setVisible(true);
        try{
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
