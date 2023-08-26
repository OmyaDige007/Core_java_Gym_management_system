package Gym;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Home_page extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	Font f,f1,f2;
	JPanel p1;
	
	Home_page()
	{
		super("home page");
		setSize(1600,900);
		setLocation(0,0);
		
		f=new Font("Lucide Fax",Font.BOLD,20);
		f2=new Font("Gadugi",Font.BOLD,35);
		f1=new Font("Ms UI Gothic",Font.BOLD,18);
		
		ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("HOME01.jpg"));		//image
		Image img=ic.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
		ImageIcon ic1=new ImageIcon(img);
		l1=new JLabel(ic1);
		
		//
		
		JMenuBar m1=new JMenuBar();
		JMenu men1=new JMenu("Master						........");
		JMenuItem ment1=new JMenuItem("Add Trainer");
		JMenuItem ment2=new JMenuItem("Add Customer");
		
		ImageIcon ic2=new ImageIcon(ClassLoader.getSystemResource("addT.jpg"));  		
		Image img2=ic2.getImage().getScaledInstance(16 ,16, Image.SCALE_DEFAULT );
		ImageIcon ic3=new ImageIcon(img2);
		ment1.setIcon(ic3);
		ment1.setMnemonic('T');
		ment1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
		
		ImageIcon ic4=new ImageIcon(ClassLoader.getSystemResource("addCus.jpg")); 	
		Image img3=ic4.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment2.setIcon(new ImageIcon(img3));
		ment2.setMnemonic('C');
		ment2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		
		JMenu men2=new JMenu("Attendunce						.........");
		JMenuItem ment3=new JMenuItem("Trainer Attendunce");
		JMenuItem ment4=new JMenuItem("Customer Attendunce");
		
		ImageIcon ic5=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img4=ic5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment3.setIcon(new ImageIcon(img4));
		ment3.setMnemonic('A');
		ment3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		
		ImageIcon ic6=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img5=ic6.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment4.setIcon(new ImageIcon(img5));
		ment4.setMnemonic('U');
		ment4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
		
		JMenu men3=new JMenu("Personal Information						.........");
		JMenuItem ment5=new JMenuItem("Trainer Information");
		JMenuItem ment6=new JMenuItem("Customer Information");
		
		ImageIcon ic7=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img6=ic7.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment5.setIcon(new ImageIcon(img6));
		ment5.setMnemonic('P');
		ment5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		
		ImageIcon ic8=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img7=ic8.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment6.setIcon(new ImageIcon(img7));
		ment6.setMnemonic('S');
		ment6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		
		JMenu men4=new JMenu("Update Information						.........");
		JMenuItem ment7=new JMenuItem("Update Trainer");
		JMenuItem ment8=new JMenuItem("Update Customer");
		
		ImageIcon ic9=new ImageIcon(ClassLoader.getSystemResource("update_trainer.jpeg")); 
		Image img8=ic9.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment7.setIcon(new ImageIcon(img8));
		ment7.setMnemonic('D');
		ment7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		
		ImageIcon ic10=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img9=ic10.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment8.setIcon(new ImageIcon(img9));
		ment8.setMnemonic('M');
		ment8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
		
		JMenu men5=new JMenu("Fess Informtion						........");
		JMenuItem ment9=new JMenuItem("Trainer Fees");
		JMenuItem ment10=new JMenuItem("Customer Fess");
		
		ImageIcon ic11=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img10=ic11.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment9.setIcon(new ImageIcon(img10));
		ment9.setMnemonic('F');
		ment9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
		
		ImageIcon ic12=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img11=ic12.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment10.setIcon(new ImageIcon(img11));
		ment10.setMnemonic('T');
		ment10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
		
		JMenu men6=new JMenu("All Details						........");
		JMenuItem ment11=new JMenuItem("Gym Details");
		JMenuItem ment12=new JMenuItem("Gym Gagets");
		
		ImageIcon ic13=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img12=ic13.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment11.setIcon(new ImageIcon(img12));
		ment11.setMnemonic('G');
		ment11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
		
		ImageIcon ic14=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img13=ic14.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment12.setIcon(new ImageIcon(img13));
		ment12.setMnemonic('Y');
		ment12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,ActionEvent.CTRL_MASK));
		
		JMenu men7=new JMenu("	Exit	...........");
		JMenuItem ment13=new JMenuItem("Exit");
		
		ImageIcon ic15=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img14=ic15.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment13.setIcon(new ImageIcon(img14));
		ment13.setMnemonic('X');
		ment13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		
	//	JMenu men8=new JMenu("Exercises Rutein");
		//JMenuItem ment14=new JMenuItem("Exercises Images");
	//	JMenuItem ment15=new JMenuItem("BMR Calculator");
		
	//	ImageIcon ic16=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
	/*	Image img15=ic16.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment14.setIcon(new ImageIcon(img15));
		ment14.setMnemonic('E');
		ment14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
		
		ImageIcon ic17=new ImageIcon(ClassLoader.getSystemResource("homePage2.jpg")); 	//__________________________
		Image img16=ic17.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		ment15.setIcon(new ImageIcon(img16));
		ment15.setMnemonic('B');
		ment15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));*/
		
		men1.add(ment1);
		men1.add(ment2);
		
		men2.add(ment3);
		men2.add(ment4);
		
		men3.add(ment5);
		men3.add(ment6);
		
		men4.add(ment7);
		men4.add(ment8);
		
		men5.add(ment9);
		men5.add(ment10);
		
		men6.add(ment11);
		men6.add(ment12);
		
		men7.add(ment13);
		
		//men8.add(ment14);
	//	men8.add(ment15);
		
		m1.add(men1);
		m1.add(men2);
		m1.add(men3);
		m1.add(men4);
		m1.add(men5);
		m1.add(men6);
		//m1.add(ment8);
		m1.add(men7);
		
		men1.setFont(f);
		men2.setFont(f);
		men3.setFont(f);
		men4.setFont(f);
		men5.setFont(f);
		men6.setFont(f);
		men7.setFont(f);
	//	men8.setFont(f);
		
		ment1.setFont(f1);
		ment2.setFont(f1);
		ment3.setFont(f1);
		ment4.setFont(f1);
		ment5.setFont(f1);
		ment6.setFont(f1);
		ment7.setFont(f1);
		ment8.setFont(f1);
		ment9.setFont(f1);
		ment10.setFont(f1);
		ment11.setFont(f1);
		ment12.setFont(f1);
		ment13.setFont(f1);
		//ment14.setFont(f1);
		//ment15.setFont(f1);
		
		m1.setBackground(Color.BLACK);
		
		men1.setForeground(Color.GRAY);
		men2.setForeground(Color.GRAY);
		men3.setForeground(Color.GRAY);
		men4.setForeground(Color.GRAY);
		men5.setForeground(Color.GRAY);
		men6.setForeground(Color.GRAY);
		men7.setForeground(Color.RED);
		//men8.setForeground(Color.GRAY);
		
		ment1.setBackground(Color.BLACK);
		ment2.setBackground(Color.BLACK);
		ment3.setBackground(Color.BLACK);
		ment4.setBackground(Color.BLACK);
		ment5.setBackground(Color.BLACK);
		ment6.setBackground(Color.BLACK);
		ment7.setBackground(Color.BLACK);
		ment8.setBackground(Color.BLACK);
		ment9.setBackground(Color.BLACK);
		ment10.setBackground(Color.BLACK);
		ment11.setBackground(Color.BLACK);
		ment12.setBackground(Color.BLACK);
		ment13.setBackground(Color.BLACK);
	//	ment14.setBackground(Color.BLACK);
	//	ment15.setBackground(Color.BLACK);
		
		ment1.setForeground(Color.YELLOW);
		ment2.setForeground(Color.YELLOW);
		ment3.setForeground(Color.YELLOW);
		ment4.setForeground(Color.YELLOW);
		ment5.setForeground(Color.YELLOW);
		ment6.setForeground(Color.YELLOW);
		ment7.setForeground(Color.YELLOW);
		ment8.setForeground(Color.YELLOW);
		ment9.setForeground(Color.YELLOW);
		ment10.setForeground(Color.YELLOW);
		ment11.setForeground(Color.YELLOW);
		ment12.setForeground(Color.YELLOW);
		ment13.setForeground(Color.YELLOW);
	//	ment14.setForeground(Color.YELLOW);
		//ment15.setForeground(Color.YELLOW);
	
		ment1.addActionListener(this);
		ment2.addActionListener(this);
		ment3.addActionListener(this);
		ment4.addActionListener(this);
		ment5.addActionListener(this);
		ment6.addActionListener(this);
		ment7.addActionListener(this);
		ment8.addActionListener(this);
		ment9.addActionListener(this);
		ment10.addActionListener(this);
		ment11.addActionListener(this);
		ment12.addActionListener(this);
		ment13.addActionListener(this);
	//	ment14.addActionListener(this);
		//ment15.addActionListener(this);
		
		setJMenuBar(m1);
		add(l1);//image add
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		String comnd=e.getActionCommand();
		if(comnd.equals("Add Trainer"))
		{
			new Add_Trainer().setVisible(true);
		}
		else if(comnd.equals("Add Customer"))
		{
			new Add_Customer().setVisible(true);
		}
		else if(comnd.equals("Trainer Attendunce"))
		{
			new Trainer_Attendunce().setVisible(true);
		}
		else if(comnd.equals("Customer Attendunce"))
		{
			new Customer_Attendunce().setVisible(true);
		}
		else if(comnd.equals("Trainer Information"))
		{
			new Trainer_Information().setVisible(true);
		}
		else if(comnd.equals("Customer Information"))
		{
			new Customer_Information().setVisible(true);
		}
		else if(comnd.equals("Update Trainer"))
		{
			new Update_Trainer().setVisible(true);
		}
		else if(comnd.equals("Update Customer"))
		{
			new Update_Customer().setVisible(true);
		}
		
		else if(comnd.equals("Trainer Fees"))
		{
			new Trainer_Fees().setVisible(true);
		}
		
		else if(comnd.equals("Customer Fees"))
		{
			 Customer_Fees cf=new  Customer_Fees();
			 cf.setVisible(true);
			 new Customer_Fees ();
		}
		else if(comnd.equals("Exit"))
		{
			System.exit(0);
		}
		}
		catch(Exception r)
		{
			System.out.print(r);
		}
	//	else if(comnd.equals("Gym Details"))
	//	{
	//		new Gym_Details().setVisible(true);
	//	}
		
		
	}
	public static void main(String args[])
	{
		new Home_page().setVisible(true);
	}
}