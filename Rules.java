package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    // Starts Heading with 
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(100, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(40, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(25, 100, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. All Questions are Compulsory." + "<br><br>" +
                "2. There are 15 seconds for each question" + "<br><br>" +
                "3. You may use 50-50 Life line for 1 times which eleminates two incorrect options and only show two correct options" + "<br><br>" +
                "4. Do not open any tab or press back button" + "<br><br>" +
                "5. There is no Negative marking" + "<br><br>" +
                "6. There are total 10 questions each 10 marks" + "<br><br>" +
                "7. Pen and Paper is allowed" + "<br><br>" +
                "8. Submit the quiz" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 600);
        setLocation(250, 20);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
