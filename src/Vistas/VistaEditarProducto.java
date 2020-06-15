package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ListSelectionModel;
import Productos.RegistroVenta;
import Productos.Venta;
import Productos.ListadoVentas;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.UIManager;

public class VistaEditarProducto extends JFrame
{
	private JPanel contentPane;
	private static ListadoVentas<Integer,RegistroVenta<Venta>> listVentas;
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
					VistaEditarProducto frame = new VistaEditarProducto(listVentas);
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
	public VistaEditarProducto(ListadoVentas<Integer,RegistroVenta<Venta>> lista)
	{
		this.listVentas = lista; 
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/Imagenes/IconoVentana.png")));
		setTitle("Aurelia - Registro de Nuevo Producto");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 200, 800, 600);
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
		
		JMenu menuBarraListados = new JMenu("Listados");
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
		contentPane.setBorder(UIManager.getBorder("List.noFocusBorder"));
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

		JLabel etiquetaTitulo = new JLabel("Editar Producto\r\n");
		etiquetaTitulo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaTitulo.setForeground(Color.DARK_GRAY);
		etiquetaTitulo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		etiquetaTitulo.setBackground(Color.GRAY);
		etiquetaTitulo.setBounds(291, 13, 211, 41);
		contentPane.add(etiquetaTitulo);

		JLabel etiquetaProducto = new JLabel("Producto :");
		etiquetaProducto.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaProducto.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaProducto.setForeground(Color.DARK_GRAY);
		etiquetaProducto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaProducto.setBackground(Color.GRAY);
		etiquetaProducto.setBounds(65, 74, 76, 22);
		contentPane.add(etiquetaProducto);

		JLabel etiquetaDetalleProducto = new JLabel("Nuevo Detalle de Producto :");
		etiquetaDetalleProducto.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaDetalleProducto.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaDetalleProducto.setForeground(Color.DARK_GRAY);
		etiquetaDetalleProducto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaDetalleProducto.setBackground(Color.GRAY);
		etiquetaDetalleProducto.setBounds(180, 133, 206, 22);
		contentPane.add(etiquetaDetalleProducto);
		
		JLabel etiqueta_precio = new JLabel("Nuevo Precio de Venta : $");
		etiqueta_precio.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setForeground(Color.DARK_GRAY);
		etiqueta_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_precio.setBackground(Color.GRAY);
		etiqueta_precio.setBounds(216, 224, 188, 22);
		contentPane.add(etiqueta_precio);
		
		JLabel etiqueta_cantidad = new JLabel("Nuevo Stock :");
		etiqueta_cantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setForeground(Color.DARK_GRAY);
		etiqueta_cantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_cantidad.setBackground(Color.GRAY);
		etiqueta_cantidad.setBounds(291, 336, 101, 22);
		contentPane.add(etiqueta_cantidad);

		JLabel etiquetaCategoria = new JLabel("Nueva Categor\u00EDa :");
		etiquetaCategoria.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaCategoria.setForeground(Color.DARK_GRAY);
		etiquetaCategoria.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaCategoria.setBackground(Color.GRAY);
		etiquetaCategoria.setBounds(257, 184, 129, 22);
		contentPane.add(etiquetaCategoria);

		JLabel etiquetaPrecioPorUnidad = new JLabel("/ud");
		etiquetaPrecioPorUnidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorUnidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorUnidad.setBackground(Color.GRAY);
		etiquetaPrecioPorUnidad.setBounds(547, 224, 26, 22);
		etiquetaPrecioPorUnidad.setVisible(false);
		contentPane.add(etiquetaPrecioPorUnidad);
		
		JLabel etiquetaPrecioPorGramo = new JLabel("/g");
		etiquetaPrecioPorGramo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorGramo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorGramo.setBackground(Color.GRAY);
		etiquetaPrecioPorGramo.setBounds(547, 224, 17, 22);
		etiquetaPrecioPorGramo.setVisible(false);
		contentPane.add(etiquetaPrecioPorGramo);
		
