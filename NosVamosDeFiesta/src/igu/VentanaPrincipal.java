package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.OrganizacionFiestas;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.JCheckBox;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

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
	private JPanel panelLabelDescripcion;
	private JPanel panelLabelTipoFiesta;
	private JPanel panelLabelAsistentes;
	private Component horizontalStrut;
	private JPanel panelCatalogo;
	private JPanel panelSuperiorCatalogo;
	private JPanel panelInferiorCatalogo;
	private JPanel panelCentralCatalogo;
	private Component horizontalStrut_1;
	private JPanel panelFiltradoCatalogo;
	private JScrollPane scrollPaneArticulosCatalogo;
	private JPanel panelArticulosCatalogo;
	private JButton btnAyudaCatalogo;
	private Component horizontalStrut_2;
	private JLabel lblNombreClienteCatalogo;
	private JButton btnCarrito;
	private JCheckBox chckbxBebida;
	private JCheckBox chckbxComida;
	private JCheckBox chckbxDecoracin;
	private JCheckBox chckbxLocal;
	private JCheckBox chckbxOtros;
	private JButton btnAtrasCatalogo;
	private JButton btnSiguienteCatalogo;
	private JButton btnCancelarCatalogo;
	private JPanel panelContenedorArticulos;
	private Component horizontalStrut_3;
	private Component horizontalStrut_4;
	private JPanel panelFormalizacion;
	private JPanel panelSuperiorFormalizacion;
	private JPanel panelInferiorFormalizacion;
	private JPanel panelCentralFormalizacion;
	private JButton button;
	private Component horizontalStrut_5;
	private Component horizontalStrut_7;
	private JPanel panelDatosFormalizacion;
	private JLabel lblFormalizaTuFiesta;
	private JPanel panelTituloFormalizacion;
	private JButton btnAtrasFormalizacion;
	private JButton btnSiguienteFormalizacion;
	private JButton btnCancelarFormalizacion;
	private JLabel lblNombreClienteFormalizacion;
	private JPanel panelMensaje;
	private JLabel lblMensaje;
	private JPanel panelDatos;
	private JPanel panelDatos1;
	private JPanel panelDatos2;
	private Component horizontalStrut_6;
	private Component horizontalStrut_8;
	private Component horizontalStrut_9;
	private Component horizontalStrut_10;
	private JPanel panelDatosPersonales;
	private JPanel panelDatosFiesta;
	private JPanel panelNombre;
	private JPanel panelApellidos;
	private JPanel panelNif;
	private Component verticalStrut_10;
	private Component verticalStrut_13;
	private JLabel lblNombreFormalizacion;
	private JTextField txtNombreFormalizacion;
	private JLabel lblApellidosFormalizacion;
	private JTextField txtApellidosFormalizacion;
	private JLabel lblNif;
	private JTextField txtNif;
	private Component verticalStrut_14;
	private JPanel panelFecha;
	private JLabel lblFecha;
	private JPanel panelHora;
	private JLabel lblHora;
	private JTextField txtHora;
	private JPanel panelObservaciones;
	private JLabel lblObservaciones;
	private JTextField txtObservaciones;
	private Component verticalStrut_15;
	private JSpinner spinner_1;
	private JPanel panelResumen;
	private JPanel panelSuperiorResumen;
	private JPanel panelInferiorResumen;
	private JPanel panelCentralResumen;
	private JButton button_1;
	private Component horizontalStrut_11;
	private Component horizontalStrut_12;
	private Component horizontalStrut_13;
	private JButton btnAtrasResumen;
	private JButton btnSiguienteResumen;
	private JButton btnCancelarResumen;
	private JPanel panelDatosResumen;
	private JLabel lblResumenDeLa;
	private JPanel panelTituloResumen;
	private JScrollPane scrollPaneResumen;
	private JTextArea textAreaResumen;
	private Component horizontalStrut_14;
	private Component horizontalStrut_15;
	private JPanel panelCompletado;
	private JPanel panelSuperiorCompletado;
	private JPanel panelCentralCompletado;
	private JPanel panelInferiorCompletado;
	private JButton btnNewButton_1;
	private Component horizontalStrut_16;
	private Component horizontalStrut_17;
	private Component horizontalStrut_18;
	private JButton btnFinalizar;
	private JLabel lblTituloCompletado;
	private JPanel panelTituloCompletado;
	private JLabel lblImagenCompletado;
	

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
			panelContenedor.add(getPanelCatalogo(), "name_433690722399634");
			panelContenedor.add(getPanelFormalizacion(), "name_442786314426274");
			panelContenedor.add(getPanelResumen(), "name_445967455209251");
			panelContenedor.add(getPanelCompletado(), "name_446888496605853");
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
			btnComenzar.setMnemonic('C');
			btnComenzar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(false, true, false, false, false, false, false);
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
			btnIdentificate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(identificarCliente())
					cambiarPanel(false, false, true, false, false, false, false);
				}
			});
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
					cambiarPanel(false, false, true, false, false, false, false);
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
					cambiarPanel(true, false, false, false, false, false, false);					
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
			panelNombreRegistro.add(getVerticalStrut_1());
			panelNombreRegistro.add(getPanel_3());
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
			panelNombreIdentificacion.add(getVerticalStrut_5());
			panelNombreIdentificacion.add(getPanel_8());
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
			panelSuperiorConfiguracion.setLayout(new GridLayout(0, 3, 0, 0));
			panelSuperiorConfiguracion.add(getBtnAyudaConfiguracion());
			panelSuperiorConfiguracion.add(getHorizontalStrut_1());
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
			panelCentralConfiguracion.add(getHorizontalStrut(), BorderLayout.EAST);
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
			btnAyudaConfiguracion.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnAyudaConfiguracion.setToolTipText("Ayuda");
		}
		return btnAyudaConfiguracion;
	}
	private JLabel getLblNombreClienteConfiguracion() {
		if (lblNombreClienteConfiguracion == null) {
			lblNombreClienteConfiguracion = new JLabel("Bienvenido");
			lblNombreClienteConfiguracion.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNombreClienteConfiguracion.setAlignmentX(Component.RIGHT_ALIGNMENT);
		}
		return lblNombreClienteConfiguracion;
	}
	private JButton getBtnAtras() {
		if (btnAtras == null) {
			btnAtras = new JButton("Atras");
			btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnAtras.setMnemonic('A');
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(false, true, false, false, false, false, false);
				}
			});
		}
		return btnAtras;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(true, false, false, false, false, false, false);
					inicializar();
				}
			});
			btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnCancelar.setMnemonic('C');
		}
		return btnCancelar;
	}
	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
			btnSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(false, false, false, true, false, false, false);
				}
			});
			btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnSiguiente.setMnemonic('S');
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
			lblNmeroDeAsistentes.setDisplayedMnemonic('N');
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
			panelAsistentes.add(getPanelLabelAsistentes());
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
			panelDescripcion.add(getPanelLabelDescripcion());
			panelDescripcion.add(getScrollPaneDescripcionConfiguración());
		}
		return panelDescripcion;
	}
	private JLabel getLblDescripcin() {
		if (lblDescripcin == null) {
			lblDescripcin = new JLabel("Descripci\u00F3n: ");
			lblDescripcin.setDisplayedMnemonic('D');
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
			panelTipoFiesta.add(getPanelLabelTipoFiesta());
			panelTipoFiesta.add(getTextField());
		}
		return panelTipoFiesta;
	}
	private JLabel getLblTipoDeFiesta() {
		if (lblTipoDeFiesta == null) {
			lblTipoDeFiesta = new JLabel("Tipo de Fiesta: ");
			lblTipoDeFiesta.setDisplayedMnemonic('T');
			lblTipoDeFiesta.setLabelFor(getTextField());
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
	private JPanel getPanelLabelDescripcion() {
		if (panelLabelDescripcion == null) {
			panelLabelDescripcion = new JPanel();
			panelLabelDescripcion.add(getLblDescripcin());
		}
		return panelLabelDescripcion;
	}
	private JPanel getPanelLabelTipoFiesta() {
		if (panelLabelTipoFiesta == null) {
			panelLabelTipoFiesta = new JPanel();
			panelLabelTipoFiesta.add(getLblTipoDeFiesta());
		}
		return panelLabelTipoFiesta;
	}
	private JPanel getPanelLabelAsistentes() {
		if (panelLabelAsistentes == null) {
			panelLabelAsistentes = new JPanel();
			panelLabelAsistentes.add(getLblNmeroDeAsistentes());
		}
		return panelLabelAsistentes;
	}
	private Component getHorizontalStrut() {
		if (horizontalStrut == null) {
			horizontalStrut = Box.createHorizontalStrut(20);
		}
		return horizontalStrut;
	}
	private JPanel getPanelCatalogo() {
		if (panelCatalogo == null) {
			panelCatalogo = new JPanel();
			panelCatalogo.setLayout(new BorderLayout(0, 0));
			panelCatalogo.add(getPanelSuperiorCatalogo(), BorderLayout.NORTH);
			panelCatalogo.add(getPanelCentralCatalogo(), BorderLayout.CENTER);
			panelCatalogo.add(getPanelInferiorCatalogo(), BorderLayout.SOUTH);
		}
		return panelCatalogo;
	}
	private JPanel getPanelSuperiorCatalogo() {
		if (panelSuperiorCatalogo == null) {
			panelSuperiorCatalogo = new JPanel();
			panelSuperiorCatalogo.setLayout(new GridLayout(1, 0, 0, 0));
			panelSuperiorCatalogo.add(getBtnAyudaCatalogo());
			panelSuperiorCatalogo.add(getHorizontalStrut_2());
			panelSuperiorCatalogo.add(getLblNombreClienteCatalogo());
			panelSuperiorCatalogo.add(getBtnCarrito());
		}
		return panelSuperiorCatalogo;
	}
	private JPanel getPanelInferiorCatalogo() {
		if (panelInferiorCatalogo == null) {
			panelInferiorCatalogo = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelInferiorCatalogo.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			panelInferiorCatalogo.add(getBtnAtrasCatalogo());
			panelInferiorCatalogo.add(getBtnSiguienteCatalogo());
			panelInferiorCatalogo.add(getBtnCancelarCatalogo());
		}
		return panelInferiorCatalogo;
	}
	private JPanel getPanelCentralCatalogo() {
		if (panelCentralCatalogo == null) {
			panelCentralCatalogo = new JPanel();
			panelCentralCatalogo.setLayout(new BorderLayout(0, 0));
			panelCentralCatalogo.add(getPanelFiltradoCatalogo(), BorderLayout.NORTH);
			panelCentralCatalogo.add(getPanelContenedorArticulos(), BorderLayout.SOUTH);
		}
		return panelCentralCatalogo;
	}
	private Component getHorizontalStrut_1() {
		if (horizontalStrut_1 == null) {
			horizontalStrut_1 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_1;
	}
	private JPanel getPanelFiltradoCatalogo() {
		if (panelFiltradoCatalogo == null) {
			panelFiltradoCatalogo = new JPanel();
			panelFiltradoCatalogo.add(getChckbxBebida());
			panelFiltradoCatalogo.add(getChckbxComida());
			panelFiltradoCatalogo.add(getChckbxDecoracin());
			panelFiltradoCatalogo.add(getChckbxLocal());
			panelFiltradoCatalogo.add(getChckbxOtros());
		}
		return panelFiltradoCatalogo;
	}
	private JScrollPane getScrollPaneArticulosCatalogo() {
		if (scrollPaneArticulosCatalogo == null) {
			scrollPaneArticulosCatalogo = new JScrollPane();
			scrollPaneArticulosCatalogo.setViewportView(getPanelArticulosCatalogo());
		}
		return scrollPaneArticulosCatalogo;
	}
	private JPanel getPanelArticulosCatalogo() {
		if (panelArticulosCatalogo == null) {
			panelArticulosCatalogo = new JPanel();
			panelArticulosCatalogo.setLayout(new GridLayout(0, 2, 0, 0));
		}
		return panelArticulosCatalogo;
	}
	private JButton getBtnAyudaCatalogo() {
		if (btnAyudaCatalogo == null) {
			btnAyudaCatalogo = new JButton("?");
			btnAyudaCatalogo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnAyudaCatalogo.setToolTipText("Ayuda");
		}
		return btnAyudaCatalogo;
	}
	private Component getHorizontalStrut_2() {
		if (horizontalStrut_2 == null) {
			horizontalStrut_2 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_2;
	}
	private JLabel getLblNombreClienteCatalogo() {
		if (lblNombreClienteCatalogo == null) {
			lblNombreClienteCatalogo = new JLabel("");
			lblNombreClienteCatalogo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNombreClienteCatalogo.setInheritsPopupMenu(false);
		}
		return lblNombreClienteCatalogo;
	}
	private JButton getBtnCarrito() {
		if (btnCarrito == null) {
			btnCarrito = new JButton("Carrito");
			btnCarrito.setMnemonic('R');
			btnCarrito.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return btnCarrito;
	}
	private JCheckBox getChckbxBebida() {
		if (chckbxBebida == null) {
			chckbxBebida = new JCheckBox("Bebida");
			chckbxBebida.setMnemonic('B');
			chckbxBebida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return chckbxBebida;
	}
	private JCheckBox getChckbxComida() {
		if (chckbxComida == null) {
			chckbxComida = new JCheckBox("Comida");
			chckbxComida.setMnemonic('M');
			chckbxComida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return chckbxComida;
	}
	private JCheckBox getChckbxDecoracin() {
		if (chckbxDecoracin == null) {
			chckbxDecoracin = new JCheckBox("Decoraci\u00F3n");
			chckbxDecoracin.setMnemonic('D');
			chckbxDecoracin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return chckbxDecoracin;
	}
	private JCheckBox getChckbxLocal() {
		if (chckbxLocal == null) {
			chckbxLocal = new JCheckBox("Local");
			chckbxLocal.setMnemonic('L');
			chckbxLocal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return chckbxLocal;
	}
	private JCheckBox getChckbxOtros() {
		if (chckbxOtros == null) {
			chckbxOtros = new JCheckBox("Otros");
			chckbxOtros.setMnemonic('T');
			chckbxOtros.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return chckbxOtros;
	}
	private JButton getBtnAtrasCatalogo() {
		if (btnAtrasCatalogo == null) {
			btnAtrasCatalogo = new JButton("Atras");
			btnAtrasCatalogo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(false, false, true, false, false, false, false);
				}
			});
			btnAtrasCatalogo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnAtrasCatalogo.setMnemonic('A');
		}
		return btnAtrasCatalogo;
	}
	private JButton getBtnSiguienteCatalogo() {
		if (btnSiguienteCatalogo == null) {
			btnSiguienteCatalogo = new JButton("Siguiente");
			btnSiguienteCatalogo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(false, false, false, false, true, false, false);
				}
			});
			btnSiguienteCatalogo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnSiguienteCatalogo.setMnemonic('S');
		}
		return btnSiguienteCatalogo;
	}
	private JButton getBtnCancelarCatalogo() {
		if (btnCancelarCatalogo == null) {
			btnCancelarCatalogo = new JButton("Cancelar");
			btnCancelarCatalogo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnCancelarCatalogo.setMnemonic('C');
		}
		return btnCancelarCatalogo;
	}
	private JPanel getPanelContenedorArticulos() {
		if (panelContenedorArticulos == null) {
			panelContenedorArticulos = new JPanel();
			panelContenedorArticulos.setLayout(new BorderLayout(0, 0));
			panelContenedorArticulos.add(getHorizontalStrut_4(), BorderLayout.WEST);
			panelContenedorArticulos.add(getScrollPaneArticulosCatalogo(), BorderLayout.NORTH);
			panelContenedorArticulos.add(getHorizontalStrut_3(), BorderLayout.SOUTH);
		}
		return panelContenedorArticulos;
	}
	private Component getHorizontalStrut_3() {
		if (horizontalStrut_3 == null) {
			horizontalStrut_3 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_3;
	}
	private Component getHorizontalStrut_4() {
		if (horizontalStrut_4 == null) {
			horizontalStrut_4 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_4;
	}
	private JPanel getPanelFormalizacion() {
		if (panelFormalizacion == null) {
			panelFormalizacion = new JPanel();
			panelFormalizacion.setLayout(new BorderLayout(0, 0));
			panelFormalizacion.add(getPanelSuperiorFormalizacion(), BorderLayout.NORTH);
			panelFormalizacion.add(getPanelCentralFormalizacion(), BorderLayout.CENTER);
			panelFormalizacion.add(getPanelInferiorFormalizacion(), BorderLayout.SOUTH);
		}
		return panelFormalizacion;
	}
	private JPanel getPanelSuperiorFormalizacion() {
		if (panelSuperiorFormalizacion == null) {
			panelSuperiorFormalizacion = new JPanel();
			panelSuperiorFormalizacion.setLayout(new GridLayout(1, 0, 0, 0));
			panelSuperiorFormalizacion.add(getButton());
			panelSuperiorFormalizacion.add(getHorizontalStrut_5());
			panelSuperiorFormalizacion.add(getLblNombreClienteFormalizacion());
			panelSuperiorFormalizacion.add(getHorizontalStrut_7());
		}
		return panelSuperiorFormalizacion;
	}
	private JPanel getPanelInferiorFormalizacion() {
		if (panelInferiorFormalizacion == null) {
			panelInferiorFormalizacion = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelInferiorFormalizacion.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			panelInferiorFormalizacion.add(getBtnAtrasFormalizacion());
			panelInferiorFormalizacion.add(getBtnSiguienteFormalizacion());
			panelInferiorFormalizacion.add(getBtnCancelarFormalizacion());
		}
		return panelInferiorFormalizacion;
	}
	private JPanel getPanelCentralFormalizacion() {
		if (panelCentralFormalizacion == null) {
			panelCentralFormalizacion = new JPanel();
			panelCentralFormalizacion.setLayout(new BorderLayout(0, 0));
			panelCentralFormalizacion.add(getPanelTituloFormalizacion(), BorderLayout.NORTH);
			panelCentralFormalizacion.add(getPanelDatosFormalizacion());
		}
		return panelCentralFormalizacion;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("?");
			button.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button.setToolTipText("Ayuda");
		}
		return button;
	}
	private Component getHorizontalStrut_5() {
		if (horizontalStrut_5 == null) {
			horizontalStrut_5 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_5;
	}
	private Component getHorizontalStrut_7() {
		if (horizontalStrut_7 == null) {
			horizontalStrut_7 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_7;
	}
	private JPanel getPanelDatosFormalizacion() {
		if (panelDatosFormalizacion == null) {
			panelDatosFormalizacion = new JPanel();
			panelDatosFormalizacion.setLayout(new BorderLayout(0, 0));
			panelDatosFormalizacion.add(getPanelMensaje(), BorderLayout.NORTH);
			panelDatosFormalizacion.add(getPanelDatos(), BorderLayout.CENTER);
		}
		return panelDatosFormalizacion;
	}
	private JLabel getLblFormalizaTuFiesta() {
		if (lblFormalizaTuFiesta == null) {
			lblFormalizaTuFiesta = new JLabel("Formaliza tu Fiesta");
			lblFormalizaTuFiesta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblFormalizaTuFiesta;
	}
	private JPanel getPanelTituloFormalizacion() {
		if (panelTituloFormalizacion == null) {
			panelTituloFormalizacion = new JPanel();
			panelTituloFormalizacion.add(getLblFormalizaTuFiesta());
		}
		return panelTituloFormalizacion;
	}
	private JButton getBtnAtrasFormalizacion() {
		if (btnAtrasFormalizacion == null) {
			btnAtrasFormalizacion = new JButton("Atras");
			btnAtrasFormalizacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(false, false, false, true, false, false, false);
				}
			});
			btnAtrasFormalizacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnAtrasFormalizacion.setMnemonic('A');
		}
		return btnAtrasFormalizacion;
	}
	private JButton getBtnSiguienteFormalizacion() {
		if (btnSiguienteFormalizacion == null) {
			btnSiguienteFormalizacion = new JButton("Siguiente");
			btnSiguienteFormalizacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(false, false, false, false, false, true, false);
				}
			});
			btnSiguienteFormalizacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnSiguienteFormalizacion.setMnemonic('S');
		}
		return btnSiguienteFormalizacion;
	}
	private JButton getBtnCancelarFormalizacion() {
		if (btnCancelarFormalizacion == null) {
			btnCancelarFormalizacion = new JButton("Cancelar");
			btnCancelarFormalizacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnCancelarFormalizacion.setMnemonic('C');
		}
		return btnCancelarFormalizacion;
	}
	private JLabel getLblNombreClienteFormalizacion() {
		if (lblNombreClienteFormalizacion == null) {
			lblNombreClienteFormalizacion = new JLabel("");
		}
		return lblNombreClienteFormalizacion;
	}
	private JPanel getPanelMensaje() {
		if (panelMensaje == null) {
			panelMensaje = new JPanel();
			panelMensaje.add(getLblMensaje());
		}
		return panelMensaje;
	}
	private JLabel getLblMensaje() {
		if (lblMensaje == null) {
			lblMensaje = new JLabel("\u00A1Ya falta poco! Para formalizar tu fiesta rellena los siguientes datos");
			lblMensaje.setFont(new Font("Dialog", Font.PLAIN, 18));
		}
		return lblMensaje;
	}
	private JPanel getPanelDatos() {
		if (panelDatos == null) {
			panelDatos = new JPanel();
			panelDatos.setLayout(new GridLayout(0, 2, 0, 0));
			panelDatos.add(getPanelDatos1());
			panelDatos.add(getPanelDatos2());
		}
		return panelDatos;
	}
	private JPanel getPanelDatos1() {
		if (panelDatos1 == null) {
			panelDatos1 = new JPanel();
			panelDatos1.setLayout(new BorderLayout(0, 0));
			panelDatos1.add(getHorizontalStrut_6_1(), BorderLayout.WEST);
			panelDatos1.add(getHorizontalStrut_8(), BorderLayout.EAST);
			panelDatos1.add(getPanelDatosPersonales(), BorderLayout.CENTER);
		}
		return panelDatos1;
	}
	private JPanel getPanelDatos2() {
		if (panelDatos2 == null) {
			panelDatos2 = new JPanel();
			panelDatos2.setLayout(new BorderLayout(0, 0));
			panelDatos2.add(getHorizontalStrut_9(), BorderLayout.WEST);
			panelDatos2.add(getHorizontalStrut_10(), BorderLayout.EAST);
			panelDatos2.add(getPanelDatosFiesta(), BorderLayout.CENTER);
		}
		return panelDatos2;
	}
	private Component getHorizontalStrut_6_1() {
		if (horizontalStrut_6 == null) {
			horizontalStrut_6 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_6;
	}
	private Component getHorizontalStrut_8() {
		if (horizontalStrut_8 == null) {
			horizontalStrut_8 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_8;
	}
	private Component getHorizontalStrut_9() {
		if (horizontalStrut_9 == null) {
			horizontalStrut_9 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_9;
	}
	private Component getHorizontalStrut_10() {
		if (horizontalStrut_10 == null) {
			horizontalStrut_10 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_10;
	}
	private JPanel getPanelDatosPersonales() {
		if (panelDatosPersonales == null) {
			panelDatosPersonales = new JPanel();
			panelDatosPersonales.setLayout(new GridLayout(0, 1, 0, 5));
			panelDatosPersonales.add(getVerticalStrut_10());
			panelDatosPersonales.add(getPanelNombre());
			panelDatosPersonales.add(getPanelApellidos());
			panelDatosPersonales.add(getPanelNif());
			panelDatosPersonales.add(getVerticalStrut_13());
		}
		return panelDatosPersonales;
	}
	private JPanel getPanelDatosFiesta() {
		if (panelDatosFiesta == null) {
			panelDatosFiesta = new JPanel();
			panelDatosFiesta.setLayout(new GridLayout(0, 1, 0, 0));
			panelDatosFiesta.add(getVerticalStrut_14());
			panelDatosFiesta.add(getPanelFecha());
			panelDatosFiesta.add(getPanelHora());
			panelDatosFiesta.add(getPanelObservaciones());
			panelDatosFiesta.add(getVerticalStrut_15());
		}
		return panelDatosFiesta;
	}
	private JPanel getPanelNombre() {
		if (panelNombre == null) {
			panelNombre = new JPanel();
			panelNombre.setLayout(new GridLayout(0, 2, 0, 0));
			panelNombre.add(getLblNombreFormalizacion());
			panelNombre.add(getTxtNombreFormalizacion());
		}
		return panelNombre;
	}
	private JPanel getPanelApellidos() {
		if (panelApellidos == null) {
			panelApellidos = new JPanel();
			panelApellidos.setLayout(new GridLayout(0, 2, 0, 0));
			panelApellidos.add(getLblApellidosFormalizacion());
			panelApellidos.add(getTxtApellidosFormalizacion());
		}
		return panelApellidos;
	}
	private JPanel getPanelNif() {
		if (panelNif == null) {
			panelNif = new JPanel();
			panelNif.setLayout(new GridLayout(0, 2, 0, 0));
			panelNif.add(getLblNif());
			panelNif.add(getTxtNif());
		}
		return panelNif;
	}
	private Component getVerticalStrut_10() {
		if (verticalStrut_10 == null) {
			verticalStrut_10 = Box.createVerticalStrut(20);
		}
		return verticalStrut_10;
	}
	private Component getVerticalStrut_13() {
		if (verticalStrut_13 == null) {
			verticalStrut_13 = Box.createVerticalStrut(20);
		}
		return verticalStrut_13;
	}
	private JLabel getLblNombreFormalizacion() {
		if (lblNombreFormalizacion == null) {
			lblNombreFormalizacion = new JLabel("Nombre: ");
			lblNombreFormalizacion.setFont(new Font("Dialog", Font.PLAIN, 18));
			lblNombreFormalizacion.setDisplayedMnemonic('N');
			lblNombreFormalizacion.setLabelFor(getTxtNombreFormalizacion());
		}
		return lblNombreFormalizacion;
	}
	private JTextField getTxtNombreFormalizacion() {
		if (txtNombreFormalizacion == null) {
			txtNombreFormalizacion = new JTextField();
			txtNombreFormalizacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
			txtNombreFormalizacion.setColumns(10);
		}
		return txtNombreFormalizacion;
	}
	private JLabel getLblApellidosFormalizacion() {
		if (lblApellidosFormalizacion == null) {
			lblApellidosFormalizacion = new JLabel("Apellidos:");
			lblApellidosFormalizacion.setDisplayedMnemonic('P');
			lblApellidosFormalizacion.setLabelFor(getTxtApellidosFormalizacion());
			lblApellidosFormalizacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return lblApellidosFormalizacion;
	}
	private JTextField getTxtApellidosFormalizacion() {
		if (txtApellidosFormalizacion == null) {
			txtApellidosFormalizacion = new JTextField();
			txtApellidosFormalizacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
			txtApellidosFormalizacion.setColumns(10);
		}
		return txtApellidosFormalizacion;
	}
	private JLabel getLblNif() {
		if (lblNif == null) {
			lblNif = new JLabel("NIF: ");
			lblNif.setDisplayedMnemonic('F');
			lblNif.setLabelFor(getTxtNif());
			lblNif.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return lblNif;
	}
	private JTextField getTxtNif() {
		if (txtNif == null) {
			txtNif = new JTextField();
			txtNif.setFont(new Font("Tahoma", Font.PLAIN, 18));
			txtNif.setColumns(10);
		}
		return txtNif;
	}
	private Component getVerticalStrut_14() {
		if (verticalStrut_14 == null) {
			verticalStrut_14 = Box.createVerticalStrut(20);
		}
		return verticalStrut_14;
	}
	private JPanel getPanelFecha() {
		if (panelFecha == null) {
			panelFecha = new JPanel();
			panelFecha.setLayout(new GridLayout(0, 2, 0, 0));
			panelFecha.add(getLblFecha());
			panelFecha.add(getSpinner_1());
		}
		return panelFecha;
	}
	private JLabel getLblFecha() {
		if (lblFecha == null) {
			lblFecha = new JLabel("Fecha: ");
			lblFecha.setLabelFor(getSpinner_1());
			lblFecha.setFont(new Font("Dialog", Font.PLAIN, 18));
			lblFecha.setDisplayedMnemonic('E');
		}
		return lblFecha;
	}
	private JPanel getPanelHora() {
		if (panelHora == null) {
			panelHora = new JPanel();
			panelHora.setLayout(new GridLayout(0, 2, 0, 0));
			panelHora.add(getLblHora());
			panelHora.add(getTxtHora());
		}
		return panelHora;
	}
	private JLabel getLblHora() {
		if (lblHora == null) {
			lblHora = new JLabel("Hora:");
			lblHora.setLabelFor(getTxtHora());
			lblHora.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblHora.setDisplayedMnemonic('H');
		}
		return lblHora;
	}
	private JTextField getTxtHora() {
		if (txtHora == null) {
			txtHora = new JTextField();
			txtHora.setFont(new Font("Tahoma", Font.PLAIN, 18));
			txtHora.setColumns(10);
		}
		return txtHora;
	}
	private JPanel getPanelObservaciones() {
		if (panelObservaciones == null) {
			panelObservaciones = new JPanel();
			panelObservaciones.setLayout(new GridLayout(0, 2, 0, 0));
			panelObservaciones.add(getLblObservaciones());
			panelObservaciones.add(getTxtObservaciones());
		}
		return panelObservaciones;
	}
	private JLabel getLblObservaciones() {
		if (lblObservaciones == null) {
			lblObservaciones = new JLabel("Observaciones: ");
			lblObservaciones.setLabelFor(getTxtObservaciones());
			lblObservaciones.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblObservaciones.setDisplayedMnemonic('B');
		}
		return lblObservaciones;
	}
	private JTextField getTxtObservaciones() {
		if (txtObservaciones == null) {
			txtObservaciones = new JTextField();
			txtObservaciones.setFont(new Font("Tahoma", Font.PLAIN, 18));
			txtObservaciones.setColumns(10);
		}
		return txtObservaciones;
	}
	private Component getVerticalStrut_15() {
		if (verticalStrut_15 == null) {
			verticalStrut_15 = Box.createVerticalStrut(20);
		}
		return verticalStrut_15;
	}
	private JSpinner getSpinner_1() {
		if (spinner_1 == null) {
			spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerDateModel(new Date(1546988400000L), new Date(1546297200000L), null, Calendar.DAY_OF_YEAR));
		}
		return spinner_1;
	}
	private JPanel getPanelResumen() {
		if (panelResumen == null) {
			panelResumen = new JPanel();
			panelResumen.setLayout(new BorderLayout(0, 0));
			panelResumen.add(getPanelSuperiorResumen(), BorderLayout.NORTH);
			panelResumen.add(getPanelCentralResumen(), BorderLayout.CENTER);
			panelResumen.add(getPanelInferiorResumen(), BorderLayout.SOUTH);
		}
		return panelResumen;
	}
	private JPanel getPanelSuperiorResumen() {
		if (panelSuperiorResumen == null) {
			panelSuperiorResumen = new JPanel();
			panelSuperiorResumen.setLayout(new GridLayout(1, 0, 0, 0));
			panelSuperiorResumen.add(getButton_1());
			panelSuperiorResumen.add(getHorizontalStrut_11());
			panelSuperiorResumen.add(getHorizontalStrut_12());
			panelSuperiorResumen.add(getHorizontalStrut_13());
		}
		return panelSuperiorResumen;
	}
	private JPanel getPanelInferiorResumen() {
		if (panelInferiorResumen == null) {
			panelInferiorResumen = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelInferiorResumen.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			panelInferiorResumen.add(getBtnAtrasResumen());
			panelInferiorResumen.add(getBtnSiguienteResumen());
			panelInferiorResumen.add(getBtnCancelarResumen());
		}
		return panelInferiorResumen;
	}
	private JPanel getPanelCentralResumen() {
		if (panelCentralResumen == null) {
			panelCentralResumen = new JPanel();
			panelCentralResumen.setLayout(new BorderLayout(0, 0));
			panelCentralResumen.add(getPanelDatosResumen(), BorderLayout.CENTER);
		}
		return panelCentralResumen;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("?");
			button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return button_1;
	}
	private Component getHorizontalStrut_11() {
		if (horizontalStrut_11 == null) {
			horizontalStrut_11 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_11;
	}
	private Component getHorizontalStrut_12() {
		if (horizontalStrut_12 == null) {
			horizontalStrut_12 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_12;
	}
	private Component getHorizontalStrut_13() {
		if (horizontalStrut_13 == null) {
			horizontalStrut_13 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_13;
	}
	private JButton getBtnAtrasResumen() {
		if (btnAtrasResumen == null) {
			btnAtrasResumen = new JButton("Atras");
			btnAtrasResumen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(false, false, false, false, true, false, false);
				}
			});
			btnAtrasResumen.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnAtrasResumen.setMnemonic('A');
		}
		return btnAtrasResumen;
	}
	private JButton getBtnSiguienteResumen() {
		if (btnSiguienteResumen == null) {
			btnSiguienteResumen = new JButton("Siguiente");
			btnSiguienteResumen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(false, false, false, false, false, false, true);
				}
			});
			btnSiguienteResumen.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnSiguienteResumen.setMnemonic('S');
		}
		return btnSiguienteResumen;
	}
	private JButton getBtnCancelarResumen() {
		if (btnCancelarResumen == null) {
			btnCancelarResumen = new JButton("Cancelar");
			btnCancelarResumen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return btnCancelarResumen;
	}
	private JPanel getPanelDatosResumen() {
		if (panelDatosResumen == null) {
			panelDatosResumen = new JPanel();
			panelDatosResumen.setLayout(new BorderLayout(0, 0));
			panelDatosResumen.add(getHorizontalStrut_15(), BorderLayout.WEST);
			panelDatosResumen.add(getPanelTituloResumen(), BorderLayout.NORTH);
			panelDatosResumen.add(getScrollPaneResumen(), BorderLayout.CENTER);
			panelDatosResumen.add(getHorizontalStrut_14(), BorderLayout.EAST);
		}
		return panelDatosResumen;
	}
	private JLabel getLblResumenDeLa() {
		if (lblResumenDeLa == null) {
			lblResumenDeLa = new JLabel("Resumen de la compra");
			lblResumenDeLa.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblResumenDeLa;
	}
	private JPanel getPanelTituloResumen() {
		if (panelTituloResumen == null) {
			panelTituloResumen = new JPanel();
			panelTituloResumen.add(getLblResumenDeLa());
		}
		return panelTituloResumen;
	}
	private JScrollPane getScrollPaneResumen() {
		if (scrollPaneResumen == null) {
			scrollPaneResumen = new JScrollPane();
			scrollPaneResumen.setViewportView(getTextAreaResumen());
		}
		return scrollPaneResumen;
	}
	private JTextArea getTextAreaResumen() {
		if (textAreaResumen == null) {
			textAreaResumen = new JTextArea();
			textAreaResumen.setLineWrap(true);
			textAreaResumen.setWrapStyleWord(true);
			textAreaResumen.setEditable(false);
		}
		return textAreaResumen;
	}
	private Component getHorizontalStrut_14() {
		if (horizontalStrut_14 == null) {
			horizontalStrut_14 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_14;
	}
	private Component getHorizontalStrut_15() {
		if (horizontalStrut_15 == null) {
			horizontalStrut_15 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_15;
	}
	private JPanel getPanelCompletado() {
		if (panelCompletado == null) {
			panelCompletado = new JPanel();
			panelCompletado.setBackground(new Color(147, 112, 219));
			panelCompletado.setLayout(new BorderLayout(0, 0));
			panelCompletado.add(getPanelSuperiorCompletado(), BorderLayout.NORTH);
			panelCompletado.add(getPanelCentralCompletado(), BorderLayout.CENTER);
			panelCompletado.add(getPanelInferiorCompletado(), BorderLayout.SOUTH);
		}
		return panelCompletado;
	}
	private JPanel getPanelSuperiorCompletado() {
		if (panelSuperiorCompletado == null) {
			panelSuperiorCompletado = new JPanel();
			panelSuperiorCompletado.setBackground(new Color(147, 112, 219));
			panelSuperiorCompletado.setLayout(new GridLayout(1, 0, 0, 0));
			panelSuperiorCompletado.add(getBtnNewButton_1());
			panelSuperiorCompletado.add(getHorizontalStrut_16());
			panelSuperiorCompletado.add(getHorizontalStrut_17());
			panelSuperiorCompletado.add(getHorizontalStrut_18());
		}
		return panelSuperiorCompletado;
	}
	private JPanel getPanelCentralCompletado() {
		if (panelCentralCompletado == null) {
			panelCentralCompletado = new JPanel();
			panelCentralCompletado.setBackground(new Color(147, 112, 219));
			panelCentralCompletado.setLayout(new BorderLayout(0, 0));
			panelCentralCompletado.add(getPanelTituloCompletado(), BorderLayout.NORTH);
			panelCentralCompletado.add(getLblImagenCompletado(), BorderLayout.CENTER);
		}
		return panelCentralCompletado;
	}
	private JPanel getPanelInferiorCompletado() {
		if (panelInferiorCompletado == null) {
			panelInferiorCompletado = new JPanel();
			panelInferiorCompletado.setBackground(new Color(147, 112, 219));
			FlowLayout flowLayout = (FlowLayout) panelInferiorCompletado.getLayout();
			panelInferiorCompletado.add(getBtnFinalizar());
		}
		return panelInferiorCompletado;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("?");
			btnNewButton_1.setBackground(new Color(255, 204, 51));
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return btnNewButton_1;
	}
	private Component getHorizontalStrut_16() {
		if (horizontalStrut_16 == null) {
			horizontalStrut_16 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_16;
	}
	private Component getHorizontalStrut_17() {
		if (horizontalStrut_17 == null) {
			horizontalStrut_17 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_17;
	}
	private Component getHorizontalStrut_18() {
		if (horizontalStrut_18 == null) {
			horizontalStrut_18 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_18;
	}
	private JButton getBtnFinalizar() {
		if (btnFinalizar == null) {
			btnFinalizar = new JButton("Finalizar");
			btnFinalizar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarPanel(true, false, false, false, false, false, false);
				}
			});
			btnFinalizar.setBackground(new Color(255, 204, 51));
			btnFinalizar.setFont(new Font("Curlz MT", Font.PLAIN, 30));
		}
		return btnFinalizar;
	}
	private JLabel getLblTituloCompletado() {
		if (lblTituloCompletado == null) {
			lblTituloCompletado = new JLabel("\u00A1Genial!");
			lblTituloCompletado.setFont(new Font("Curlz MT", Font.PLAIN, 40));
		}
		return lblTituloCompletado;
	}
	private JPanel getPanelTituloCompletado() {
		if (panelTituloCompletado == null) {
			panelTituloCompletado = new JPanel();
			panelTituloCompletado.setBackground(new Color(147, 112, 219));
			panelTituloCompletado.setForeground(Color.BLACK);
			panelTituloCompletado.add(getLblTituloCompletado());
		}
		return panelTituloCompletado;
	}
	private JLabel getLblImagenCompletado() {
		if (lblImagenCompletado == null) {
			lblImagenCompletado = new JLabel("");
			lblImagenCompletado.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/fiestaCompleta.jpg")));
		}
		return lblImagenCompletado;
	}
	
	private void cambiarPanel(boolean bienvenida, boolean inicio, boolean configuracion, boolean catalogo, boolean formalizacion, boolean resumen, boolean completado){
		panelBienvenida.setVisible(bienvenida);
		panelInicio.setVisible(inicio);
		panelConfiguracionFiesta.setVisible(configuracion);
		panelCatalogo.setVisible(catalogo);
		panelFormalizacion.setVisible(formalizacion);
		panelResumen.setVisible(resumen);
		panelCompletado.setVisible(completado);		
	}
	
	private void inicializar(){
		//Aquí inicializamos
	}
	
	private boolean identificarCliente(){
		if(!organizacionFiestas.identificar(
				txtNombreIdentificacion.getText(), 
				String.valueOf(pwIdentificacion.getPassword()))){
			JOptionPane.showMessageDialog(this, "El usuario no existe o no es correcto.");
			return false;
		}
		return true;
	}
}
