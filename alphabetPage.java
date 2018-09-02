import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class alphabetPage extends JPanel
{
	static JPanel jp= new JPanel();
	static Font fontArial= new Font("Arial",Font.BOLD,15);
	static Font fontArial1= new Font("Arial",Font.BOLD,25);
	static Font fontArial2= new Font("Arial",Font.BOLD,40);
	static JButton btA, btB, btC, btD ,btE, btF, btG, btH, btI, btJ, btK, btL, btM, btN, btO;
	static JButton btP, btQ, btR, btS, btT, btU, btV, btW, btX, btY, btZ, btRmT, btRmO;

	public alphabetPage()
	{
		setSize(1200,800);
		setLayout(null);  
		setBackground(Color.YELLOW);
		jp.setBackground(Color.WHITE);
		jp.setBounds(300,30,600,400) ;
		jp.setVisible(true);
		jp.setLayout(null);
		add(jp);
	
		JLabel jl=new JLabel("RHYMES :");
		jl.setBounds(950,60,150,50);
		jl.setFont(fontArial1);
		add(jl);
	
		ImageIcon PicRmT=new ImageIcon("twin.png");
		JButton btRmT = new JButton(PicRmT);
		btRmT.setBounds(950,120,120,120) ;
		add(btRmT);
	
		ImageIcon PicRmO=new ImageIcon("ot.png");
		JButton btRmO = new JButton(PicRmO);
		btRmO.setBounds(950,270,120,120) ;
		add(btRmO);
	
		btA=new JButton("A");
		btA.setBounds(150,450,50,50) ;
		btA.setBackground(Color.PINK);
		btA.setFont(fontArial);
		add(btA);
	
		btB=new JButton("B");
		btB.setBounds(210,450,50,50) ;
		btB.setBackground(Color.PINK);
		btB.setFont(fontArial);
		add(btB);
	
		btC=new JButton("C");
		btC.setBounds(270,450,50,50) ;
		btC.setBackground(Color.PINK);
		btC.setFont(fontArial);
		add(btC);
	
		btD=new JButton("D");
		btD.setBounds(330,450,50,50) ;
		btD.setBackground(Color.PINK);
		btD.setFont(fontArial);
		add(btD);
	
		btE=new JButton("E");
		btE.setBounds(390,450,50,50) ;
		btE.setBackground(Color.PINK);
		btE.setFont(fontArial);
		add(btE);
	
		btF=new JButton("F");
		btF.setBounds(450,450,50,50) ;
		btF.setBackground(Color.PINK);
		btF.setFont(fontArial);
		add(btF);
	
		btG=new JButton("G");
		btG.setBounds(510,450,50,50) ;
		btG.setBackground(Color.PINK);
		btG.setFont(fontArial);
		add(btG);
	
		btH=new JButton("H");
		btH.setBounds(570,450,50,50) ;
		btH.setBackground(Color.PINK);
		btH.setFont(fontArial);
		add(btH);
	
		btI=new JButton("I");
		btI.setBounds(630,450,50,50) ;
		btI.setBackground(Color.PINK);
		btI.setFont(fontArial);
		add(btI);
	
		btJ=new JButton("J");
		btJ.setBounds(690,450,50,50) ;
		btJ.setBackground(Color.PINK);
		btJ.setFont(fontArial);
		add(btJ);
	
		btK=new JButton("K");
		btK.setBounds(750,450,50,50) ;
		btK.setBackground(Color.PINK);
		btK.setFont(fontArial);
		add(btK);
	
		btL=new JButton("L");
		btL.setBounds(810,450,50,50) ;
		btL.setBackground(Color.PINK);
		btL.setFont(fontArial);
		add(btL);
	
		btM=new JButton("M");
		btM.setBounds(870,450,50,50) ;
		btM.setBackground(Color.PINK);
		btM.setFont(fontArial);
		add(btM);
	
		btN=new JButton("N");
		btN.setBounds(930,450,50,50) ;
		btN.setBackground(Color.PINK);
		btN.setFont(fontArial);
		add(btN);
	
		btO=new JButton("O");
		btO.setBounds(990,450,50,50) ;
		btO.setBackground(Color.PINK);
		btO.setFont(fontArial);
		add(btO);
	
		btP=new JButton("P");
		btP.setBounds(240,510,50,50) ;
		btP.setBackground(Color.PINK);
		btP.setFont(fontArial);
		add(btP);
	
		btQ=new JButton("Q");
		btQ.setBounds(300,510,50,50) ;
		btQ.setBackground(Color.PINK);
		btQ.setFont(fontArial);
		add(btQ);
	
		btR=new JButton("R");
		btR.setBounds(360,510,50,50) ;
		btR.setBackground(Color.PINK);
		btR.setFont(fontArial);
		add(btR);
	
		btS=new JButton("S");
		btS.setBounds(420,510,50,50) ;
		btS.setBackground(Color.PINK);
		btS.setFont(fontArial);
		add(btS);
	
		btT=new JButton("T");
		btT.setBounds(480,510,50,50) ;
		btT.setBackground(Color.PINK);
		btT.setFont(fontArial);
		add(btT);
	
		btU=new JButton("U");
		btU.setBounds(540,510,50,50) ;
		btU.setBackground(Color.PINK);
		btU.setFont(fontArial);
		add(btU);
	
		btV=new JButton("V");
		btV.setBounds(600,510,50,50) ;
		btV.setBackground(Color.PINK);
		btV.setFont(fontArial);
		add(btV);
	
		btW=new JButton("W");
		btW.setBounds(660,510,50,50) ;
		btW.setBackground(Color.PINK);
		btW.setFont(fontArial);
		add(btW);
	
		btX=new JButton("X");
		btX.setBounds(720,510,50,50) ;
		btX.setBackground(Color.PINK);
		btX.setFont(fontArial);
		add(btX);
	
		btY=new JButton("Y");
		btY.setBounds(780,510,50,50) ;
		btY.setBackground(Color.PINK);
		btY.setFont(fontArial);
		add(btY);
	
		btZ=new JButton("Z");
		btZ.setBounds(840,510,50,50) ;
		btZ.setBackground(Color.PINK);
		btZ.setFont(fontArial);
		add(btZ);
	
		 revalidate();
         repaint();
	
	
	
	btRmT.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 RmT_action(event);
            }
        });
		
		btRmO.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 RmO_action(event);
            }
        });

	      btA.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 A_action(event);
            }
        });

    btB.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 B_action(event);
            }
        });

    btC.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 C_action(event);
            }
        });

    btD.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 D_action(event);
            }
        });
    btE.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 E_action(event);
            }
        });
    btF.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 F_action(event);
            }
        });
    btG.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 G_action(event);
            }
        });
    btH.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 H_action(event);
            }
        });
    btI.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 I_action(event);
            }
        });
    btJ.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 J_action(event);
            }
        });
    btK.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 K_action(event);
            }
        });
    btL.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 L_action(event);
            }
        });
    btM.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 M_action(event);
            }
        });
    btN.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 N_action(event);
            }
        });
    btO.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 O_action(event);
            }
        });
    btP.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 P_action(event);
            }
        });
    btQ.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 Q_action(event);
            }
        });
    btR.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 R_action(event);
            }
        });
    btS.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 S_action(event);
            }
        });
    btT.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 T_action(event);
            }
        });
    btU.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 U_action(event);
            }
        });
    btV.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 V_action(event);
            }
        });
    btW.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 W_action(event);
            }
        });
    btX.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 X_action(event);
            }
        });
    btY.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 Y_action(event);
            }
        });
    btZ.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 Z_action(event);
            }
        });
	}
  public static void PlaySound(File Sound)
    {
        try{
            
            Clip clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(100); //sleep for the time sound is playing
    }
        catch(Exception e) { };
}
  
  public static void RmT_action(ActionEvent event)
      {
          System.out.println("Twinkle pressed.");
          jp.removeAll();
		  ImageIcon PicRmT2=new ImageIcon("twinkle-twinkle-little-star.png");
          JLabel JRmT=new JLabel(PicRmT2,JLabel.CENTER);
		  JRmT.setBounds(10,10,580,380);
          jp.add(JRmT);
          jp.revalidate();
          jp.repaint();

         File Clip=new File("Tw.wav");
         PlaySound(Clip);
      }
	  
	  public static void RmO_action(ActionEvent event)
      {
          System.out.println("Onetwo pressed.");
          jp.removeAll();
          ImageIcon PicRmO2=new ImageIcon("onetwo2.png");
          JLabel JRmO=new JLabel(PicRmO2,JLabel.CENTER);
		  JRmO.setBounds(10,10,580,380);
          jp.add(JRmO);
          jp.revalidate();
          jp.repaint();

         File Clip=new File("otb.wav");
         PlaySound(Clip);
      }
  
  public static void A_action(ActionEvent event)
      {
          System.out.println("A pressed.");
          jp.removeAll();
          ImageIcon PicA=new ImageIcon("a.png");
          JLabel JA=new JLabel("APPLE",PicA,JLabel.CENTER);
          JA.setBounds(50,10,380,400);
          JA.setFont(fontArial2);
          JA.setForeground(Color.RED);
          jp.add(JA);
          jp.revalidate();
          jp.repaint();

         File Clip=new File("A.wav");
         PlaySound(Clip);
      }
      public static void B_action(ActionEvent event)
      {
          System.out.println("B pressed.");
          jp.removeAll();
          ImageIcon PicB=new ImageIcon("b.png");
          JLabel JB=new JLabel("BALL",PicB,JLabel.CENTER);
          JB.setBounds(50,10,380,400);
          JB.setFont(fontArial2);
          JB.setForeground(Color.RED);
          jp.add(JB);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("B.wav");
         PlaySound(Clip);
      }

      public static void C_action(ActionEvent event)
      {
          System.out.println("C pressed.");
          jp.removeAll();
          ImageIcon PicC=new ImageIcon("c.png");
          JLabel JC=new JLabel("CAT",PicC,JLabel.RIGHT);
          JC.setBounds(10,5,450,400);
          JC.setFont(fontArial2);
          JC.setForeground(Color.RED);
          jp.add(JC);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("C.wav");
         PlaySound(Clip);
      }

      public static void D_action(ActionEvent event)
      {
          System.out.println("D pressed.");
          jp.removeAll();
          ImageIcon PicD=new ImageIcon("d.png");
          JLabel JD=new JLabel("DOLL",PicD,JLabel.CENTER);
          JD.setBounds(50,10,420,420);
          JD.setFont(fontArial2);
          JD.setForeground(Color.RED);
		  
          jp.add(JD);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("D.wav");
         PlaySound(Clip);
      }
        public static void E_action(ActionEvent event)
      {
          System.out.println("E pressed.");
          jp.removeAll();
          ImageIcon PicE=new ImageIcon("e.png");
          JLabel JE=new JLabel("EGG",PicE,JLabel.CENTER);
          JE.setBounds(50,10,380,400);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          jp.add(JE);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("E.wav");
         PlaySound(Clip);
      }
      public static void F_action(ActionEvent event)
      {
          System.out.println("F pressed.");
          jp.removeAll();
          ImageIcon PicF=new ImageIcon("f.png");
          JLabel JF=new JLabel("FISH",PicF,JLabel.CENTER);
          JF.setBounds(50,10,420,400);
          JF.setFont(fontArial2);
          JF.setForeground(Color.RED);
          jp.add(JF);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("F.wav");
         PlaySound(Clip);
      }
      public static void G_action(ActionEvent event)
      {
          System.out.println("G pressed.");
          jp.removeAll();
          ImageIcon PicG=new ImageIcon("g.png");
          JLabel JG=new JLabel("GOAT",PicG,JLabel.CENTER);
          JG.setBounds(50,10,420,400);
          JG.setFont(fontArial2);
          JG.setForeground(Color.RED);
          jp.add(JG);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("G.wav");
         PlaySound(Clip);
      }
      public static void H_action(ActionEvent event)
      {
          System.out.println("H pressed.");
          jp.removeAll();
          ImageIcon PicH=new ImageIcon("h.png");
          JLabel JH=new JLabel("HEN",PicH,JLabel.CENTER);
          JH.setBounds(50,10,420,400);
          JH.setFont(fontArial2);
          JH.setForeground(Color.RED);
          jp.add(JH);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("H.wav");
         PlaySound(Clip);
      }
      public static void I_action(ActionEvent event)
      {
          System.out.println("I pressed.");
          jp.removeAll();
          ImageIcon PicI=new ImageIcon("i.png");
          JLabel JI=new JLabel("ICE",PicI,JLabel.CENTER);
          JI.setBounds(50,10,420,400);
          JI.setFont(fontArial2);
          JI.setForeground(Color.RED);
          jp.add(JI);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("I.wav");
         PlaySound(Clip);
      }
      public static void J_action(ActionEvent event)
      {
          System.out.println("J pressed.");
          jp.removeAll();
          ImageIcon PicJ=new ImageIcon("j.png");
          JLabel JJ=new JLabel("JUG",PicJ,JLabel.CENTER);
          JJ.setBounds(50,10,380,400);
          JJ.setFont(fontArial2);
          JJ.setForeground(Color.RED);
          jp.add(JJ);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("J.wav");	
         PlaySound(Clip);
      }
      public static void K_action(ActionEvent event)
      {
          System.out.println("K pressed.");
          jp.removeAll();
          ImageIcon PicK=new ImageIcon("k.png");
          JLabel JK=new JLabel("KITE",PicK,JLabel.CENTER);
          JK.setBounds(50,10,380,400);
          JK.setFont(fontArial2);
          JK.setForeground(Color.RED);
          jp.add(JK);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("K.wav");
         PlaySound(Clip);
      }
      public static void L_action(ActionEvent event)
      {
          System.out.println("L pressed.");
          jp.removeAll();
          ImageIcon PicL=new ImageIcon("l.png");
          JLabel JL=new JLabel("LION",PicL,JLabel.CENTER);
          JL.setBounds(10,15,500,350);
          JL.setFont(fontArial2);
          JL.setForeground(Color.RED);
         jp.add(JL);
         jp.revalidate();
          jp.repaint();
         File Clip=new File("L.wav");
         PlaySound(Clip);
      }
      public static void M_action(ActionEvent event)
      {
          System.out.println("M pressed.");
          jp.removeAll();
          ImageIcon PicM=new ImageIcon("m.png");
          JLabel JM=new JLabel("MANGO",PicM,JLabel.CENTER);
          JM.setBounds(5,10,600,400);
          JM.setFont(fontArial2);
          JM.setForeground(Color.RED);
          jp.add(JM);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("M.wav");
         PlaySound(Clip);
      }
      public static void N_action(ActionEvent event)
      {
          System.out.println("N pressed.");
          jp.removeAll();
          ImageIcon PicN=new ImageIcon("n.png");
          JLabel JN=new JLabel("NEST",PicN,JLabel.CENTER);
          JN.setBounds(50,10,450,400);
          JN.setFont(fontArial2);
          JN.setForeground(Color.RED);
          jp.add(JN);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("N.wav");
         PlaySound(Clip);
      }
      public static void O_action(ActionEvent event)
      {
          System.out.println("O pressed.");
          jp.removeAll();
          ImageIcon PicO=new ImageIcon("o.png");
          JLabel JO=new JLabel("ORANGE",PicO,JLabel.CENTER);
          JO.setBounds(50,10,450,400);
          JO.setFont(fontArial2);
          JO.setForeground(Color.RED);
          jp.add(JO);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("O.wav");
         PlaySound(Clip);
      }
      public static void P_action(ActionEvent event)
      {
          System.out.println("P pressed.");
          jp.removeAll();
          ImageIcon PicP=new ImageIcon("p.png");
          JLabel JP=new JLabel("PEN",PicP,JLabel.CENTER);
          JP.setBounds(50,10,500,400);
          JP.setFont(fontArial2);
          JP.setForeground(Color.RED);
          jp.add(JP);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("P.wav");
         PlaySound(Clip);
      }
      public static void Q_action(ActionEvent event)
      {
          System.out.println("Q pressed.");
          jp.removeAll();
          ImageIcon PicQ=new ImageIcon("q.png");
          JLabel JQ=new JLabel("QUEEN",PicQ,JLabel.CENTER);
          JQ.setBounds(50,10,450,400);
          JQ.setFont(fontArial2);
          JQ.setForeground(Color.RED);
          jp.add(JQ);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("Q.wav");
         PlaySound(Clip);
      }
      public static void R_action(ActionEvent event)
      {
          System.out.println("R pressed.");
          jp.removeAll();
          ImageIcon PicR=new ImageIcon("r.png");
          JLabel JR=new JLabel("ROSE",PicR,JLabel.CENTER);
          JR.setBounds(50,10,420,360);
          JR.setFont(fontArial2);
          JR.setForeground(Color.RED);
          jp.add(JR);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("R.wav");
         PlaySound(Clip);
      }
      public static void S_action(ActionEvent event)
      {
          System.out.println("S pressed.");
          jp.removeAll();
          ImageIcon PicS=new ImageIcon("s.png");
          JLabel JS=new JLabel("SUN",PicS,JLabel.CENTER);
          JS.setBounds(50,10,380,400);
          JS.setFont(fontArial2);
          JS.setForeground(Color.RED);
          jp.add(JS);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("S.wav");
         PlaySound(Clip);
      }
      public static void T_action(ActionEvent event)
      {
          System.out.println("T pressed.");
          jp.removeAll();
          ImageIcon PicT=new ImageIcon("t.png");
          JLabel JT=new JLabel("TIGER",PicT,JLabel.CENTER);
          JT.setBounds(10,10,570,400);
          JT.setFont(fontArial2);
          JT.setForeground(Color.RED);
          jp.add(JT);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("T.wav");
         PlaySound(Clip);
      }
      public static void U_action(ActionEvent event)
      {
          System.out.println("U pressed.");
          jp.removeAll();
          ImageIcon PicU=new ImageIcon("u.png");
          JLabel JU=new JLabel("UMBRELLA",PicU,JLabel.CENTER);
          JU.setBounds(0,10,600,400);
          JU.setFont(fontArial2);
          JU.setForeground(Color.RED);
          jp.add(JU);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("U.wav");
         PlaySound(Clip);
      }
      public static void V_action(ActionEvent event)
      {
          System.out.println("V pressed.");
          jp.removeAll();
          ImageIcon PicV=new ImageIcon("v.png");
          JLabel JV=new JLabel("VEGETABLE",PicV,JLabel.CENTER);
          JV.setBounds(0,10,600,400);
          JV.setFont(fontArial2);
          JV.setForeground(Color.RED);
          jp.add(JV);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("V.wav");
         PlaySound(Clip);
      }
      public static void W_action(ActionEvent event)
      {
          System.out.println("W pressed.");
          jp.removeAll();
          ImageIcon PicW=new ImageIcon("w.png");
          JLabel JW=new JLabel("WATCH",PicW,JLabel.CENTER);
          JW.setBounds(50,10,500,400);
          JW.setFont(fontArial2);
          JW.setForeground(Color.RED);
          jp.add(JW);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("W.wav");
         PlaySound(Clip);
      }
      public static void X_action(ActionEvent event)
      {
          System.out.println("X pressed.");
          jp.removeAll();
          ImageIcon PicX=new ImageIcon("x.png");
          JLabel JX=new JLabel("XYLOPHONE",PicX,JLabel.CENTER);
          JX.setBounds(0,10,600,400);
          JX.setFont(fontArial2);
          JX.setForeground(Color.RED);
          jp.add(JX);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("X.wav");
         PlaySound(Clip);
      }
      public static void Y_action(ActionEvent event)
      {
          System.out.println("Y pressed.");
          jp.removeAll();
          ImageIcon PicY=new ImageIcon("y.png");
          JLabel JY=new JLabel("YOYO",PicY,JLabel.CENTER);
          JY.setBounds(50,10,420,400);
          JY.setFont(fontArial2);
          JY.setForeground(Color.RED);
          jp.add(JY);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("Y.wav");
         PlaySound(Clip);
      }
      public static void Z_action(ActionEvent event)
      {
          System.out.println("Z pressed.");
          jp.removeAll();
          ImageIcon PicZ=new ImageIcon("z.png");
          JLabel JZ=new JLabel("ZEBRA",PicZ,JLabel.CENTER);
          JZ.setBounds(50,10,420,400);
          JZ.setFont(fontArial2);
          JZ.setForeground(Color.RED);
          jp.add(JZ);
          jp.revalidate();
          jp.repaint();
         File Clip=new File("Z.wav");
         PlaySound(Clip);
      }	
	
	
}
