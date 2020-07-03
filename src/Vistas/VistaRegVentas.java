package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Contenedores.Contenedor;
import Contenedores.ContenedorArrayList;
import Exepciones.AgregarProductoException;
import Exepciones.StockInsuficienteException;

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
import java.awt.Window.Type;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;

import Productos.ListadoProducto;
import Productos.Producto;
import Productos.ProductoEnvasado;
import Productos.ProductoSuelto;
import Ventas.ListadoVentas;
import Ventas.RegistroVenta;
import Ventas.Venta;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.DefaultComboBoxModel;

public class VistaRegVentas extends JDialog
{
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public VistaRegVentas(java.awt.Frame parent, boolean modo,ListadoVentas<Integer,RegistroVenta<Venta>> listVenta, ListadoProducto<Producto> listProd)
	{
		
		super(parent,modo);
		setType(Type.POPUP);
		setResizable(false);
		setUndecorated(true);
		setSize(792, 515);
		setBackground(Color.WHITE);
		setAlwaysOnTop(true);
		
	
		RegistroVenta<Venta> regaux = new RegistroVenta<Venta>();
		
		/*
		 * Contenido en Ventana				
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		btnConfirmarVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				listVenta.agregar(regaux);
				dispose();
				listVenta.guardarArchivo();
				
				
			}
		});
		btnConfirmarVenta.setToolTipText("Con este bot\u00F3n se confirma la venta.");
		btnConfirmarVenta.setForeground(new Color(0, 128, 0));
		btnConfirmarVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConfirmarVenta.setBackground(Color.LIGHT_GRAY);
		btnConfirmarVenta.setBounds(348, 450, 211, 41);
		contentPane.add(btnConfirmarVenta);
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(listProd.listaSimple());
		
		JComboBox<String> comboBoxProducto = new JComboBox<String>();
		comboBoxProducto.setToolTipText("Aqu\u00ED se elige el producto a agregar a la lista de venta.");
		comboBoxProducto.setFont(new Font("Courier New", Font.PLAIN, 17));
		comboBoxProducto.setModel(model);
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
		textPaneID.setEnabled(false);
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
		chckbxVegetariano.setEnabled(false);
		chckbxVegetariano.setToolTipText("Aqu\u00ED se muestra si el producto es vegetariano.\r\n");
		chckbxVegetariano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegetariano.setBackground(Color.WHITE);
		chckbxVegetariano.setBounds(181, 126, 123, 31);
		chckbxVegetariano.setVisible(true);
		contentPane.add(chckbxVegetariano);
		
		JCheckBox chckbxVegano = new JCheckBox("Vegano");
		chckbxVegano.setEnabled(false);
		chckbxVegano.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxVegano.setToolTipText("Aqu\u00ED se muestra si el producto es vegano.\r\n");
		chckbxVegano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegano.setBackground(Color.WHITE);
		chckbxVegano.setBounds(333, 126, 123, 31);
		chckbxVegano.setVisible(true);
		contentPane.add(chckbxVegano);

		JCheckBox chckbxAzucar = new JCheckBox("Az\u00FAcar");
		chckbxAzucar.setEnabled(false);
		chckbxAzucar.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxAzucar.setToolTipText("Aqu\u00ED se muestra si el producto contiene az\u00FAcar.\r\n");
		chckbxAzucar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxAzucar.setBackground(Color.WHITE);
		chckbxAzucar.setBounds(485, 126, 123, 31);
		contentPane.add(chckbxAzucar);

		JCheckBox chckbxCeliaco = new JCheckBox("Apto Cel\u00EDaco\r\n");
		chckbxCeliaco.setEnabled(false);
		chckbxCeliaco.setToolTipText("Aqu\u00ED se muestra si el producto contiene az\u00FAcar.\r\n");
		chckbxCeliaco.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxCeliaco.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxCeliaco.setBackground(Color.WHITE);
		chckbxCeliaco.setBounds(637, 126, 123, 31);
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
			public void actionPerformed(ActionEvent e)
			{	
				
				Venta venta;
				Producto producto = (Producto)listProd.getProducto(comboBoxProducto.getSelectedIndex()-1) ;

				venta = new Venta();
				
				try
				{
					
					venta.cargarVenta(producto, (int)jSpinCantidad.getValue());
					regaux.agregar(venta);
					int precio = (int)producto.getPrecio();
					int cant = (int)jSpinCantidad.getValue();
					int precioTotal = precio * cant;
					listaParcial.addElement(jSpinCantidad.getValue() + " " + textPaneID.getText() + ", " +  " a $" + String.valueOf(precioTotal));
					
				}catch (StockInsuficienteException ex) 
				{	
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error.", 2, null);
				}
				
				
			
				

				/// cambiar la muestra de la categoría por el detalle del precio (por gramos o por unidad)
				/// desarrollar listaProducto paralela al defaultListModel
			}
		});
		btnAniadirALista.setForeground(new Color(70, 130, 180));
		btnAniadirALista.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnAniadirALista.setBackground(Color.LIGHT_GRAY);
		btnAniadirALista.setBounds(513, 182, 211, 41);
		contentPane.add(btnAniadirALista);
		
		JTextPane textPaneStockMin = new JTextPane();
		textPaneStockMin.setToolTipText("Aqu\u00ED se muestra el stock actual del producto.\r\n");
		textPaneStockMin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPaneStockMin.setEditable(false);
		textPaneStockMin.setBackground(Color.LIGHT_GRAY);
		textPaneStockMin.setBounds(123, 127, 39, 28);
		contentPane.add(textPaneStockMin);
		
		JLabel etiquetaStock_1 = new JLabel("Stock Minimo :");
		etiquetaStock_1.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaStock_1.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaStock_1.setForeground(Color.DARK_GRAY);
		etiquetaStock_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaStock_1.setBackground(Color.GRAY);
		etiquetaStock_1.setBounds(10, 130, 109, 22);
		contentPane.add(etiquetaStock_1);
		
		comboBoxProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Producto prod = listProd.getProducto(comboBoxProducto.getSelectedIndex()-1);
				chckbxAzucar.setSelected(prod.isAzucar());
				chckbxAzucar.revalidate();
				chckbxCeliaco.setSelected(prod.isCeliaco());
				chckbxCeliaco.revalidate();
				chckbxVegano.setSelected(prod.isVegano());
				chckbxVegano.revalidate();
				chckbxVegetariano.setSelected(prod.isVegetariano());
				chckbxVegetariano.revalidate();
				textPaneID.setText(prod.getNombre());
				textPaneID.revalidate();
				textPanePrecio.setText(String.valueOf(prod.getPrecio()));
				textPanePrecio.revalidate();
				textPaneStock.setText(String.valueOf(prod.getStock()));
				textPaneStock.revalidate();
				textPaneStockMin.setText(String.valueOf(prod.getStockMin()));
				textPaneStockMin.revalidate();
			}
		});
		
	}
}
