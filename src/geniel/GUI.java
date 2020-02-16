/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geniel;
import java.awt.*;
import static java.awt.Color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author legok
 */
public class GUI {
    JFrame phone = new JFrame();
    JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel temp = new JPanel();
    JPanel home = new JPanel(new BorderLayout());
    JScrollPane scroll = new JScrollPane();
    JLabel two = new JLabel();
    JButton message = new JButton();
    JButton geenie = new JButton();
    JButton homb = new JButton();
    //messages app
    JButton momi = new JButton();
    JButton broi = new JButton();
    JButton jacki = new JButton();
    JButton keithi = new JButton();
    JButton joei = new JButton();
    //chat options
    JPanel chatLog = new JPanel();
    JPanel send = new JPanel(new FlowLayout(FlowLayout.CENTER));
    String s1[] = {"<html><b style = \"color: white\">Did you eat the brownies in my sock drawer??<b><html>", "<html><b style = \"color: white\">I don't know what happened?<b><html>"};
    String s2[] = {"<html><b style = \"color: white\">You're kidding?!<b><html>", "<html><b style = \"color: white\">Was it the genie?...<b><html>"};
    int counter = 0;
    JButton opt1 = new JButton();
    JButton opt2 = new JButton();
    
    //genie app
    JButton wish1 = new JButton();
    JButton wish2 = new JButton();
    JButton wish3 = new JButton();

    JLabel battery = new JLabel();
    JLabel signal = new JLabel();
    
    int numMessage = 0;
    
    Clicklistener click = new Clicklistener();

    GUI(){
        homeScreen();
        top.add(signal);// Adding panels and buttons
        top.add(battery);
        bottom.add(homb);
        home.add(top, BorderLayout.NORTH);
        home.add(bottom, BorderLayout.SOUTH);
    }
    
