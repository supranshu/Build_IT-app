import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class firstPage extends JFrame implements ActionListener{
    JLabel l,l1,l2,l3; JButton b1,b2,b3,next;
    firstPage()
    {
        JLayeredPane pane=getLayeredPane();
        ImageIcon i= new ImageIcon("bg (1).png");
        l2= new JLabel(i);
        l2.setBounds(0,0,800,600);
        l2.setVisible(true);
        b1=new JButton("Start");
        b1.setBounds(360,20,80,30); 
        b1.setBackground(Color.green);
        b1.setFocusable(false);
        b1.setOpaque(false);
        b2= new JButton("Sign in");
        b2.setBounds(250,110,100,50);
        b2.setVisible(false);
        b3= new JButton("Sign up");
        b3.setBounds(450,110,100,50);
        b3.setVisible(false);
        l=new JLabel("Welcome to Build IT!!!");
        l.setBounds(340,50,160,30);
        l.setVisible(false);
        l1= new JLabel("Let's build your dream PC!");
        l1.setBounds(330,70,160,30);
        next = new JButton("Continue");
        next.setBackground(getForeground());
        next.setBounds(350,250,100,65);
        l3= new JLabel();
        l3.setBounds(350,200,100,100);
        l3.setVisible(false);
        next.setVisible(false);
        l1.setVisible(false);
        b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       next.addActionListener(this);
       pane.add(l2,new Integer(1));
       pane.add(b1,new Integer(2));
       pane.add(l,new Integer(2));
       pane.add(l1,new Integer(2));
       pane.add(b2,new Integer(2));
       pane.add(b3,new Integer(2));
       pane.add(next,new Integer(2));
        
        
        setVisible(true);
        setSize(800,600);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
       try{ if(e.getSource()==b1)
        {
            l.setVisible(true);
            
            l1.setVisible(true);
           

        }
        
        b2.setVisible(true);
        b3.setVisible(true);
        
        if(e.getSource()==b3)
        {
            new signupPage();
            next.setVisible(true);
        }
        else if(e.getSource()==b2)
        {
            new signinPage();
            next.setVisible(true);
        }
        else if(e.getSource()==next)
        {
           new secondPage();
           this.dispose();
        }
         }
            catch(Exception ex){
        
            }
        
    }
    public static void main(String[] args){
        new firstPage();
    }


}
class signupPage extends JFrame implements ActionListener
{
    JButton b;
    signupPage()
    {
    
     JLabel label = new JLabel();            
     label.setBounds(20,150, 200,50);  
      JPasswordField value = new JPasswordField();   
     value.setBounds(100,140,100,30);   
     JLabel l1=new JLabel("Username:");    
        l1.setBounds(20,20, 80,20);  
        JLabel l2=new JLabel("Phone no.:");    
        l2.setBounds(20,50, 80,20); 
        JLabel l3=new JLabel("E-mail:");    
        l3.setBounds(20,80, 80,20); 
        JLabel l4=new JLabel("Age:");    
        l4.setBounds(20,110, 80,20);   
        JLabel l5=new JLabel("Password:");    
        l5.setBounds(20,140, 80,20);       
        JTextField t1 = new JTextField();  
        t1.setBounds(100,20, 200,20);   
        JTextField t2 = new JTextField();  
        t2.setBounds(100,50, 200,20); 
        JTextField t3 = new JTextField();  
        t3.setBounds(100,80, 200,20); 
        JTextField t4 = new JTextField();  
        t4.setBounds(100,110, 200,20); 
        
       b= new JButton("Login");  
        b.setBounds(100,170, 80,20); 
        

        add(value); add(l1); add(label); add(l2); add(b); add(t1);  add(l3); add(l4); add(l5); add(t2); add(t3); add(t4); 
        b.addActionListener(this);
        setSize(500,500);    
        setLayout(null);    
        setVisible(true);
    }
        public void actionPerformed(ActionEvent e)
        {
            
            if(e.getSource()==b)
            {
            this.dispose();
            }
        }  


}
class signinPage extends JFrame implements ActionListener{
    JButton b;
    signinPage(){
        final JLabel label = new JLabel();            
     label.setBounds(20,150, 200,50);  
     final JPasswordField value = new JPasswordField();   
     value.setBounds(100,75,100,30);   
     JLabel l1=new JLabel("Username:");    
        l1.setBounds(20,20, 80,30);    
        JLabel l2=new JLabel("Password:");    
        l2.setBounds(20,75, 80,30);    
        b = new JButton("Login");  
        b.setBounds(100,120, 80,30);    
        final JTextField text = new JTextField();  
        text.setBounds(100,20, 100,30);    
                add(value); add(l1); add(label); add(l2); add(b); add(text);  
                setSize(300,300);    
                setLayout(null);    
                setVisible(true); 
                b.addActionListener(this);    
    }
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==b)
        {
        this.dispose();
        }
    } 

}
class secondPage extends JFrame implements ActionListener
{
    JButton b;
    JCheckBox cb1,cb2,cb3;  
    
