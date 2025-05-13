package proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class DialogoAyuda extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JPanel pnlVersion;
	private JLabel lblGelber;
	private JLabel lblLuis;
	private JLabel lblWalter;
	private JLabel lblKatia;
	private JLabel lblVersion;
	private JPanel pnlAutores;
	private JLabel lblAutores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoAyuda dialog = new DialogoAyuda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog. 
	 */
	public DialogoAyuda() {
		setFont(new Font("Microsoft Tai Le", Font.PLAIN, 14));
		setTitle("Acerca de la tienda ");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblGelber = new JLabel("Gelber Paolo Lozano Huangal");
		lblGelber .setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblGelber.setBounds(128, 100, 180, 14);
		contentPanel.add(lblGelber);
		
		lblLuis = new JLabel("Luis Pierre Oscco Lara");
		lblLuis.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblLuis.setBounds(128, 130, 180, 20);
		contentPanel.add(lblLuis);
		
		lblWalter = new JLabel("Walter José Cañapataña Vargas");
		lblWalter .setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblWalter.setBounds(128, 160, 180, 20);
		contentPanel.add(lblWalter);
		
		lblKatia = new JLabel("Katia Katherine de la Torre Lorenz");
		lblKatia.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblKatia.setBounds(128, 190, 180, 20);
		contentPanel.add(lblKatia);
		
		pnlVersion = new JPanel();
		pnlVersion.setBackground(new Color(192, 192, 192));
		pnlVersion.setBounds(0, 0, 434, 40);
		pnlVersion.setLayout(null);
        contentPanel.add(pnlVersion);
		
		lblVersion = new JLabel("Byte Store Versión 1.0");
		lblVersion.setForeground(new Color(128, 0, 0));
		lblVersion.setFont(new Font("Microsoft Tai Le", Font.BOLD, 16));
		lblVersion.setBounds(137, 11, 166, 20);
		pnlVersion.add(lblVersion);
		
		pnlAutores = new JPanel();
		pnlAutores.setLayout(null);
		pnlAutores.setBackground(new Color(141, 141, 141));
		pnlAutores.setBounds(0, 40, 434, 35);
		contentPanel.add(pnlAutores);
		
		lblAutores = new JLabel("AUTORES");
		lblAutores.setForeground(new Color(255, 255, 255));
		lblAutores.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		lblAutores.setBounds(184, 11, 100, 20);
		pnlAutores.add(lblAutores);
	}
}
