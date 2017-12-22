package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


public class HackGame implements ActionListener {
	int bit1 = 25;
	int bit2 = 25;
	int iPass;
	String sPass;
	boolean p1turn = true;
	boolean setPas = true;
	JFrame frame = new JFrame("HackGame Status: " + setCheck());
	JPanel panel = new JPanel();
	JButton turnfin1 = new JButton("PLayer 1 Finish Turn");
	JButton turnfin2 = new JButton("PLayer 2 Finish Turn");
	JPasswordField pass = new JPasswordField(8);
	JLabel play1 = new JLabel("Player 1 Has: " + bit1 + " bits");
	JLabel play2 = new JLabel("Player 2 Has: " + bit2 + " bits");
void run(){
	addComp();
	addList();
	
	frame.setVisible(true);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
void addComp(){
	frame.add(panel);
	panel.add(play1);
	panel.add(turnfin1);
	panel.add(pass);
	panel.add(turnfin2);
	panel.add(play2);
	System.out.println("Added Components");
}
void addList(){
	turnfin1.addActionListener(this);
	turnfin2.addActionListener(this);
}
public static void main(String[] args) {
	HackGame hg = new HackGame();
	hg.run();
}
void stop(int i){
	System.out.println("stoping: " + i);
	try {
		Thread.sleep(i);
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	}
	System.out.println("stoped: " + i);
}
String setCheck(){
	String setent = "ERROR";
	if(setPas == true){
		setent = "Setting";
	}else if(setPas == false){
		setent = "Entering";
	}
	return(setent);
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton BP = (JButton)e.getSource();
	if(BP == turnfin1 && p1turn == true && setPas == false){
		
	}else if (BP == turnfin1 && p1turn == false){
			stop(1000);
	}else if(BP == turnfin1 && p1turn == false && setPas == false){

	}else if(BP == turnfin1 && p1turn == true){
		stop(1000);
	}else if(BP == turnfin1 && setPas == true){
	//sPass = 
	System.out.println(sPass);
	}else if(BP == turnfin2 && setPas == true){
		
	}
	System.out.println("ButtonPressed");
}
}
