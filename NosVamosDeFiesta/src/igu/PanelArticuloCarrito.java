package igu;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.Box;

public class PanelArticuloCarrito extends JPanel {
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

	private JLabel getLblImagen() {
		if (lblImagen == null) {
			lblImagen = new JLabel("");
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
}
