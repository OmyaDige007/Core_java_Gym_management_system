package Gym;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gym_Detail {

	JFrame f=new JFrame("Gym_Details");
	JLabel l1,l2,l3,l4,l5,l6;
	JButton bt1;
	JPanel p1,p2,p3,p4;
	
	
	
	Gym_Detail()
	{
		f.setVisible(true);
		f.setSize(1400,900);
		f.setLocation(0,0);
		f.setBackground(Color.BLACK);
		
		ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("customer_fees1.jpg"));
		Image im=img.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
		l6=new JLabel(new ImageIcon(im));
		
		l1=new JLabel("Omya's Fitness Point");
		l2=new JLabel("Owner Name");
		l3=new JLabel("Omya Dige");
		l4=new JLabel("Address");
		l5=new JLabel("SATARA");
		
		f.setLayout(new GridLayout(2,1,10,10));
		p1.add(l1);
		p2.add(l6);
		p3.add(l2);p3.add(l3);
		p4.add(l4);p4.add(l5);
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		
		
	}
	public static void main(String args[])
	{
		new Gym_Detail().setVisible(true);
	}
	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
