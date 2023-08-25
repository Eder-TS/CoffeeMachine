package CoffeeMachineV2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FazedorDeFrame {
	
	public static void janela() {
		JFrame meuFrame = new JFrame("Meu Frame");
		
		meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b1 = new JButton("Botão");
		b1.setMnemonic(KeyEvent.VK_D);
		Component emptyLabel = b1;
		meuFrame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		
		meuFrame.pack();
		
		meuFrame.setVisible(true);
	}

}
