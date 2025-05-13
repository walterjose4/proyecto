package proyecto;

import java.awt.BorderLayout;
//import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
//import javax.swing.JTextPane;
//import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DialogoVender extends JDialog implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private final JPanel contenPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JScrollPane spc;
	private JTextArea txtS;
	private JComboBox<String> cboModelo;
	private JButton btnVender;
	private JButton btnCerrar;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private static int contadorVentas = 0;
	private double totalImporteAcumulado = 0;
	private static final int LIMITE_VENTAS = 5;
	private static final double CUOTA_DIARIA = 5000.0; // Meta diaria

	public static void registrarVenta(double importe, int totalImporteAcumulado, int contadorVentass)
	{
		totalImporteAcumulado += importe;
		contadorVentas++;

		if (contadorVentas % LIMITE_VENTAS == 0) {
			mostrarVentanaAvance(contadorVentass);
		}
	}

	public static double obtenerTotalAcumulado(double totalImporteAcumulado)
	{
		return totalImporteAcumulado;
	}

	public static double obtenerPorcentajeCuota(double totalImporteAcumulado)
	{
		return (totalImporteAcumulado / CUOTA_DIARIA) * 100;
	}

	private static void mostrarVentanaAvance(int contadorVentas)
	{
		DialogoAvanceVentas avance = new DialogoAvanceVentas();
		double totalImporteAcumulado = 0;
		int obtenerPorcentajeCuota;

		avance.txtNumeroVenta.setText(String.valueOf(contadorVentas));
		avance.txtImporteTotal.setText(String.format("S/. %.2f", obtenerTotalAcumulado(totalImporteAcumulado)));

		avance.txtPorcCuotaDiaria.setText(String.format("%.2f %%", obtenerPorcentajeCuota(totalImporteAcumulado)));

		avance.setModal(true);
		avance.setVisible(true);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try {
			DialogoVender dialog = new DialogoVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoVender()
	{
		setTitle("Vender");
		setBounds(100, 100, 500, 350);
		getContentPane().setLayout(new BorderLayout());
		contenPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contenPanel, BorderLayout.CENTER);
		contenPanel.setLayout(null);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBackground(new Color(128, 0, 0));
		btnVender.setForeground(new Color(255, 255, 255));
		btnVender.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		btnVender.setBounds(360, 25, 89, 30);
		contenPanel.add(btnVender);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBackground(new Color(128, 0, 0));
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBounds(360, 66, 89, 30);
		contenPanel.add(btnCerrar);

		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(120, 55, 160, 20);
		txtPrecio.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		contenPanel.add(txtPrecio);

		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(120, 95, 160, 20);
		txtCantidad.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		contenPanel.add(txtCantidad);

		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblModelo.setBounds(32, 20, 96, 14);
		contenPanel.add(lblModelo);

		lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblPrecio.setBounds(32, 58, 96, 14);
		contenPanel.add(lblPrecio);

		lblCantidad = new JLabel("Cantidad\r\n");
		lblCantidad.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblCantidad.setBounds(32, 95, 89, 14);
		contenPanel.add(lblCantidad);

		spc = new JScrollPane();
		spc.setBounds(29, 130, 425, 168);
		contenPanel.add(spc);

		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setLineWrap(true);
		txtS.setBorder(BorderFactory.createLineBorder(new Color(64, 64, 64), 1));
		spc.setViewportView(txtS);

		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[]
		{ DatosLaptops.modelo0, DatosLaptops.modelo1, DatosLaptops.modelo2, DatosLaptops.modelo3, DatosLaptops.modelo4,
				DatosLaptops.modelo5 }));
		cboModelo.setBounds(120, 16, 160, 22);
		cboModelo.setAutoscrolls(true);
		cboModelo.setForeground(new Color(36, 31, 49));
		cboModelo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		cboModelo.setBorder(BorderFactory.createLineBorder(new Color(64, 64, 64), 1));
		contenPanel.add(cboModelo);
		cboModelo.setSelectedIndex(0);
		txtPrecio.setText(String.valueOf(DatosLaptops.precio0));
	};

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedbtnVender(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedbtnCerrar(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e)
	{
		int index = cboModelo.getSelectedIndex();
		switch (index)
		{
		case 0:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio0));
			break;
		case 1:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio1));
			break;
		case 2:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio2));
			break;
		case 3:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio3));
			break;
		case 4:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio4));
			break;
		case 5:
			txtPrecio.setText(String.valueOf(DatosLaptops.precio5));
			break;
		}
	}

	private void actionPerformedbtnVender(ActionEvent e)
	{
		try {

			double precio, impCompra, impDesc, impTotal, descuento0, descuento1, descuento2, descuento3;
			int cantidad;
			String obsequio, obsequio1, obsequio2, obsequio3, modeloSelec;

			descuento0 = DatosDescuentos.descuento0;
			descuento1 = DatosDescuentos.descuento1;
			descuento2 = DatosDescuentos.descuento2;
			descuento3 = DatosDescuentos.descuento3;
			obsequio1 = DatosObsequios.obsequio1;
			obsequio2 = DatosObsequios.obsequio2;
			obsequio3 = DatosObsequios.obsequio3;

			precio = leerPrecio();
			cantidad = leerCantidad();
			impCompra = calcularImpCompra(precio, cantidad);
			impDesc = calcularImpDesc(cantidad, impCompra, descuento0, descuento1, descuento2, descuento3);
			impTotal = calcularImpTotal(impCompra, impDesc);
			modeloSelec = ingresarModSelecString();
			obsequio = seleccionObsequio(cantidad, obsequio1, obsequio2, obsequio3);

			if (cantidad == 1)
				obsequio = obsequio1;
			else if (cantidad >= 2 && cantidad <= 5)
				obsequio = obsequio2;
			else
				obsequio = obsequio3;

			txtS.setText(" BOLETA DE VENTA\n\n");
			imprimir(" Modelo\t\t: " + modeloSelec + "\n");
			imprimir(" Precio\t\t: S/." + String.format("%.2f", precio) + "\n");
			imprimir(" Cantidad\t\t: " + cantidad + "\n");
			imprimir(" Importe de compra\t: S/." + String.format("%.2f", impCompra) + "\n");
			imprimir(" Importe de descuento\t: S/." + String.format("%.2f", impDesc) + "\n");
			imprimir(" Total a pagar\t\t: S/." + String.format("%.2f", impTotal) + "\n");
			imprimir(" Obsequio\t\t: " + obsequio + "\n");

			contadorVentas++;
			totalImporteAcumulado += impTotal;

			if (contadorVentas % 5 == 0) {
				DialogoAvanceVentas avance = new DialogoAvanceVentas();

				avance.txtNumeroVenta.setText(String.valueOf(contadorVentas));
				avance.txtImporteTotal.setText(String.format("S/. %.2f", totalImporteAcumulado));

				double porcentaje = (totalImporteAcumulado / CUOTA_DIARIA) * 100;

				if (porcentaje > 100) {
					porcentaje = 100;
				}

				porcentaje = Math.round(porcentaje * 100) / 100;
				avance.txtPorcCuotaDiaria.setText(String.format("%.2f %%", porcentaje));

				avance.setLocationRelativeTo(this);
				avance.setModal(true);
				avance.setVisible(true);
			}

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Error de formato", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void actionPerformedbtnCerrar(ActionEvent e)
	{
		dispose();
	}

	double leerPrecio()
	{
		return Double.parseDouble(txtPrecio.getText());
	}

	int leerCantidad()
	{
		return Integer.parseInt(txtCantidad.getText());
	}

	double calcularImpCompra(double precio, int cantidad)
	{
		return precio * cantidad;
	}

	double calcularImpDesc(int cantidad, double impCompra, double descuento0, double descuento1, double descuento2,
			double descuento3)
	{

		if (cantidad >= 1 && cantidad <= 5)
			return (descuento0 / 100) * impCompra;
		else if (cantidad >= 6 && cantidad <= 10)
			return (descuento1 / 100) * impCompra;
		else if (cantidad >= 11 && cantidad <= 15)
			return (descuento2 / 100) * impCompra;
		else
			return (descuento3 / 100) * impCompra;
	}

	double calcularImpTotal(double impCompra, double impDesc)
	{
		return impCompra - impDesc;
	}

	String ingresarModSelecString()
	{
		return (String) cboModelo.getSelectedItem();
	}

	String seleccionObsequio(int cantidad, String obsequio1, String obsequio2, String obsequio3)
	{
		if (cantidad == 1)
			return obsequio1;
		else if (cantidad >= 2 && cantidad <= 5)
			return obsequio2;
		else
			return obsequio3;
	}

	void imprimir(String cad)
	{
		txtS.append(cad);
	}
}
