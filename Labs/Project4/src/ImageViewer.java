import java.awt.*; 
import java.awt.event.*; 

import javax.swing.*; 

import java.io.File; 
public class ImageViewer extends JFrame  {
	
		private JPanel imagePanel; // A panel to hold an image label 
		private JPanel buttonPanel; // A panel to hold a button 
		private JLabel imageLabel; // A label to hold an image 
		private JButton button; // A button to get an image 
		private JFileChooser fileChooser; // For the open dialog box 
		private Container contentPane; // To reference the content pane 
/**
Constructor 
*/ 
public ImageViewer() { 
	
		// Set the title. 
		setTitle("Image Viewer");
		
		// Specify what happens when the close button is clicked. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		// Create a BorderLayout manager for the content pane. 
		setLayout(new BorderLayout());
		
		// Build the panels. 
		buildImagePanel(); 
		buildButtonPanel(); 
		
		// Add the panels to the content pane. 
		button.addActionListener(new ButtonListener()); 
		
		// Create a file chooser. 
		// Pack and display the window. 
		pack(); 
		setVisible(true); 
		}



/**
The buildImagePanel method adds an empty label to a panel. 
*/ 
private void buildImagePanel() {
	// Create a panel.
	JPanel panel1 = new JPanel();
	
// Create a label. 
	JLabel label1 = new JLabel("PEACE");
	
// Add the label to the panel. 
	panel1.add(label1);
}
/**
The buildButtonPanel method adds a button to a panel. 
*/ 
private void buildButtonPanel() { 
// Create a panel.
	JPanel panel2 = new JPanel();
	
// Create a button.
	JButton button1 = new JButton("Click me!");
	
// Register an action listener with the button.
	button1.addMouseListener(null);
// Add the button to the panel. 
	panel2.add(button1);
}
/**
Private inner class that handles the event when the user clicks the button. 
*/ 


private class ButtonListener implements ActionListener {
	
	
public void actionPerformed(ActionEvent e) {
	
	
// To reference the selected image file 
// To read the image from the file 
// To hold the name and path of the file 
// Indicates status of the open dialog box 
// Display an open dialog box. 
fileChooserStatus = fileChooser.showOpenDialog(ImageViewer.this); 
if (fileChooserStatus == JFileChooser.APPROVE_OPTION) 
{ 
// Get a reference to the selected file. 
// Get the path of the selected file. 
// Read the image from the file. 
// Store the image in the label. 
// If the label displays text, remove it. 
// Pack the frame again to accomodate the new size of the label. 
} 
} 
}










/**
The main method creates an instance of the ImageViewer 
class, causing it to display its window. 
*/ 
public static void main(String[] args) 
{
ImageViewer iv = new ImageViewer(); 
} 
}
