import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
  String name = JOptionPane.showInputDialog("Enter your name:");
  JOptionPane.showMessageDialog(null , "Hello "+name);
    
  
  int age =Integer.parseInt(JOptionPane.showInputDialog("How old are you:")); 
  JOptionPane.showMessageDialog(null , "Do you have "+age+" years");
  
  
  String country = JOptionPane.showInputDialog("Where are you from?");
  JOptionPane.showMessageDialog(null , "You lives in "+country);
  
  
  double height = Double.parseDouble(JOptionPane.showInputDialog("How tall you are?"));
  JOptionPane.showMessageDialog(null, "You height is "+height);
  
  
	}

}
