package proyecto;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class DialogoMantenimientoListar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contenPanel = new JPanel();
	private JScrollPane scp;
	private JButton btnListar;
	private JButton btnCerrar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoMantenimientoListar dialog = new DialogoMantenimientoListar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoMantenimientoListar() {
		setTitle("Listado de laptops");
		setBounds(100, 100, 550, 450);
		getContentPane().setLayout(new BorderLayout());
		contenPanel.setBackground(new Color(192, 192, 192));
		contenPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contenPanel, BorderLayout.CENTER);
		contenPanel.setLayout(null);
		
		scp = new JScrollPane();
		scp.setBounds(10, 11, 514, 345);
		contenPanel.add(scp);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scp.setViewportView(txtS);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		btnListar.setForeground(new Color(255, 255, 255));
		btnListar.setBackground(new Color(128, 0, 0));
		btnListar.setBorder(BorderFactory.createLineBorder(new Color(64,64,64), 3));
		btnListar.setBounds(150, 370, 100, 30);
		contenPanel.add(btnListar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setBackground(new Color(128, 0, 0));
		btnCerrar.setBorder(BorderFactory.createLineBorder(new Color(64,64,64), 3));
		btnCerrar.setBounds(293, 370, 100, 30);
		contenPanel.add(btnCerrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	
	protected void actionPerformedBtnListar(ActionEvent e) {
		
		txtS.setText(" LISTADO DE LAPTOPS \n\n");
		
		imprimir(" Modelo\t: "+DatosLaptops.modelo0+"\n");
		imprimir(" Precio\t: S/ "+DatosLaptops.precio0+"\n");
		imprimir(" RAM\t: "+DatosLaptops.ram0+" GB\n");
		imprimir(" Unidad SSD\t: "+DatosLaptops.unidadSSD0+" GB\n");
		imprimir(" Procesador\t: "+DatosLaptops.procesador0+"\n\n");

		imprimir(" Modelo\t: "+DatosLaptops.modelo1+"\n");
		imprimir(" Precio\t: S/ "+DatosLaptops.precio1+"\n");
		imprimir(" RAM\t: "+DatosLaptops.ram1+" GB\n");
		imprimir(" Unidad SSD\t: "+DatosLaptops.unidadSSD1+" GB\n");
		imprimir(" Procesador\t: "+DatosLaptops.procesador1+"\n\n");
		
		imprimir(" Modelo\t: "+DatosLaptops.modelo2+"\n");
		imprimir(" Precio\t: S/ "+DatosLaptops.precio2+"\n");
		imprimir(" RAM\t: "+DatosLaptops.ram2+" GB\n");
		imprimir(" Unidad SSD\t: "+DatosLaptops.unidadSSD2+" GB\n");
		imprimir(" Procesador\t: "+DatosLaptops.procesador2+"\n\n");
		
		imprimir(" Modelo\t: "+DatosLaptops.modelo3+"\n");
		imprimir(" Precio\t: S/ "+DatosLaptops.precio3+"\n");
		imprimir(" RAM\t: "+DatosLaptops.ram3+" GB\n");
		imprimir(" Unidad SSD\t: "+DatosLaptops.unidadSSD3+" GB\n");
		imprimir(" Procesador\t: "+DatosLaptops.procesador3+"\n\n");
		
		imprimir(" Modelo\t: "+DatosLaptops.modelo4+"\n");
		imprimir(" Precio\t: S/ "+DatosLaptops.precio4+"\n");
		imprimir(" RAM\t: "+DatosLaptops.ram4+" GB\n");
		imprimir(" Unidad SSD\t: "+DatosLaptops.unidadSSD4+" GB\n");
		imprimir(" Procesador\t: "+DatosLaptops.procesador4+"\n\n");
		
		imprimir(" Modelo\t: "+DatosLaptops.modelo5+"\n");
		imprimir(" Precio\t: S/ "+DatosLaptops.precio5+"\n");
		imprimir(" RAM\t: "+DatosLaptops.ram5+" GB\n");
		imprimir(" Unidad SSD\t: "+DatosLaptops.unidadSSD5+" GB\n");
		imprimir(" Procesador\t: "+DatosLaptops.procesador5+"\n\n");
		
		txtS.setCaretPosition(0);
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
	void imprimir (String cad) {txtS.append(cad);}
}
