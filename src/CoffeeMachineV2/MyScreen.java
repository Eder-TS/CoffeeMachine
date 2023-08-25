package CoffeeMachineV2;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyScreen {

	public static void coffeeMachineGUI() {
		MyScreen.frameFeaurtes();
		
		
		
		//JButton makeACoffee = new JButton("Fazer café");
		
		
	}
	
	private static Component labelFeatures() {
		
		JLabel header = new JLabel();
		
		header.setText("Bem vindo! Escolha sua bebida preferida!");
		
		header.setOpaque(true);
		
		header.setHorizontalTextPosition(JLabel.LEADING);
		
		return header;
		
	}

	private static void frameFeaurtes() {
		JFrame myFrame = new JFrame("Máquina de café");
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setSize(400, 250);
		
		myFrame.setLocationRelativeTo(null);
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		myFrame.setVisible(true);
		
		myFrame.add(MyScreen.labelFeatures());
	}
}
