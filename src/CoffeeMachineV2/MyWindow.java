package CoffeeMachineV2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyWindow {

	private JFrame frmCoffeeMachine;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWindow window = new MyWindow();
					window.frmCoffeeMachine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCoffeeMachine = new JFrame();
		frmCoffeeMachine.setTitle("Máquina de Café");
		frmCoffeeMachine.setBounds(100, 100, 480, 350);
		frmCoffeeMachine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCoffeeMachine.getContentPane().setLayout(null);
		
		JLabel lblChooseDrink = new JLabel("Escolha sua bebida");
		lblChooseDrink.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblChooseDrink.setBounds(24, 11, 145, 25);
		frmCoffeeMachine.getContentPane().add(lblChooseDrink);
		
		JButton btnEspresso = new JButton("Espresso");
		btnEspresso.setToolTipText("Espresso");		
		btnEspresso.setBounds(24, 47, 145, 23);
		frmCoffeeMachine.getContentPane().add(btnEspresso);
		btnEspresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new Drink("Espresso");
            }
        });
		
		JButton btnEspressoWithMilk = new JButton("Espresso com leite");
		btnEspressoWithMilk.setToolTipText("Espresso com leite");
		btnEspressoWithMilk.setBounds(24, 81, 145, 23);
		frmCoffeeMachine.getContentPane().add(btnEspressoWithMilk);
		btnEspressoWithMilk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	new Drink("Espresso com leite");
            }
        });
		
		
		JButton btnCapuccino = new JButton("Capuccino");
		btnCapuccino.setToolTipText("Capuccino");
		btnCapuccino.setBounds(24, 115, 145, 23);
		frmCoffeeMachine.getContentPane().add(btnCapuccino);
		btnCapuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	new Drink("Capuccino");
            }
        });
		
		JLabel lblDrinkIntensity = new JLabel("Intensidade da bebida");
		lblDrinkIntensity.setFont(new Font("Rockwell", Font.PLAIN, 12));
		lblDrinkIntensity.setBounds(24, 159, 145, 14);
		frmCoffeeMachine.getContentPane().add(lblDrinkIntensity);
		
		JButton btnMore = new JButton("Mais");
		btnMore.setBounds(52, 191, 89, 23);
		frmCoffeeMachine.getContentPane().add(btnMore);
		btnMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	Drink.setMoreIntensity();
            }
        });
		
		JButton btnLess = new JButton("Menos");
		btnLess.setBounds(52, 264, 89, 23);
		frmCoffeeMachine.getContentPane().add(btnLess);
		btnLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	Drink.setLessIntensity();
            }
        });
		
		JTextArea textAreaActualIntensity = new JTextArea(String.valueOf(Drink.getIntensity()));
		textAreaActualIntensity.setMargin(new Insets(0, 7, 0, 0));
		textAreaActualIntensity.setFont(new Font("Dialog", Font.PLAIN, 18));
		textAreaActualIntensity.setLineWrap(true);
		textAreaActualIntensity.setBounds(83, 226, 26, 26);
		frmCoffeeMachine.getContentPane().add(textAreaActualIntensity);
		
		JPanel panelStatusImage = new JPanel();
		panelStatusImage.setBounds(243, 47, 178, 175);
		frmCoffeeMachine.getContentPane().add(panelStatusImage);
		
		JButton btnMakeADrink = new JButton("Preparar bebida");
		btnMakeADrink.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMakeADrink.setBounds(265, 245, 134, 23);
		frmCoffeeMachine.getContentPane().add(btnMakeADrink);
		btnMakeADrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dispenser.makeADrink();
            }
        });
	}

}
