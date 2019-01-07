package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.OrganizacionFiestas;
import persistencia.GestionFicheros;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.GridLayout;

public class VentanaPrincipal extends JFrame {

	private OrganizacionFiestas organizacionFiestas;
	private JPanel contentPane;
	private JPanel panelContenedor;
	private JPanel panelBienvenida;
	private JPanel panelImagen;
	private JButton btnComenzar;
	private JLabel lblBienvenido;
	private JPanel panelBotonComenzar;
	private JPanel panelBienvenido;
	private JLabel lblmagenBienvenida;
	private JPanel panelInicio;
	private JPanel panelBotonesInicio;
	private JButton btnIdentificate;
	private JButton btnRegistrate;
	private JButton btnSinRegistro;
	private JPanel panelAtrasInicio;
	private JPanel panelBotonIdentificate;
	private JPanel panelBotonRegistrate;
	private JPanel panelBotonSinRegistro;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Nos vamos de fiesta");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/fiesta.jpg")));
		organizacionFiestas = new OrganizacionFiestas();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanelContenedor(), BorderLayout.CENTER);
	}

	private JPanel getPanelContenedor() {
		if (panelContenedor == null) {
			panelContenedor = new JPanel();
			panelContenedor.setLayout(new CardLayout(0, 0));
			panelContenedor.add(getPanelBienvenida(), "name_392626165650801");
			panelContenedor.add(getPanelInicio(), "name_393999272847387");
		}
		return panelContenedor;
	}
	private JPanel getPanelBienvenida() {
		if (panelBienvenida == null) {
			panelBienvenida = new JPanel();
			panelBienvenida.setForeground(new Color(147, 112, 219));
			panelBienvenida.setLayout(new BorderLayout(0, 0));
			panelBienvenida.add(getPanelBienvenido(), BorderLayout.NORTH);
			panelBienvenida.add(getPanelImagen(), BorderLayout.CENTER);
			panelBienvenida.add(getPanelBotonComenzar(), BorderLayout.SOUTH);
		}
		return panelBienvenida;
	}
	private JPanel getPanelImagen() {
		if (panelImagen == null) {
			panelImagen = new JPanel();
			panelImagen.setBackground(new Color(147, 112, 219));
			panelImagen.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelImagen.add(getLblmagenBienvenida());
		}
		return panelImagen;
	}
	private JButton getBtnComenzar() {
		if (btnComenzar == null) {
			btnComenzar = new JButton("COMENZAR");
			btnComenzar.setBackground(new Color(255, 204, 51));
			btnComenzar.setFont(new Font("Curlz MT", Font.PLAIN, 30));
		}
		return btnComenzar;
	}
	private JLabel getLblBienvenido() {
		if (lblBienvenido == null) {
			lblBienvenido = new JLabel("Bienvenido");
			lblBienvenido.setFont(new Font("Curlz MT", Font.PLAIN, 55));
			lblBienvenido.setForeground(new Color(255, 204, 51));
		}
		return lblBienvenido;
	}
	private JPanel getPanelBotonComenzar() {
		if (panelBotonComenzar == null) {
			panelBotonComenzar = new JPanel();
			panelBotonComenzar.setBackground(new Color(147, 112, 219));
			panelBotonComenzar.add(getBtnComenzar());
		}
		return panelBotonComenzar;
	}
	private JPanel getPanelBienvenido() {
		if (panelBienvenido == null) {
			panelBienvenido = new JPanel();
			panelBienvenido.setBackground(new Color(147, 112, 219));
			panelBienvenido.setForeground(new Color(147, 112, 219));
			panelBienvenido.add(getLblBienvenido());
		}
		return panelBienvenido;
	}
	private JLabel getLblmagenBienvenida() {
		if (lblmagenBienvenida == null) {
			lblmagenBienvenida = new JLabel("");
			lblmagenBienvenida.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/fiesta.jpg")));
		}
		return lblmagenBienvenida;
	}
	private JPanel getPanelInicio() {
		if (panelInicio == null) {
			panelInicio = new JPanel();
			panelInicio.setLayout(new BorderLayout(0, 0));
			panelInicio.add(getPanelBotonesInicio(), BorderLayout.CENTER);
			panelInicio.add(getPanelAtrasInicio(), BorderLayout.NORTH);
		}
		return panelInicio;
	}
	private JPanel getPanelBotonesInicio() {
		if (panelBotonesInicio == null) {
			panelBotonesInicio = new JPanel();
			panelBotonesInicio.setLayout(new GridLayout(3, 1, 5, 5));
			panelBotonesInicio.add(getPanelBotonIdentificate());
			panelBotonesInicio.add(getPanelBotonRegistrate());
			panelBotonesInicio.add(getPanelBotonSinRegistro());
		}
		return panelBotonesInicio;
	}
	private JButton getBtnIdentificate() {
		if (btnIdentificate == null) {
			btnIdentificate = new JButton("Identif\u00EDcate");
		}
		return btnIdentificate;
	}
	private JButton getBtnRegistrate() {
		if (btnRegistrate == null) {
			btnRegistrate = new JButton("Reg\u00EDstrate");
		}
		return btnRegistrate;
	}
	private JButton getBtnSinRegistro() {
		if (btnSinRegistro == null) {
			btnSinRegistro = new JButton("Continuar sin registro");
		}
		return btnSinRegistro;
	}
	private JPanel getPanelAtrasInicio() {
		if (panelAtrasInicio == null) {
			panelAtrasInicio = new JPanel();
		}
		return panelAtrasInicio;
	}
	private JPanel getPanelBotonIdentificate() {
		if (panelBotonIdentificate == null) {
			panelBotonIdentificate = new JPanel();
			panelBotonIdentificate.add(getBtnIdentificate());
		}
		return panelBotonIdentificate;
	}
	private JPanel getPanelBotonRegistrate() {
		if (panelBotonRegistrate == null) {
			panelBotonRegistrate = new JPanel();
			panelBotonRegistrate.add(getBtnRegistrate());
		}
		return panelBotonRegistrate;
	}
	private JPanel getPanelBotonSinRegistro() {
		if (panelBotonSinRegistro == null) {
			panelBotonSinRegistro = new JPanel();
			panelBotonSinRegistro.add(getBtnSinRegistro());
		}
		return panelBotonSinRegistro;
	}
}
