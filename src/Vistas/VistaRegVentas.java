package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;

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
import Productos.listadoVentas;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
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
		setBounds(300, 200, 800, 600);
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

		JLabel etiquetaNuevaVenta = new JLabel("Nueva Venta");
		etiquetaNuevaVenta.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaNuevaVenta.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaNuevaVenta.setForeground(Color.DARK_GRAY);
		etiquetaNuevaVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		etiquetaNuevaVenta.setBackground(Color.GRAY);
		etiquetaNuevaVenta.setBounds(291, 0, 211, 41);
		contentPane.add(etiquetaNuevaVenta);

		JLabel etiqueta_producto = new JLabel("Producto :");
		etiqueta_producto.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_producto.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_producto.setForeground(Color.DARK_GRAY);
		etiqueta_producto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_producto.setBackground(Color.GRAY);
		etiqueta_producto.setBounds(65, 44, 76, 22);
		contentPane.add(etiqueta_producto);
		
		JLabel etiquetaID = new JLabel("ID :");
		etiquetaID.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaID.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaID.setForeground(Color.DARK_GRAY);
		etiquetaID.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaID.setBackground(Color.GRAY);
		etiquetaID.setBounds(77, 97, 24, 22);
		contentPane.add(etiquetaID);
		
		JLabel etiquetaStock = new JLabel("Stock :");
		etiquetaStock.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaStock.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaStock.setForeground(Color.DARK_GRAY);
		etiquetaStock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaStock.setBackground(Color.GRAY);
		etiquetaStock.setBounds(265, 97, 49, 22);
		contentPane.add(etiquetaStock);
		
		JLabel etiquetaPrecio = new JLabel("Precio : $");
		etiquetaPrecio.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecio.setForeground(Color.DARK_GRAY);
		etiquetaPrecio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecio.setBackground(Color.GRAY);
		etiquetaPrecio.setBounds(478, 97, 67, 22);
		contentPane.add(etiquetaPrecio);
		
		JLabel etiquetaCantidad = new JLabel("Cantidad Vendida :");
		etiquetaCantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaCantidad.setForeground(Color.DARK_GRAY);
		etiquetaCantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaCantidad.setBackground(Color.GRAY);
		etiquetaCantidad.setBounds(234, 177, 137, 22);
		contentPane.add(etiquetaCantidad);

		JLabel etiquetaPrecioxUnidad = new JLabel("/ud");
		etiquetaPrecioxUnidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioxUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioxUnidad.setForeground(Color.DARK_GRAY);
		etiquetaPrecioxUnidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioxUnidad.setBackground(Color.GRAY);
		etiquetaPrecioxUnidad.setBounds(710, 97, 26, 22);
		etiquetaPrecioxUnidad.setVisible(false);
		contentPane.add(etiquetaPrecioxUnidad);
		
		JLabel etiquetaPrecioxGramo = new JLabel("/g");
		etiquetaPrecioxGramo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioxGramo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioxGramo.setForeground(Color.DARK_GRAY);
		etiquetaPrecioxGramo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioxGramo.setBackground(Color.GRAY);
		etiquetaPrecioxGramo.setBounds(710, 97, 17, 22);
		etiquetaPrecioxGramo.setVisible(false);
		contentPane.add(etiquetaPrecioxGramo);
		
		// Botones:
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setToolTipText("Con este bot\u00F3n se cancela la venta.");
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
		btnConfirmarVenta.setToolTipText("Con este bot\u00F3n se confirma la venta.");
		btnConfirmarVenta.setForeground(new Color(0, 128, 0));
		btnConfirmarVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConfirmarVenta.setBackground(Color.LIGHT_GRAY);
		btnConfirmarVenta.setBounds(348, 450, 211, 41);
		contentPane.add(btnConfirmarVenta);
		
		JComboBox<String> comboBoxProducto = new JComboBox<String>();
		comboBoxProducto.setToolTipText("Aqu\u00ED se elige el producto a agregar a la lista de venta.");
		comboBoxProducto.setFont(new Font("Courier New", Font.PLAIN, 17));
		comboBoxProducto.setModel(new DefaultComboBoxModel<String>(new String[] {" ", "fefe", "fifi", "fofo", "fufu"}));
		comboBoxProducto.setEditable(true);
		comboBoxProducto.setBackground(Color.LIGHT_GRAY);
		comboBoxProducto.setBounds(153, 37, 569, 41);
		contentPane.add(comboBoxProducto);
		
		JSpinner jSpinCantidad = new JSpinner();
		jSpinCantidad.setToolTipText("Aqu\u00ED se especifica la cantidad vendida del producto.");
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
		textPaneID.setToolTipText("Aqu\u00ED se muestra el ID del producto.\r\n");
		textPaneID.setEditable(false);
		textPaneID.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPaneID.setBackground(Color.LIGHT_GRAY);
		textPaneID.setBounds(113, 91, 140, 28);
		contentPane.add(textPaneID);
		
		JTextPane textPaneStock = new JTextPane(); // Obtener Stock del atributo del Producto
		textPaneStock.setToolTipText("Aqu\u00ED se muestra el stock actual del producto.\r\n");
		textPaneStock.setEditable(false);
		textPaneStock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPaneStock.setBackground(Color.LIGHT_GRAY);
		textPaneStock.setBounds(326, 91, 140, 28);
		contentPane.add(textPaneStock);
		
		JTextPane textPanePrecio = new JTextPane(); // Obtener Precio del atributo del Producto y desarrollar etiqueta de si es por gramo o por unidad
		textPanePrecio.setToolTipText("Aqu\u00ED se muestra el precio de venta del producto.");
		textPanePrecio.setEditable(false);
		textPanePrecio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPanePrecio.setBackground(Color.LIGHT_GRAY);
		textPanePrecio.setBounds(557, 91, 140, 28);
		contentPane.add(textPanePrecio);
		
		// CheckBoxs 

		JCheckBox chckbxVegetariano = new JCheckBox("Vegetariano");
		chckbxVegetariano.setToolTipText("Aqu\u00ED se muestra si el producto es vegetariano.\r\n");
		chckbxVegetariano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegetariano.setBackground(Color.LIGHT_GRAY);
		chckbxVegetariano.setBounds(161, 128, 117, 31);
		contentPane.add(chckbxVegetariano);
		
		JCheckBox chckbxVegano = new JCheckBox("Vegano");
		chckbxVegano.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxVegano.setToolTipText("Aqu\u00ED se muestra si el producto es vegano.\r\n");
		chckbxVegano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegano.setBackground(Color.LIGHT_GRAY);
		chckbxVegano.setBounds(282, 128, 117, 31);
		chckbxVegano.setVisible(false);
		contentPane.add(chckbxVegano);

		JCheckBox chckbxAzucar = new JCheckBox("Az\u00FAcar");
		chckbxAzucar.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxAzucar.setToolTipText("Aqu\u00ED se muestra si el producto contiene az\u00FAcar.\r\n");
		chckbxAzucar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxAzucar.setBackground(Color.LIGHT_GRAY);
		chckbxAzucar.setBounds(402, 128, 117, 31);
		contentPane.add(chckbxAzucar);

		JCheckBox chckbxCeliaco = new JCheckBox("Apto Cel\u00EDaco\r\n");
		chckbxCeliaco.setToolTipText("Aqu\u00ED se muestra si el producto contiene az\u00FAcar.\r\n");
		chckbxCeliaco.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxCeliaco.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxCeliaco.setBackground(Color.LIGHT_GRAY);
		chckbxCeliaco.setBounds(523, 128, 123, 31);
		contentPane.add(chckbxCeliaco);
		
		// Lista y componentes relacionados.
		
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
		btnAniadirALista.setToolTipText("Con este bot\u00F3n se agrega el producto a la lista de venta.");
		btnAniadirALista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(comboBoxProducto.getSelectedIndex() == 0)
				{
					JOptionPane.showMessageDialog(null, "Seleccione el producto a vender.", "Error.", 2, null);
				}
				else
				{
					listaParcial.addElement(jSpinCantidad.getValue() + " " + comboBoxProducto.getSelectedItem() + ", a $" + ".");
					/// desarrollar listaVenta paralela al defaultListModel
				}
				
			}
		});
		btnAniadirALista.setForeground(new Color(70, 130, 180));
		btnAniadirALista.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnAniadirALista.setBackground(Color.LIGHT_GRAY);
		btnAniadirALista.setBounds(513, 182, 211, 41);
		contentPane.add(btnAniadirALista);

		JButton btnEliminarSeleccionado = new JButton("Eliminar Seleccionado");	
		btnEliminarSeleccionado.setToolTipText("Con este bot\u00F3n se elimina el producto que est\u00E9 seleccionado de la lista de venta.");
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