    secondPage() 
    {
        ImageIcon i=new ImageIcon("pg2.jpg");
        JLayeredPane p=getLayeredPane();
        JLabel l1= new JLabel(i);
        l1.setBounds(0,0,800,600);
        JLabel l = new JLabel("Select PC Type");
        l.setBounds(50,10,100,20);
        cb1=new JCheckBox("Daily Use");  
        cb1.setBounds(400,150,150,20);  
        cb1.setOpaque(false);
        cb2=new JCheckBox("Office Work");  
        cb2.setBounds(400,200,150,20); 
        cb2.setOpaque(false); 
        cb3=new JCheckBox("Gaming");  
        cb3.setBounds(400,250,150,20); 
        cb3.setOpaque(false); 
        b= new JButton("Continue");
        b.setBounds(400,300,100,40);
        p.add(l1,new Integer(1));
        p.add(b,new Integer(2));
        p.add(cb1,new Integer(2));
        p.add(cb2,new Integer(2));
        p.add(cb3,new Integer(2));
        add(l); 
        
        b.addActionListener(this);
        setVisible(true);
        setLayout(null);
        setSize(800,600);
    }
        public void actionPerformed(ActionEvent e)
        {
            
            if(e.getSource()==b&&cb1.isSelected())
            {
                new dailyUse();
                this.dispose();
            }
            else if(e.getSource()==b&&cb2.isSelected())
            {
                new officeWork();
                this.dispose();
            }
            else if(e.getSource()==b&&cb3.isSelected())
            {
                new GamingType();
                this.dispose();
            }
            
        } 


}
class dailyUse extends JFrame implements ActionListener
{
    JButton b,b1,b2;
    int ch=0;
    int cost=0;
    int total;
    dailyUse()
    {
        ImageIcon i1=new ImageIcon("du.jpg");
        JLayeredPane p=getLayeredPane();
        JLabel l3=new JLabel(i1);
        l3.setBounds(0,0,800,600);
        JLabel l=new JLabel("RAM");
        l.setBounds(50,50,100,30);
        String ram[]={"RAM","1.2gb","2.4gb","3.8gb"};
        JComboBox cb1=new JComboBox<>(ram);
        cb1.setBounds(30,10,80,50);
        

        String rom[]={"ROM","1.256GB HDD","2.512GB HDD","3.1TB HDD"};
        JComboBox cb2=new JComboBox<>(rom);
        cb2.setBounds(30,70,80,50);
        
        String proc[]={"Processor","1.Core i3 7th gen"," 2.Core i3 10th gen"," 3.Core i5 9th gen","4.Core i5 10th gen"};
        JComboBox cb3=new JComboBox<>(proc);
        cb3.setBounds(30,130,120,50);
        
        String mot[]={"Motherboard","1.ASRock A320M-HDV R4.0","2.Asrock A520M-HDV","3.ASRock B450 Pro4 R2.0","4.ASRock B450M Pro4"};
        JComboBox cb4=new JComboBox<>(mot);
        cb4.setBounds(30,190,150,50);
       
        String acc[]={"Accessories Brand","1.Samsung","2.Acer","3.Redgaer"};
        JComboBox cb5=new JComboBox<>(acc);
        cb5.setBounds(30,250,150,50);

        String cool[]={"Cooling System","1.450W Bronze","2.550W Bronze","3.550W Gold"};
        JComboBox cb6=new JComboBox<>(cool);
        cb6.setBounds(30,310,150,50);

        String grap[]={"Graphc Card","1.Gigabyte rtx 1080 2gb vram","2.Gigabyte rtx 1650 4gb","3.Nvidia rtx 3050 4gb"};
        JComboBox cb7=new JComboBox<>(grap);
        cb7.setBounds(30,370,150,50);
        
        b= new JButton("Price");
        b.setBounds(430,350,150,30);

        b1= new JButton("Continue");
        b1.setBounds(430,400,150,30);
        
        b2= new JButton("Exit");
        b2.setBounds(430,450,150,30);

        cb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                ch=cb1.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=1500;
                            break;
                    case 2: cost+=2000;
                    break;
                    case 3:cost+=2500;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                ch=cb2.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=2500;
                    break;
                    case 2: cost+=3000;
                    break;
                    case 3:cost+=5000;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                ch=cb3.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=6700;
                    break;
                    case 2: cost+=7000;
                    break;
                    case 3:cost+=8000;
                    break;
                    case 4:cost+=9500;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
                ch=cb4.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=4000;
                    break;
                    case 2: cost+=6000;
                    break;
                    case 3:cost+=7475;
                    break;
                    case 4:cost+=6705;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ch=cb5.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=11500;
                    break;
                    case 2: cost+=12500;
                    break;
                    case 3:cost+=13500;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ch=cb6.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=3300;
                    break;
                    case 2: cost+=3800;
                    break;
                    case 3:cost+=4750;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ch=cb7.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=12000;
                    break;
                    case 2: cost+=16800;
                    break;
                    case 3:cost+=22500;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        p.add(l3,new Integer(1));
        p.add(b,new Integer(2));
        p.add(cb1,new Integer(2));
        p.add(cb2,new Integer(2));
        p.add(cb3,new Integer(2));
        p.add(cb4,new Integer(2));
        p.add(cb5,new Integer(2));
        p.add(cb6,new Integer(2));
        p.add(cb7,new Integer(2));
        p.add(b1,new Integer(2));
        p.add(b2,new Integer(2));
       // p.add(l,new Integer(2));
        
       
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
        setLayout(null);
        setSize(800,600);
    }
    
