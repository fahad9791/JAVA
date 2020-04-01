package csPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame
{
	private Container c;
	private JLabel l;
	private Font f1;
	private Font f2;
	private JTextField lf;
	private JPasswordField pf;
	private JButton login;
	private Cursor cur;
	
	public Login()
	{
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLACK);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,150,400,500);
		setTitle("COFFEE SHOP");
		setResizable(false);
		
		f1 = new Font("ITALIC", Font.BOLD, 20);
		f2 = new Font("TIMES NEW ROMAN", Font.BOLD, 14);
		
		l = new JLabel("COFFEE SHOP");
		l.setBounds(100,10,300,100);
		l.setFont(f1);
		l.setForeground(Color.WHITE);
		c.add(l);
		
		l = new JLabel("Enter Your Username :");
		l.setBounds(10,70,200,100);
		l.setFont(f2);
		l.setForeground(Color.WHITE);
		c.add(l);
		
		l = new JLabel("Enter Your Password :");
		l.setBounds(10,130,200,100);
		l.setFont(f2);
		l.setForeground(Color.WHITE);
		c.add(l);
		
		lf = new JTextField();
		lf.setBounds(170,110,150,20);
		c.add(lf);
		
		pf = new JPasswordField();
		pf.setBounds(170,170,150,20);
		c.add(pf);
		
		login = new JButton("LOGIN");
		login.setBounds(150,250,100,50);
		c.add(login);
		cur = new Cursor(Cursor.HAND_CURSOR);  
		login.setCursor(cur);
		
		login.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				String user = lf.getText();
				String pass = pf.getText();
				
				if(user.equals("fahad") && pass.equals("12345"))
				{
					
					dispose();
					Menu m = new Menu();
					m.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid username or password","WARNING", JOptionPane.ERROR_MESSAGE);
				}
				
		}
		
	});
	}
	
	/*public static void main (String [] args)
	{
		Login log = new Login();
        log.setVisible(true);		
	}*/
}