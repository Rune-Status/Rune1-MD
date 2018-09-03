package R1_MD;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.eclipse.jdt.internal.jarinjarloader.JarRsrcLoader;

import com.R1.Client;
import com.R1.Main;

public class start extends com.R1.Main{
	private static final JButton ActionEvent = null;

	public static void main(String[] args) {
		//STARTS RUNE1 CLIENT
		Client client;
		Main start;
		JarRsrcLoader JarRsrcLoader = new org.eclipse.jdt.internal.jarinjarloader.JarRsrcLoader();
		start = new com.R1.Main();
		client = new com.R1.Client();
		start();
		client();
		JarRsrcLoader();
		
		JFrame frame = new JFrame("Rune1 Utilities");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("");
		JButton button2 = new JButton();

		if (button2 == ActionEvent) {
			JFrame frame2 = new JFrame("Rune1 Utilities");
			JPanel panel2 = new JPanel();
			frame.setSize(300, 300);
			frame2.setVisible(true);
	        frame.dispose();
		}
		
		button2.setText("Calculator");
		panel.add(label);
		panel.add(button2);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		

	}

	private static void JarRsrcLoader() {
		
	}

	private static void client() {
		
	}

	private static void start() {
		
	}
	
}
