package proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DialogoConfigurarDescuentos extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblDcto1;
	private JLabel lblDcto2;
	private JLabel lblDcto4;
	private JLabel lblDcto3;
	private JTextField txtDcto1;
	private JTextField txtDcto2;
	private JTextField txtDcto3;
	private JTextField txtDcto4;
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarDescuentos dialog = new DialogoConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarDescuentos() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 480, 220);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblDcto1 = new JLabel("1 a 5 unidades");
		lblDcto1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblDcto1.setBounds(20, 30, 128, 20);
		contentPanel.add(lblDcto1);
		
		lblDcto2 = new JLabel("6 a 10 unidades");
		lblDcto2.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblDcto2.setBounds(20, 60, 128, 20);
		contentPanel.add(lblDcto2);
		
		lblDcto3 = new JLabel("11 a 15 unidades");
		lblDcto3.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblDcto3.setBounds(20, 90, 128, 20);
		contentPanel.add(lblDcto3);
		
		lblDcto4 = new JLabel("mas de 15 unidades");
		lblDcto4.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblDcto4.setBounds(20, 120, 128, 20);
		contentPanel.add(lblDcto4);
		
		txtDcto1 = new JTextField();
		txtDcto1.setBounds(170, 30, 120, 20);
		txtDcto1.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		contentPanel.add(txtDcto1);
		txtDcto1.setColumns(10);
		
		txtDcto2 = new JTextField();
		txtDcto2.setBounds(170, 60, 120, 20);
		txtDcto2.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		contentPanel.add(txtDcto2);
		txtDcto2.setColumns(10);
		
		txtDcto3 = new JTextField();
		txtDcto3.setBounds(170, 90, 120, 20);
		txtDcto3.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		contentPanel.add(txtDcto3);
		txtDcto3.setColumns(10);
		
		txtDcto4 = new JTextField();
		txtDcto4.setBounds(170, 120, 120, 20);
		txtDcto4.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		contentPanel.add(txtDcto4);
		txtDcto4.setColumns(10);
		
		lblPorcentaje1 = new JLabel("%");
		lblPorcentaje1.setBounds(300, 30, 30, 20);
		contentPanel.add(lblPorcentaje1);
		
		lblPorcentaje2 = new JLabel("%");
		lblPorcentaje2.setBounds(300, 60, 30, 20);
		contentPanel.add(lblPorcentaje2);
		
		lblPorcentaje3 = new JLabel("%");
		lblPorcentaje3.setBounds(300, 90, 30, 20);
		contentPanel.add(lblPorcentaje3);
		
		lblPorcentaje4 = new JLabel("%");
		lblPorcentaje4.setBounds(300, 120, 30, 20);
		contentPanel.add(lblPorcentaje4);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(360, 40, 89, 30);
		btnAceptar.setForeground(new Color(255, 255, 255)); 
		btnAceptar.setBackground(new Color(128, 0, 0));
		btnAceptar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		btnAceptar.setBorder(BorderFactory.createLineBorder(new Color(64,64,64), 3));
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(360, 80, 89, 30);
		btnCancelar.setForeground(new Color(255, 255, 255)); 
		btnCancelar.setBackground(new Color(128, 0, 0));
		btnCancelar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(64,64,64), 3));
		contentPanel.add(btnCancelar);
		
		txtDcto1.setText(String.valueOf(DatosDescuentos.descuento0));
		txtDcto2.setText(String.valueOf(DatosDescuentos.descuento1));
		txtDcto3.setText(String.valueOf(DatosDescuentos.descuento2));
		txtDcto4.setText(String.valueOf(DatosDescuentos.descuento3));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAceptar) {
			actionPerformedbtnAceptar(e);
		}
		if(e.getSource()==btnCancelar) {
			actionPerformedbtnCancelar(e);
		}
	}

	private void actionPerformedbtnAceptar(ActionEvent e) {
		try {
    DatosDescuentos.descuento0 = Double.parseDouble(txtDcto1.getText());
    DatosDescuentos.descuento1 = Double.parseDouble(txtDcto2.getText());
    DatosDescuentos.descuento3 = Double.parseDouble(txtDcto3.getText());
    DatosDescuentos.descuento3 = Double.parseDouble(txtDcto4.getText());
	JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Error de formato", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void actionPerformedbtnCancelar(ActionEvent e) {
		dispose();
	}

}
