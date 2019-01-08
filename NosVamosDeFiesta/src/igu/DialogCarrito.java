package igu;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import logica.Articulo;

public class DialogCarrito extends JDialog {
	

	private final JPanel contentPanel = new JPanel();
	private VentanaPrincipal vp;
	private JPanel panelBotones;
	private JButton btnCerrar;
	private JPanel panelTituloCarrito;
	private JLabel lblCarrito;
	private JPanel panelArticulosCarrito;
	private JPanel panelAccionesCarrito;
	private JPanel panelBotonesCarrito;
	private JPanel panelSubtotal;
	private JButton btnVaciarCarrito;
	private JButton btnRecuperarCarrito;
	private JLabel lblSubtotal;
	private JTextField txtSubtotal;
	private Component horizontalStrut;
	private JScrollPane scrollPane;
	private JPanel panelContenedorArticulos;

	/**
	 * Create the dialog.
	 */
	public DialogCarrito() {
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 700, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		contentPanel.add(getPanelBotones(), BorderLayout.SOUTH);
		contentPanel.add(getPanelTituloCarrito(), BorderLayout.NORTH);
		contentPanel.add(getPanelArticulosCarrito(), BorderLayout.CENTER);
	}

	public DialogCarrito(VentanaPrincipal ventanaPrincipal) {
		this();
		vp = ventanaPrincipal;
		rellenarCarrito();
	}

	private JPanel getPanelBotones() {
		if (panelBotones == null) {
			panelBotones = new JPanel();
			FlowLayout fl_panelBotones = (FlowLayout) panelBotones.getLayout();
			fl_panelBotones.setAlignment(FlowLayout.RIGHT);
			panelBotones.add(getBtnCerrar());
		}
		return panelBotones;
	}
	private JButton getBtnCerrar() {
		if (btnCerrar == null) {
			btnCerrar = new JButton("Cerrar");
		}
		return btnCerrar;
	}
	private JPanel getPanelTituloCarrito() {
		if (panelTituloCarrito == null) {
			panelTituloCarrito = new JPanel();
			panelTituloCarrito.add(getLblCarrito());
		}
		return panelTituloCarrito;
	}
	private JLabel getLblCarrito() {
		if (lblCarrito == null) {
			lblCarrito = new JLabel("Carrito");
			lblCarrito.setFont(new Font("Tahoma", Font.PLAIN, 28));
		}
		return lblCarrito;
	}
	private JPanel getPanelArticulosCarrito() {
		if (panelArticulosCarrito == null) {
			panelArticulosCarrito = new JPanel();
			panelArticulosCarrito.setLayout(new BorderLayout(0, 0));
			panelArticulosCarrito.add(getScrollPane(), BorderLayout.CENTER);
			panelArticulosCarrito.add(getPanelAccionesCarrito(), BorderLayout.SOUTH);
		}
		return panelArticulosCarrito;
	}
	private JPanel getPanelAccionesCarrito() {
		if (panelAccionesCarrito == null) {
			panelAccionesCarrito = new JPanel();
			panelAccionesCarrito.setLayout(new GridLayout(0, 2, 0, 0));
			panelAccionesCarrito.add(getPanelBotonesCarrito());
			panelAccionesCarrito.add(getPanelSubtotal());
		}
		return panelAccionesCarrito;
	}
	private JPanel getPanelBotonesCarrito() {
		if (panelBotonesCarrito == null) {
			panelBotonesCarrito = new JPanel();
			panelBotonesCarrito.setLayout(new GridLayout(0, 2, 0, 0));
			panelBotonesCarrito.add(getBtnVaciarCarrito());
			panelBotonesCarrito.add(getBtnRecuperarCarrito());
		}
		return panelBotonesCarrito;
	}
	private JPanel getPanelSubtotal() {
		if (panelSubtotal == null) {
			panelSubtotal = new JPanel();
			panelSubtotal.setLayout(new GridLayout(0, 3, 0, 0));
			panelSubtotal.add(getHorizontalStrut());
			panelSubtotal.add(getLblSubtotal());
			panelSubtotal.add(getTxtSubtotal());
		}
		return panelSubtotal;
	}
	private JButton getBtnVaciarCarrito() {
		if (btnVaciarCarrito == null) {
			btnVaciarCarrito = new JButton("Vaciar Carrito");
			btnVaciarCarrito.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnVaciarCarrito.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnVaciarCarrito;
	}
	private JButton getBtnRecuperarCarrito() {
		if (btnRecuperarCarrito == null) {
			btnRecuperarCarrito = new JButton("Recuperar Carrito");
			btnRecuperarCarrito.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnRecuperarCarrito;
	}
	private JLabel getLblSubtotal() {
		if (lblSubtotal == null) {
			lblSubtotal = new JLabel("Subtotal: ");
			lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblSubtotal;
	}
	private JTextField getTxtSubtotal() {
		if (txtSubtotal == null) {
			txtSubtotal = new JTextField();
			txtSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtSubtotal.setEditable(false);
			txtSubtotal.setColumns(10);
		}
		return txtSubtotal;
	}
	private Component getHorizontalStrut() {
		if (horizontalStrut == null) {
			horizontalStrut = Box.createHorizontalStrut(20);
		}
		return horizontalStrut;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getPanelContenedorArticulos());
		}
		return scrollPane;
	}
	private JPanel getPanelContenedorArticulos() {
		if (panelContenedorArticulos == null) {
			panelContenedorArticulos = new JPanel();
			panelContenedorArticulos.setLayout(new GridLayout(0, 1, 0, 0));
		}
		return panelContenedorArticulos;
	}
	
	private void rellenarCarrito(){
		List<Articulo> articulosCarrito = vp.getArticulosCarrito();
		for (Articulo a : articulosCarrito){
			panelContenedorArticulos.add(new PanelArticuloCarrito(this,a));
		}
	}

	public void eliminarArticuloCarrito(Articulo articulo) {
		vp.eliminarArticuloCarrito(articulo);
		panelContenedorArticulos.removeAll();
		rellenarCarrito();	
	}
	
	private void vaciarCarrito(){
		
	}
}
