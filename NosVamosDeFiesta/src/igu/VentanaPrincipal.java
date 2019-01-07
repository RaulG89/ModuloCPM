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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
	private JButton btnAtrasInicio;
	private JTextField txtNombreIdentificacion;
	private JTextField txtNombreRegistro;
	private JPasswordField pwIdentificacion;
	private JPasswordField pwRegistro;
	private JLabel lblNombreIdentificacion;
	private JLabel lblContraseñaIdentificacion;
	private JLabel lblNombreRegistro;
	private JLabel lblContraseñaRegistro;
	private JPanel panelNombreRegistro;
	private JPanel panelContraseñaRegistro;
	private JPanel panelBotonRegistro;
	private JPanel panel_3;
	private Component verticalStrut;
	private Component verticalStrut_1;
	private Component verticalStrut_2;
	private JPanel panel_4;
	private Component verticalStrut_3;
	private JPanel panelNombreIdentificacion;
	private JPanel panelContraseñaIdentificacion;
	private JPanel panelBotonIdentificacion;
	private Component verticalStrut_4;
	private JPanel panel_8;
	private Component verticalStrut_5;
	private Component verticalStrut_6;
	private JPanel panel_9;
	private Component verticalStrut_7;
	private JPanel panelConfiguracionFiesta;
	private JPanel panelSuperiorConfiguracion;
	private JPanel panelCentralConfiguracion;
	private JPanel panelInferiorConfiguracion;
	private JButton btnAyudaConfiguracion;
	private JLabel lblNombreClienteConfiguracion;
	private JButton btnAtras;
	private JButton btnCancelar;
	private JButton btnSiguiente;
	private JPanel panelTituloConfiguracion;
	private JPanel panelOpcionesConfiguracion;
	private JPanel panelAsistentesConfiguracion;
	private JLabel lblTituloConfiguracion;
	private JLabel lblNmeroDeAsistentes;
	private JSpinner spinner;
	private JPanel panelTipoFiestaConfiguracion;
	private JPanel panelDescripcionConfiguracion;
	private JPanel panelAsistentes;
	private Component verticalStrut_8;
	private Component verticalStrut_9;
	private JPanel panelDescripcion;
	private JLabel lblDescripcin;
	private JScrollPane scrollPaneDescripcionConfiguración;
	private JTextArea textAreaDescripcionConfiguracion;
	private JPanel panelTipoFiesta;
	private JLabel lblTipoDeFiesta;
	private JTextField textField;
	private Component verticalStrut_11;
	private Component verticalStrut_12;
	

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
			panelContenedor.add(getPanelConfiguracionFiesta(), "name_18654399956158");
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
			btnComenzar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelBienvenida.setVisible(false);
					panelInicio.setVisible(true);
				}
			});
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
			panelInicio.add(getPanelAtrasInicio(), BorderLayout.SOUTH);
		}
		return panelInicio;
	}
	private JPanel getPanelBotonesInicio() {
		if (panelBotonesInicio == null) {
			panelBotonesInicio = new JPanel();
			panelBotonesInicio.setLayout(new GridLayout(1, 2, 5, 5));
			panelBotonesInicio.add(getPanelBotonIdentificate());
			panelBotonesInicio.add(getPanelBotonRegistrate());
		}
		return panelBotonesInicio;
	}
	private JButton getBtnIdentificate() {
		if (btnIdentificate == null) {
			btnIdentificate = new JButton("Identif\u00EDcate");
			btnIdentificate.setMnemonic('D');
			btnIdentificate.setFont(new Font("Dialog", Font.BOLD, 18));
		}
		return btnIdentificate;
	}
	private JButton getBtnRegistrate() {
		if (btnRegistrate == null) {
			btnRegistrate = new JButton("Reg\u00EDstrate");
			btnRegistrate.setMnemonic('R');
			btnRegistrate.setFont(new Font("Dialog", Font.BOLD, 18));
		}
		return btnRegistrate;
	}
	private JButton getBtnSinRegistro() {
		if (btnSinRegistro == null) {
			btnSinRegistro = new JButton("Continuar sin registro");
			btnSinRegistro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					panelInicio.setVisible(false);
					panelConfiguracionFiesta.setVisible(true);
					
				}
			});
			btnSinRegistro.setMnemonic('S');
			btnSinRegistro.setFont(new Font("Dialog", Font.BOLD, 18));
		}
		return btnSinRegistro;
	}
	private JPanel getPanelAtrasInicio() {
		if (panelAtrasInicio == null) {
			panelAtrasInicio = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelAtrasInicio.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			panelAtrasInicio.add(getBtnAtrasInicio());
			panelAtrasInicio.add(getBtnSinRegistro());
		}
		return panelAtrasInicio;
	}
	private JPanel getPanelBotonIdentificate() {
		if (panelBotonIdentificate == null) {
			panelBotonIdentificate = new JPanel();
			panelBotonIdentificate.setFont(new Font("Dialog", Font.PLAIN, 18));
			panelBotonIdentificate.setBorder(new TitledBorder(null, "Identificaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelBotonIdentificate.setLayout(new GridLayout(0, 1, 0, 0));
			panelBotonIdentificate.add(getPanelNombreIdentificacion());
			panelBotonIdentificate.add(getPanelContraseñaIdentificacion());
			panelBotonIdentificate.add(getPanelBotonIdentificacion());
		}
		return panelBotonIdentificate;
	}
	private JPanel getPanelBotonRegistrate() {
		if (panelBotonRegistrate == null) {
			panelBotonRegistrate = new JPanel();
			panelBotonRegistrate.setFont(new Font("Dialog", Font.PLAIN, 18));
			panelBotonRegistrate.setBorder(new TitledBorder(null, "Registro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelBotonRegistrate.setLayout(new GridLayout(0, 1, 0, 0));
			panelBotonRegistrate.add(getPanelNombreRegistro());
			panelBotonRegistrate.add(getPanelContraseñaRegistro());
			panelBotonRegistrate.add(getPanelBotonRegistro());
		}
		return panelBotonRegistrate;
	}
	private JButton getBtnAtrasInicio() {
		if (btnAtrasInicio == null) {
			btnAtrasInicio = new JButton("Atras");
			btnAtrasInicio.setMnemonic('A');
			btnAtrasInicio.setFont(new Font("Dialog", Font.BOLD, 18));
			btnAtrasInicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelInicio.setVisible(false);
					panelBienvenida.setVisible(true);					
				}
			});
		}
		return btnAtrasInicio;
	}
	private JTextField getTxtNombreIdentificacion() {
		if (txtNombreIdentificacion == null) {
			txtNombreIdentificacion = new JTextField();
			txtNombreIdentificacion.setFont(new Font("Dialog", Font.PLAIN, 18));
			txtNombreIdentificacion.setColumns(10);
		}
		return txtNombreIdentificacion;
	}
	private JTextField getTxtNombreRegistro() {
		if (txtNombreRegistro == null) {
			txtNombreRegistro = new JTextField();
			txtNombreRegistro.setFont(new Font("Dialog", Font.PLAIN, 18));
			txtNombreRegistro.setColumns(10);
		}
		return txtNombreRegistro;
	}
	private JPasswordField getPwIdentificacion() {
		if (pwIdentificacion == null) {
			pwIdentificacion = new JPasswordField();
			pwIdentificacion.setFont(new Font("Dialog", Font.PLAIN, 18));
		}
		return pwIdentificacion;
	}
	private JPasswordField getPwRegistro() {
		if (pwRegistro == null) {
			pwRegistro = new JPasswordField();
			pwRegistro.setFont(new Font("Dialog", Font.PLAIN, 18));
		}
		return pwRegistro;
	}
	private JLabel getLblNombreIdentificacion() {
		if (lblNombreIdentificacion == null) {
			lblNombreIdentificacion = new JLabel("Nombre: ");
			lblNombreIdentificacion.setAlignmentX(Component.CENTER_ALIGNMENT);
			lblNombreIdentificacion.setLabelFor(getTxtNombreIdentificacion());
			lblNombreIdentificacion.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNombreIdentificacion.setDisplayedMnemonic('N');
		}
		return lblNombreIdentificacion;
	}
	private JLabel getLblContraseñaIdentificacion() {
		if (lblContraseñaIdentificacion == null) {
			lblContraseñaIdentificacion = new JLabel("Contrase\u00F1a: ");
			lblContraseñaIdentificacion.setLabelFor(getPwIdentificacion());
			lblContraseñaIdentificacion.setDisplayedMnemonic('C');
			lblContraseñaIdentificacion.setFont(new Font("Dialog", Font.BOLD, 18));
		}
		return lblContraseñaIdentificacion;
	}
	private JLabel getLblNombreRegistro() {
		if (lblNombreRegistro == null) {
			lblNombreRegistro = new JLabel("Nombre: ");
			lblNombreRegistro.setDisplayedMnemonic('M');
			lblNombreRegistro.setLabelFor(getTxtNombreRegistro());
			lblNombreRegistro.setFont(new Font("Dialog", Font.BOLD, 18));
		}
		return lblNombreRegistro;
	}
	private JLabel getLblContraseñaRegistro() {
		if (lblContraseñaRegistro == null) {
			lblContraseñaRegistro = new JLabel("Contraseña: ");
			lblContraseñaRegistro.setDisplayedMnemonic('T');
			lblContraseñaRegistro.setLabelFor(getPwRegistro());
			lblContraseñaRegistro.setFont(new Font("Dialog", Font.BOLD, 18));
		}
		return lblContraseñaRegistro;
	}
	private JPanel getPanelNombreRegistro() {
		if (panelNombreRegistro == null) {
			panelNombreRegistro = new JPanel();
			panelNombreRegistro.setLayout(new GridLayout(0, 1, 0, 0));
			panelNombreRegistro.add(getVerticalStrut());
			panelNombreRegistro.add(getPanel_3());
			panelNombreRegistro.add(getVerticalStrut_1());
		}
		return panelNombreRegistro;
	}
	private JPanel getPanelContraseñaRegistro() {
		if (panelContraseñaRegistro == null) {
			panelContraseñaRegistro = new JPanel();
			panelContraseñaRegistro.setLayout(new GridLayout(0, 1, 0, 0));
			panelContraseñaRegistro.add(getVerticalStrut_2());
			panelContraseñaRegistro.add(getPanel_4());
			panelContraseñaRegistro.add(getVerticalStrut_3());
		}
		return panelContraseñaRegistro;
	}
	private JPanel getPanelBotonRegistro() {
		if (panelBotonRegistro == null) {
			panelBotonRegistro = new JPanel();
			panelBotonRegistro.add(getBtnRegistrate());
		}
		return panelBotonRegistro;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new GridLayout(1, 0, 0, 0));
			panel_3.add(getLblNombreRegistro());
			panel_3.add(getTxtNombreRegistro());
		}
		return panel_3;
	}
	private Component getVerticalStrut() {
		if (verticalStrut == null) {
			verticalStrut = Box.createVerticalStrut(20);
		}
		return verticalStrut;
	}
	private Component getVerticalStrut_1() {
		if (verticalStrut_1 == null) {
			verticalStrut_1 = Box.createVerticalStrut(20);
		}
		return verticalStrut_1;
	}
	private Component getVerticalStrut_2() {
		if (verticalStrut_2 == null) {
			verticalStrut_2 = Box.createVerticalStrut(20);
		}
		return verticalStrut_2;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setLayout(new GridLayout(0, 2, 0, 0));
			panel_4.add(getLblContraseñaRegistro());
			panel_4.add(getPwRegistro());
		}
		return panel_4;
	}
	private Component getVerticalStrut_3() {
		if (verticalStrut_3 == null) {
			verticalStrut_3 = Box.createVerticalStrut(20);
		}
		return verticalStrut_3;
	}
	private JPanel getPanelNombreIdentificacion() {
		if (panelNombreIdentificacion == null) {
			panelNombreIdentificacion = new JPanel();
			panelNombreIdentificacion.setLayout(new GridLayout(0, 1, 0, 0));
			panelNombreIdentificacion.add(getVerticalStrut_4());
			panelNombreIdentificacion.add(getPanel_8());
			panelNombreIdentificacion.add(getVerticalStrut_5());
		}
		return panelNombreIdentificacion;
	}
	private JPanel getPanelContraseñaIdentificacion() {
		if (panelContraseñaIdentificacion == null) {
			panelContraseñaIdentificacion = new JPanel();
			panelContraseñaIdentificacion.setLayout(new GridLayout(0, 1, 0, 0));
			panelContraseñaIdentificacion.add(getVerticalStrut_6_1());
			panelContraseñaIdentificacion.add(getPanel_9_1());
			panelContraseñaIdentificacion.add(getVerticalStrut_7_1());
		}
		return panelContraseñaIdentificacion;
	}
	private JPanel getPanelBotonIdentificacion() {
		if (panelBotonIdentificacion == null) {
			panelBotonIdentificacion = new JPanel();
			panelBotonIdentificacion.add(getBtnIdentificate());
		}
		return panelBotonIdentificacion;
	}
	private Component getVerticalStrut_4() {
		if (verticalStrut_4 == null) {
			verticalStrut_4 = Box.createVerticalStrut(20);
		}
		return verticalStrut_4;
	}
	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
			panel_8.setAlignmentX(Component.LEFT_ALIGNMENT);
			panel_8.setLayout(new GridLayout(0, 2, 0, 0));
			panel_8.add(getLblNombreIdentificacion());
			panel_8.add(getTxtNombreIdentificacion());
		}
		return panel_8;
	}
	private Component getVerticalStrut_5() {
		if (verticalStrut_5 == null) {
			verticalStrut_5 = Box.createVerticalStrut(20);
		}
		return verticalStrut_5;
	}
	private Component getVerticalStrut_6_1() {
		if (verticalStrut_6 == null) {
			verticalStrut_6 = Box.createVerticalStrut(20);
		}
		return verticalStrut_6;
	}
	private JPanel getPanel_9_1() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.setLayout(new GridLayout(0, 2, 0, 0));
			panel_9.add(getLblContraseñaIdentificacion());
			panel_9.add(getPwIdentificacion());
		}
		return panel_9;
	}
	private Component getVerticalStrut_7_1() {
		if (verticalStrut_7 == null) {
			verticalStrut_7 = Box.createVerticalStrut(20);
		}
		return verticalStrut_7;
	}
	private JPanel getPanelConfiguracionFiesta() {
		if (panelConfiguracionFiesta == null) {
			panelConfiguracionFiesta = new JPanel();
			panelConfiguracionFiesta.setLayout(new BorderLayout(0, 0));
			panelConfiguracionFiesta.add(getPanelSuperiorConfiguracion(), BorderLayout.NORTH);
			panelConfiguracionFiesta.add(getPanelCentralConfiguracion(), BorderLayout.CENTER);
			panelConfiguracionFiesta.add(getPanelInferiorConfiguracion(), BorderLayout.SOUTH);
		}
		return panelConfiguracionFiesta;
	}
	private JPanel getPanelSuperiorConfiguracion() {
		if (panelSuperiorConfiguracion == null) {
			panelSuperiorConfiguracion = new JPanel();
			panelSuperiorConfiguracion.setLayout(new GridLayout(1, 0, 0, 0));
			panelSuperiorConfiguracion.add(getBtnAyudaConfiguracion());
			panelSuperiorConfiguracion.add(getLblNombreClienteConfiguracion());
		}
		return panelSuperiorConfiguracion;
	}
	private JPanel getPanelCentralConfiguracion() {
		if (panelCentralConfiguracion == null) {
			panelCentralConfiguracion = new JPanel();
			panelCentralConfiguracion.setLayout(new BorderLayout(0, 0));
			panelCentralConfiguracion.add(getPanelTituloConfiguracion(), BorderLayout.NORTH);
			panelCentralConfiguracion.add(getPanelOpcionesConfiguracion(), BorderLayout.CENTER);
		}
		return panelCentralConfiguracion;
	}
	private JPanel getPanelInferiorConfiguracion() {
		if (panelInferiorConfiguracion == null) {
			panelInferiorConfiguracion = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelInferiorConfiguracion.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			panelInferiorConfiguracion.setAlignmentX(Component.LEFT_ALIGNMENT);
			panelInferiorConfiguracion.add(getBtnAtras());
			panelInferiorConfiguracion.add(getBtnSiguiente());
			panelInferiorConfiguracion.add(getBtnCancelar());
		}
		return panelInferiorConfiguracion;
	}
	private JButton getBtnAyudaConfiguracion() {
		if (btnAyudaConfiguracion == null) {
			btnAyudaConfiguracion = new JButton("?");
		}
		return btnAyudaConfiguracion;
	}
	private JLabel getLblNombreClienteConfiguracion() {
		if (lblNombreClienteConfiguracion == null) {
			lblNombreClienteConfiguracion = new JLabel("");
			lblNombreClienteConfiguracion.setAlignmentX(Component.RIGHT_ALIGNMENT);
		}
		return lblNombreClienteConfiguracion;
	}
	private JButton getBtnAtras() {
		if (btnAtras == null) {
			btnAtras = new JButton("Atras");
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelConfiguracionFiesta.setVisible(false);
					panelInicio.setVisible(true);
				}
			});
		}
		return btnAtras;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
		}
		return btnCancelar;
	}
	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
		}
		return btnSiguiente;
	}
	private JPanel getPanelTituloConfiguracion() {
		if (panelTituloConfiguracion == null) {
			panelTituloConfiguracion = new JPanel();
			panelTituloConfiguracion.add(getLblTituloConfiguracion());
		}
		return panelTituloConfiguracion;
	}
	private JPanel getPanelOpcionesConfiguracion() {
		if (panelOpcionesConfiguracion == null) {
			panelOpcionesConfiguracion = new JPanel();
			panelOpcionesConfiguracion.setLayout(new GridLayout(0, 1, 0, 0));
			panelOpcionesConfiguracion.add(getPanelTipoFiestaConfiguracion());
			panelOpcionesConfiguracion.add(getPanelDescripcionConfiguracion());
			panelOpcionesConfiguracion.add(getPanelAsistentesConfiguracion());
		}
		return panelOpcionesConfiguracion;
	}
	private JPanel getPanelAsistentesConfiguracion() {
		if (panelAsistentesConfiguracion == null) {
			panelAsistentesConfiguracion = new JPanel();
			panelAsistentesConfiguracion.setLayout(new GridLayout(0, 1, 0, 0));
			panelAsistentesConfiguracion.add(getVerticalStrut_8());
			panelAsistentesConfiguracion.add(getPanelAsistentes());
			panelAsistentesConfiguracion.add(getVerticalStrut_9());
		}
		return panelAsistentesConfiguracion;
	}
	private JLabel getLblTituloConfiguracion() {
		if (lblTituloConfiguracion == null) {
			lblTituloConfiguracion = new JLabel("¿Cómo será tu fiesta?");
			lblTituloConfiguracion.setFont(new Font("Dialog", Font.BOLD, 30));
		}
		return lblTituloConfiguracion;
	}
	private JLabel getLblNmeroDeAsistentes() {
		if (lblNmeroDeAsistentes == null) {
			lblNmeroDeAsistentes = new JLabel("N\u00FAmero de asistentes: ");
			lblNmeroDeAsistentes.setLabelFor(getSpinner());
			lblNmeroDeAsistentes.setFont(new Font("Dialog", Font.BOLD, 18));
		}
		return lblNmeroDeAsistentes;
	}
	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setMinimumSize(new Dimension(40, 40));
			spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(0), null, new Integer(1)));
		}
		return spinner;
	}
	private JPanel getPanelTipoFiestaConfiguracion() {
		if (panelTipoFiestaConfiguracion == null) {
			panelTipoFiestaConfiguracion = new JPanel();
			panelTipoFiestaConfiguracion.setLayout(new GridLayout(0, 1, 0, 0));
			panelTipoFiestaConfiguracion.add(getVerticalStrut_11());
			panelTipoFiestaConfiguracion.add(getPanelTipoFiesta());
			panelTipoFiestaConfiguracion.add(getVerticalStrut_12());
		}
		return panelTipoFiestaConfiguracion;
	}
	private JPanel getPanelDescripcionConfiguracion() {
		if (panelDescripcionConfiguracion == null) {
			panelDescripcionConfiguracion = new JPanel();
			panelDescripcionConfiguracion.setLayout(new GridLayout(0, 1, 0, 0));
			panelDescripcionConfiguracion.add(getPanelDescripcion());
		}
		return panelDescripcionConfiguracion;
	}
	private JPanel getPanelAsistentes() {
		if (panelAsistentes == null) {
			panelAsistentes = new JPanel();
			panelAsistentes.setLayout(new GridLayout(0, 2, 0, 0));
			panelAsistentes.add(getLblNmeroDeAsistentes());
			panelAsistentes.add(getSpinner());
		}
		return panelAsistentes;
	}
	private Component getVerticalStrut_8() {
		if (verticalStrut_8 == null) {
			verticalStrut_8 = Box.createVerticalStrut(20);
		}
		return verticalStrut_8;
	}
	private Component getVerticalStrut_9() {
		if (verticalStrut_9 == null) {
			verticalStrut_9 = Box.createVerticalStrut(20);
		}
		return verticalStrut_9;
	}
	private JPanel getPanelDescripcion() {
		if (panelDescripcion == null) {
			panelDescripcion = new JPanel();
			panelDescripcion.setLayout(new GridLayout(0, 2, 0, 0));
			panelDescripcion.add(getLblDescripcin());
			panelDescripcion.add(getScrollPaneDescripcionConfiguración());
		}
		return panelDescripcion;
	}
	private JLabel getLblDescripcin() {
		if (lblDescripcin == null) {
			lblDescripcin = new JLabel("Descripci\u00F3n: ");
			lblDescripcin.setFont(new Font("Dialog", Font.BOLD, 18));
			lblDescripcin.setLabelFor(getTextAreaDescripcionConfiguracion());
		}
		return lblDescripcin;
	}
	private JScrollPane getScrollPaneDescripcionConfiguración() {
		if (scrollPaneDescripcionConfiguración == null) {
			scrollPaneDescripcionConfiguración = new JScrollPane();
			scrollPaneDescripcionConfiguración.setViewportView(getTextAreaDescripcionConfiguracion());
		}
		return scrollPaneDescripcionConfiguración;
	}
	private JTextArea getTextAreaDescripcionConfiguracion() {
		if (textAreaDescripcionConfiguracion == null) {
			textAreaDescripcionConfiguracion = new JTextArea();
			textAreaDescripcionConfiguracion.setLineWrap(true);
			textAreaDescripcionConfiguracion.setWrapStyleWord(true);
		}
		return textAreaDescripcionConfiguracion;
	}
	private JPanel getPanelTipoFiesta() {
		if (panelTipoFiesta == null) {
			panelTipoFiesta = new JPanel();
			panelTipoFiesta.setLayout(new GridLayout(0, 2, 0, 0));
			panelTipoFiesta.add(getLblTipoDeFiesta());
			panelTipoFiesta.add(getTextField());
		}
		return panelTipoFiesta;
	}
	private JLabel getLblTipoDeFiesta() {
		if (lblTipoDeFiesta == null) {
			lblTipoDeFiesta = new JLabel("Tipo de Fiesta: ");
			lblTipoDeFiesta.setFont(new Font("Dialog", Font.BOLD, 18));
		}
		return lblTipoDeFiesta;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Dialog", Font.PLAIN, 18));
			textField.setColumns(10);
		}
		return textField;
	}
	private Component getVerticalStrut_11() {
		if (verticalStrut_11 == null) {
			verticalStrut_11 = Box.createVerticalStrut(20);
		}
		return verticalStrut_11;
	}
	private Component getVerticalStrut_12() {
		if (verticalStrut_12 == null) {
			verticalStrut_12 = Box.createVerticalStrut(20);
		}
		return verticalStrut_12;
	}
}
