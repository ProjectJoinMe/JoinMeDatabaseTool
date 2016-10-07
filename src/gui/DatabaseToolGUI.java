package gui;

import javax.swing.*;
import java.awt.*;

public class DatabaseToolGUI extends JFrame
{
    public DatabaseToolGUI()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        initComponents();
    }
    
    private void initComponents()
    {
        Container cont = getContentPane();
        cont.setLayout(new GridLayout(1, 1));
        cont.add(new JTextField("Hi"));
    }
    
    public static void main(String[] args)
    {
        new DatabaseToolGUI().setVisible(true);
    }
}
