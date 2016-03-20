package Caculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowBulder extends JFrame {

	private JPanel contentPane;
	private JTextField txtfirstNumber;
	private JTextField txtsecondNumber;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public WindowBulder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtfirstNumber = new JTextField();
		contentPane.add(txtfirstNumber);
		txtfirstNumber.setColumns(10);
		
		JLabel lblAdd = new JLabel("+");
		contentPane.add(lblAdd);
		
		txtsecondNumber = new JTextField();
		contentPane.add(txtsecondNumber);
		txtsecondNumber.setColumns(10);
		
		JButton btnCaculate = new JButton("=");
		btnCaculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int firstNumber = Integer.parseInt(txtfirstNumber.getText());
				int secondNumber = Integer.parseInt(txtsecondNumber.getText());
				int result = firstNumber + secondNumber;
				txtResult.setText(String.valueOf(result));
			}
		});
		contentPane.add(btnCaculate);
		
		txtResult = new JTextField();
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		txtResult.setEditable(false);
	}

}
