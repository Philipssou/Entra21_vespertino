package exercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Soma");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero que deseja somar"));
				int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
				
				JOptionPane.showMessageDialog(null, "A somar é: "+(numero1+numero2));
				
			}
		});
		btnNewButton.setBounds(10, 11, 130, 50);
		contentPane.add(btnNewButton);
		
		JButton btnSubtrao = new JButton("Subtra\u00E7\u00E3o");
		btnSubtrao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero que deseja subtrair"));
				int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
			
				JOptionPane.showMessageDialog(null, "A subtração é: "+(numero1-numero2));
				
			}
		});
		btnSubtrao.setBounds(10, 72, 130, 50);
		contentPane.add(btnSubtrao);
		
		JButton btnMultiplicao = new JButton("Multiplica\u00E7\u00E3o");
		btnMultiplicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero que deseja multiplicar"));
				int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
			
				JOptionPane.showMessageDialog(null, "A multiplicação é: "+(numero1*numero2));
			}
		});
		btnMultiplicao.setBounds(10, 133, 130, 50);
		contentPane.add(btnMultiplicao);
		
		JButton btnDiviso = new JButton("Divis\u00E3o");
		btnDiviso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero que deseja dividir"));
				int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
				
				JOptionPane.showMessageDialog(null, "A divisão é: "+(numero1/numero2));
			}
		});
		btnDiviso.setBounds(10, 194, 130, 50);
		contentPane.add(btnDiviso);
		
		JButton btnSeno = new JButton("Seno");
		btnSeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o angulo para saber o seno"));
				
				JOptionPane.showMessageDialog(null, "O seno de "+numero1+" é: "+Math.sin(numero1)+"º");
			}
		});
		btnSeno.setBounds(10, 255, 130, 50);
		contentPane.add(btnSeno);
		
		JButton btnCoseno = new JButton("Coseno");
		btnCoseno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o angulo para saber o coseno"));
				
				JOptionPane.showMessageDialog(null, "O coseno de "+numero1+" é: "+Math.cos(numero1)+"º");
			}
		});
		btnCoseno.setBounds(10, 316, 130, 50);
		contentPane.add(btnCoseno);
		
		JButton btnTangente = new JButton("Tangente");
		btnTangente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o angulo para saber a tangente"));
				
				JOptionPane.showMessageDialog(null, "A tangente de "+numero1+" é: "+Math.tan(numero1)+"º");	
			}
		});
		btnTangente.setBounds(10, 377, 130, 50);
		contentPane.add(btnTangente);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
int 			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Log"));
				
				JOptionPane.showMessageDialog(null, "O log de "+numero1+" é: "+Math.log(numero1)+"º");
			}
		});
		btnLog.setBounds(10, 438, 130, 50);
		contentPane.add(btnLog);
		
		JButton btnRaizQuadrada = new JButton("Raiz Quadrada");
		btnRaizQuadrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
int 			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero para saber sua raiz qudrada"));
				
				JOptionPane.showMessageDialog(null, "A raiz quadrada de "+numero1+" é: "+Math.sqrt(numero1));
			}
		});
		btnRaizQuadrada.setBounds(10, 504, 130, 46);
		contentPane.add(btnRaizQuadrada);
		
		JButton btnRaizCubica = new JButton("Raiz Cubica");
		btnRaizCubica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero para saber sua raiz cubica"));
				
				JOptionPane.showMessageDialog(null, "A raiz cubica de é "+numero1+" é: "+Math.cbrt(numero1)+"º");
			}
		});
		btnRaizCubica.setBounds(150, 11, 130, 50);
		contentPane.add(btnRaizCubica);
	}
}
