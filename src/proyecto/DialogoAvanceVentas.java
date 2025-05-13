package proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DialogoAvanceVentas extends JDialog implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblPorcCuotaDiaria;
	private JLabel lblNumeroVenta;
	private JLabel lblImporteTotal;
	private JButton btnAceptar;
	private JLabel lblIcono;
	public JTextField txtNumeroVenta;
	public JTextField txtImporteTotal;
	public JTextField txtPorcCuotaDiaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try {
			DialogoAvanceVentas dialog = new DialogoAvanceVentas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoAvanceVentas()
	{
		setTitle("Avance de ventas");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblNumeroVenta = new JLabel("Venta Nro. ");
		lblNumeroVenta.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblNumeroVenta.setBounds(112, 25, 75, 14);
		contentPanel.add(lblNumeroVenta);

		txtNumeroVenta = new JTextField();
		txtNumeroVenta.setEditable(false);
		txtNumeroVenta.setBorder(null);
		txtNumeroVenta.setForeground(new Color(0, 0, 0));
		txtNumeroVenta.setBackground(new Color(192, 192, 192));
		txtNumeroVenta.setBounds(175, 22, 23, 21);
		contentPanel.add(txtNumeroVenta);
		txtNumeroVenta.setColumns(10);

		lblImporteTotal = new JLabel("Importe total general acumulado:");
		lblImporteTotal.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblImporteTotal.setBounds(112, 50, 211, 14);
		contentPanel.add(lblImporteTotal);

		txtImporteTotal = new JTextField();
		txtImporteTotal.setBorder(null);
		txtImporteTotal.setEditable(false);
		txtImporteTotal.setBounds(307, 47, 114, 21);
		contentPanel.add(txtImporteTotal);
		txtImporteTotal.setColumns(10);

		lblPorcCuotaDiaria = new JLabel("Porcentaje de la couta diaria:");
		lblPorcCuotaDiaria.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblPorcCuotaDiaria.setBounds(112, 75, 190, 14);
		contentPanel.add(lblPorcCuotaDiaria);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);

		txtPorcCuotaDiaria = new JTextField();
		txtPorcCuotaDiaria.setBorder(null);
		txtPorcCuotaDiaria.setEditable(false);
		txtPorcCuotaDiaria.setBounds(307, 72, 114, 21);
		contentPanel.add(txtPorcCuotaDiaria);
		txtPorcCuotaDiaria.setColumns(10);

		btnAceptar.setBackground(new Color(128, 0, 0));
		btnAceptar.setForeground(new Color(255, 255, 255));
		btnAceptar.setBorder(BorderFactory.createLineBorder(new Color(64, 64, 64), 3));
		btnAceptar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		btnAceptar.setBounds(185, 110, 90, 25);
		contentPanel.add(btnAceptar);

		ImageIcon originalIcon = new ImageIcon(getClass().getResource("/recursos/icono.png"));
		Image imgEscalada = originalIcon.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
		ImageIcon iconoEscalado = new ImageIcon(imgEscalada);
		lblIcono = new JLabel(iconoEscalado);
		lblIcono.setBounds(24, 25, 64, 64);
		contentPanel.add(lblIcono);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}

	protected void actionPerformedBtnAceptar(ActionEvent e)
	{
		dispose();
	}
}
