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

import Productos.RegistroVenta;
import Productos.Venta;
import Productos.listadoVentas;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JTextField;

public class VistaAgregProducto extends JFrame
{
	private JPanel contentPane;
	private JTable table;
	private static listadoVentas<Integer,RegistroVenta<Venta>> listVentas;
	private JTextField textFieldDetalleProducto;
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
					VistaAgregProducto frame = new VistaAgregProducto(listVentas);
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
	public VistaAgregProducto(listadoVentas<Integer,RegistroVenta<Venta>> lista)
	{
		this.listVentas = lista; 
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/Imagenes/IconoVentana.png")));
		setTitle("Aurelia - Registro de Nuevo Producto");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		/*
		 * Barra de Opciones
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
		btnRegistrarVenta.setForeground(new Color(153, 0, 0));
		btnRegistrarVenta.setBackground(Color.LIGHT_GRAY);
		btnRegistrarVenta.setBounds(571, 450, 211, 41);
		contentPane.add(btnRegistrarVenta);
		
		table = new JTable();
		table.setBounds(247, 221, 73, -74);
		contentPane.add(table);
		
		JLabel etiquetaNuevoProducto = new JLabel("Nuevo Producto");
		etiquetaNuevoProducto.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaNuevoProducto.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaNuevoProducto.setForeground(Color.DARK_GRAY);
		etiquetaNuevoProducto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		etiquetaNuevoProducto.setBackground(Color.GRAY);
		etiquetaNuevoProducto.setBounds(291, 13, 211, 41);
		contentPane.add(etiquetaNuevoProducto);
		
		JLabel etiquetaDetalleProducto = new JLabel("Detalle Producto :");
		etiquetaDetalleProducto.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaDetalleProducto.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaDetalleProducto.setForeground(Color.DARK_GRAY);
		etiquetaDetalleProducto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaDetalleProducto.setBackground(Color.GRAY);
		etiquetaDetalleProducto.setBounds(69, 74, 131, 22);
		contentPane.add(etiquetaDetalleProducto);
		
		JLabel etiqueta_precio = new JLabel("Precio:");
		etiqueta_precio.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setForeground(Color.DARK_GRAY);
		etiqueta_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_precio.setBackground(Color.GRAY);
		etiqueta_precio.setBounds(514, 128, 50, 22);
		contentPane.add(etiqueta_precio);
		
		JLabel etiqueta_cantidad = new JLabel("Stock Inicial");
		etiqueta_cantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setForeground(Color.DARK_GRAY);
		etiqueta_cantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_cantidad.setBackground(Color.GRAY);
		etiqueta_cantidad.setBounds(284, 177, 87, 22);
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
		jSpin_.setModel(new SpinnerNumberModel(new Integer(1), new Integer(0), null, new Integer(1)));
		jSpin_.setBounds(383, 177, 118, 28);
		contentPane.add(jSpin_);
		
		JButton btnConfirmarVenta = new JButton("Confirmar ");
		btnConfirmarVenta.setForeground(new Color(0, 128, 0));
		btnConfirmarVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConfirmarVenta.setBackground(Color.LIGHT_GRAY);
		btnConfirmarVenta.setBounds(348, 450, 211, 41);
		contentPane.add(btnConfirmarVenta);
		
		JButton btnAniadirALista = new JButton("A\u00F1adir a la Lista");
		btnAniadirALista.setForeground(new Color(70, 130, 180));
		btnAniadirALista.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnAniadirALista.setBackground(Color.LIGHT_GRAY);
		btnAniadirALista.setBounds(511, 169, 211, 41);
		contentPane.add(btnAniadirALista);
		
		JSpinner jSpin__1 = new JSpinner();
		jSpin__1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		jSpin__1.setFont(new Font("Courier New", Font.PLAIN, 17));
		jSpin__1.setBounds(571, 128, 119, 28);
		contentPane.add(jSpin__1);
		
		JLabel etiqueta_signoPeso = new JLabel("$");
		etiqueta_signoPeso.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_signoPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		etiqueta_signoPeso.setForeground(Color.DARK_GRAY);
		etiqueta_signoPeso.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_signoPeso.setBackground(Color.GRAY);
		etiqueta_signoPeso.setBounds(702, 128, 9, 22);
		contentPane.add(etiqueta_signoPeso);
		
		textFieldDetalleProducto = new JTextField();
		textFieldDetalleProducto.setBounds(212, 76, 277, 22);
		contentPane.add(textFieldDetalleProducto);
		textFieldDetalleProducto.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categor\u00EDa :");
		lblCategoria.setVerticalAlignment(SwingConstants.CENTER);
		lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setForeground(Color.DARK_GRAY);
		lblCategoria.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblCategoria.setBackground(Color.GRAY);
		lblCategoria.setBounds(121, 109, 79, 22);
		contentPane.add(lblCategoria);
	}
}
