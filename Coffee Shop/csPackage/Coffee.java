package csPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Coffee extends JFrame
{
	private Container c;
	private JButton back;
	private Cursor cur;
	private JLabel l;
	private Font f1;
	private Font f2;
	
	Coffee()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLACK);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,150,400,500);
		setTitle("COFFEE SHOP");
		setResizable(false);
		
		f1 = new Font("FORTE", Font.BOLD, 26);
		f2 = new Font("JOKERMAN", Font.BOLD, 14);
		
		l = new JLabel("DRINK MENU");
		l.setBounds(100,10,300,100);
		l.setFont(f1);
		l.setForeground(Color.ORANGE);
		c.add(l);
		
		l = new JLabel("CAPPUCCINO..........BDT 210");
		l.setBounds(10,50,400,100);
		l.setFont(f2);
		l.setForeground(Color.RED);
		c.add(l);
		
		l = new JLabel("GLACE...............BDT 250");
		l.setBounds(10,100,400,100);
		l.setFont(f2);
		l.setForeground(Color.YELLOW);
		c.add(l);
		
		l = new JLabel("LATTE...............BDT 300");
		l.setBounds(10,150,400,100);
		l.setFont(f2);
		l.setForeground(Color.RED);
		c.add(l);
		
		l = new JLabel("COCOA...............BDT 350");
		l.setBounds(10,200,400,100);
		l.setFont(f2);
		l.setForeground(Color.YELLOW);
		c.add(l);
		
		l = new JLabel("MOCHA...............BDT 370");
		l.setBounds(10,250,400,100);
		l.setFont(f2);
		l.setForeground(Color.RED);
		c.add(l);
		
		l = new JLabel("AMERICNO............BDT 350");
		l.setBounds(10,300,400,100);
		l.setFont(f2);
		l.setForeground(Color.YELLOW);
		c.add(l);
		
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
		Coffee cof = new Coffee();
        cof.setVisible(true);		
	}*/
}