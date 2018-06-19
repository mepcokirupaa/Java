package apppkg;
import mypkg.CStudent;
import static mypkg.CStudent.*;
import mypkg.CalGeneralCategory;
import mypkg.CalSportsCategory;
import mypkg.CalphyCategory;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cutoff extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JRadioButton rdbtnNewRadioButton;
	//private JRadioButton rdbtnNewRadioButton_1;
	//private JRadioButton rdbtnNewRadioButton_2;
	//private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JRadioButton rdbtnNewRadioButton_5;
	private JRadioButton rdbtnNewRadioButton_6;
	private JRadioButton rdbtnNewRadioButton_7;
	private JRadioButton rdbtnNewRadioButton_8;
	private JRadioButton rdbtnNewRadioButton_9;
	private JRadioButton rdbtnNewRadioButton_10;
	private JRadioButton rdbtnNewRadioButton_11;
	private JRadioButton rdbtnNewRadioButton_12;
	private JRadioButton rdbtnNewRadioButton_13;
	private JRadioButton rdbtnNewRadioButton_14;
	private JRadioButton rdbtnNewRadioButton_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cutoff frame = new cutoff();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cutoff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adno");
		lblNewLabel_1.setBounds(0, 25, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("maths");
		lblNewLabel_2.setBounds(0, 45, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("physics");
		lblNewLabel_3.setBounds(0, 65, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("chemistry");
		lblNewLabel_4.setBounds(0, 85, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("entrance");
		lblNewLabel_5.setBounds(0, 102, 46, 26);
		contentPane.add(lblNewLabel_5);
		
	  /*  JLabel lblNewLabel_6 = new JLabel("cutoff");
		lblNewLabel_6.setBounds(0, 122, 46, 14);
		contentPane.add(lblNewLabel_6);*/
		
		textField = new JTextField();
		textField.setBounds(84, 0, 86, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(84, 22, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(84, 45, 86, 17);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 65, 86, 17);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(84, 85, 86, 17);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(84, 108, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(276, 65, 78, 23);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		rdbtnNewRadioButton = new JRadioButton("GenCat");
		rdbtnNewRadioButton.setBounds(0, 151, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_4 = new JRadioButton("SpoCat");
		rdbtnNewRadioButton_4.setBounds(138, 149, 86, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		rdbtnNewRadioButton_5 = new JRadioButton("PhyCat");
		rdbtnNewRadioButton_5.setBounds(270, 125, 109, 14);
		contentPane.add(rdbtnNewRadioButton_5);
		
		rdbtnNewRadioButton_6 = new JRadioButton("Intra");
		rdbtnNewRadioButton_6.setBounds(138, 171, 107, 14);
		contentPane.add(rdbtnNewRadioButton_6);
		
		rdbtnNewRadioButton_7 = new JRadioButton("Inter");
		rdbtnNewRadioButton_7.setBounds(138, 188, 117, 14);
		contentPane.add(rdbtnNewRadioButton_7);
		
		rdbtnNewRadioButton_8 = new JRadioButton("District");
		rdbtnNewRadioButton_8.setBounds(138, 205, 109, 14);
		contentPane.add(rdbtnNewRadioButton_8);
		
		rdbtnNewRadioButton_9 = new JRadioButton("state");
		rdbtnNewRadioButton_9.setBounds(138, 219, 109, 23);
		contentPane.add(rdbtnNewRadioButton_9);
		
		rdbtnNewRadioButton_10 = new JRadioButton("Nation");
		rdbtnNewRadioButton_10.setBounds(138, 238, 109, 23);
		contentPane.add(rdbtnNewRadioButton_10);
		
		rdbtnNewRadioButton_11 = new JRadioButton("10%-20%");
		rdbtnNewRadioButton_11.setBounds(270, 142, 109, 14);
		contentPane.add(rdbtnNewRadioButton_11);
		
		rdbtnNewRadioButton_12 = new JRadioButton("20%-40%");
		rdbtnNewRadioButton_12.setBounds(270, 160, 111, 14);
		contentPane.add(rdbtnNewRadioButton_12);
		
		rdbtnNewRadioButton_13 = new JRadioButton("40%-50%");
		rdbtnNewRadioButton_13.setBounds(270, 171, 109, 23);
		contentPane.add(rdbtnNewRadioButton_13);
		
		rdbtnNewRadioButton_14 = new JRadioButton("50%-60%");
		rdbtnNewRadioButton_14.setBounds(270, 193, 109, 14);
		contentPane.add(rdbtnNewRadioButton_14);
		
		rdbtnNewRadioButton_15 = new JRadioButton("60%&above");
		rdbtnNewRadioButton_15.setBounds(270, 210, 109, 14);
		contentPane.add(rdbtnNewRadioButton_15);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
           // private int totalSeats;
			public void actionPerformed(ActionEvent arg0){
			String sName1=textField.getText();
			 String Adno=textField_1.getText();
			 int nAdno1=Integer.parseInt(Adno);
			 String maths=textField_2.getText();
             double mathsMark=Double.parseDouble(maths);			
			 String physics=textField_3.getText();
             double physicsMark=Double.parseDouble(physics);
             String chemistry=textField_4.getText();
             double chemistryMark=Double.parseDouble(chemistry);
             String entrance=textField_5.getText();
             double entMark=Double.parseDouble(entrance);
            // public int bonus ;
            // String cutoff=textField_6.getText();
            // double cutoff=Double.parseDouble(cutof);
             if(rdbtnNewRadioButton.isSelected())
             {
                  CalGeneralCategory e=new CalGeneralCategory(sName1,nAdno1,mathsMark,physicsMark,chemistryMark,entMark);
                  e.calCutoff(bonus);
                  e.Display();
                 /*if(cutoff>=160 && totalSeats>0)
                 {
                   if(totalSeats>0&&totalSeats>3)
                   {
                     totalSeats--;
                     System.out.println("You are allocated to our college");
                   }
                   else if(totalSeats>0&&totalSeats<=3)
                   {
                    System.out.println("You are in Waiting List");
                    totalSeats--;
                   }
                   else
                       System.out.println("You are not eligible");
                   
                 }*/

             }
             if(rdbtnNewRadioButton_4.isSelected())
             {
				 CalSportsCategory
				 f=new CalSportsCategory(sName1,nAdno1,mathsMark,physicsMark,chemistryMark,entMark);
                 f.calCutoff(bonus);
                 f.Display();
               //  String nCutoff=""+cutoff;
                 //textField_6.setText(nCutoff);
                 if(rdbtnNewRadioButton_6.isSelected())
                 {
                	 bonus=1;
                 }
                 if(rdbtnNewRadioButton_7.isSelected())
                 {
                	 bonus=2;
                 }
                 if(rdbtnNewRadioButton_8.isSelected())
                 {
                	 bonus=3;
                 }
                 if(rdbtnNewRadioButton_9.isSelected())
                 {
                	 bonus=4;
                 }
                 if(rdbtnNewRadioButton_10.isSelected())
                 {
                	 bonus=5;
                 }
                 
                /*if(cutoff>=160 && totalSeats>0)
                {
                  if(totalSeats>0&&totalSeats>3)
                  {
                    totalSeats--;
                    System.out.println("You are allocated to our college");
                  }
                  else if(totalSeats>0&&totalSeats<=3)
                  {
                   System.out.println("You are in Waiting List");
                   totalSeats--;
                  }
                }

                else
                  System.out.println("You are not eligible");*/

             }
             if(rdbtnNewRadioButton_5.isSelected())
             {
              	 CalphyCategory g=new CalphyCategory(sName1,nAdno1,mathsMark,physicsMark,chemistryMark,entMark);
              	 g.calCutoff(bonus);
                 g.Display();
                 if(rdbtnNewRadioButton_11.isSelected())
                 {
                	 bonus=1;
                 }
                 if(rdbtnNewRadioButton_12.isSelected())
                 {
                	 bonus=2;
                 }
                 if(rdbtnNewRadioButton_13.isSelected())
                 {
                	 bonus=3;
                 }
                 if(rdbtnNewRadioButton_14.isSelected())
                 {
                	 bonus=4;
                 }
                 if(rdbtnNewRadioButton_15.isSelected())
                 {
                	 bonus=5;
                 }
                 /*if(cutoff>=160 && totalSeats>0)
                 {
                   if(totalSeats>0&&totalSeats>3)
                   {
                     totalSeats--;
                     System.out.println("You are allocated to our college");
                   }
                   else if(totalSeats>0&&totalSeats<=3)
                   {
                    System.out.println("You are in Waiting List");
                    totalSeats--;
                   }
                 }
                 else
                   System.out.println("You are not eligible");*/
          
	 
             }
			
             String nCutoff=""+cutoff;
             textField_6.setText(nCutoff);
			}
		});
		btnNewButton.setBounds(265, 238, 89, 23);
		contentPane.add(btnNewButton);
		
		
	    JLabel lblNewLabel_6 = new JLabel("cutoff");
		lblNewLabel_6.setBounds(216, 65, 69, 21);
		contentPane.add(lblNewLabel_6);
		
	
		
		
		
		
		
		
	}
}
