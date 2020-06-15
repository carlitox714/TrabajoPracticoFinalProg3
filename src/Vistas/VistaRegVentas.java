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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
import Ventas.RegistroVenta;
import Ventas.Venta;
import Ventas.listadoVentas;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class VistaRegVentas extends JFrame
{
	private JPanel contentPane;
	private JTable table;
	private JTable tablaVentas;
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
		
		JLabel lblNewLabel_1 = new JLabel("Almac\u00E9n de Alimentos Saludables - Gesti\u00F3n de Stock");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1.setBounds(12, 504, 384, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u00A9 2020 - Los Hermosos");
		lblNewLabel_1_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(610, 504, 172, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnRegistrarVenta = new JButton("Cancelar");
		btnRegistrarVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnRegistrarVenta.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusGained(FocusEvent arg0)
			{
				
			}
		});
		btnRegistrarVenta.setForeground(new Color(153, 0, 0));
		btnRegistrarVenta.setBackground(Color.LIGHT_GRAY);
		btnRegistrarVenta.setBounds(571, 450, 211, 41);
		contentPane.add(btnRegistrarVenta);
		
		table = new JTable();
		table.setBounds(247, 221, 73, -74);
		contentPane.add(table);
		
		JLabel etiquetaNuevaVenta = new JLabel("Nueva Venta");
		etiquetaNuevaVenta.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaNuevaVenta.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaNuevaVenta.setForeground(Color.DARK_GRAY);
		etiquetaNuevaVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		etiquetaNuevaVenta.setBackground(Color.GRAY);
		etiquetaNuevaVenta.setBounds(291, 13, 211, 41);
		contentPane.add(etiquetaNuevaVenta);
		
		JComboBox comboBox_producto = new JComboBox();
		comboBox_producto.setEditable(true);
		comboBox_producto.setBackground(Color.LIGHT_GRAY);
		comboBox_producto.setBounds(153, 67, 569, 41);
		contentPane.add(comboBox_producto);
		
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
		etiqueta_id.setBounds(121, 128, 20, 22);
		contentPane.add(etiqueta_id);
		
		JLabel etiqueta_stock = new JLabel("Stock:");
		etiqueta_stock.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_stock.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_stock.setForeground(Color.DARK_GRAY);
		etiqueta_stock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_stock.setBackground(Color.GRAY);
		etiqueta_stock.setBounds(305, 128, 45, 22);
		contentPane.add(etiqueta_stock);
		
		JLabel etiqueta_precio = new JLabel("Precio:");
		etiqueta_precio.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setForeground(Color.DARK_GRAY);
		etiqueta_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_precio.setBackground(Color.GRAY);
		etiqueta_precio.setBounds(514, 128, 50, 22);
		contentPane.add(etiqueta_precio);
		
		JLabel etiqueta_cantidad = new JLabel("Cantidad:");
		etiqueta_cantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setForeground(Color.DARK_GRAY);
		etiqueta_cantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_cantidad.setBackground(Color.GRAY);
		etiqueta_cantidad.setBounds(302, 177, 69, 22);
		contentPane.add(etiqueta_cantidad);
		
		JSpinner jSpin_ = new JSpinner();
		jSpin_.setFont(new Font("Courier New", Font.PLAIN, 17));
		jSpin_.addMouseWheelListener(new MouseWheelListener()
		{
			public void mouseWheelMoved(MouseWheelEvent e)
			{
		        int movimiento = e.getWheelRotation();
		        if (movimiento > 0 && jSpin_.getPreviousValue() != null)// Rueda hacia abajo
		        {
		            jSpin_.setValue(jSpin_.getPreviousValue());
		        }
		        else if (movimiento < 0 && jSpin_.getNextValue() != null)// Rueda hacia arriba
		        {
		        	jSpin_.setValue(jSpin_.getNextValue());
		        }
			}
		});
		jSpin_.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		jSpin_.setBounds(383, 171, 119, 39);
		contentPane.add(jSpin_);
		
		JButton btnConfirmarVenta = new JButton("Confirmar Venta");
		btnConfirmarVenta.setForeground(new Color(0, 128, 0));
		btnConfirmarVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConfirmarVenta.setBackground(Color.LIGHT_GRAY);
		btnConfirmarVenta.setBounds(348, 450, 211, 41);
		contentPane.add(btnConfirmarVenta);
		
		JTextPane textPane_id = new JTextPane();
		textPane_id.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_id.setBackground(Color.LIGHT_GRAY);
		textPane_id.setBounds(153, 128, 140, 28);
		contentPane.add(textPane_id);
		
		JTextPane textPane_stock = new JTextPane();
		textPane_stock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_stock.setBackground(Color.LIGHT_GRAY);
		textPane_stock.setBounds(362, 128, 140, 28);
		contentPane.add(textPane_stock);
		
		JTextPane textPane_precio = new JTextPane();
		textPane_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_precio.setBackground(Color.LIGHT_GRAY);
		textPane_precio.setBounds(571, 128, 140, 28);
		contentPane.add(textPane_precio);
		
		JButton btnAniadirALista = new JButton("A\u00F1adir a la Lista");
		btnAniadirALista.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnAniadirALista.setForeground(new Color(70, 130, 180));
		btnAniadirALista.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnAniadirALista.setBackground(Color.LIGHT_GRAY);
		btnAniadirALista.setBounds(511, 169, 211, 41);
		contentPane.add(btnAniadirALista);
		
		JLabel etiquetaListaParcial = new JLabel("Lista Parcial");
		etiquetaListaParcial.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaListaParcial.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaListaParcial.setForeground(Color.DARK_GRAY);
		etiquetaListaParcial.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		etiquetaListaParcial.setBackground(Color.GRAY);
		etiquetaListaParcial.setBounds(69, 201, 211, 41);
		contentPane.add(etiquetaListaParcial);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(79, 255, 643, 182);
		contentPane.add(scrollPane);
		
		tablaVentas = new JTable();
		tablaVentas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Detalle Producto", "Precio Unidad", "Cantidad"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(100);
		tablaVentas.getColumnModel().getColumn(1).setPreferredWidth(450);
		tablaVentas.getColumnModel().getColumn(2).setPreferredWidth(100);
		tablaVentas.getColumnModel().getColumn(3).setPreferredWidth(150);
		tablaVentas.setFont(new Font("Courier New", Font.PLAIN, 16));
		scrollPane.setViewportView(tablaVentas);
	}
}
