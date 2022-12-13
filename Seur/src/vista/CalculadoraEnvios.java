package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class CalculadoraEnvios {

	private JFrame frmCalculadoraDeEnvios;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraEnvios window = new CalculadoraEnvios();
					window.frmCalculadoraDeEnvios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraEnvios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDeEnvios = new JFrame();
		frmCalculadoraDeEnvios.setTitle("Calculadora de Envios");
		frmCalculadoraDeEnvios.setBounds(100, 100, 498, 339);
		frmCalculadoraDeEnvios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDeEnvios.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(142, 35, 215, 20);
		frmCalculadoraDeEnvios.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 106, 215, 20);
		frmCalculadoraDeEnvios.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Ciudad de origen");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 38, 107, 17);
		frmCalculadoraDeEnvios.getContentPane().add(lblNewLabel);
		
		JLabel lblCiudadDeDestino = new JLabel("Ciudad de destino");
		lblCiudadDeDestino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCiudadDeDestino.setBounds(21, 107, 113, 17);
		frmCalculadoraDeEnvios.getContentPane().add(lblCiudadDeDestino);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nacional");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(143, 62, 111, 23);
		frmCalculadoraDeEnvios.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Extranjero");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(253, 62, 111, 23);
		frmCalculadoraDeEnvios.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nacional");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setSelected(true);
		rdbtnNewRadioButton_2.setBounds(142, 143, 111, 23);
		frmCalculadoraDeEnvios.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Extranjero");
		buttonGroup_1.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(252, 143, 111, 23);
		frmCalculadoraDeEnvios.getContentPane().add(rdbtnNewRadioButton_1_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Paq 10 - Antes de las 10 h ", "Paq 24 - Al día siguiente"}));
		comboBox.setBounds(142, 185, 215, 22);
		frmCalculadoraDeEnvios.getContentPane().add(comboBox);
		
		JLabel lblTipoDeEnvo = new JLabel("Tipo de envío");
		lblTipoDeEnvo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeEnvo.setBounds(23, 189, 113, 17);
		frmCalculadoraDeEnvios.getContentPane().add(lblTipoDeEnvo);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		spinner.setBounds(142, 229, 30, 20);
		frmCalculadoraDeEnvios.getContentPane().add(spinner);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeso.setBounds(23, 232, 113, 17);
		frmCalculadoraDeEnvios.getContentPane().add(lblPeso);
		
		JButton btnNewButton = new JButton(" Calcular Precio");
		btnNewButton.setBounds(270, 252, 131, 23);
		frmCalculadoraDeEnvios.getContentPane().add(btnNewButton);
	}
}