        public void actionPerformed(ActionEvent e)
        {
            
            if(e.getSource()==b)
            {
                JOptionPane.showMessageDialog(this,"You're pc build cost is "+total+" total"); 
               

            }
            else if(e.getSource()==b1)
            {
                new secondPage();
            }
            else if(e.getSource()==b2)
            {
                this.dispose();
            }
        
    }
    
}
class officeWork extends JFrame implements ActionListener
{
    JButton b,b1,b2;
    int ch=0;
    int cost=0;
    int total;
    officeWork()
    {
       
        JLabel l=new JLabel("RAM");
        ImageIcon i=new ImageIcon("office1.jpg");
        JLabel l2=new JLabel(i);
        l2.setBounds(0,0,800,600);
        JLayeredPane p=getLayeredPane();
        l.setBounds(50,50,100,30);
        String ram[]={"RAM","1.4gb","2.6gb","3.8gb"};
        JComboBox cb1=new JComboBox<>(ram);
        cb1.setBounds(30,10,80,50);
        

        String rom[]={"ROM","1.512GB HDD","2.1TB SSD","3.1TB HDD + 256GB SSD"};
        JComboBox cb2=new JComboBox<>(rom);
        cb2.setBounds(30,70,150,50);
        
        String proc[]={"Processor","1.Core i3 9th gen"," 2.Core i5 7th gen"," 3.Core i5 9th gen","4.Core i5 11th gen"};
        JComboBox cb3=new JComboBox<>(proc);
        cb3.setBounds(30,130,150,50);
        
        String mot[]={"Motherboard","1.ASRock A320M-HDV R4.0","2.Asrock A520M-HDV","3.ASRock B450 Pro4 R2.0","4.ASRock B450M Pro4"};
        JComboBox cb4=new JComboBox<>(mot);
        cb4.setBounds(30,190,150,50);
       
        String acc[]={"Accessories Brand","1.Samsung","2.Acer","3.Redgaer"};
        JComboBox cb5=new JComboBox<>(acc);
        cb5.setBounds(30,250,150,50);

        String cool[]={"Cooling System","1.550W Bronze","2.450W Gold","3.550W Gold"};
        JComboBox cb6=new JComboBox<>(cool);
        cb6.setBounds(30,310,150,50);

        
        JLabel l1=new JLabel("No Need of Graphic card for Office work");
        l1.setBounds(300,70,250,50);
        
        cb1.setBounds(30,10,80,50);
        
        b= new JButton("Price");
        b.setBounds(430,350,150,30);

        b1= new JButton("Continue");
        b1.setBounds(430,400,150,30);

        b2= new JButton("Exit");
        b2.setBounds(430,450,150,30);

        cb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                ch=cb1.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=2500;
                            break;
                    case 2: cost+=4000;
                    break;
                    case 3:cost+=9000;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                ch=cb2.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=3500;
                    break;
                    case 2: cost+=5000;
                    break;
                    case 3:cost+=7000;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                ch=cb3.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=15000;
                    break;
                    case 2: cost+=18000;
                    break;
                    case 3:cost+=21000;
                    break;
                    case 4:cost+=22500;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
                ch=cb4.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=4000;
                    break;
                    case 2: cost+=6000;
                    break;
                    case 3:cost+=7475;
                    break;
                    case 4:cost+=6705;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ch=cb5.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=11500;
                    break;
                    case 2: cost+=12500;
                    break;
                    case 3:cost+=13500;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ch=cb6.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=3300;
                    break;
                    case 2: cost+=3800;
                    break;
                    case 3:cost+=4750;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        
        p.add(l2,new Integer(1));
        p.add(b,new Integer(2));
        p.add(cb1,new Integer(2));
        p.add(cb2,new Integer(2));
        p.add(cb3,new Integer(2));
        p.add(cb4,new Integer(2));
        p.add(cb5,new Integer(2));
        p.add(cb6,new Integer(2));
        p.add(b1,new Integer(2));
        p.add(b2,new Integer(2));
        p.add(l1,new Integer(2));
       // p.add(l,new Integer(2));
        
       
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
        setLayout(null);
        setSize(800,600);
    }
    
