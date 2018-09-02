import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;

public class Exam extends JPanel
{
	JPanel jp=new JPanel();
	private JButton ques1,op1,op2,op3,op4,qp,ques2,op5,op6,op7,btnSubmitScore,btnHighScore,btnSubmit;
	static Font fontArial= new Font("Arial",Font.BOLD,15);
	int result=0;
	String[] name = new String[10];
	String[] scored = new String[10];
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public Exam()
	{
	    setVisible(true);
		setSize(1200,800);
		setLayout(null);
		setBackground(Color.YELLOW);
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/score","root","");
			st = con.createStatement();
			System.out.println("yes");
			
		}
		
	
		catch(Exception ex)
		{
			System.out.println("no");
			System.out.println("error in db connection"+ex);
			
		}
		
		
		
		
		JButton score = new JButton("SCORE");
		score.setBounds(900,250,100,100) ;
		score.setBackground(Color.PINK);
		score.setFont(fontArial);
		add(score);
	
		ques1=new JButton("1. Which picture matches with the letter A ? ");
		ques1.setBounds(300,50,500,50);
		ques1.setBackground(Color.PINK);
		ques1.setFont(fontArial);
		add(ques1);
		
		
		
		ImageIcon imA=new ImageIcon("ap.png");
		JButton op1 = new JButton(imA);
	    op1.setBounds(400,120,80,80) ;
		add(op1);
		
		ImageIcon imM=new ImageIcon("ma.png");
		JButton op2 = new JButton(imM);
		op2.setBounds(620,120,80,80) ;
		add(op2);
		
		ImageIcon imV=new ImageIcon("ve.png");
		JButton op3 = new JButton(imV);
		op3.setBounds(400,220,80,80) ;
		add(op3);
		
		ImageIcon imO=new ImageIcon("or.png");
		JButton op4 = new JButton(imO);
		op4.setBounds(620,220,80,80) ;
		add(op4);
		
		
		ImageIcon imT=new ImageIcon("ti.png");
		JButton qp = new JButton(imT);
		qp.setBounds(490,430,120,70) ;
		add(qp);
		
		ques2=new JButton("2. What is the picture of this? ");
		ques2.setBounds(300,380,500,50);
		ques2.setBackground(Color.PINK);
		ques2.setFont(fontArial);
		add(ques2);
		
		op5=new JButton("ZEBRA");
		op5.setBounds(400,520,90,40);
		op5.setBackground(Color.PINK);
		op5.setFont(fontArial);
		add(op5);
		
		op6=new JButton("TIGER ");
		op6.setBounds(620,520,90,40);
		op6.setBackground(Color.PINK);
		op6.setFont(fontArial);
		add(op6);
		
		op7=new JButton("LION");
		op7.setBounds(510,520,90,40);
		op7.setBackground(Color.PINK);
		op7.setFont(fontArial);
		add(op7);

//		
		btnSubmitScore = new JButton("Submit Score");
		btnSubmitScore.setBounds(350, 600, 150, 40);
		btnSubmitScore.setBackground(Color.PINK);
		btnSubmitScore.setFont(fontArial);
		add(btnSubmitScore);
		
		btnHighScore = new JButton("High Score");
		btnHighScore.setBounds(600, 600, 150, 40);
		btnHighScore.setBackground(Color.PINK);
		btnHighScore.setFont(fontArial);
		add(btnHighScore);
		
		
		btnSubmitScore.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
        	
        	     JFrame sframe = new JFrame();
                 JPanel submit = new JPanel();
                 
                 sframe.setSize(600, 500);
                 sframe.setResizable(false);
                 submit.setSize(600,500);
         		submit.setLayout(null);
         		submit.setBackground(Color.CYAN);
         		
         		btnSubmit = new JButton("Submit");
         		btnSubmit.setBounds(470, 300, 100, 50);
			
         		JTextField txtName = new JTextField();
         		JLabel lblName = new JLabel("Put your name : ");
         		lblName.setBounds(100, 200, 150, 50);
         		JLabel lblput = new JLabel("Your Score : ");
         		lblput.setBounds(100, 100, 150, 50);
         		String score = String.valueOf(result);
         		JLabel lblScore = new JLabel(score);
         		//System.out.println(score);
         		lblScore.setBounds(300, 100, 150, 50);
         	
         		
         		txtName.setBounds(300, 200, 150, 50);
         		
