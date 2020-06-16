package Vistas;


import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;

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
import javax.swing.ListModel;

import Productos.RegistroVenta;
import Productos.Venta;
import Productos.ListadoProducto;
import Productos.ListadoVentas;
import Productos.Producto;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.UIManager;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.LineBorder;

public class VistaListProducID extends JDialog
{
	private JPanel contentPane;
	private Object JDialog;
	
	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					VistaListProducID frame = new VistaListProducID();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				} 
		});
	}*/

	/**
	 * Create the frame.
	 */
	public VistaListProducID(java.awt.Frame parent, boolean bobo, ListadoProducto<Producto> lista)
	{
		super(parent,bobo);
	setType(Type.POPUP);
		setResizable(false);
	
		
		setUndecorated(true);
		
	
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/Imagenes/IconoVentana.png")));
		setTitle("Aurelia - Listado de Productos Ordenados por ID\r\n\r\n");
		setBackground(Color.WHITE);
		
		setSize(790, 560);
		/*
		 * Contenido en Ventana				
		 */
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setBackground(Color.WHITE);
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

		JLabel etiquetaTitulo = new JLabel("Listado Productos Ordenados por ID\r\n");
		etiquetaTitulo.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaTitulo.setForeground(Color.DARK_GRAY);
		etiquetaTitulo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		etiquetaTitulo.setBackground(Color.GRAY);
		etiquetaTitulo.setBounds(204, 13, 385, 30);
		contentPane.add(etiquetaTitulo);
		
		// Botones:
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0){
				dispose();
			}
		});
		btnVolver.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnVolver.setForeground(new Color(153, 0, 0));
		btnVolver.setBackground(Color.LIGHT_GRAY);
		btnVolver.setBounds(571, 450, 211, 41);
		contentPane.add(btnVolver);
		
		// Lista

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 65, 654, 350);
		contentPane.add(scrollPane);
		
		DefaultListModel<String> listaParcial = new DefaultListModel<String>();
		
		listaParcial = lista.listadoString();
		
		JList<String> listaParcialProductos = new JList<String>();
		listaParcialProductos.setForeground(Color.DARK_GRAY);
		listaParcialProductos.setFont(new Font("Courier New", Font.PLAIN, 17));
		listaParcialProductos.setBackground(Color.LIGHT_GRAY);
		listaParcialProductos.setModel(listaParcial);
		scrollPane.setViewportView(listaParcialProductos);
	}
}
