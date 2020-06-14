package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListDataListener;

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
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Productos.RegistroVenta;
import Productos.Venta;
import Productos.listadoVentas;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;
import java.awt.List;

public class VistaAgregProducto extends JFrame
{
	private JPanel contentPane;
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
		
		JLabel etiqueta_precio = new JLabel("Precio de Venta :");
		etiqueta_precio.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setForeground(Color.DARK_GRAY);
		etiqueta_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_precio.setBackground(Color.GRAY);
		etiqueta_precio.setBounds(436, 109, 123, 22);
		contentPane.add(etiqueta_precio);
		
		JLabel etiqueta_cantidad = new JLabel("Stock Inicial :");
		etiqueta_cantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setForeground(Color.DARK_GRAY);
		etiqueta_cantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_cantidad.setBackground(Color.GRAY);
		etiqueta_cantidad.setBounds(271, 191, 95, 22);
		contentPane.add(etiqueta_cantidad);

		JLabel etiquetaSignoPeso = new JLabel("$");
		etiquetaSignoPeso.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaSignoPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		etiquetaSignoPeso.setForeground(Color.DARK_GRAY);
		etiquetaSignoPeso.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaSignoPeso.setBackground(Color.GRAY);
		etiquetaSignoPeso.setBounds(702, 108, 10, 25);
		contentPane.add(etiquetaSignoPeso);

		JLabel etiquetaCategoria = new JLabel("Categor\u00EDa :");
		etiquetaCategoria.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaCategoria.setForeground(Color.DARK_GRAY);
		etiquetaCategoria.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaCategoria.setBackground(Color.GRAY);
		etiquetaCategoria.setBounds(121, 109, 79, 22);
		contentPane.add(etiquetaCategoria);

		JLabel etiquetaPrecioPorUnidad = new JLabel("/ud");
		etiquetaPrecioPorUnidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorUnidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorUnidad.setBackground(Color.GRAY);
		etiquetaPrecioPorUnidad.setBounds(724, 109, 26, 22);
		etiquetaPrecioPorUnidad.setVisible(false);
		contentPane.add(etiquetaPrecioPorUnidad);
		
		JLabel etiquetaPrecioPorGramo = new JLabel("/g");
		etiquetaPrecioPorGramo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorGramo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorGramo.setBackground(Color.GRAY);
		etiquetaPrecioPorGramo.setBounds(724, 109, 17, 22);
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
		jSpinStock.setBounds(378, 191, 118, 28);
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
		jSpinPrecio.setBounds(571, 109, 119, 28);
		contentPane.add(jSpinPrecio);
		
		textFieldDetalleProducto = new JTextField();
		textFieldDetalleProducto.setToolTipText("\r\nEn este campo se ingresa por teclado el detalle del producto.\r\n");
		textFieldDetalleProducto.setBounds(212, 76, 184, 22);
		contentPane.add(textFieldDetalleProducto);
		textFieldDetalleProducto.setColumns(10);
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setBackground(Color.WHITE);
		comboBoxCategoria.setToolTipText("Aqu\u00ED puedes seleccionar la categor\u00EDa a la que pertenece el nuevo producto.");
		comboBoxCategoria.setModel(new DefaultComboBoxModel(new String[] {"Categor\u00EDa 1", "Categor\u00EDa 2", "Categor\u00EDa 3"}));
		comboBoxCategoria.setBounds(212, 111, 184, 22);
		contentPane.add(comboBoxCategoria);
		
		JCheckBox chckbxVegetariano = new JCheckBox("Vegetariano");
		chckbxVegetariano.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo es vegetariano.\r\n");
		chckbxVegetariano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegetariano.setBackground(Color.LIGHT_GRAY);
		chckbxVegetariano.setBounds(222, 142, 117, 31);
		contentPane.add(chckbxVegetariano);
		
		JCheckBox chckbxVegano = new JCheckBox("Vegano");
		chckbxVegano.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo es vegano.\r\n");
		chckbxVegano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegano.setBackground(Color.LIGHT_GRAY);
		chckbxVegano.setBounds(348, 142, 117, 31);
		chckbxVegano.setVisible(false);
		contentPane.add(chckbxVegano);
		
		//L�gica Vegano-Vegetariano
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
		chckbxAzucar.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo contiene az\u00FAcar.\r\n");
		chckbxAzucar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxAzucar.setBackground(Color.LIGHT_GRAY);
		chckbxAzucar.setBounds(474, 142, 117, 31);
		contentPane.add(chckbxAzucar);
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 232, 654, 184);
		contentPane.add(scrollPane);
		
		// Lista y componentes relacionados
		
		DefaultListModel<String> listaParcial = new DefaultListModel<String>();
		
		JList<String> listaParcialProductos = new JList<String>();
		listaParcialProductos.setBackground(Color.LIGHT_GRAY);
		listaParcialProductos.setModel(listaParcial);
		scrollPane.setViewportView(listaParcialProductos);
		
		JButton btnAniadirALista = new JButton("A\u00F1adir a la Lista");
		btnAniadirALista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				/// verificar repetido en registro real y luego en listaparcial
				listaParcial.addElement(jSpinStock.getValue() + " " + textFieldDetalleProducto.getText() + ", " +  comboBoxCategoria.getSelectedItem() + " a $" + jSpinPrecio.getValue() + ".");
				/// cambiar la muestra de la categor�a por el detalle del precio (por gramos o por unidad)
				/// desarrollar listaProducto paralela al defaultlistmodel
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
