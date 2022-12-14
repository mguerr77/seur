package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Modelo.Envio;

public class CalculadoraEnvios {

	private JFrame frmCalculadoraDeEnvios;
	private JTextField cOrigen;
	private JTextField cDestino;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private Envio envio;
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
		
		cOrigen = new JTextField();
		cOrigen.setBounds(142, 35, 215, 20);
		frmCalculadoraDeEnvios.getContentPane().add(cOrigen);
		cOrigen.setColumns(10);
		
		cDestino = new JTextField();
		cDestino.setColumns(10);
		cDestino.setBounds(142, 106, 215, 20);
		frmCalculadoraDeEnvios.getContentPane().add(cDestino);
		
		JLabel lblNewLabel = new JLabel("Ciudad de origen");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 38, 107, 17);
		frmCalculadoraDeEnvios.getContentPane().add(lblNewLabel);
		
		JLabel lblCiudadDeDestino = new JLabel("Ciudad de destino");
		lblCiudadDeDestino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCiudadDeDestino.setBounds(21, 107, 113, 17);
		frmCalculadoraDeEnvios.getContentPane().add(lblCiudadDeDestino);
		
		JRadioButton oNacional = new JRadioButton("Nacional");
		oNacional.setSelected(true);
		buttonGroup.add(oNacional);
		oNacional.setBounds(143, 62, 111, 23);
		frmCalculadoraDeEnvios.getContentPane().add(oNacional);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Extranjero");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(253, 62, 111, 23);
		frmCalculadoraDeEnvios.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton dNacional = new JRadioButton("Nacional");
		buttonGroup_1.add(dNacional);
		dNacional.setSelected(true);
		dNacional.setBounds(142, 143, 111, 23);
		frmCalculadoraDeEnvios.getContentPane().add(dNacional);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Extranjero");
		buttonGroup_1.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(252, 143, 111, 23);
		frmCalculadoraDeEnvios.getContentPane().add(rdbtnNewRadioButton_1_1);
		
		JComboBox<String> tEnvio = new JComboBox<String>();
		tEnvio.setModel(new DefaultComboBoxModel<String>(new String[] {"Paq 10 - Antes de las 10 h ", "Paq 24 - Al día siguiente"}));
		tEnvio.setBounds(142, 185, 215, 22);
		frmCalculadoraDeEnvios.getContentPane().add(tEnvio);
		
		JLabel lblTipoDeEnvo = new JLabel("Tipo de envío");
		lblTipoDeEnvo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeEnvo.setBounds(23, 189, 113, 17);
		frmCalculadoraDeEnvios.getContentPane().add(lblTipoDeEnvo);
		
		JSpinner pesoSpinner = new JSpinner();
		pesoSpinner.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		pesoSpinner.setBounds(142, 229, 30, 20);
		frmCalculadoraDeEnvios.getContentPane().add(pesoSpinner);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeso.setBounds(23, 232, 113, 17);
		frmCalculadoraDeEnvios.getContentPane().add(lblPeso);
		
		JButton btnCalcularPrecio = new JButton(" Calcular Precio");
		btnCalcularPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cOrigen.getText().isEmpty() || cDestino.getText().isEmpty()) 
					JOptionPane.showMessageDialog(null, "Origen y/o destino vacíos", "Calcula Envío", JOptionPane.WARNING_MESSAGE);
				else
				{
					envio = new Envio(cOrigen.getText(),oNacional.isSelected(),cDestino.getText(),dNacional.isSelected(), tEnvio.getSelectedItem().toString(),(int) pesoSpinner.getValue());
					System.out.println(envio);
					JOptionPane.showMessageDialog(null, "Origen y/o destino vacíos", "Calcula Envío", JOptionPane.WARNING_MESSAGE);
				}
					
				
			
			
			}
		});
		btnCalcularPrecio.setBounds(270, 252, 131, 23);
		frmCalculadoraDeEnvios.getContentPane().add(btnCalcularPrecio);
	}
}
