package br.edu.ifcvideira.calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Letra extends JFrame {

	private JPanel contentPane;
	private JTextField tfnumero1;
	private JTextField tfnumero2;
	private JTextField tfresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Letra frame = new Letra();
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
	public Letra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCalculadora.setBounds(156, 11, 107, 28);
		contentPane.add(lblCalculadora);
		
		tfnumero1 = new JTextField();
		tfnumero1.setBounds(111, 61, 86, 20);
		contentPane.add(tfnumero1);
		tfnumero1.setColumns(10);
		
		tfnumero2 = new JTextField();
		tfnumero2.setBounds(222, 61, 86, 20);
		contentPane.add(tfnumero2);
		tfnumero2.setColumns(10);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Soma();
			}
		});
		btnSoma.setBounds(57, 108, 116, 23);
		contentPane.add(btnSoma);
		
		JButton btnSubtracao = new JButton("Subtra\u00E7\u00E3o");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sub();
			}
		});
		
		btnSubtracao.setBounds(254, 108, 110, 23);
		contentPane.add(btnSubtracao);
		
		JButton btnDivisao = new JButton("Divis\u00E3o");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDivisao.setBounds(254, 149, 110, 23);
		contentPane.add(btnDivisao);
		
		JButton btnMultiplicao = new JButton("Multiplica\u00E7\u00E3o");
		btnMultiplicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiplicao.setBounds(57, 149, 116, 23);
		contentPane.add(btnMultiplicao);
		
		tfresultado = new JTextField();
		tfresultado.setBounds(207, 211, 86, 20);
		contentPane.add(tfresultado);
		tfresultado.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(111, 214, 62, 14);
		contentPane.add(lblResultado);
	}
	private void Soma() {
		tfresultado.setText(Double.toString(Double.parseDouble(tfnumero1.getText()) + Double.parseDouble(tfnumero2.getText())));
	}
	private void Sub() {
		tfresultado.setText(Double.toString(Double.parseDouble(tfnumero1.getText()) - Double.parseDouble(tfnumero2.getText())));
	}
	
	
}
