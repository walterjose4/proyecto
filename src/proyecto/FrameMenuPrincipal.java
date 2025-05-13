package proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class FrameMenuPrincipal extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JPanel contenPanel;
	private JMenuBar jmbMenuPrincipal;
	private JMenu jmnArchivo;
	private JMenuItem MntmSalir;
	private JMenu jmnMantenimiento;
	private JMenu jmnVentas;
	private JMenu jmnConfiguracion;
	private JMenu jmnAyuda;
	private JMenuItem MntmListadoLaptops;
	private JMenuItem MntmConsultarLaptops;
	private JMenuItem MntmModificarLaptops;
	private JMenuItem MntmPorcentajeDescuento;
	private JMenuItem MntmObsequios;
	private JMenuItem MntmNosotros;
	private JMenuItem MntmVender;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try {
					FrameMenuPrincipal frame = new FrameMenuPrincipal();
					frame.setSize(650, 500); // size frame
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); // center screen
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrameMenuPrincipal()
	{
		setTitle("BYTE STORE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font menuFont = new Font("Microsoft Tai Le", Font.BOLD, 14);
		Font itemFont = new Font("Microsoft Tai Le", Font.PLAIN, 14);
		Border bordeMenu = new LineBorder(new Color(200, 200, 200), 1);

		contenPanel = new JPanel();
		contenPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenPanel);
		contenPanel.setLayout(new BorderLayout(0, 0));

		jmbMenuPrincipal = new JMenuBar();
		jmbMenuPrincipal.setBackground(new Color(192, 192, 192));
		jmbMenuPrincipal.setLayout(new GridLayout(0, 5));
		jmbMenuPrincipal.setPreferredSize(new Dimension(400, 60));
		contenPanel.add(jmbMenuPrincipal, BorderLayout.NORTH);

		jmnArchivo = new JMenu("        Archivo");
		jmnArchivo.setFont(menuFont);
		jmnArchivo.setBorder(bordeMenu);
		jmnArchivo.setHorizontalAlignment(SwingConstants.CENTER);
		jmnArchivo.setHorizontalTextPosition(SwingConstants.CENTER);
		jmnArchivo.setAlignmentX(Component.CENTER_ALIGNMENT);
		jmbMenuPrincipal.add(jmnArchivo);

		MntmSalir = new JMenuItem("Salir");
		MntmSalir.setFont(itemFont);
		MntmSalir.addActionListener(this);
		jmnArchivo.add(MntmSalir);

		jmnMantenimiento = new JMenu("  Mantenimiento ");
		jmnMantenimiento.setFont(menuFont);
		jmnMantenimiento.setBorder(bordeMenu);
		jmnMantenimiento.setHorizontalAlignment(SwingConstants.CENTER);
		jmnMantenimiento.setHorizontalTextPosition(SwingConstants.CENTER);
		jmnMantenimiento.setAlignmentX(Component.CENTER_ALIGNMENT);
		jmbMenuPrincipal.add(jmnMantenimiento);

		MntmConsultarLaptops = new JMenuItem("Consultar Laptops");
		MntmConsultarLaptops.addActionListener(this);
		MntmConsultarLaptops.setFont(itemFont);
		jmnMantenimiento.add(MntmConsultarLaptops);

		MntmModificarLaptops = new JMenuItem("Modificar Laptops");
		MntmModificarLaptops.addActionListener(this);
		MntmModificarLaptops.setFont(itemFont);
		jmnMantenimiento.add(MntmModificarLaptops);

		MntmListadoLaptops = new JMenuItem("Listado de Laptops");
		MntmListadoLaptops.addActionListener(this);
		MntmListadoLaptops.setFont(itemFont);
		jmnMantenimiento.add(MntmListadoLaptops);

		jmnVentas = new JMenu("         Ventas");
		jmnVentas.setFont(menuFont);
		jmnVentas.setBorder(bordeMenu);
		jmnVentas.setHorizontalAlignment(SwingConstants.CENTER);
		jmnVentas.setHorizontalTextPosition(SwingConstants.CENTER);
		jmnVentas.setAlignmentX(Component.CENTER_ALIGNMENT);
		jmbMenuPrincipal.add(jmnVentas);

		MntmVender = new JMenuItem("Vender");
		MntmVender.addActionListener(this);
		MntmVender.setFont(itemFont);
		jmnVentas.add(MntmVender);

		jmnConfiguracion = new JMenu("  Configuración");
		jmnConfiguracion.setFont(menuFont);
		jmnConfiguracion.setBorder(bordeMenu);
		jmnConfiguracion.setHorizontalAlignment(SwingConstants.CENTER);
		jmnConfiguracion.setHorizontalTextPosition(SwingConstants.CENTER);
		jmnConfiguracion.setAlignmentX(Component.CENTER_ALIGNMENT);
		jmbMenuPrincipal.add(jmnConfiguracion);

		MntmPorcentajeDescuento = new JMenuItem("Porcentaje de descuento");
		MntmPorcentajeDescuento.addActionListener(this);
		MntmPorcentajeDescuento.setFont(itemFont);
		jmnConfiguracion.add(MntmPorcentajeDescuento);

		MntmObsequios = new JMenuItem("Obsequios");
		MntmObsequios.addActionListener(this);
		MntmObsequios.setFont(itemFont);
		jmnConfiguracion.add(MntmObsequios);

		jmnAyuda = new JMenu("         Ayuda");
		jmnAyuda.setFont(menuFont);
		jmnAyuda.setBorder(bordeMenu);
		jmnAyuda.setHorizontalAlignment(SwingConstants.CENTER);
		jmnAyuda.setHorizontalTextPosition(SwingConstants.CENTER);
		jmnAyuda.setAlignmentX(Component.CENTER_ALIGNMENT);
		jmbMenuPrincipal.add(jmnAyuda);

		MntmNosotros = new JMenuItem("Nosotros");
		MntmNosotros.addActionListener(this);
		MntmNosotros.setFont(itemFont);
		jmnAyuda.add(MntmNosotros);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == MntmSalir) {
			actionPerformedMnmntmSalir(e);
		}
		if (e.getSource() == MntmConsultarLaptops) {
			actionPerformedMntmConsultarLaptop(e);
		}
		if (e.getSource() == MntmModificarLaptops) {
			actionPerformedMntmModificarLaptop(e);
		}
		if (e.getSource() == MntmListadoLaptops) {
			actionPerformedMntmListadodeLaptop(e);
		}
		if (e.getSource() == MntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == MntmObsequios) {
			actionPerformedMntmObsequios(e);
		}
		if (e.getSource() == MntmPorcentajeDescuento) {
			actionPerformedMntmPorcentajeDescuento(e);
		}
		if (e.getSource() == MntmNosotros) {
			actionPerformedMntmAyuda(e);
		}
	}

	protected void actionPerformedMnmntmSalir(ActionEvent e)
	{
		System.exit(0);
	}

	protected void actionPerformedMntmConsultarLaptop(ActionEvent e)
	{
		DialogoMantenimientoConsultar dmc = new DialogoMantenimientoConsultar();
		dmc.setLocationRelativeTo(this);
		dmc.setVisible(true);
	}

	protected void actionPerformedMntmModificarLaptop(ActionEvent e)
	{
		DialogoMantenimientoModificar dmm = new DialogoMantenimientoModificar();
		dmm.setLocationRelativeTo(this);
		dmm.setVisible(true);
	}

	protected void actionPerformedMntmListadodeLaptop(ActionEvent e)
	{
		DialogoMantenimientoListar dml = new DialogoMantenimientoListar();
		dml.setLocationRelativeTo(this);
		dml.setVisible(true);
	}

	protected void actionPerformedMntmPorcentajeDescuento(ActionEvent e)
	{
		DialogoConfigurarDescuentos dcd = new DialogoConfigurarDescuentos();
		dcd.setLocationRelativeTo(this);
		dcd.setVisible(true);
	}

	protected void actionPerformedMntmObsequios(ActionEvent e)
	{
		DialogoConfigurarObsequios dco = new DialogoConfigurarObsequios();
		dco.setLocationRelativeTo(this);
		dco.setVisible(true);
	}

	protected void actionPerformedMntmVender(ActionEvent e)
	{
		DialogoVender dv = new DialogoVender();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmAyuda(ActionEvent e)
	{
		DialogoAyuda da = new DialogoAyuda();
		da.setLocationRelativeTo(this);
		da.setVisible(true);
	}
}
