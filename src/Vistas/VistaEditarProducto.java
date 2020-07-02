package Vistas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import Productos.ListadoProducto;
import Productos.Producto;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.UIManager;

public class VistaEditarProducto extends JDialog
{
	private JPanel contentPane;
	private JTextField textFieldDetalleProducto;
	static int id = -1;
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VistaEditarProducto(java.awt.Frame parent, boolean modo, ListadoProducto<Producto> lista)
	{
		super(parent,modo);
		setType(Type.POPUP);
		setResizable(false);
		setUndecorated(true);
		setSize(792, 515);
		setBackground(Color.WHITE);
		setAlwaysOnTop(true);
		
		Producto prod = new Producto();		
		
		/*
		 * Contenido en Ventana				
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(UIManager.getBorder("List.noFocusBorder"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Producto Seleccionado
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(lista.listaSimple());
		
		JComboBox<String> comboBoxProducto = new JComboBox<String>();
		comboBoxProducto.setFont(new Font("Courier New", Font.PLAIN, 17));
		comboBoxProducto.setModel(model);
		comboBoxProducto.setEditable(true);
		comboBoxProducto.setBackground(Color.LIGHT_GRAY);
		comboBoxProducto.setBounds(153, 67, 414, 41);
		contentPane.add(comboBoxProducto);

		// Etiquetas:
		
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
		etiquetaDetalleProducto.setBounds(186, 157, 206, 22);
		contentPane.add(etiquetaDetalleProducto);
		
		JLabel etiqueta_precio = new JLabel("Nuevo Precio de Venta : $");
		etiqueta_precio.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_precio.setForeground(Color.DARK_GRAY);
		etiqueta_precio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_precio.setBackground(Color.GRAY);
		etiqueta_precio.setBounds(216, 213, 188, 22);
		contentPane.add(etiqueta_precio);
		
		JLabel etiqueta_cantidad = new JLabel("Nuevo Stock :");
		etiqueta_cantidad.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_cantidad.setForeground(Color.DARK_GRAY);
		etiqueta_cantidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_cantidad.setBackground(Color.GRAY);
		etiqueta_cantidad.setBounds(291, 336, 101, 22);
		contentPane.add(etiqueta_cantidad);

		JLabel etiquetaPrecioPorUnidad = new JLabel("/ud");
		etiquetaPrecioPorUnidad.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorUnidad.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorUnidad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorUnidad.setBackground(Color.GRAY);
		etiquetaPrecioPorUnidad.setBounds(547, 213, 26, 22);
		etiquetaPrecioPorUnidad.setVisible(false);
		contentPane.add(etiquetaPrecioPorUnidad);
		
		JLabel etiquetaPrecioPorGramo = new JLabel("/g");
		etiquetaPrecioPorGramo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPrecioPorGramo.setForeground(Color.DARK_GRAY);
		etiquetaPrecioPorGramo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaPrecioPorGramo.setBackground(Color.GRAY);
		etiquetaPrecioPorGramo.setBounds(547, 213, 17, 22);
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

		
		JSpinner jSpinStockMinimo = new JSpinner();
		jSpinStockMinimo.setFont(new Font("Courier New", Font.PLAIN, 17));
		jSpinStockMinimo.setBounds(216, 336, 50, 28);
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
		jSpinStock.setBounds(404, 336, 50, 28);
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
		jSpinPrecio.setBounds(416, 213, 119, 28);
		contentPane.add(jSpinPrecio);
		
		textFieldDetalleProducto = new JTextField();
		textFieldDetalleProducto.setFont(new Font("Courier New", Font.PLAIN, 17));
		textFieldDetalleProducto.setToolTipText("\r\nEn este campo se ingresa por teclado el detalle del producto.\r\n");
		textFieldDetalleProducto.setBounds(404, 157, 184, 27);
		contentPane.add(textFieldDetalleProducto);
		textFieldDetalleProducto.setColumns(10);
		
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
		chckbxAzucar.setSelected(true);
		contentPane.add(chckbxAzucar);
		
		JCheckBox chckbxCeliaco = new JCheckBox("Apto Cel\u00EDaco\r\n");
		chckbxCeliaco.setToolTipText("Aqu\u00ED seleccionas si el art\u00EDculo es apto para cel\u00EDacos.\r\n");
		chckbxCeliaco.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxCeliaco.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		chckbxCeliaco.setBackground(Color.LIGHT_GRAY);
		chckbxCeliaco.setBounds(522, 274, 123, 31);
		contentPane.add(chckbxCeliaco);
		
		JButton btnCargarDatos = new JButton("Datos Actuales\r\n");
		btnCargarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Producto prod = lista.getProducto(comboBoxProducto.getSelectedIndex()-1);
				chckbxAzucar.setSelected(prod.isAzucar());
				chckbxAzucar.revalidate();
				chckbxCeliaco.setSelected(prod.isCeliaco());
				chckbxCeliaco.revalidate();
				chckbxVegano.setSelected(prod.isVegano());
				chckbxVegano.revalidate();
				chckbxVegetariano.setSelected(prod.isVegetariano());
				chckbxVegetariano.revalidate();
				textFieldDetalleProducto.setText(prod.getNombre());
				textFieldDetalleProducto.revalidate();
				jSpinPrecio.setValue(prod.getPrecio());
				jSpinPrecio.revalidate();
				jSpinStock.setValue(prod.getStock());
				jSpinStock.revalidate();
				jSpinStockMinimo.setValue(prod.getStockMin());
				jSpinStockMinimo.revalidate();
			}
		});
		btnCargarDatos.setForeground(Color.DARK_GRAY);
		btnCargarDatos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnCargarDatos.setBackground(Color.LIGHT_GRAY);
		btnCargarDatos.setBounds(577, 67, 211, 41);
		contentPane.add(btnCargarDatos);

		JButton btnConfirmar = new JButton("Confirmar ");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				lista.getProducto(comboBoxProducto.getSelectedIndex()-1).setAzucar(chckbxAzucar.isSelected());
				lista.getProducto(comboBoxProducto.getSelectedIndex()-1).setCeliaco(chckbxCeliaco.isSelected());
				lista.getProducto(comboBoxProducto.getSelectedIndex()-1).setVegano(chckbxVegano.isSelected());
				lista.getProducto(comboBoxProducto.getSelectedIndex()-1).setVegetariano(chckbxVegetariano.isSelected());
				lista.getProducto(comboBoxProducto.getSelectedIndex()-1).setNombre(textFieldDetalleProducto.getText());
				lista.getProducto(comboBoxProducto.getSelectedIndex()-1).setPrecio((int)jSpinPrecio.getValue());
				lista.getProducto(comboBoxProducto.getSelectedIndex()-1).setStock((int)jSpinStock.getValue());
				
				dispose();
			}
		});
		btnConfirmar.setForeground(new Color(0, 128, 0));
		btnConfirmar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnConfirmar.setBackground(Color.LIGHT_GRAY);
		btnConfirmar.setBounds(348, 450, 211, 41);
		contentPane.add(btnConfirmar);
		
		JLabel etiqueta_stockMinimo = new JLabel("Nuevo Stock Min :");
		etiqueta_stockMinimo.setVerticalAlignment(SwingConstants.CENTER);
		etiqueta_stockMinimo.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_stockMinimo.setForeground(Color.DARK_GRAY);
		etiqueta_stockMinimo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiqueta_stockMinimo.setBackground(Color.GRAY);
		etiqueta_stockMinimo.setBounds(78, 336, 128, 22);
		contentPane.add(etiqueta_stockMinimo);
	}
}
