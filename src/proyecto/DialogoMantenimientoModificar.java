package proyecto;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class DialogoMantenimientoModificar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contenPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblMemoriaRam;
	private JLabel lblAlmacenamiento;
	private JLabel lblProcesador;
	private JTextField txtPrecio;
	private JTextField txtMemoriaRam;
	private JTextField txtAlmacenamiento;
	private JTextField txtProcesador;
	private JButton btnCerrar;
	private JButton btnGuardar;
	private JComboBox<String> cboModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoMantenimientoModificar dialog = new DialogoMantenimientoModificar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoMantenimientoModificar() {
		setForeground(new Color(128, 0, 0));
		setTitle("Modificar Laptops");
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(new BorderLayout());
		contenPanel.setBackground(new Color(192, 192, 192));
		contenPanel.setForeground(new Color(255, 255, 255));
		getContentPane().add(contenPanel, BorderLayout.CENTER);
		contenPanel.setLayout(null);

		lblModelo = new JLabel("Modelo\r\n");
		lblModelo.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		lblModelo.setBounds(22, 45, 130, 14);
		contenPanel.add(lblModelo);

		lblPrecio = new JLabel("Precio\r\n");
		lblPrecio.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblPrecio.setBounds(22, 90, 130, 14);
		contenPanel.add(lblPrecio);

		lblMemoriaRam = new JLabel("Memoria RAM (GB)");
		lblMemoriaRam.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblMemoriaRam.setBounds(22, 130, 130, 14);
		contenPanel.add(lblMemoriaRam);

		lblAlmacenamiento = new JLabel("Almacenamiento (GB)");
		lblAlmacenamiento.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
		lblAlmacenamiento.setBounds(22, 170, 130, 14);
		contenPanel.add(lblAlmacenamiento);

		lblProcesador = new JLabel("Procesador\r\n");
		lblProcesador.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblProcesador.setBounds(22, 210, 130, 14);
		contenPanel.add(lblProcesador);

		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPrecio.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.gray, 1),
				BorderFactory.createEmptyBorder(0, 8, 0, 0)));
		txtPrecio.setColumns(10);
		txtPrecio.setEditable(true);
		txtPrecio.setFocusable(true);
		txtPrecio.setBounds(168, 85, 165, 22);
		contenPanel.add(txtPrecio);
		txtMemoriaRam = new JTextField();
		txtMemoriaRam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMemoriaRam.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.gray, 1),
				BorderFactory.createEmptyBorder(0, 8, 0, 0)));
		txtMemoriaRam.setColumns(10);
		txtMemoriaRam.setEditable(true);
		txtMemoriaRam.setFocusable(true);
		txtMemoriaRam.setBounds(168, 125, 165, 22);
		contenPanel.add(txtMemoriaRam);

		txtAlmacenamiento = new JTextField();
		txtAlmacenamiento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAlmacenamiento.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.gray, 1),
				BorderFactory.createEmptyBorder(0, 8, 0, 0)));
		txtAlmacenamiento.setColumns(10);
		txtAlmacenamiento.setEditable(true);
		txtAlmacenamiento.setFocusable(true);
		txtAlmacenamiento.setBounds(168, 165, 165, 22);
		contenPanel.add(txtAlmacenamiento);

		txtProcesador = new JTextField();
		txtProcesador.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		txtProcesador.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.gray, 1),
				BorderFactory.createEmptyBorder(0, 8, 0, 0)));
		txtProcesador.setColumns(10);
		txtProcesador.setEditable(true);
		txtProcesador.setFocusable(true);
		txtProcesador.setBounds(168, 205, 165, 22);
		contenPanel.add(txtProcesador);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBackground(new Color(128, 0, 0));
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 15));
		btnCerrar.setBorder(BorderFactory.createLineBorder(new Color(64, 64, 64), 3));
		btnCerrar.setBounds(373, 45, 89, 32);
		contenPanel.add(btnCerrar);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.addActionListener(this);
		btnGuardar.setBackground(new Color(128, 0, 0));
		btnGuardar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 15));
		btnGuardar.setBorder(BorderFactory.createLineBorder(new Color(64, 64, 64), 3));
		btnGuardar.setBounds(373, 100, 89, 32);
		contenPanel.add(btnGuardar);

		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] { DatosLaptops.modelo0, DatosLaptops.modelo1,
				DatosLaptops.modelo2, DatosLaptops.modelo3, DatosLaptops.modelo4, DatosLaptops.modelo5 }));
		cboModelo.setAutoscrolls(true);
		cboModelo.setForeground(Color.black);
		cboModelo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		cboModelo.setBorder(BorderFactory.createLineBorder(new Color(64, 64, 64), 1));
		cboModelo.setBounds(168, 45, 165, 22);
		cboModelo.setSelectedIndex(0);
		contenPanel.add(cboModelo);

		txtPrecio.setText(String.valueOf(DatosLaptops.precio0));
		txtMemoriaRam.setText(String.valueOf(DatosLaptops.ram0));
		txtAlmacenamiento.setText(String.valueOf(DatosLaptops.unidadSSD0));
		txtProcesador.setText(DatosLaptops.procesador0);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}

		if (e.getSource() == btnGuardar) {
			actionPerformedbtnGuardar(e);
		}

		if (e.getSource() == btnCerrar) {
			actionPerformedbtnCerrar(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e) {
		int index = cboModelo.getSelectedIndex();
		switch (index) {
		case 0:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio0));
			txtMemoriaRam.setText(String.valueOf(DatosLaptops.ram0));
			txtAlmacenamiento.setText(String.valueOf(DatosLaptops.unidadSSD0));
			txtProcesador.setText(DatosLaptops.procesador0);
			break;
		case 1:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio1));
			txtMemoriaRam.setText(String.valueOf(DatosLaptops.ram1));
			txtAlmacenamiento.setText(String.valueOf(DatosLaptops.unidadSSD1));
			txtProcesador.setText(String.valueOf(DatosLaptops.procesador1));
			break;
		case 2:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio2));
			txtMemoriaRam.setText(String.valueOf(DatosLaptops.ram2));
			txtAlmacenamiento.setText(String.valueOf(DatosLaptops.unidadSSD2));
			txtProcesador.setText(String.valueOf(DatosLaptops.procesador2));
			break;
		case 3:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio3));
			txtMemoriaRam.setText(String.valueOf(DatosLaptops.ram3));
			txtAlmacenamiento.setText(String.valueOf(DatosLaptops.unidadSSD3));
			txtProcesador.setText(String.valueOf(DatosLaptops.procesador3));
			break;
		case 4:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio4));
			txtMemoriaRam.setText(String.valueOf(DatosLaptops.ram4));
			txtAlmacenamiento.setText(String.valueOf(DatosLaptops.unidadSSD4));
			txtProcesador.setText(String.valueOf(DatosLaptops.procesador4));
			break;

		default:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio5));
			txtMemoriaRam.setText(String.valueOf(DatosLaptops.ram5));
			txtAlmacenamiento.setText(String.valueOf(DatosLaptops.unidadSSD5));
			txtProcesador.setText(String.valueOf(DatosLaptops.procesador5));
			break;
		}
	}

	protected void actionPerformedbtnGuardar(ActionEvent e) {

		try {
			double precio;
			int ram, almacenamiento;
			String procesador;

			precio = Double.parseDouble(txtPrecio.getText());
			ram = Integer.parseInt(txtMemoriaRam.getText());
			almacenamiento = Integer.parseInt(txtAlmacenamiento.getText());
			procesador = txtProcesador.getText();

			int indice = cboModelo.getSelectedIndex();
			switch (indice) {
			case 0:
				DatosLaptops.precio0 = precio;
				DatosLaptops.ram0 = ram;
				DatosLaptops.unidadSSD0 = almacenamiento;
				DatosLaptops.procesador0 = procesador;
				break;
			case 1:
				DatosLaptops.precio1 = precio;
				DatosLaptops.ram1 = ram;
				DatosLaptops.unidadSSD1 = almacenamiento;
				DatosLaptops.procesador1 = procesador;
				break;
			case 2:
				DatosLaptops.precio2 = precio;
				DatosLaptops.ram2 = ram;
				DatosLaptops.unidadSSD2 = almacenamiento;
				DatosLaptops.procesador2 = procesador;
				break;
			case 3:
				DatosLaptops.precio3 = precio;
				DatosLaptops.ram3 = ram;
				DatosLaptops.unidadSSD3 = almacenamiento;
				DatosLaptops.procesador3 = procesador;
				break;
			case 4:
				DatosLaptops.precio4 = precio;
				DatosLaptops.ram4 = ram;
				DatosLaptops.unidadSSD4 = almacenamiento;
				DatosLaptops.procesador4 = procesador;
				break;
			case 5:
				DatosLaptops.precio5 = precio;
				DatosLaptops.ram5 = ram;
				DatosLaptops.unidadSSD5 = almacenamiento;
				DatosLaptops.procesador5 = procesador;
				break;
			}

			JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Error de formato", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void actionPerformedbtnCerrar(ActionEvent e) {
		dispose();
	}

}
