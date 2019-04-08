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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		textField = new JTextField();
		textField.setBounds(111, 61, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 61, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Soma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(57, 108, 116, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtra\u00E7\u00E3o");
		btnNewButton_1.setBounds(254, 108, 110, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnDiviso = new JButton("Divis\u00E3o");
		btnDiviso.setBounds(254, 149, 110, 23);
		contentPane.add(btnDiviso);
		
		JButton btnMultiplicao = new JButton("Multiplica\u00E7\u00E3o");
		btnMultiplicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiplicao.setBounds(57, 149, 116, 23);
		contentPane.add(btnMultiplicao);
		
		textField_2 = new JTextField();
		textField_2.setBounds(207, 211, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(111, 214, 62, 14);
		contentPane.add(lblResultado);
	}
}