		// Botones:
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0){
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnCancelar.setForeground(new Color(153, 0, 0));
		btnCancelar.setBackground(Color.LIGHT_GRAY);
		btnCancelar.setBounds(571, 450, 211, 41);
		contentPane.add(btnCancelar);

		JButton btnConfirmar = new JButton("Confirmar ");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				/*
				 * 
				 * 
				 */
			}
		});
		btnConfirmar.setForeground(new Color(0, 128, 0));
		btnConfirmar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConfirmar.setBackground(Color.LIGHT_GRAY);
		btnConfirmar.setBounds(348, 450, 211, 41);
		contentPane.add(btnConfirmar);
				
		JSpinner jSpinStock = new JSpinner();
		jSpinStock.setFont(new Font("Courier New", Font.PLAIN, 17));
		jSpinStock.addMouseWheelListener(new MouseWheelListener()
		{
			public void mouseWheelMoved(MouseWheelEvent e)
			{
		        int movimiento = e.getWheelRotation();
		        if (movimiento > 0 && jSpinStock.getPreviousValue() != null)// Rueda hacia abajo
		        {
		            jSpinStock.setValue(jSpinStock.getPreviousValue());
		        }
		        else if (movimiento < 0 && jSpinStock.getNextValue() != null)// Rueda hacia arriba
		        {
		        	jSpinStock.setValue(jSpinStock.getNextValue());
		        }
			}
		});
		jSpinStock.setModel(new SpinnerNumberModel(new Integer(1), new Integer(0), null, new Integer(1)));
		jSpinStock.setBounds(404, 336, 118, 28);
		contentPane.add(jSpinStock);
		
		JSpinner jSpinPrecio = new JSpinner();
		jSpinPrecio.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		jSpinPrecio.setFont(new Font("Courier New", Font.PLAIN, 17));
		jSpinPrecio.addMouseWheelListener(new MouseWheelListener()
		{
			public void mouseWheelMoved(MouseWheelEvent e)
			{
		        int movimiento = e.getWheelRotation();
		        if (movimiento > 0 && jSpinPrecio.getPreviousValue() != null)// Rueda hacia abajo
		        {
		        	jSpinPrecio.setValue(jSpinPrecio.getPreviousValue());
		        }
		        else if (movimiento < 0 && jSpinPrecio.getNextValue() != null)// Rueda hacia arriba
		        {
		        	jSpinPrecio.setValue(jSpinPrecio.getNextValue());
		        }
			}
		});
		jSpinPrecio.setBounds(416, 224, 119, 28);
		contentPane.add(jSpinPrecio);
		
		textFieldDetalleProducto = new JTextField();
		textFieldDetalleProducto.setFont(new Font("Courier New", Font.PLAIN, 17));
		textFieldDetalleProducto.setToolTipText("\r\nEn este campo se ingresa por teclado el detalle del producto.\r\n");
		textFieldDetalleProducto.setBounds(398, 133, 184, 27);
		contentPane.add(textFieldDetalleProducto);
		textFieldDetalleProducto.setColumns(10);
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setFont(new Font("Courier New", Font.PLAIN, 17));
		comboBoxCategoria.setBackground(Color.WHITE);
		comboBoxCategoria.setToolTipText("Aqu\u00ED puedes seleccionar la categor\u00EDa a la que pertenece el nuevo producto.");
		comboBoxCategoria.setModel(new DefaultComboBoxModel(new String[] {"Categor\u00EDa 1", "Categor\u00EDa 2", "Categor\u00EDa 3"}));
		comboBoxCategoria.setBounds(398, 184, 184, 27);
		contentPane.add(comboBoxCategoria);
		
		JCheckBox chckbxVegetariano = new JCheckBox("Vegetariano");
		chckbxVegetariano.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo es vegetariano.\r\n");
		chckbxVegetariano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegetariano.setBackground(Color.LIGHT_GRAY);
		chckbxVegetariano.setBounds(155, 274, 117, 31);
		contentPane.add(chckbxVegetariano);
		
		JCheckBox chckbxVegano = new JCheckBox("Vegano");
		chckbxVegano.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxVegano.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo es vegano.\r\n");
		chckbxVegano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegano.setBackground(Color.LIGHT_GRAY);
		chckbxVegano.setBounds(280, 274, 117, 31);
		chckbxVegano.setVisible(false);
		if(chckbxVegetariano.isSelected())
			chckbxVegano.setVisible(true);
		contentPane.add(chckbxVegano);
		
		//Lógica Vegano-Vegetariano
		chckbxVegetariano.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(chckbxVegetariano.isSelected())
					chckbxVegano.setVisible(true);
				else
					chckbxVegano.setVisible(false);
				chckbxVegano.setSelected(false);
			}
		});
		
		JCheckBox chckbxAzucar = new JCheckBox("Az\u00FAcar");
		chckbxAzucar.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxAzucar.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo contiene az\u00FAcar.\r\n");
		chckbxAzucar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxAzucar.setBackground(Color.LIGHT_GRAY);
		chckbxAzucar.setBounds(401, 274, 117, 31);
		contentPane.add(chckbxAzucar);
		
		JCheckBox chckbxCeliaco = new JCheckBox("Apto Cel\u00EDaco\r\n");
		chckbxCeliaco.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo es apto para cel\u00EDacos.\r\n");
		chckbxCeliaco.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxCeliaco.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxCeliaco.setBackground(Color.LIGHT_GRAY);
		chckbxCeliaco.setBounds(522, 274, 123, 31);
		contentPane.add(chckbxCeliaco);

		JComboBox<String> comboBoxProducto = new JComboBox<String>();
		comboBoxProducto.setFont(new Font("Courier New", Font.PLAIN, 17));
		comboBoxProducto.setModel(new DefaultComboBoxModel<String>(new String[] {" ", "fafa", "fefe", "fifi", "fofo", "fufu"}));
		comboBoxProducto.setEditable(true);
		comboBoxProducto.setBackground(Color.LIGHT_GRAY);
		comboBoxProducto.setBounds(153, 67, 569, 41);
		contentPane.add(comboBoxProducto);
	}
}
