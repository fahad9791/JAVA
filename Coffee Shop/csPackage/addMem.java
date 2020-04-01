package csPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class addMem extends JFrame
{
	private Container c;
	private JLabel l;
	private Font f1,f2;
	private JTextField lf1,lf2,lf3,lf4,lf5;
	private JPasswordField pf;
	private JButton save,back;
	private Cursor cur;
	
	addMem()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLACK);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,150,400,500);
		setTitle("COFFEE SHOP");
		setResizable(false);
		
		f1 = new Font("TIMES NEW ROMAN", Font.BOLD, 14);
		f2 = new Font("TIMES NEW ROMAN", Font.BOLD, 26);
		
		l = new JLabel("ADD MEMBER");
		l.setBounds(100,05,300,100);
		l.setFont(f2);
		l.setForeground(Color.ORANGE);
		c.add(l);
		
		l = new JLabel("Name:");
		l.setBounds(10,50,200,100);
		l.setFont(f1);
		l.setForeground(Color.WHITE);
		c.add(l);
		
		l = new JLabel("Password:");
		l.setBounds(10,100,200,100);
		l.setFont(f1);
		l.setForeground(Color.WHITE);
		c.add(l);
		
		l = new JLabel("Email:");
		l.setBounds(10,150,200,100);
		l.setFont(f1);
		l.setForeground(Color.WHITE);
		c.add(l);
		
		l = new JLabel("Address:");
		l.setBounds(10,200,200,100);
		l.setFont(f1);
		l.setForeground(Color.WHITE);
		c.add(l);
		
		l = new JLabel("City:");
		l.setBounds(10,250,200,100);
		l.setFont(f1);
		l.setForeground(Color.WHITE);
		c.add(l);
		
		l = new JLabel("Contact No:");
		l.setBounds(10,300,200,100);
		l.setFont(f1);
		l.setForeground(Color.WHITE);
		c.add(l);
		
		lf1 = new JTextField();
		lf1.setBounds(170,90,150,20);
		c.add(lf1);
		
		pf = new JPasswordField();
		pf.setBounds(170,140,150,20);
		c.add(pf);
		
		lf2 = new JTextField();
		lf2.setBounds(170,190,150,20);
		c.add(lf2);
		
		lf3 = new JTextField();
		lf3.setBounds(170,240,150,20);
		c.add(lf3);
		
		lf4 = new JTextField();
		lf4.setBounds(170,290,150,20);
		c.add(lf4);
		
		lf5 = new JTextField();
		lf5.setBounds(170,340,150,20);
		c.add(lf5);
		
		save = new JButton("SAVE");
		save.setBounds(120,370,100,40);
		c.add(save);
		cur = new Cursor(Cursor.HAND_CURSOR);  
		save.setCursor(cur);
		
		back = new JButton("< BACK");
		back.setBounds(280,400,80,40);
		c.add(back);
		cur = new Cursor(Cursor.HAND_CURSOR);  
		back.setCursor(cur);
		
		back.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
			    dispose();
				Menu m = new Menu();
				m.setVisible(true);
				
		    }
		
	    });
		
		
	}
	
	/*public static void main (String [] args)
	{
		addMem am  = new addMem();
        am.setVisible(true);		
	}*/
}