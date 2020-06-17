package Vistas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import Productos.RegistroVenta;
import Productos.Venta;
import Productos.ListadoVentas;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.UIManager;

public class VistaListVentas extends JDialog
{
	private JPanel contentPane;
	private static ListadoVentas<Integer,RegistroVenta<Venta>> listVentas;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					VistaListVentas frame = new VistaListVentas(listVentas);
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
	public VistaListVentas(java.awt.Frame parent, boolean modo, ListadoVentas<Integer,RegistroVenta<Venta>> lista)
	{
		super(parent,modo);
		setType(Type.POPUP);
		setResizable(false);
		setUndecorated(true);
		setSize(792, 515);
		setBackground(Color.WHITE);
		setAlwaysOnTop(true);
		
		VistaListVentas.listVentas = lista; 
		
		/*
		 * Contenido en Ventana				
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(UIManager.getBorder("List.noFocusBorder"));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel etiquetaTitulo = new JLabel("Lista de Ventas\r\n");
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
		
		JList<String> listaParcialProductos = new JList<String>();
		listaParcialProductos.setForeground(Color.DARK_GRAY);
		listaParcialProductos.setFont(new Font("Courier New", Font.PLAIN, 17));
		listaParcialProductos.setBackground(Color.LIGHT_GRAY);
		listaParcialProductos.setModel(listaParcial);
		scrollPane.setViewportView(listaParcialProductos);
	}
}
