package csPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Menu extends JFrame
{
	private Container c;
	private JButton menu, adm, details, logout, back;
	private Cursor cur;
	
	Menu()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLACK);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,150,400,500);
		setTitle("COFFEE SHOP");
		setResizable(false);
		
		menu = new JButton("MENU");
		menu.setBounds(100,50,150,50);
		c.add(menu);
		cur = new Cursor(Cursor.HAND_CURSOR);  
		menu.setCursor(cur);
		
		adm = new JButton("ADD MEMBER");
		adm.setBounds(100,150,150,50);
		c.add(adm);
		cur = new Cursor(Cursor.HAND_CURSOR);  
		adm.setCursor(cur);
		
		details = new JButton("DETAILS");
		details.setBounds(100,250,150,50);
		c.add(details);
		cur = new Cursor(Cursor.HAND_CURSOR);  
		details.setCursor(cur);
		
		logout = new JButton("LOGOUT");
		logout.setBounds(100,350,150,50);
		c.add(logout);
		cur = new Cursor(Cursor.HAND_CURSOR);  
		logout.setCursor(cur);
		
		back = new JButton("< BACK");
		back.setBounds(280,400,80,40);
		c.add(back);
		cur = new Cursor(Cursor.HAND_CURSOR);  
		back.setCursor(cur);
		
		adm.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
			    dispose();
				addMem am = new addMem();
				am.setVisible(true);
				
		    }
		
	    });
		
		menu.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
			    dispose();
				Coffee cof = new Coffee();
				cof.setVisible(true);
				
		    }
		
	    });
		
		logout.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
			    dispose();
				Login log = new Login();
				log.setVisible(true);
				
		    }
		
	    });
		
		back.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
			    dispose();
				Login log = new Login();
				log.setVisible(true);
				
		    }
		
	    });

	}
	

	/*public static void main (String [] args)
	{
		Menu m = new Menu();
        m.setVisible(true);		
	}*/
}