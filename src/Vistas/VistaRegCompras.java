package Vistas;

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
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import Productos.RegistroVenta;
import Productos.Venta;
import Productos.ListadoVentas;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.DefaultComboBoxModel;

public class VistaRegCompras extends JFrame
{
	private JPanel contentPane;
	private static ListadoVentas<Integer,RegistroVenta<Venta>> listVentas;

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
					VistaRegCompras frame = new VistaRegCompras(listVentas);
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
	public VistaRegCompras(ListadoVentas<Integer,RegistroVenta<Venta>> lista)
	{
		
		listVentas = lista;
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/Imagenes/IconoVentana.png")));
		setTitle("Aurelia - Registro de Compra");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 300, 800, 600);
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
		
		JMenuItem btnBarraAgregarProducto = new JMenuItem("Agregar Producto");
		btnBarraAgregarProducto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraProductos.add(btnBarraAgregarProducto);
		
		JMenuItem btnBarraEditarProducto = new JMenuItem("Editar Producto");
		btnBarraEditarProducto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraProductos.add(btnBarraEditarProducto);
		
		JMenuItem btnBarraRegistrarCompra = new JMenuItem("Registrar Compra");
		btnBarraRegistrarCompra.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraProductos.add(btnBarraRegistrarCompra);
		
		JMenu menuBarraListados = new JMenu("Productos");
		menuBarraListados.setForeground(Color.BLACK);
		menuBarraListados.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBar.add(menuBarraListados);
		
		JMenuItem btnBarraListVentas = new JMenuItem("Ventas");
		btnBarraListVentas.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraListados.add(btnBarraListVentas);
		
		JMenuItem btnBarraProductosID = new JMenuItem("Productos por ID");
		btnBarraProductosID.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraListados.add(btnBarraProductosID);
		
		JMenuItem btnBarraProductosAlfabetico = new JMenuItem("Productos Alfab\u00E9tico");
		btnBarraProductosAlfabetico.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
		menuBarraListados.add(btnBarraProductosAlfabetico);
		
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

		JLabel etiquetaNuevaCompra = new JLabel("Nueva Compra");
		etiquetaNuevaCompra.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaNuevaCompra.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaNuevaCompra.setForeground(Color.DARK_GRAY);
		etiquetaNuevaCompra.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		etiquetaNuevaCompra.setBackground(Color.GRAY);
		etiquetaNuevaCompra.setBounds(291, 13, 211, 41);
		contentPane.add(etiquetaNuevaCompra);

		JLabel etiquetaProducto = new JLabel("Producto :");
		etiquetaProducto.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaProducto.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaProducto.setForeground(Color.DARK_GRAY);
		etiquetaProducto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaProducto.setBackground(Color.GRAY);
		etiquetaProducto.setBounds(65, 74, 76, 22);
		contentPane.add(etiquetaProducto);
		
		JLabel etiquetaID = new JLabel("ID :");
		etiquetaID.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaID.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaID.setForeground(Color.DARK_GRAY);
		etiquetaID.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaID.setBackground(Color.GRAY);
		etiquetaID.setBounds(37, 128, 24, 22);
		contentPane.add(etiquetaID);
		
		JLabel etiqueta_stock = new JLabel("Stock Actual :");
		etiqueta_stock.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_stock.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_stock.setForeground(Color.DARK_GRAY);
		etiqueta_stock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_stock.setBackground(Color.GRAY);
		etiqueta_stock.setBounds(225, 128, 99, 22);
		contentPane.add(etiqueta_stock);
		
		JLabel etiqueta_precio = new JLabel("Precio : $ ");
		etiqueta_precio.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setForeground(Color.DARK_GRAY);
		etiqueta_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_precio.setBackground(Color.GRAY);
		etiqueta_precio.setBounds(488, 128, 71, 22);
		contentPane.add(etiqueta_precio);
		
		JLabel etiqueta_cantidad = new JLabel("Cantidad Comprada :");
		etiqueta_cantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setForeground(Color.DARK_GRAY);
		etiqueta_cantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_cantidad.setBackground(Color.GRAY);
		etiqueta_cantidad.setBounds(218, 177, 153, 22);
		contentPane.add(etiqueta_cantidad);

