package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Productos.Producto;
import Productos.RegistroVenta;
import Productos.Venta;
import Productos.listadoVentas;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;

public class VistaRegVentas extends JFrame
{
	private JPanel contentPane;
	private static listadoVentas<Integer,RegistroVenta<Venta>> listVentas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					VistaRegVentas frame = new VistaRegVentas(listVentas);
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaRegVentas(listadoVentas<Integer,RegistroVenta<Venta>> lista)
	{
		
		listVentas = lista;
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/Imagenes/IconoVentana.png")));
		setTitle("Aurelia - Registro de Venta");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		/*
		 * Barra de Tareas
		 */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuBarraCaja = new JMenu("Caja");
		menuBarraCaja.setForeground(Color.BLACK);
		menuBarraCaja.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBar.add(menuBarraCaja);
		
		JMenuItem btnBarraRegistrarVenta = new JMenuItem("Registrar Venta");
		btnBarraRegistrarVenta.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraCaja.add(btnBarraRegistrarVenta);
		
		JMenu menuBarraProductos = new JMenu("Productos");
		menuBarraProductos.setForeground(Color.BLACK);
		menuBarraProductos.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBar.add(menuBarraProductos);
		
		JMenuItem btnBarraRegistrarCompra = new JMenuItem("Registrar Compra");
		btnBarraRegistrarCompra.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraProductos.add(btnBarraRegistrarCompra);
		
		JMenuItem btnBarraAgregarProducto = new JMenuItem("Agregar Producto");
		btnBarraAgregarProducto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraProductos.add(btnBarraAgregarProducto);
		
		JMenuItem btnBarraEditarProducto = new JMenuItem("Editar Producto");
		btnBarraEditarProducto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraProductos.add(btnBarraEditarProducto);
		
		JMenu menuBarraListados = new JMenu("Listados");
		menuBarraListados.setForeground(Color.BLACK);
		menuBarraListados.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBar.add(menuBarraListados);
		
		JMenuItem btnBarraRegistroVentas = new JMenuItem("Registro de Ventas");
		btnBarraRegistroVentas.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraListados.add(btnBarraRegistroVentas);
		
		JMenuItem btnBarraProductosID = new JMenuItem("Productos por ID");
		btnBarraProductosID.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraListados.add(btnBarraProductosID);
		
		JMenuItem btnBarraProductosStock = new JMenuItem("Productos por Stock");
		btnBarraProductosStock.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraListados.add(btnBarraProductosStock);
		
		JMenu menuBarraAyuda = new JMenu("Ayuda");
		menuBarraAyuda.setForeground(Color.BLACK);
		menuBarraAyuda.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBar.add(menuBarraAyuda);
		
		JMenuItem btnBarraManual = new JMenuItem("Manual de Usuario");
		btnBarraManual.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraAyuda.add(btnBarraManual);
		/*
		 * Contenido en Ventana				
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Etiquetas:
		
		JLabel etiquetaPieDePagina1 = new JLabel("Almac\u00E9n de Alimentos Saludables - Gesti\u00F3n de Stock");
		etiquetaPieDePagina1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPieDePagina1.setForeground(SystemColor.textInactiveText);
		etiquetaPieDePagina1.setBounds(12, 504, 384, 22);
		contentPane.add(etiquetaPieDePagina1);
		
		JLabel etiquetaPieDePagina2 = new JLabel("\u00A9 2020 - Los Hermosos");
		etiquetaPieDePagina2.setForeground(SystemColor.textInactiveText);
		etiquetaPieDePagina2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPieDePagina2.setBounds(610, 504, 172, 22);
		contentPane.add(etiquetaPieDePagina2);

		JLabel etiquetaNuevaVenta = new JLabel("Nueva Venta");
		etiquetaNuevaVenta.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaNuevaVenta.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaNuevaVenta.setForeground(Color.DARK_GRAY);
		etiquetaNuevaVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		etiquetaNuevaVenta.setBackground(Color.GRAY);
		etiquetaNuevaVenta.setBounds(291, 13, 211, 41);
		contentPane.add(etiquetaNuevaVenta);

		JLabel etiqueta_producto = new JLabel("Producto:");
		etiqueta_producto.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_producto.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_producto.setForeground(Color.DARK_GRAY);
		etiqueta_producto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_producto.setBackground(Color.GRAY);
		etiqueta_producto.setBounds(69, 74, 72, 22);
		contentPane.add(etiqueta_producto);
		
		JLabel etiquetaID = new JLabel("ID:");
		etiquetaID.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaID.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaID.setForeground(Color.DARK_GRAY);
		etiquetaID.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaID.setBackground(Color.GRAY);
		etiquetaID.setBounds(91, 128, 20, 22);
		contentPane.add(etiquetaID);
		
		JLabel etiquetaStock = new JLabel("Stock:");
		etiquetaStock.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaStock.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaStock.setForeground(Color.DARK_GRAY);
		etiquetaStock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaStock.setBackground(Color.GRAY);
		etiquetaStock.setBounds(275, 128, 45, 22);
		contentPane.add(etiquetaStock);
		
		JLabel etiquetaPrecio = new JLabel("Precio:");
		etiquetaPrecio.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecio.setForeground(Color.DARK_GRAY);
		etiquetaPrecio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecio.setBackground(Color.GRAY);
		etiquetaPrecio.setBounds(479, 128, 50, 22);
		contentPane.add(etiquetaPrecio);
		
		JLabel etiquetaCantidad = new JLabel("Cantidad:");
		etiquetaCantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaCantidad.setForeground(Color.DARK_GRAY);
		etiquetaCantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaCantidad.setBackground(Color.GRAY);
		etiquetaCantidad.setBounds(302, 177, 69, 22);
		contentPane.add(etiquetaCantidad);

		JLabel etiquetaPrecioxUnidad = new JLabel("/ud");
		etiquetaPrecioxUnidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioxUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioxUnidad.setForeground(Color.DARK_GRAY);
		etiquetaPrecioxUnidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioxUnidad.setBackground(Color.GRAY);
		etiquetaPrecioxUnidad.setBounds(693, 128, 26, 22);
		etiquetaPrecioxUnidad.setVisible(false);
		contentPane.add(etiquetaPrecioxUnidad);
		
		JLabel etiquetaPrecioxGramo = new JLabel("/g");
		etiquetaPrecioxGramo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioxGramo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioxGramo.setForeground(Color.DARK_GRAY);
		etiquetaPrecioxGramo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioxGramo.setBackground(Color.GRAY);
		etiquetaPrecioxGramo.setBounds(693, 128, 17, 22);
		etiquetaPrecioxGramo.setVisible(false);
		contentPane.add(etiquetaPrecioxGramo);
		
		// Botones:
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnCancelar.setForeground(new Color(153, 0, 0));
		btnCancelar.setBackground(Color.LIGHT_GRAY);
		btnCancelar.setBounds(571, 450, 211, 41);
		contentPane.add(btnCancelar);

		JButton btnConfirmarVenta = new JButton("Confirmar Venta");
		btnConfirmarVenta.setForeground(new Color(0, 128, 0));
		btnConfirmarVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConfirmarVenta.setBackground(Color.LIGHT_GRAY);
		btnConfirmarVenta.setBounds(348, 450, 211, 41);
		contentPane.add(btnConfirmarVenta);
		
		JComboBox<String> comboBoxProducto = new JComboBox<String>();
		comboBoxProducto.setModel(new DefaultComboBoxModel(new String[] {" ", "fefe", "fifi", "fofo", "fufu"}));
		comboBoxProducto.setEditable(true);
		comboBoxProducto.setBackground(Color.LIGHT_GRAY);
		comboBoxProducto.setBounds(153, 67, 569, 41);
		contentPane.add(comboBoxProducto);
		
		JSpinner jSpinCantidad = new JSpinner();
		jSpinCantidad.setFont(new Font("Courier New", Font.PLAIN, 17));
		jSpinCantidad.addMouseWheelListener(new MouseWheelListener()
		{
			public void mouseWheelMoved(MouseWheelEvent e)
			{
		        int movimiento = e.getWheelRotation();
		        if (movimiento > 0 && jSpinCantidad.getPreviousValue() != null)// Rueda hacia abajo
		        {
		            jSpinCantidad.setValue(jSpinCantidad.getPreviousValue());
		        }
		        else if (movimiento < 0 && jSpinCantidad.getNextValue() != null)// Rueda hacia arriba
		        {
		        	jSpinCantidad.setValue(jSpinCantidad.getNextValue());
		        }
			}
		});
		jSpinCantidad.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		jSpinCantidad.setBounds(383, 171, 119, 39);
		contentPane.add(jSpinCantidad);
		
		JTextPane textPaneID = new JTextPane();// Obtener ID del atributo del Producto
		textPaneID.setEditable(false);
		textPaneID.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPaneID.setBackground(Color.LIGHT_GRAY);
		textPaneID.setBounds(123, 128, 140, 28);
		contentPane.add(textPaneID);
		
		JTextPane textPaneStock = new JTextPane(); // Obtener Stock del atributo del Producto
		textPaneStock.setEditable(false);
		textPaneStock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPaneStock.setBackground(Color.LIGHT_GRAY);
		textPaneStock.setBounds(327, 128, 140, 28);
		contentPane.add(textPaneStock);
		
		JTextPane textPanePrecio = new JTextPane(); // Obtener Precio del atributo del Producto y desarrollar etiqueta de si es por gramo o por unidad
		textPanePrecio.setEditable(false);
		textPanePrecio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPanePrecio.setBackground(Color.LIGHT_GRAY);
		textPanePrecio.setBounds(541, 128, 140, 28);
		contentPane.add(textPanePrecio);
		
		// Lista y componentes relacionados.
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 232, 654, 184);
		contentPane.add(scrollPane);
		
		DefaultListModel<String> listaParcial = new DefaultListModel<String>();
		
		JList<String> listaParcialProductos = new JList<String>();
		listaParcialProductos.setBackground(Color.LIGHT_GRAY);
		listaParcialProductos.setModel(listaParcial);
		scrollPane.setViewportView(listaParcialProductos);
		
		JButton btnAniadirALista = new JButton("A\u00F1adir a la Lista");
		btnAniadirALista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(comboBoxProducto.getSelectedIndex() == 0)
				{
					JOptionPane.showMessageDialog(null, "Seleccione el producto a vender.", "Error.", 2, null);
				}
				else
				{
					listaParcial.addElement(jSpinCantidad.getValue() + " " + comboBoxProducto.getSelectedItem() + ", a $" + ".");
					/// desarrollar listaVenta paralela al defaultlistmodel
				}
				
			}
		});
		btnAniadirALista.setForeground(new Color(70, 130, 180));
		btnAniadirALista.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnAniadirALista.setBackground(Color.LIGHT_GRAY);
		btnAniadirALista.setBounds(513, 182, 211, 41);
		contentPane.add(btnAniadirALista);

		JButton btnEliminarSeleccionados = new JButton("Eliminar Seleccionados");	
		btnEliminarSeleccionados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ListSelectionModel model2 = listaParcialProductos.getSelectionModel();
				int indiceABorrar = model2.getMinSelectionIndex();
				if (indiceABorrar != -1) {
					listaParcial.remove(indiceABorrar);
				}		
			}
		});
		btnEliminarSeleccionados.setForeground(new Color(153, 0, 0));
		btnEliminarSeleccionados.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnEliminarSeleccionados.setBackground(Color.LIGHT_GRAY);
		btnEliminarSeleccionados.setBounds(69, 429, 211, 41);
		contentPane.add(btnEliminarSeleccionados);
	}
}
