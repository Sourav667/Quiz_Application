package quiz.application;

import javax.swing.*; // add swing package
import java.awt.*;
import java.awt.event.*; 
// ACtionListener is a interface
public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    // Constructor 
    Login() 
    {
        // set Color it is present is awt package.
        getContentPane().setBackground(Color.WHITE); 
        // Create Own Layout
        setLayout(null);
        
        
        // Load the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        // where Place the Image
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        //  For Heading 
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(710, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        // Names 
        JLabel name = new JLabel("Enter your name");
        name.setBounds(780, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        //Text Field
        
        tfname = new JTextField();
        tfname.setBounds(700, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        // Create Button
        rules = new JButton("Next");
        rules.setBounds(700, 270, 100, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
         
        back = new JButton("Exit");
        back.setBounds(895, 270, 100, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1100, 500); // Set size of the Frame
        setLocation(80, 90); // Set Location
        setVisible(true); // By default it is false
    }
    // Method of 
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login(); // Anonymous Object
    }
}
