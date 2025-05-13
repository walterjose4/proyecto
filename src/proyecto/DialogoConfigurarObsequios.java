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

public class DialogoConfigurarObsequios extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtObsq1;
	private JTextField txtObsq2;
	private JTextField txtObsq3;
	private JLabel lblObsq3;
	private JLabel lblObsq2;
	private JLabel lblObsq1;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarObsequios dialog = new DialogoConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarObsequios() {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 480, 180);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblObsq1 = new JLabel("1 unidad");
		lblObsq1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblObsq1.setBounds(20, 30, 128, 20);
		contentPanel.add(lblObsq1);

		lblObsq2 = new JLabel("2 a 5 unidades");
		lblObsq2.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblObsq2.setBounds(20, 60, 128, 20);
		contentPanel.add(lblObsq2);

		lblObsq3 = new JLabel("6 a mas unidades");
		lblObsq3.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblObsq3.setBounds(20, 90, 128, 20);
		contentPanel.add(lblObsq3);

		txtObsq1 = new JTextField();
		txtObsq1.setBounds(130, 30, 200, 20);
		txtObsq1.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		contentPanel.add(txtObsq1);
		txtObsq1.setColumns(10);

		txtObsq2 = new JTextField();
		txtObsq2.setBounds(130, 60, 200, 20);
		txtObsq2.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		contentPanel.add(txtObsq2);
		txtObsq2.setColumns(10);

		txtObsq3 = new JTextField();
		txtObsq3.setBounds(130, 90, 200, 20);
		txtObsq3.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		contentPanel.add(txtObsq3);
		txtObsq3.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setForeground(new Color(255, 255, 255));
		btnAceptar.setBackground(new Color(128, 0, 0));
		btnAceptar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		btnAceptar.setBorder(BorderFactory.createLineBorder(new Color(64, 64, 64), 3));
		btnAceptar.setBounds(360, 30, 89, 30);
		contentPanel.add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBackground(new Color(128, 0, 0));
		btnCancelar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(64, 64, 64), 3));
		btnCancelar.setBounds(360, 70, 89, 30);
		contentPanel.add(btnCancelar);
		
		txtObsq1.setText(DatosObsequios.obsequio1);
		txtObsq2.setText(DatosObsequios.obsequio2);
		txtObsq3.setText(DatosObsequios.obsequio3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedbtnVender(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedbtnCancelar(e);
		}
	}

	private void actionPerformedbtnVender(ActionEvent e) {
		try {
		DatosObsequios.obsequio1 = txtObsq1.getText();
		DatosObsequios.obsequio2 = txtObsq2.getText();
		DatosObsequios.obsequio3 = txtObsq3.getText();
		JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
	} catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(null, "Error de formato", "Error", JOptionPane.ERROR_MESSAGE);
	}
	}

	private void actionPerformedbtnCancelar(ActionEvent e) {
		dispose();
	}
}
