package assignment_2;

import javax.swing.JDialog;

/**
 *
 * @author Taylor Johnson
 * date - 10/17/17
 */
public class Main {
    
    private static MovieForm myFrame;

    public static void main(String[] args) {
        instantiateGUI();
    }
    
    //instantiates the GUI
    private static void instantiateGUI() {
        myFrame = new MovieForm(null, false);
        myFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        myFrame.pack();
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
    }
}
