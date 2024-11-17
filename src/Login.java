package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

// Class definition that extends JFrame to create a windowed GUI application and implements ActionListener to handle button click events
public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;

    // Constructor for the Login class to set up the UI components
    Login(){
        // Set the title of the JFrame window
        super("Bank Management System");

        // Load the bank icon image using the ClassLoader
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        // Resize the loaded image to 100x100 pixels while maintaining its aspect ratio
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        // Convert the scaled image back into an ImageIcon
        ImageIcon i3=new ImageIcon(i2);
        // Create a JLabel to display the image
        JLabel image=new JLabel(i3);
        // Set the position and size of the image on the JFrame (x, y, width, height)
        image.setBounds(350,10,100,100);
        // Add the JLabel with the bank icon to the JFrame
        add(image);

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        // Create a JLabel with the text "WELCOME TO ATM"
        label1 = new JLabel("WELCOME TO ATM");
        // Set the text color of the JLabel to white
        label1.setForeground(Color.WHITE);
        // Set the font style, weight, and size for the text in the JLabel
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        // Set the position (x, y) and size (width, height) of the JLabel on the JFrame
        label1.setBounds(230,125,450,40);
        // Add the JLabel to the JFrame so that it appears on the window
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        // JTextField with a maximum column width of 15 characters
        textField2=new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        // JPasswordField with a preferred width of 15 characters
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

        // JButton with the text "SIGN IN" to represent a button that users can click
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100, 30);
        // When button1 is clicked, the actionPerformed() method of the current class will be called
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230, 30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2= iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        // Set the layout manager to 'null' to allow absolute positioning of components
        setLayout(null);
        // Set the size of the JFrame window (width, height)
        setSize(850,480);
        // Set the location of the JFrame on the screen (x, y)
        setLocation(450,200);
        // Make the JFrame visible on the screen
        setVisible(true);

    }
    // The actionPerformed method is called when an action event occurs (such as a button click)
    // ActionEvent is part of the ActionListener interface, which this class implements to handle events
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()== button1){
                conn c = new conn();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }

            } else if (e.getSource()== button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource()== button3) {
                new SignUp();
                setVisible(false);

            }

        }
        catch(Exception E){
            E.printStackTrace();
        }

    }


    public static void main(String[] args) {
        //Instance of the Login class, which will display the JFrame
        new Login();
    }
}