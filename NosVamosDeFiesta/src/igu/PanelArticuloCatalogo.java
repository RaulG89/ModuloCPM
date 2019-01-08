package igu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;

import logica.Articulo;
import logica.tipos.TipoArticulo;

import java.awt.Font;

public class PanelArticuloCatalogo extends JPanel {
	private VentanaPrincipal vp;
	private Articulo articulo;
	private JLabel lblImagen;
	private JPanel panelDatosArticulo;
	private JPanel panelDescripcion;
	private JPanel panelAñadir;
	private JLabel lblDenominacion;
	private JTextField txtDenominacion;
	private JLabel lblPrecioUnitario;
	private JTextField txtPrecioUnitario;
	private JLabel lblPrecioGrupo;
	private JTextField txtPrecioGrupo;
	private JLabel lblTipo;
	private JTextField txtTipoArticulo;
	private JScrollPane scrollPane;
	private JTextArea textAreaDescripcion;
	private JLabel lblUnidades;
	private JButton btnAadir;
	private JSpinner spinner;
	private JPanel panelDenominacion;
	private JPanel panelPrecioUnitario;
	private JPanel panelPrecioGrupo;
	private JPanel panelTipo;
	private JPanel panelDatos;
	private Component horizontalStrut;
	private Component horizontalStrut_1;
	private JPanel panelUnidades;
	private JPanel panelSelector;
	private Component horizontalStrut_2;
	private Component horizontalStrut_3;