		JLabel etiquetaPrecioPorUnidad = new JLabel("/ud");
		etiquetaPrecioPorUnidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorUnidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorUnidad.setBackground(Color.GRAY);
		etiquetaPrecioPorUnidad.setBounds(729, 128, 26, 22);
		etiquetaPrecioPorUnidad.setVisible(false);
		contentPane.add(etiquetaPrecioPorUnidad);
		
		JLabel etiquetaPrecioPorGramo = new JLabel("/g");
		etiquetaPrecioPorGramo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorGramo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorGramo.setBackground(Color.GRAY);
		etiquetaPrecioPorGramo.setBounds(729, 128, 17, 22);
		etiquetaPrecioPorGramo.setVisible(false);
		contentPane.add(etiquetaPrecioPorGramo);
		
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
		
		JComboBox comboBoxProducto = new JComboBox();
		comboBoxProducto.setFont(new Font("Courier New", Font.PLAIN, 17));
		comboBoxProducto.setModel(new DefaultComboBoxModel(new String[] {" ", "fafa", "fefe", "fifi", "fofo", "fufu"}));
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
		jSpinCantidad.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		jSpinCantidad.setBounds(383, 171, 119, 39);
		contentPane.add(jSpinCantidad);
		
		JButton btnConfirmarCompra = new JButton("Confirmar Compra\r\n"); // Desarrollar la edición de atributos en los productos.
		btnConfirmarCompra.setForeground(new Color(0, 128, 0));
		btnConfirmarCompra.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConfirmarCompra.setBackground(Color.LIGHT_GRAY);
		btnConfirmarCompra.setBounds(348, 450, 211, 41);
		contentPane.add(btnConfirmarCompra);
		
		JTextPane textPane_id = new JTextPane();
		textPane_id.setEditable(false);
		textPane_id.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_id.setBackground(Color.LIGHT_GRAY);
		textPane_id.setBounds(73, 128, 140, 28);
		contentPane.add(textPane_id);
		
		JTextPane textPane_stock = new JTextPane();
		textPane_stock.setEditable(false);
		textPane_stock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_stock.setBackground(Color.LIGHT_GRAY);
		textPane_stock.setBounds(336, 128, 140, 28);
		contentPane.add(textPane_stock);
		
		JTextPane textPane_precio = new JTextPane();
		textPane_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_precio.setBackground(Color.LIGHT_GRAY);
		textPane_precio.setBounds(577, 128, 140, 28);
		contentPane.add(textPane_precio);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 232, 654, 184);
		contentPane.add(scrollPane);
		
		DefaultListModel<String> listaParcial = new DefaultListModel<String>();
		
		JList<String> listaParcialProductos = new JList<String>();
		listaParcialProductos.setForeground(Color.DARK_GRAY);
		listaParcialProductos.setFont(new Font("Courier New", Font.PLAIN, 17));
		listaParcialProductos.setBackground(Color.LIGHT_GRAY);
		listaParcialProductos.setModel(listaParcial);
		scrollPane.setViewportView(listaParcialProductos);
		
		JButton btnAniadirALista = new JButton("A\u00F1adir a la Lista");
		btnAniadirALista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(comboBoxProducto.getSelectedIndex() == 0)
				{
					JOptionPane.showMessageDialog(null, "Seleccione el producto a comprar.", "Error.", 2, null);
				}
				else
				{
					listaParcial.addElement(jSpinCantidad.getValue() + " " + comboBoxProducto.getSelectedItem());
					/// desarrollar listaCompra paralela al defaultListModel para luego hacer los cambios de stock y precios
				}
				
			}
		});
		btnAniadirALista.setForeground(new Color(70, 130, 180));
		btnAniadirALista.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnAniadirALista.setBackground(Color.LIGHT_GRAY);
		btnAniadirALista.setBounds(513, 182, 211, 41);
		contentPane.add(btnAniadirALista);
		
		JButton btnEliminarSeleccionado = new JButton("Eliminar Seleccionado");	
		btnEliminarSeleccionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ListSelectionModel model2 = listaParcialProductos.getSelectionModel();
				int indiceABorrar = model2.getMinSelectionIndex();
				if (indiceABorrar != -1) {
					listaParcial.remove(indiceABorrar);
				}		
			}
		});
		btnEliminarSeleccionado.setForeground(new Color(153, 0, 0));
		btnEliminarSeleccionado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnEliminarSeleccionado.setBackground(Color.LIGHT_GRAY);
		btnEliminarSeleccionado.setBounds(69, 429, 211, 41);
		contentPane.add(btnEliminarSeleccionado);
	}
}