    public void genieScreen(){
        GradientPanelGenie genie = new GradientPanelGenie();
        JPanel genie2 = new JPanel(new GridLayout(2, 1));
        JPanel genie3 = new JPanel(new FlowLayout());
        JLabel djinn = new JLabel();
        wish1 = new JButton("Wealth");
        wish2 = new JButton("Love");
        wish3 = new JButton("Peace");
        
        ImageIcon dj = new ImageIcon("Djinn.png");
        Image dimg = dj.getImage();
        setPanelu(genie);

        genie.setLayout(new BorderLayout());
        Image newdimg = dimg.getScaledInstance(550, 550, java.awt.Image.SCALE_SMOOTH);
        dj = new ImageIcon(newdimg);
        djinn.setIcon(dj);
        genie2.setBackground(new Color(106, 0, 128));
        genie3.setOpaque(false);
        
        wish1.setToolTipText("You wish for great riches?");
        wish2.setToolTipText("You wish for true love?");
        wish3.setToolTipText("You wish for world peace?");
        
        wish1.setPreferredSize(new Dimension(120, 35));
        wish2.setPreferredSize(new Dimension(120, 35));
        wish3.setPreferredSize(new Dimension(120, 35));
        
        wish1.addActionListener(click);
        wish2.addActionListener(click);
        wish3.addActionListener(click);
        
        phone.add(home);
        home.add(top, BorderLayout.NORTH);
        home.add(bottom, BorderLayout.SOUTH);
        home.add(genie, BorderLayout.CENTER);
        genie.add(genie2, BorderLayout.SOUTH);
        genie.add(djinn, BorderLayout.CENTER);
        genie2.add(genie3);
        genie3.add(wish1);
        genie3.add(wish2);
        genie3.add(wish3);
        
        phone.setPreferredSize(new Dimension(600, 800));
        phone.setResizable(false);
        phone.pack();
        phone.setVisible(true);
        phone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void homeScreen() {
        
        GradientPanel center = new GradientPanel();
        JPanel center1 = new JPanel(new FlowLayout (FlowLayout.LEFT));
        ImageIcon icon = new ImageIcon("messages.png");
        ImageIcon genie = new ImageIcon("gen.png");
        ImageIcon bat = new ImageIcon("battery.png");
        ImageIcon sig = new ImageIcon("signal.png");
        ImageIcon hob = new ImageIcon("homeb.png");
        ImageIcon iconp = new ImageIcon("messages pressed.png");
        ImageIcon geniep = new ImageIcon("gen pressed.png");
        ImageIcon homebp = new ImageIcon("homeb pressed.png");
        
        Image bimg = bat.getImage();
        Image img = icon.getImage();
        Image gimg = genie.getImage();
        Image simg = sig.getImage();
        Image himg = hob.getImage();
        Image ip = iconp.getImage();
        Image gp = geniep.getImage();
        Image hbp = homebp.getImage();
        
        Image newimg = img.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        Image newgimg = gimg.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        Image newbimg = bimg.getScaledInstance(50, 20, java.awt.Image.SCALE_SMOOTH);
        Image newsimg = simg.getScaledInstance(30, 20, java.awt.Image.SCALE_SMOOTH);
        Image newhimg = himg.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        Image newip = ip.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        Image newgp = gp.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        Image newhbp = hbp.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
 
        icon = new ImageIcon(newimg);
        genie = new ImageIcon(newgimg);
        bat = new ImageIcon(newbimg);
        sig = new ImageIcon(newsimg);
        hob = new ImageIcon(newhimg);
        iconp = new ImageIcon(newip);
        geniep = new ImageIcon(newgp);
        homebp = new ImageIcon(newhbp);

        setPanelu(center);
        center.setLayout(new GridLayout(4,1,1,1));
        phone.setPreferredSize(new Dimension(600, 800));
        phone.setResizable(false);
        geenie.setPreferredSize(new Dimension(120,120));
        message.setPreferredSize(new Dimension(120,120));
        homb.setPreferredSize(new Dimension(50, 50));
        message.setIcon(icon);
        geenie.setIcon(genie);
        homb.setIcon(hob);
        
        message.setPressedIcon(iconp);
        geenie.setPressedIcon(geniep);
        homb.setPressedIcon(homebp);
        
        battery.setIcon(bat);
        signal.setIcon(sig);
        
        message.setOpaque(false);//setting button designs
        message.setFocusPainted(false);
        message.setBorderPainted(false);
        message.setContentAreaFilled(false);
        message.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        geenie.setOpaque(false);
        geenie.setFocusPainted(false);
        geenie.setBorderPainted(false);
        geenie.setContentAreaFilled(false);
        geenie.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        homb.setOpaque(false);//setting button designs
        homb.setFocusPainted(false);
        homb.setBorderPainted(false);
        homb.setContentAreaFilled(false);
        homb.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        
        // Setting Backgrounds
        phone.setBackground(BLACK);
        home.setBackground(BLACK);
        top.setBackground(BLACK);
        bottom.setBackground(DARK_GRAY);
        center.setOpaque(true);
        center1.setOpaque(false);
        bottom.setOpaque(true);
        
        geenie.addActionListener(click);// Adding of Action Listener
        message.addActionListener(click);
        homb.addActionListener(click);
        
        
        home.add(center, BorderLayout.CENTER);
        center.add(center1);
        center1.add(message);
        center1.add(geenie);
        phone.add(home);
        phone.pack();
        phone.setVisible(true);
        phone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void messageScreen(){
        JPanel background = new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel leftSide = new JPanel(new GridLayout(5, 1, 20, 20));
        JPanel mom = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel mom1 = new JPanel();
        JPanel bro = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel bro1 = new JPanel();
        JPanel jack = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel jack1 = new JPanel();
        JPanel keith = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel keith1 = new JPanel();
        JPanel joe = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel joe1 = new JPanel();
        Border mBorder = BorderFactory.createLineBorder(new Color(31, 87, 130), 5);
        Border rBorder = BorderFactory.createLineBorder(new Color(31, 87, 130), 5, true);
        
        mom.setBorder(mBorder);
        bro.setBorder(mBorder);
        jack.setBorder(mBorder);
        keith.setBorder(mBorder);
        joe.setBorder(mBorder);
        
        mom1.setLayout(new BoxLayout(mom1, BoxLayout.Y_AXIS));
        bro1.setLayout(new BoxLayout(bro1, BoxLayout.Y_AXIS));
        jack1.setLayout(new BoxLayout(jack1, BoxLayout.Y_AXIS));
        keith1.setLayout(new BoxLayout(keith1, BoxLayout.Y_AXIS));
        joe1.setLayout(new BoxLayout(joe1, BoxLayout.Y_AXIS));

        momi.setPreferredSize(new Dimension(80, 80));
        momi.setBorder(rBorder);
        JLabel moml = new JLabel("<html><h1><b style = \"color: white\">Mom<b><h1><html>");
        JLabel momt = new JLabel("<html><b style = \"color: white\">Ok Goodnight honey<b><html>");

        broi.setPreferredSize(new Dimension(80, 80));
        broi.setBorder(rBorder);
        JLabel brol = new JLabel("<html><h1><b style = \"color: white\">Onii-chan<b><h1><html>");
        JLabel brot = new JLabel("<html><b style = \"color: white\">Hey bro had a nice time...<b><html>");

        jacki.setPreferredSize(new Dimension(80, 80));
        jacki.setBorder(rBorder);
        JLabel jackl = new JLabel("<html><h1><b style = \"color: white\">Jack<b><h1><html>");
        JLabel jackt = new JLabel("<html><b style = \"color: white\">Bro can you send me the HW?<b><html>");

        keithi.setPreferredSize(new Dimension(80, 80));
        keithi.setBorder(rBorder);
        JLabel keithl = new JLabel("<html><h1><b style = \"color: white\">Keith<b><h1><html>");
        JLabel keitht = new JLabel("<html><b style = \"color: white\">DiD yOu tAkE mY mAnGa?!<b><html>");

        joei.setPreferredSize(new Dimension(80, 80));
        joei.setBorder(rBorder);
        JLabel joel = new JLabel("<html><h1><b style = \"color: white\">Joe<b><h1><html>");
        JLabel joet = new JLabel("<html><b style = \"color: white\">Hey m80 I'm famous on net!!<b><html>");
        
        ImageIcon momp = new ImageIcon("mom.png");
        ImageIcon brop = new ImageIcon("pic_one.png");
        ImageIcon jackp = new ImageIcon("default.png");
        ImageIcon keithp = new ImageIcon("DConan.png");
        ImageIcon joep = new ImageIcon("default.png");

        Image momp2 = momp.getImage();
        Image brop2 = brop.getImage();
        Image jackp2 = jackp.getImage();
        Image keithp2 = keithp.getImage();
        Image joep2 = joep.getImage();

        Image newmomp2 = momp2.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
        Image newbrop2 = brop2.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
        Image newjackp2 = jackp2.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
        Image newkeithp2 = keithp2.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
        Image newjoep2 = joep2.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
        
        momp = new ImageIcon(newmomp2);
        brop = new ImageIcon(newbrop2);
        jackp = new ImageIcon(newjackp2);
        keithp = new ImageIcon(newkeithp2);
        joep = new ImageIcon(newjoep2);

        setPanelu(background);
        
        momi.addActionListener(click);
        broi.addActionListener(click);
        jacki.addActionListener(click);
        keithi.addActionListener(click);
        joei.addActionListener(click);
        
        background.setBackground(DARK_GRAY);
        leftSide.setBackground(DARK_GRAY);
        mom1.setBackground(new Color(37, 106, 158));
        mom.setBackground(new Color(37, 106, 158));
        bro1.setBackground(new Color(37, 106, 158));
        bro.setBackground(new Color(37, 106, 158));
        jack.setBackground(new Color(37, 106, 158));
        jack1.setBackground(new Color(37, 106, 158));
        keith.setBackground(new Color(37, 106, 158));
        keith1.setBackground(new Color(37, 106, 158));
        joe.setBackground(new Color(37, 106, 158));
        joe1.setBackground(new Color(37, 106, 158));
        
        joei.setIcon(joep);
        keithi.setIcon(keithp);
        jacki.setIcon(jackp);
        broi.setIcon(brop);
        momi.setIcon(momp);
        
        mom1.add(moml);
        mom1.add(momt);
        mom.add(momi);
        mom.add(mom1);
        
        bro1.add(brol);
        bro1.add(brot);
        bro.add(broi);
        bro.add(bro1);
        
        jack1.add(jackl);
        jack1.add(jackt);
        jack.add(jacki);
        jack.add(jack1);
        
        keith1.add(keithl);
        keith1.add(keitht);
        keith.add(keithi);
        keith.add(keith1);
        
        joe1.add(joel);
        joe1.add(joet);
        joe.add(joei);
        joe.add(joe1);
        
        leftSide.add(mom);
        leftSide.add(bro);
        leftSide.add(jack);
        leftSide.add(keith);
        leftSide.add(joe);
        background.add(leftSide);
        home.add(background, BorderLayout.CENTER);
        
        phone.add(home);
        phone.setPreferredSize(new Dimension(600, 800));
        phone.setResizable(false);
        phone.pack();
        phone.setVisible(true);
        phone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void chatScreenM(){
        chatLog = new JPanel();
        JPanel m1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel m2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel m3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel m4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //JPanel y2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        //JPanel y3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        //JPanel y4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel backy = new JPanel();
        
        Border rBorder = BorderFactory.createLineBorder(LIGHT_GRAY, 10, true);
        Border lBorder = BorderFactory.createLineBorder(BLACK, 5);
        
        JLabel tagM = new JLabel("<html><h1><b style = \"color: white\">Mom: <b><h1><html>");
        
        JLabel one = new JLabel("<html><b style = \"color: white\">HEY!!!! WHY ARE THE POLICE HERE??!!!<b><html>");
        
        
        backy.setLayout(new BorderLayout());
        chatLog.setLayout(new GridLayout(10, 1, 10, 10));
        
        scroll = new JScrollPane(chatLog);
        
        setPanelu(backy);
        chatLog.setBackground(LIGHT_GRAY);
        m1.setBackground(new Color(31, 87, 130));
        m1.setBorder(rBorder);

        opt1 = new JButton();
        opt2 = new JButton();
        
        opt1.setText(s1[counter]);
        opt2.setText(s2[counter]);
        
        m1.add(tagM);
        m1.add(one);
        chatLog.add(m1);
        
        setChat(two);

        opt1.setBackground(new Color(37, 186, 39));
        opt2.setBackground(new Color(37, 186, 39));
        
        opt1.setBorder(lBorder);
        opt2.setBorder(lBorder);
        
        opt1.addActionListener(click);
        opt2.addActionListener(click);
        
        send.add(opt1);
        send.add(opt2);
        
        
        backy.add(scroll, BorderLayout.CENTER);
        backy.add(send, BorderLayout.SOUTH);
        
        home.add(backy, BorderLayout.CENTER);
        
        phone.add(home);
        phone.setPreferredSize(new Dimension(600, 800));
        phone.setResizable(false);
        phone.pack();
        phone.setVisible(true);
        phone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void chatScreenB(){
        chatLog = new JPanel();
        chatLog.setLayout(new GridLayout(10, 1, 10, 10));
        
        JPanel backy = new JPanel(new GridLayout(1, 1));
        
        scroll = new JScrollPane(chatLog);
        
        setPanelu(backy);
        chatLog.setBackground(RED);
        
        backy.add(scroll);
        
        home.add(backy, BorderLayout.CENTER);
        
        phone.add(home);
        phone.setPreferredSize(new Dimension(600, 800));
        phone.setResizable(false);
        phone.pack();
        phone.setVisible(true);
        phone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void chatScreenJA(){
        chatLog = new JPanel();
        chatLog.setLayout(new GridLayout(10, 1, 10, 10));
        
        JPanel backy = new JPanel(new GridLayout(1, 1));

        scroll = new JScrollPane(chatLog);
        
        setPanelu(backy);
        chatLog.setBackground(LIGHT_GRAY);
        
        backy.add(scroll);
        
        home.add(backy, BorderLayout.CENTER);
        
        phone.add(home);
        phone.setPreferredSize(new Dimension(600, 800));
        phone.setResizable(false);
        phone.pack();
        phone.setVisible(true);
        phone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void chatScreenK(){
        chatLog = new JPanel();
        chatLog.setLayout(new GridLayout(10, 1, 10, 10));
        
        JPanel backy = new JPanel(new GridLayout(1, 1));

        scroll = new JScrollPane(chatLog);
        
        setPanelu(backy);
        chatLog.setBackground(PINK);
        
        backy.add(scroll);
        
        home.add(backy, BorderLayout.CENTER);
        
        phone.add(home);
        phone.setPreferredSize(new Dimension(600, 800));
        phone.setResizable(false);
        phone.pack();
        phone.setVisible(true);
        phone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void chatScreenJO(){
        chatLog = new JPanel();
        chatLog.setLayout(new GridLayout(10, 1, 10, 10));
        
        JPanel backy = new JPanel(new GridLayout(1, 1));

        scroll = new JScrollPane(chatLog);
        
        setPanelu(backy);
        chatLog.setBackground(LIGHT_GRAY);
        
        backy.add(scroll);
        
        home.add(backy, BorderLayout.CENTER);
        
        phone.add(home);
        phone.setPreferredSize(new Dimension(600, 800));
        phone.setResizable(false);
        phone.pack();
        phone.setVisible(true);
        phone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void openMessage(){
        home.remove(getPanelu());
        messageScreen();
    }
    
    public void setTextM(JLabel uno, JButton b){
        uno = new JLabel(b.getText());
        setChat(uno);
        
    }
    
    public void sendText(){
        JPanel j = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel t = new JLabel("<html><h1><b style = \"color: white\">You: <b><h1><html>");
        Border rBorder = BorderFactory.createLineBorder(LIGHT_GRAY, 10, true);
        
        j.setBackground(new Color(37, 186, 39));
        j.setBorder(rBorder);
        
        j.add(t);
        j.add(getChat());
        chatLog.add(j);
        chatLog.validate();
        chatLog.repaint();
        if (counter + 1 < s1.length){
            opt1.setText(s1[counter + 1]);
            opt2.setText(s2[counter + 1]);
            counter++;
        }
        else{
                send.remove(opt1);
                send.remove(opt2);
                send.validate();
                send.repaint();
            }
    }
    
    public void openGenie(){
        home.remove(getPanelu());
        genieScreen();   
    }
    
    public void openChatM(){
        home.remove(getPanelu());
        chatScreenM();
    }
    
    public void openChatB(){
        home.remove(getPanelu());
        chatScreenB();
    }
    
    public void openChatJA(){
        home.remove(getPanelu());
        chatScreenJA();
    }
    
    public void openChatK(){
        home.remove(getPanelu());
        chatScreenK();
    }
    
    public void openChatJO(){
        home.remove(getPanelu());
        chatScreenJO();
    }
    
    public void goHome(){
        home.remove(getPanelu());
        homeScreen();
    }

    public void setChat(JLabel c){
        two = c;
    }
    
    public JLabel getChat(){
        return two;
    }
    
    public void setPanelu(JPanel h){
        temp = h;
    }
    
    public JPanel getPanelu(){
        return temp;
    }
    
    private class Clicklistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == geenie ){
                openGenie();
            }
            
            if (e.getSource() == homb){
                goHome();
            }
            
            if (e.getSource() == message){
                openMessage();
            }
            if (e.getSource() == momi){
                openChatM();
            }
            if (e.getSource() == broi){
                openChatB();
            }
            if (e.getSource() == jacki){
                openChatJA();
            }
            if (e.getSource() == keithi){
                openChatK();
            }
            if (e.getSource() == joei){
                openChatJO();
            }
            if (e.getSource() == wish1){
                
            }
            if (e.getSource() == wish2){
                
            }
            if (e.getSource() == wish3){
                
            }
            if (counter < s1.length){
                if (e.getSource() == opt1){
                    setTextM(geniel.GUI.this.getChat(), opt1);
                    sendText();
                }
            }
            if (e.getSource() == opt2){
                
            }
        }
    }
    
    public class GradientPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g.create();
            int w = getWidth();
            int h = getHeight();
            GradientPaint gp = new GradientPaint(
                    0, 0, new Color(26, 56, 87),
                    0, 2*h/3, new Color(252,72,27));
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, w, h);
            g2d.dispose();
        }
    }
    
    public class GradientPanelGenie extends JPanel {

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g.create();
            int w = getWidth();
            int h = getHeight();
            GradientPaint gp = new GradientPaint(
                    0, 0, new Color(2, 6, 7),
                    0, 2*h/3, new Color(106,0,128));
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, w, h);
            g2d.dispose();
        }
    }
    
}
