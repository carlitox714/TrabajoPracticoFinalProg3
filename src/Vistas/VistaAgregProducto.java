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
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
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
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.UIManager;

import Exepciones.AgregarProductoException;

public class VistaAgregProducto extends JDialog
{
	private JPanel contentPane;
	private static ListadoVentas<Integer,RegistroVenta<Venta>> listVentas;
	private JTextField textFieldDetalleProducto;
	public static int id = 0;
	
	/**
	 * Launch the application.
	 */
	/*
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
	*/

	/**
	 * Create the frame.
	 */
	public VistaAgregProducto(java.awt.Frame parent, boolean modo, ListadoProducto<Producto> lista)
	{
		super(parent,modo);
		setType(Type.POPUP);
		setResizable(false);
		setUndecorated(true);
		setSize(792, 515);
		setBackground(Color.WHITE);
		setAlwaysOnTop(true);
		
		ListadoProducto<Producto> listAux = new ListadoProducto<Producto>();		
		id = lista.getIdcount();
		
		/*
		 * Contenido en Ventana				
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(UIManager.getBorder("List.noFocusBorder"));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		etiquetaDetalleProducto.setBounds(79, 66, 131, 22);
		contentPane.add(etiquetaDetalleProducto);
		
		JLabel etiqueta_precio = new JLabel("Precio de Venta : $");
		etiqueta_precio.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setForeground(Color.DARK_GRAY);
		etiqueta_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_precio.setBackground(Color.GRAY);
		etiqueta_precio.setBounds(418, 106, 136, 22);
		contentPane.add(etiqueta_precio);
		
		JLabel etiqueta_cantidad = new JLabel("Stock Inicial :");
		etiqueta_cantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setForeground(Color.DARK_GRAY);
		etiqueta_cantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_cantidad.setBackground(Color.GRAY);
		etiqueta_cantidad.setBounds(308, 191, 95, 22);
		contentPane.add(etiqueta_cantidad);

		JLabel etiquetaCategoria = new JLabel("Categor\u00EDa :");
		etiquetaCategoria.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaCategoria.setForeground(Color.DARK_GRAY);
		etiquetaCategoria.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaCategoria.setBackground(Color.GRAY);
		etiquetaCategoria.setBounds(131, 106, 79, 22);
		contentPane.add(etiquetaCategoria);

		JLabel etiquetaPrecioPorUnidad = new JLabel("/ud");
		etiquetaPrecioPorUnidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorUnidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorUnidad.setBackground(Color.GRAY);
		etiquetaPrecioPorUnidad.setBounds(701, 106, 38, 22);
		etiquetaPrecioPorUnidad.setVisible(true);
		contentPane.add(etiquetaPrecioPorUnidad);
		
		JLabel etiquetaPrecioPorGramo = new JLabel("/100g");
		etiquetaPrecioPorGramo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorGramo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorGramo.setBackground(Color.GRAY);
		etiquetaPrecioPorGramo.setBounds(697, 106, 57, 22);
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
				try {
					ListadoProducto<Producto> aux;
					
					listAux.setIdcount(lista.getIdcount());
					lista.lista2lista(listAux);
					System.out.println(lista.toString());
					
					lista.guardarArchivo();
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				System.out.println(lista.getIdcount());

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
		jSpinStock.setBounds(415, 191, 57, 28);
		contentPane.add(jSpinStock);
		
		JSpinner jSpinStockMinimo = new JSpinner();
		jSpinStockMinimo.setFont(new Font("Courier New", Font.PLAIN, 17));
		jSpinStockMinimo.setBounds(204, 191, 57, 28);
		contentPane.add(jSpinStockMinimo);
		jSpinStockMinimo.addMouseWheelListener(new MouseWheelListener()
		{
			public void mouseWheelMoved(MouseWheelEvent e)
			{
		        int movimiento = e.getWheelRotation();
		        if (movimiento > 0 && jSpinStockMinimo.getPreviousValue() != null)// Rueda hacia abajo
		        {
		        	jSpinStockMinimo.setValue(jSpinStockMinimo.getPreviousValue());
		        }
		        else if (movimiento < 0 && jSpinStockMinimo.getNextValue() != null)// Rueda hacia arriba
		        {
		        	jSpinStockMinimo.setValue(jSpinStockMinimo.getNextValue());
		        }
			}
		});
		
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
		jSpinPrecio.setBounds(566, 106, 119, 28);
		contentPane.add(jSpinPrecio);
		
		textFieldDetalleProducto = new JTextField();
		textFieldDetalleProducto.setFont(new Font("Courier New", Font.PLAIN, 17));
		textFieldDetalleProducto.setToolTipText("\r\nEn este campo se ingresa por teclado el detalle del producto.\r\n");
		textFieldDetalleProducto.setBounds(222, 66, 184, 27);
		contentPane.add(textFieldDetalleProducto);
		textFieldDetalleProducto.setColumns(10);
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxCategoria.getSelectedIndex() == 0)
				{
					etiquetaPrecioPorGramo.setVisible(false);
					etiquetaPrecioPorUnidad.setVisible(true);
				}
				else
				{
					etiquetaPrecioPorUnidad.setVisible(false);
					etiquetaPrecioPorGramo.setVisible(true);
					
				}
			}
		});
		comboBoxCategoria.setFont(new Font("Courier New", Font.PLAIN, 17));
		comboBoxCategoria.setBackground(Color.WHITE);
		comboBoxCategoria.setToolTipText("Aqu\u00ED puedes seleccionar la categor\u00EDa a la que pertenece el nuevo producto.");
		comboBoxCategoria.setModel(new DefaultComboBoxModel(new String[] {"Envasado", "Suelto"}));
		comboBoxCategoria.setBounds(222, 106, 184, 27);
		contentPane.add(comboBoxCategoria);
		
		JCheckBox chckbxVegetariano = new JCheckBox("Vegetariano");
		chckbxVegetariano.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo es vegetariano.\r\n");
		chckbxVegetariano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegetariano.setBackground(Color.LIGHT_GRAY);
		chckbxVegetariano.setBounds(158, 142, 117, 31);
		contentPane.add(chckbxVegetariano);
		
		JCheckBox chckbxVegano = new JCheckBox("Vegano");
		chckbxVegano.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxVegano.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo es vegano.\r\n");
		chckbxVegano.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxVegano.setBackground(Color.LIGHT_GRAY);
		chckbxVegano.setBounds(279, 142, 117, 31);
		chckbxVegano.setVisible(false);
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
		chckbxAzucar.setBounds(399, 142, 117, 31);
		contentPane.add(chckbxAzucar);
		
		JCheckBox chckbxCeliaco = new JCheckBox("Apto Cel\u00EDaco\r\n");
		chckbxCeliaco.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo contiene az\u00FAcar.\r\n");
		chckbxCeliaco.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxCeliaco.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxCeliaco.setBackground(Color.LIGHT_GRAY);
		chckbxCeliaco.setBounds(520, 142, 123, 31);
		contentPane.add(chckbxCeliaco);		
		
		// Lista y componentes relacionados
		
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
				Producto prod;
				if(comboBoxCategoria.getSelectedIndex() == 0)
				{
					prod = new ProductoEnvasado(id, textFieldDetalleProducto.getText(), (Integer) jSpinPrecio.getValue(), 54, chckbxVegano.isSelected(), chckbxCeliaco.isSelected(), chckbxAzucar.isSelected(),chckbxVegetariano.isSelected(), (Integer) jSpinStock.getValue(),(Integer)jSpinStockMinimo.getValue());
				}
				else
				{
					prod = new ProductoSuelto(id, textFieldDetalleProducto.getText(), (Integer) jSpinPrecio.getValue(), 54, chckbxVegano.isSelected(), chckbxCeliaco.isSelected(), chckbxAzucar.isSelected(),chckbxVegetariano.isSelected(), (Integer) jSpinStock.getValue(),(Integer)jSpinStockMinimo.getValue());
				}
				
				if(!lista.existeProducto(prod))
					{
						try 
						{
							listAux.add(prod);
							listaParcial.addElement(jSpinStock.getValue() + " " + textFieldDetalleProducto.getText() + ", " +  comboBoxCategoria.getSelectedItem() + " a $" + jSpinPrecio.getValue() + ".");
							id++;
							
						}
						catch (AgregarProductoException e1) 
						{
							
							JOptionPane.showMessageDialog(null, e1.getMessage(), "Error.", 2, null);
						} 
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

		JButton btnEliminarSeleccionado = new JButton("Eliminar Seleccionado");	
		btnEliminarSeleccionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ListSelectionModel model2 = listaParcialProductos.getSelectionModel();
				int indiceABorrar = model2.getMinSelectionIndex();
				if (indiceABorrar != -1) {
					listaParcial.remove(indiceABorrar);
					
					System.out.println(listAux.remover(indiceABorrar).toString());
				}
			}
		});
		btnEliminarSeleccionado.setForeground(new Color(153, 0, 0));
		btnEliminarSeleccionado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnEliminarSeleccionado.setBackground(Color.LIGHT_GRAY);
		btnEliminarSeleccionado.setBounds(69, 429, 211, 41);
		contentPane.add(btnEliminarSeleccionado);
		
	
		
		JLabel etiqueta_cantidad_1 = new JLabel("Stock Minimo :");
		etiqueta_cantidad_1.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad_1.setForeground(Color.DARK_GRAY);
		etiqueta_cantidad_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_cantidad_1.setBackground(Color.GRAY);
		etiqueta_cantidad_1.setBounds(83, 191, 109, 22);
		contentPane.add(etiqueta_cantidad_1);
	}
}