	/**
	 * Create the panel.
	 */
	public PanelArticuloCatalogo() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(new Rectangle(0, 0, 300, 215));
		setLayout(new GridLayout(2, 2, 0, 0));
		add(getLblImagen());
		add(getPanelDatosArticulo());
		add(getPanelDescripcion());
		add(getPanelAñadir());
		setPreferredSize(new Dimension(300,215));

	}

	public PanelArticuloCatalogo(VentanaPrincipal ventanaPrincipal, Articulo articulo) {
		this();
		this.articulo = articulo;
		this.vp = ventanaPrincipal;
		inicializarPanelArticulo();
	}

	private void inicializarPanelArticulo() {
		txtDenominacion.setText(articulo.getDenominacion());
		txtPrecioGrupo.setText(String.valueOf(articulo.getPrecioGrupo()));
		txtPrecioUnitario.setText(String.valueOf(articulo.getPrecioUnidad()));
		txtTipoArticulo.setText(articulo.getTipo().name());
		textAreaDescripcion.setText(articulo.getDescripcion());
		adaptarImagenLabel(lblImagen, articulo.getFoto());
		if(!articulo.isGrupo()) {
			lblUnidades.setEnabled(true);
			spinner.setEnabled(true);
		}
	}

	private JLabel getLblImagen() {
		if (lblImagen == null) {
			lblImagen = new JLabel("");
			lblImagen.setBounds(new Rectangle(0, 0, 150, 107));
		}
		return lblImagen;
	}
	private JPanel getPanelDatosArticulo() {
		if (panelDatosArticulo == null) {
			panelDatosArticulo = new JPanel();
			panelDatosArticulo.setLayout(new BorderLayout(0, 0));
			panelDatosArticulo.add(getHorizontalStrut(), BorderLayout.EAST);
			panelDatosArticulo.add(getPanelDatos());
			panelDatosArticulo.add(getHorizontalStrut_1(), BorderLayout.WEST);
		}
		return panelDatosArticulo;
	}
	private JPanel getPanelDescripcion() {
		if (panelDescripcion == null) {
			panelDescripcion = new JPanel();
			panelDescripcion.setLayout(new BorderLayout(0, 0));
			panelDescripcion.add(getScrollPane(), BorderLayout.CENTER);
		}
		return panelDescripcion;
	}
	private JPanel getPanelAñadir() {
		if (panelAñadir == null) {
			panelAñadir = new JPanel();
			panelAñadir.setLayout(new BorderLayout(0, 0));
			panelAñadir.add(getHorizontalStrut_2(), BorderLayout.WEST);
			panelAñadir.add(getPanelSelector(), BorderLayout.NORTH);
			panelAñadir.add(getPanelUnidades(), BorderLayout.CENTER);
			panelAñadir.add(getHorizontalStrut_3(), BorderLayout.EAST);
			panelAñadir.add(getBtnAadir(), BorderLayout.SOUTH);
		}
		return panelAñadir;
	}
	private JLabel getLblDenominacion() {
		if (lblDenominacion == null) {
			lblDenominacion = new JLabel("Denominacion: ");
			lblDenominacion.setFont(new Font("Dialog", Font.BOLD, 10));
		}
		return lblDenominacion;
	}
	private JTextField getTxtDenominacion() {
		if (txtDenominacion == null) {
			txtDenominacion = new JTextField();
			txtDenominacion.setFont(new Font("Dialog", Font.PLAIN, 10));
			txtDenominacion.setEditable(false);
			txtDenominacion.setColumns(10);
		}
		return txtDenominacion;
	}
	private JLabel getLblPrecioUnitario() {
		if (lblPrecioUnitario == null) {
			lblPrecioUnitario = new JLabel("Precio unitario: ");
			lblPrecioUnitario.setFont(new Font("Dialog", Font.BOLD, 10));
		}
		return lblPrecioUnitario;
	}
	private JTextField getTxtPrecioUnitario() {
		if (txtPrecioUnitario == null) {
			txtPrecioUnitario = new JTextField();
			txtPrecioUnitario.setEditable(false);
			txtPrecioUnitario.setColumns(10);
		}
		return txtPrecioUnitario;
	}
	private JLabel getLblPrecioGrupo() {
		if (lblPrecioGrupo == null) {
			lblPrecioGrupo = new JLabel("Precio grupo: ");
			lblPrecioGrupo.setFont(new Font("Dialog", Font.BOLD, 10));
		}
		return lblPrecioGrupo;
	}
	private JTextField getTxtPrecioGrupo() {
		if (txtPrecioGrupo == null) {
			txtPrecioGrupo = new JTextField();
			txtPrecioGrupo.setEditable(false);
			txtPrecioGrupo.setColumns(10);
		}
		return txtPrecioGrupo;
	}
	private JLabel getLblTipo() {
		if (lblTipo == null) {
			lblTipo = new JLabel("Tipo: ");
			lblTipo.setFont(new Font("Dialog", Font.BOLD, 10));
		}
		return lblTipo;
	}
	private JTextField getTxtTipoArticulo() {
		if (txtTipoArticulo == null) {
			txtTipoArticulo = new JTextField();
			txtTipoArticulo.setFont(new Font("Dialog", Font.PLAIN, 10));
			txtTipoArticulo.setEditable(false);
			txtTipoArticulo.setColumns(10);
		}
		return txtTipoArticulo;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextAreaDescripcion());
		}
		return scrollPane;
	}
	private JTextArea getTextAreaDescripcion() {
		if (textAreaDescripcion == null) {
			textAreaDescripcion = new JTextArea();
			textAreaDescripcion.setEditable(false);
			textAreaDescripcion.setLineWrap(true);
			textAreaDescripcion.setWrapStyleWord(true);
		}
		return textAreaDescripcion;
	}
	private JLabel getLblUnidades() {
		if (lblUnidades == null) {
			lblUnidades = new JLabel("Unidades: ");
			lblUnidades.setFont(new Font("Dialog", Font.BOLD, 10));
			lblUnidades.setDisplayedMnemonic('U');
			lblUnidades.setEnabled(false);
			lblUnidades.setLabelFor(getSpinner());
		}
		return lblUnidades;
	}
	private JButton getBtnAadir() {
		if (btnAadir == null) {
			btnAadir = new JButton("A\u00F1adir");
			btnAadir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!articulo.isGrupo()){
						articulo.setUnidades((int) spinner.getValue());
						vp.añadirArticuloReserva(articulo);
						spinner.setValue(1);
					} else {
						vp.añadirArticuloReserva(articulo);
					}
				}
			});
			btnAadir.setMnemonic('Ñ');
		}
		return btnAadir;
	}
	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
			spinner.setEnabled(false);
		}
		return spinner;
	}
	private JPanel getPanelDenominacion() {
		if (panelDenominacion == null) {
			panelDenominacion = new JPanel();
			panelDenominacion.setLayout(new GridLayout(1, 0, 0, 0));
			panelDenominacion.add(getLblDenominacion());
			panelDenominacion.add(getTxtDenominacion());
		}
		return panelDenominacion;
	}
	private JPanel getPanelPrecioUnitario() {
		if (panelPrecioUnitario == null) {
			panelPrecioUnitario = new JPanel();
			panelPrecioUnitario.setLayout(new GridLayout(1, 0, 0, 0));
			panelPrecioUnitario.add(getLblPrecioUnitario());
			panelPrecioUnitario.add(getTxtPrecioUnitario());
		}
		return panelPrecioUnitario;
	}
	private JPanel getPanelPrecioGrupo() {
		if (panelPrecioGrupo == null) {
			panelPrecioGrupo = new JPanel();
			panelPrecioGrupo.setLayout(new GridLayout(1, 0, 0, 0));
			panelPrecioGrupo.add(getLblPrecioGrupo());
			panelPrecioGrupo.add(getTxtPrecioGrupo());
		}
		return panelPrecioGrupo;
	}
	private JPanel getPanelTipo() {
		if (panelTipo == null) {
			panelTipo = new JPanel();
			panelTipo.setLayout(new GridLayout(0, 2, 0, 0));
			panelTipo.add(getLblTipo());
			panelTipo.add(getTxtTipoArticulo());
		}
		return panelTipo;
	}
	private JPanel getPanelDatos() {
		if (panelDatos == null) {
			panelDatos = new JPanel();
			panelDatos.setLayout(new GridLayout(0, 1, 0, 0));
			panelDatos.add(getPanelDenominacion());
			panelDatos.add(getPanelPrecioUnitario());
			panelDatos.add(getPanelPrecioGrupo());
			panelDatos.add(getPanelTipo());
		}
		return panelDatos;
	}
	private Component getHorizontalStrut() {
		if (horizontalStrut == null) {
			horizontalStrut = Box.createHorizontalStrut(20);
		}
		return horizontalStrut;
	}
	private Component getHorizontalStrut_1() {
		if (horizontalStrut_1 == null) {
			horizontalStrut_1 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_1;
	}
	private JPanel getPanelUnidades() {
		if (panelUnidades == null) {
			panelUnidades = new JPanel();
			panelUnidades.setLayout(new GridLayout(0, 2, 0, 0));
			panelUnidades.add(getLblUnidades());
			panelUnidades.add(getSpinner());		
			
		}
		return panelUnidades;
	}
	private JPanel getPanelSelector() {
		if (panelSelector == null) {
			panelSelector = new JPanel();
			panelSelector.setLayout(new GridLayout(0, 2, 0, 0));
		}
		return panelSelector;
	}
	private Component getHorizontalStrut_2() {
		if (horizontalStrut_2 == null) {
			horizontalStrut_2 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_2;
	}
	private Component getHorizontalStrut_3() {
		if (horizontalStrut_3 == null) {
			horizontalStrut_3 = Box.createHorizontalStrut(20);
		}
		return horizontalStrut_3;
	}
	
	private void adaptarImagenLabel(JLabel label, String rutaImagen) {
		Image imgOriginal = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
		Image imgEscalada = imgOriginal.getScaledInstance(
				(int) (label.getWidth()), 
				(int) (label.getHeight()),
				Image.SCALE_FAST);
		label.setIcon(new ImageIcon(imgEscalada));
	}
}
