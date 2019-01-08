package igu;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import logica.Articulo;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class PanelArticuloCarrito extends JPanel {
	private DialogCarrito dc;
	private Articulo articulo;
	private JLabel lblImagen;
	private JPanel panelInformacionArticulo;
	private JPanel panelUnidades;
	private JPanel panelEliminar;
	private JButton btnEliminar;
	private JLabel lblDenominacion;
	private JTextField txtDenominacion;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JPanel panelDenominacion;
	private JPanel panelPrecio;
	private JTextField txtUnidades;
	private JLabel lblUnidades;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public PanelArticuloCarrito() {
		setLayout(new GridLayout(1, 0, 0, 0));
		add(getLblImagen());
		add(getPanelInformacionArticulo());
		add(getPanelUnidades());
		add(getPanelEliminar());

	}

	public PanelArticuloCarrito(DialogCarrito dialogCarrito, Articulo articulo) {
		this();
		this.articulo = articulo;
		this.dc = dialogCarrito;
		inicializarPanelArticuloCarrito();
	}

	private void inicializarPanelArticuloCarrito() {
		setPreferredSize(new Dimension(600,110));
		txtDenominacion.setText(articulo.getDenominacion());
		if (articulo.isGrupo()){
			txtPrecio.setText(String.valueOf(articulo.getPrecioGrupo()));
			txtUnidades.setEnabled(false);
		} else {
			txtPrecio.setText(String.valueOf(articulo.getPrecioUnidad()));
			txtUnidades.setText(String.valueOf(articulo.getUnidades()));
		}
		lblImagen.setPreferredSize(new Dimension(150,110));
		adaptarImagenLabel(lblImagen, articulo.getFoto());
		
	}

	private JLabel getLblImagen() {
		if (lblImagen == null) {
			lblImagen = new JLabel("");
			lblImagen.setBounds(new Rectangle(0, 0, 150, 110));
		}
		return lblImagen;
	}
	private JPanel getPanelInformacionArticulo() {
		if (panelInformacionArticulo == null) {
			panelInformacionArticulo = new JPanel();
			panelInformacionArticulo.setLayout(new GridLayout(0, 1, 0, 0));
			panelInformacionArticulo.add(getPanelDenominacion());
			panelInformacionArticulo.add(getPanelPrecio());
		}
		return panelInformacionArticulo;
	}
	private JPanel getPanelUnidades() {
		if (panelUnidades == null) {
			panelUnidades = new JPanel();
			panelUnidades.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelUnidades.add(getPanel());
			panelUnidades.add(getTxtUnidades());
		}
		return panelUnidades;
	}
	private JPanel getPanelEliminar() {
		if (panelEliminar == null) {
			panelEliminar = new JPanel();
			panelEliminar.setLayout(new GridLayout(0, 1, 0, 0));
			panelEliminar.add(getBtnEliminar());
		}
		return panelEliminar;
	}
	private JButton getBtnEliminar() {
		if (btnEliminar == null) {
			btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dc.eliminarArticuloCarrito(articulo);
				}
			});
		}
		return btnEliminar;
	}
	private JLabel getLblDenominacion() {
		if (lblDenominacion == null) {
			lblDenominacion = new JLabel("Denominaci\u00F3n: ");
			lblDenominacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblDenominacion;
	}
	private JTextField getTxtDenominacion() {
		if (txtDenominacion == null) {
			txtDenominacion = new JTextField();
			txtDenominacion.setEditable(false);
			txtDenominacion.setColumns(10);
		}
		return txtDenominacion;
	}
	private JLabel getLblPrecio() {
		if (lblPrecio == null) {
			lblPrecio = new JLabel("Precio:  ");
			lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblPrecio;
	}
	private JTextField getTxtPrecio() {
		if (txtPrecio == null) {
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setColumns(10);
		}
		return txtPrecio;
	}
	private JPanel getPanelDenominacion() {
		if (panelDenominacion == null) {
			panelDenominacion = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelDenominacion.getLayout();
			panelDenominacion.add(getLblDenominacion());
			panelDenominacion.add(getTxtDenominacion());
		}
		return panelDenominacion;
	}
	private JPanel getPanelPrecio() {
		if (panelPrecio == null) {
			panelPrecio = new JPanel();
			panelPrecio.add(getLblPrecio());
			panelPrecio.add(getTxtPrecio());
		}
		return panelPrecio;
	}
	private JTextField getTxtUnidades() {
		if (txtUnidades == null) {
			txtUnidades = new JTextField();
			txtUnidades.setEditable(false);
			txtUnidades.setPreferredSize(new Dimension(50, 50));
			txtUnidades.setColumns(10);
		}
		return txtUnidades;
	}
	private JLabel getLblUnidades() {
		if (lblUnidades == null) {
			lblUnidades = new JLabel("Unidades:");
			lblUnidades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUnidades;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			panel.add(getLblUnidades());
		}
		return panel;
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
