package guessTheNumber;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1280,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 157, 26));
		panel.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(394, 149, 512, 75);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblGuessTheNumber = new JLabel("Guess the number [ 1 - 10 ]");
		lblGuessTheNumber.setBounds(0, 19, 512, 45);
		panel_1.add(lblGuessTheNumber);
		lblGuessTheNumber.setFont(new Font("Bauhaus 93", Font.BOLD, 40));
		lblGuessTheNumber.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(416, 235, 459, 304);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(94, 173, 171, 40);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Input here below :");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel.setBounds(94, 136, 282, 53);
		panel_2.add(lblNewLabel);
		
		    Random rand = new Random();    
		    int randomNum = rand.nextInt(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			  
			    
				String number = textField.getText();
				int num = Integer.parseInt(number);
				
				if(num > 10)
				{
					JOptionPane.showMessageDialog(null, "You exceed in the limit!");
				}
				else if(num<10 || num == 10)
				{
					if(num<randomNum)
					{
						JOptionPane.showMessageDialog(null, "Too low!");
					}
					else if(num>randomNum)
					{
						JOptionPane.showMessageDialog(null, "Too high!");
					}
					else if(num==randomNum)
					{
						JOptionPane.showMessageDialog(null, "Congrats! the correct number is " + num);
					}
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		btnNewButton.setBounds(275, 172, 100, 40);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(94, 40, 282, 69);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Number");
		lblNewLabel_2.setBounds(57, 21, 165, 37);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(172, 0, 50, 66);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\question-sign.png")
				.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setLabelFor(lblNewLabel);
		label.setFont(new Font("Calibri", Font.BOLD, 20));
		label.setIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\dreamy-lines-8k-go-1280x720.jpg"));
		label.setBounds(0, 0, 1264, 681);
		panel.add(label);
		
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}
}