         		btnSubmit.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent e) {
						
						String query = "INSERT INTO `top` (`Name`, `Score`) VALUES ('"+txtName.getText()+"', '"+score+"')";
						 
						try {
							st.executeUpdate(query);
							JOptionPane.showMessageDialog(null," Socre submitted ");
							result=0;
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				});
         		
         		submit.add(btnSubmit);
         		submit.add(lblput);
         		submit.add(lblScore);
         		submit.add(lblName);
         		submit.add(txtName);
         		
         		sframe.add(submit);
                 sframe.setVisible(true);
         		 sframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
		
		btnHighScore.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent event)
	            {
	                 JFrame hscore = new JFrame();
	                 
	                 JPanel score = new JPanel();
	                 
	                 
	                 try{
	     				
	     				
	     				
	     				String query ="select * from top ORDER BY Score DESC";
	     				rs = st.executeQuery(query);
	     				
	     				int i = 0;
	     				while(rs.next())
	     				{
	     					name[i] = rs.getString("Name");
	     					scored[i] = rs.getString("Score");
	     					i++;
	     					
	     					
	     				}
	                 }
	     				
	     				catch(Exception ex)
	     				{
	     					System.out.println("erro"+ex);
	     				}
	                 
	                JLabel lblName1 = new JLabel(name[0]);
	          		lblName1.setBounds(100, 100, 150, 50);
	          		JLabel lblName2 = new JLabel(name[1]);
	          		lblName2.setBounds(100, 200, 150, 50);
	          		JLabel lblName3 = new JLabel(name[2]);
	          		lblName3.setBounds(100, 300, 150, 50);
	          		JLabel lbl = new JLabel("TOP 3");
	          		lbl.setBounds(200, 20, 150, 50);
	          		
	          		JLabel lblScore1 = new JLabel(scored[0]);
	          		lblScore1.setBounds(300, 100, 150, 50);
	          		
	          		JLabel lblScore2 = new JLabel(scored[1]);
	          		lblScore2.setBounds(300, 200, 150, 50);
	          		
	          		JLabel lblScore3 = new JLabel(scored[2]);
	          		lblScore3.setBounds(300, 300, 150, 50);
	                 
	                 
	          		score.add(lblName1);
	          		score.add(lblName2);
	          		score.add(lblName3);
	          		score.add(lbl);
	          		score.add(lblScore1);
	          		score.add(lblScore2);
	          		score.add(lblScore3);
	          		
	          		
	          		
	          		
	                score.setSize(600,500);
	         		score.setLayout(null);
	         		score.setBackground(Color.CYAN);
	         		
	         		hscore.setSize(600, 500);
	         		hscore.setResizable(false);
	         		hscore.add(score);
	                hscore.setVisible(true);
	         		hscore.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	            }
	        });
		
		
		
		score.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 Score_action(event);
            }
        });
		
		ques1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 Q1_action(event);
            }
        });
		
		ques2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 Q2_action(event);
            }
        });
		
		op1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 O1_action(event);
            }
        });
		
		op2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 O2_action(event);
            }
        });
		
		op3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 O3_action(event);
            }
        });
		
		op4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                O4_action(event);
            }
        });
		
		op5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 O5_action(event);
            }
        });
		
		op6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 O6_action(event);
            }
        });
		
		op7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 O7_action(event);
            }
        });
		
	}	
		public static void PlaySound(File Sound)
    {
        try
		{
            
            Clip clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(1000); //sleep for the time sound is playing
        }
        catch(Exception e) { };
    }
		
		public static void Q1_action(ActionEvent event)
      {
          System.out.println("question 1 pressed.");
          File Clip=new File("q1.wav");
          PlaySound(Clip);
      }
	  
	  public static void Q2_action(ActionEvent event)
      {
          System.out.println("question 2 pressed.");
          File Clip=new File("q2.wav");
          PlaySound(Clip);
      }
	  
	  public void O1_action(ActionEvent event)
      {
          System.out.println("Option 1 pressed.");
          result=result+10;
      }
	  
	  public static void O2_action(ActionEvent event)
      {
         System.out.println("Option 2 pressed.");
          JOptionPane.showMessageDialog(null,"SORRY WRONG Answer :( ");;
      }
	  
	  
	  public static void O3_action(ActionEvent event)
      {
          System.out.println("Option 3 pressed.");
         JOptionPane.showMessageDialog(null,"SORRY WRONG Answer :( ");;
      }
	  
	  
	  public static void O4_action(ActionEvent event)
      {
          System.out.println("Option 4 pressed.");
          JOptionPane.showMessageDialog(null,"SORRY WRONG Answer :( ");;
      }
	  
	  public void O5_action(ActionEvent event)
      {
          System.out.println("Option 5 pressed.");
          JOptionPane.showMessageDialog(null,"SORRY WRONG Answer :( ");;
      }
	  
	  public void O6_action(ActionEvent event)
      {
          System.out.println("Option 6 pressed.");
          result=result+10;
      }
	  
	  public void O7_action(ActionEvent event)
      {
          System.out.println("Option 7 pressed.");
          JOptionPane.showMessageDialog(null,"SORRY WRONG Answer :( ");
;
      }
	
	public void Score_action(ActionEvent event)
      {
          System.out.println("score pressed.");
		  JOptionPane.showMessageDialog(null,"YOUR SCORE IS "+result);
         
      }
	
		
		
		
		
		
	
	}