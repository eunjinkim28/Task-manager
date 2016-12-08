import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class mySchedule extends JFrame {
	JPanel scheduleMainPanel;

public mySchedule(){
	scheduleMainPanel = new JPanel();
	scheduleMainPanel.setLayout(new GridLayout(8, 10, 20, 20));
	
	JLabel scheduleListLabel = new JLabel("Schedule List");
	scheduleMainPanel.add(scheduleListLabel); 
	JTextArea scheduleText = new JTextArea("date          schedule   ",100,100);
	scheduleMainPanel.add(scheduleText);
	
    JButton createButton = new JButton("Create");  
    scheduleMainPanel.add(createButton); 
    JButton deleteButton = new JButton("Delete");
    scheduleMainPanel.add(deleteButton); 
    JButton menuButton = new JButton("Menu");
    scheduleMainPanel.add(menuButton); 
    add(scheduleMainPanel);


	

        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	
        	setSize(300,450);
        
            setTitle("Schedule");
            
            setVisible(true);
            
}

}

 public class Schedule{
	 public static void main(String[] args){
		 mySchedule schedule1 = new mySchedule();
		 
	 }
 }