        public void actionPerformed(ActionEvent e)
        {
            
            if(e.getSource()==b)
            {
                JOptionPane.showMessageDialog(this,"You're pc build cost is "+total+" total"); 
                

            }
            else if(e.getSource()==b1)
            {
                new secondPage();
            }
            else if(e.getSource()==b2)
            {
                this.dispose();
            }
        
    }
    
}
class GamingType extends JFrame implements ActionListener
{
    JButton b,b1,b2;
    int ch=0;
    int cost=0;
    int total;
    GamingType()
    {
       
        JLabel l=new JLabel("RAM");
        l.setBounds(50,50,100,30);
        JLayeredPane p=getLayeredPane();
        ImageIcon i= new ImageIcon("gaming1.jpg");
        JLabel l1= new JLabel(i);
        l1.setBounds(0,0,800,600);
        String ram[]={"RAM","1.8gb","2.16gb","3.32gb"};
        JComboBox cb1=new JComboBox<>(ram);
        cb1.setBounds(30,10,80,50);
        
        

        String rom[]={"ROM","1.1TB SSD","2.1TB HDD + 256GB SSD","3.2TB SSD"};
        JComboBox cb2=new JComboBox<>(rom);
        cb2.setBounds(30,70,150,50);
        
        String proc[]={"Processor","1.Core i5 12th gen"," 2.Core i7 9th gen"," 3.Core i9 7th gen","4.Core i9 11th gen"};
        JComboBox cb3=new JComboBox<>(proc);
        cb3.setBounds(30,130,150,50);
        
        String mot[]={"Motherboard","1.ASRock A320M-HDV R4.0","2.Asrock A520M-HDV","3.ASRock B450 Pro4 R2.0","4.ASRock B450M Pro4"};
        JComboBox cb4=new JComboBox<>(mot);
        cb4.setBounds(30,190,150,50);
       
        String acc[]={"Accessories Brand","1.Samsung","2.Acer","3.Redgaer"};
        JComboBox cb5=new JComboBox<>(acc);
        cb5.setBounds(30,250,150,50);

        String cool[]={"Cooling System","1.550W Bronze","2.450W Gold","3.550W Gold"};
        JComboBox cb6=new JComboBox<>(cool);
        cb6.setBounds(30,310,150,50);

        String grap[]={"Graphc Card","1.Gigabyte rtx 1650 4gb vram","2.Nvidia rtx 3050 4gb vram","3.Nvidia rtx 3080 8gb vram","4.Nvidia rtx 3080ti 12gb vram"};
        JComboBox cb7=new JComboBox<>(grap);
        cb7.setBounds(30,370,150,50);
        
        b= new JButton("Price");
        b.setBounds(430,350,150,30);

        b1= new JButton("Continue");
        b1.setBounds(430,400,150,30);

        b2= new JButton("Exit");
        b2.setBounds(430,450,150,30);

        cb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                ch=cb1.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=4500;
                            break;
                    case 2: cost+=9500;
                    break;
                    case 3:cost+=17500;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                ch=cb2.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=8000;
                    break;
                    case 2: cost+=12000;
                    break;
                    case 3:cost+=23000;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                ch=cb3.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=30000;
                    break;
                    case 2: cost+=33000;
                    break;
                    case 3:cost+=38000;
                    break;
                    case 4:cost+=43500;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
                ch=cb4.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=4000;
                    break;
                    case 2: cost+=6000;
                    break;
                    case 3:cost+=7475;
                    break;
                    case 4:cost+=6705;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ch=cb5.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=15500;
                    break;
                    case 2: cost+=2100;
                    break;
                    case 3:cost+=28000;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ch=cb6.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=4750;
                    break;
                    case 2: cost+=6400;
                    break;
                    case 3:cost+=7600;
                    break;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        cb7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ch=cb7.getSelectedIndex();
                switch(ch)
                {
                    case 1: cost+=16800;
                    break;
                    case 2: cost+=22500;
                    break;
                    case 3:cost+=48000;
                    break;
                    case 4: cost+=78000;
                    default : cost+=0;
                    break;
                }
                ch=0;
                total+=cost;
                cost=0;
            }
        });
        
        p.add(l1,new Integer(1));
        p.add(b,new Integer(2));
        p.add(cb1,new Integer(2));
        p.add(cb2,new Integer(2));
        p.add(cb3,new Integer(2));
        p.add(cb4,new Integer(2));
        p.add(cb5,new Integer(2));
        p.add(cb6,new Integer(2));
        p.add(cb7,new Integer(2));
        p.add(b1,new Integer(2));
        p.add(b2,new Integer(2));
        
        //p.add(l,new Integer(2));
        
       
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
        setLayout(null);
        setSize(800,600);
    }
    
        public void actionPerformed(ActionEvent e)
        {
            
            if(e.getSource()==b)
            {
                JOptionPane.showMessageDialog(this,"You're pc build cost is "+total+" total"); 
               

            }
            else if(e.getSource()==b1)
            {
                new secondPage();
            }
            else if(e.getSource()==b2)
            {
                this.dispose();
            }
        
    }
    
}



