package proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DialogoMantenimientoConsultar extends JDialog implements ActionListener {

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
	private JComboBox<String> cboModelo;


	public static void main(String[] args) {
		try {
			DialogoMantenimientoConsultar dialog = new DialogoMantenimientoConsultar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DialogoMantenimientoConsultar() {
		setFont(new Font("Microsoft Tai Le", Font.PLAIN, 15));
		setTitle("Consultar laptops\r\n");
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(new BorderLayout());
		contenPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenPanel.setBackground(new Color(192, 192, 192));
		contenPanel.setForeground(new Color(255, 255, 255));
		getContentPane().add(contenPanel, BorderLayout.CENTER);
		contenPanel.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		lblModelo.setBounds(22, 45, 78, 14);
		contenPanel.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblPrecio.setBounds(22, 90, 65, 14);
		contenPanel.add(lblPrecio);
		
		lblMemoriaRam = new JLabel("Memoria RAM (GB)");
		lblMemoriaRam.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblMemoriaRam.setBounds(22, 130, 120, 14);
		contenPanel.add(lblMemoriaRam);
		
		lblAlmacenamiento = new JLabel("Almacenamiento (GB)");
		lblAlmacenamiento.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblAlmacenamiento.setBounds(22, 168, 130, 14);
		contenPanel.add(lblAlmacenamiento);
		
		lblProcesador = new JLabel("Procesador");
		lblProcesador.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
		lblProcesador.setBounds(22, 210, 95, 14);
		contenPanel.add(lblProcesador);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		txtPrecio.setBounds(168, 85, 165, 22);		
		txtPrecio.setColumns(10);
		txtPrecio.setBorder(BorderFactory.createCompoundBorder(
			    BorderFactory.createLineBorder(Color.gray, 1),
			    BorderFactory.createEmptyBorder(0, 4, 0, 0)));
		txtPrecio.setEditable(false);
		txtPrecio.setFocusable(false); 
		contenPanel.add(txtPrecio);
		
		txtMemoriaRam = new JTextField();
		txtMemoriaRam.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		txtMemoriaRam.setBounds(168, 125, 165, 22);	
		txtMemoriaRam.setColumns(10);
		txtMemoriaRam.setBorder(BorderFactory.createCompoundBorder(
			    BorderFactory.createLineBorder(Color.gray, 1),
			    BorderFactory.createEmptyBorder(0, 4, 0, 0)));
		txtMemoriaRam.setEditable(false);		
		txtMemoriaRam.setFocusable(false); 
		contenPanel.add(txtMemoriaRam);
		
		txtAlmacenamiento = new JTextField();
		txtAlmacenamiento.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		txtAlmacenamiento.setBounds(168, 165, 165, 22);
		txtAlmacenamiento.setColumns(10);
		txtAlmacenamiento.setBorder(BorderFactory.createCompoundBorder(
			    BorderFactory.createLineBorder(Color.gray, 1),
			    BorderFactory.createEmptyBorder(0, 4, 0, 0)));
		txtAlmacenamiento.setEditable(false);
		txtAlmacenamiento.setFocusable(false); 
		contenPanel.add(txtAlmacenamiento);
		
		txtProcesador = new JTextField();
		txtProcesador.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		txtProcesador.setBounds(168, 205, 165, 22);
		txtProcesador.setColumns(10);
		txtProcesador.setBorder(BorderFactory.createCompoundBorder(
			    BorderFactory.createLineBorder(Color.gray, 1),
			    BorderFactory.createEmptyBorder(0, 4, 0, 0)));
		txtProcesador.setEditable(false);
		txtProcesador.setFocusable(false); 
		contenPanel.add(txtProcesador);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBackground(new Color(128, 0, 0));	
		btnCerrar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 15));
		btnCerrar.setBorder(BorderFactory.createLineBorder(new Color(64,64,64), 3));
		btnCerrar.setBounds(373, 45, 89, 32);
		contenPanel.add(btnCerrar);
		
		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {
				DatosLaptops.modelo0,
			    DatosLaptops.modelo1,
			    DatosLaptops.modelo2,
			    DatosLaptops.modelo3,
			    DatosLaptops.modelo4,
			    DatosLaptops.modelo5}));
		cboModelo.setAutoscrolls(true);
		cboModelo.setForeground(Color.black);
		cboModelo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		cboModelo.setBorder(BorderFactory.createLineBorder(new Color(64, 64, 64), 1)); 
		cboModelo.setBounds(168, 45, 165, 22);
		contenPanel.add(cboModelo);
		
		cboModelo.setSelectedIndex(0);
		txtPrecio.setText(String.valueOf(DatosLaptops.precio0));
		txtMemoriaRam.setText(String.valueOf(DatosLaptops.ram0));
		txtAlmacenamiento.setText(String.valueOf(DatosLaptops.unidadSSD0));
		txtProcesador.setText(DatosLaptops.procesador0);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
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
		            
		        default :
		            txtPrecio.setText(String.valueOf(DatosLaptops.precio5));
		            txtMemoriaRam.setText(String.valueOf(DatosLaptops.ram5));
		            txtAlmacenamiento.setText(String.valueOf(DatosLaptops.unidadSSD5));
		            txtProcesador.setText(String.valueOf(DatosLaptops.procesador5));
		            break;
		    }
		}
	 protected void actionPerformedbtnCerrar(ActionEvent e) {
	    dispose();
	}
			
}
