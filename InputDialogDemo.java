import javax.swing.JOptionPane;

public class InputDialogDemo {
    public static void main(String[] args) {
        //Display GUI with message
        String string = JOptionPane.showInputDialog(null,"Enter input","Input dialog demo",JOptionPane.QUESTION_MESSAGE);
        
        //Display string in console
        //System.out.print(string);
        
        //Declare output as a String and assign the message 
        String output = "The input is "+string;
        
        //Display the output in GUI
        JOptionPane.showMessageDialog(null,output);
    }
}
