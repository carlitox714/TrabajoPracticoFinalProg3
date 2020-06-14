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
import javax.swing.table.DefaultTableModel;

import Productos.Producto;
import Productos.RegistroVenta;
import Productos.Venta;
import Productos.listadoVentas;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.DefaultComboBoxModel;

public class VistaRegCompras extends JFrame
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
	public VistaRegCompras(listadoVentas<Integer,RegistroVenta<Venta>> lista)
	{
		
		listVentas = lista;
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/Imagenes/IconoVentana.png")));
		setTitle("Aurelia - Registro de Compra");
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

		JLabel etiquetaNuevaCompra = new JLabel("Nueva Compra");
		etiquetaNuevaCompra.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaNuevaCompra.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaNuevaCompra.setForeground(Color.DARK_GRAY);
		etiquetaNuevaCompra.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		etiquetaNuevaCompra.setBackground(Color.GRAY);
		etiquetaNuevaCompra.setBounds(291, 13, 211, 41);
		contentPane.add(etiquetaNuevaCompra);

		JLabel etiqueta_producto = new JLabel("Producto:");
		etiqueta_producto.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_producto.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_producto.setForeground(Color.DARK_GRAY);
		etiqueta_producto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_producto.setBackground(Color.GRAY);
		etiqueta_producto.setBounds(69, 74, 72, 22);
		contentPane.add(etiqueta_producto);
		
		JLabel etiqueta_id = new JLabel("ID:");
		etiqueta_id.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_id.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_id.setForeground(Color.DARK_GRAY);
		etiqueta_id.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_id.setBackground(Color.GRAY);
		etiqueta_id.setBounds(73, 128, 20, 22);
		contentPane.add(etiqueta_id);
		
		JLabel etiqueta_stock = new JLabel("Stock actual:");
		etiqueta_stock.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_stock.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_stock.setForeground(Color.DARK_GRAY);
		etiqueta_stock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_stock.setBackground(Color.GRAY);
		etiqueta_stock.setBounds(257, 128, 92, 22);
		contentPane.add(etiqueta_stock);
		
		JLabel etiqueta_precio = new JLabel("Precio:");
		etiqueta_precio.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setForeground(Color.DARK_GRAY);
		etiqueta_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_precio.setBackground(Color.GRAY);
		etiqueta_precio.setBounds(514, 128, 50, 22);
		contentPane.add(etiqueta_precio);
		
		JLabel etiqueta_cantidad = new JLabel("Cantidad comprada:");
		etiqueta_cantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setForeground(Color.DARK_GRAY);
		etiqueta_cantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_cantidad.setBackground(Color.GRAY);
		etiqueta_cantidad.setBounds(224, 177, 147, 22);
		contentPane.add(etiqueta_cantidad);

		JLabel etiquetaPrecioPorUnidad = new JLabel("/ud");
		etiquetaPrecioPorUnidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorUnidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorUnidad.setBackground(Color.GRAY);
		etiquetaPrecioPorUnidad.setBounds(723, 128, 26, 22);
		etiquetaPrecioPorUnidad.setVisible(false);
		contentPane.add(etiquetaPrecioPorUnidad);
		
		JLabel etiquetaPrecioPorGramo = new JLabel("/g");
		etiquetaPrecioPorGramo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorGramo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorGramo.setBackground(Color.GRAY);
		etiquetaPrecioPorGramo.setBounds(723, 128, 17, 22);
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
		jSpinCantidad.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		jSpinCantidad.setBounds(383, 171, 119, 39);
		contentPane.add(jSpinCantidad);
		
		JButton btnConfirmarVenta = new JButton("Confirmar Venta"); // Desarrollar la edición de atributos en los productos.
		btnConfirmarVenta.setForeground(new Color(0, 128, 0));
		btnConfirmarVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConfirmarVenta.setBackground(Color.LIGHT_GRAY);
		btnConfirmarVenta.setBounds(348, 450, 211, 41);
		contentPane.add(btnConfirmarVenta);
		
		JTextPane textPane_id = new JTextPane();
		textPane_id.setEditable(false);
		textPane_id.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_id.setBackground(Color.LIGHT_GRAY);
		textPane_id.setBounds(105, 128, 140, 28);
		contentPane.add(textPane_id);
		
		JTextPane textPane_stock = new JTextPane();
		textPane_stock.setEditable(false);
		textPane_stock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_stock.setBackground(Color.LIGHT_GRAY);
		textPane_stock.setBounds(362, 128, 140, 28);
		contentPane.add(textPane_stock);
		
		JTextPane textPane_precio = new JTextPane();
		textPane_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_precio.setBackground(Color.LIGHT_GRAY);
		textPane_precio.setBounds(571, 128, 140, 28);
		contentPane.add(textPane_precio);

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
					JOptionPane.showMessageDialog(null, "Seleccione el producto a comprar.", "Error.", 2, null);
				}
				else
				{
					listaParcial.addElement(jSpinCantidad.getValue() + " " + comboBoxProducto.getSelectedItem());
					/// desarrollar listaCompra paralela al defaultlistmodel para luego hacer los cambios de stock y precios
				}
				
			}
		});
		btnAniadirALista.setForeground(new Color(70, 130, 180));
		btnAniadirALista.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnAniadirALista.setBackground(Color.LIGHT_GRAY);
		btnAniadirALista.setBounds(513, 182, 211, 41);
		contentPane.add(btnAniadirALista);
	}
}
