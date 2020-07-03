package Vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;

import com.sun.glass.events.WindowEvent;

import Productos.ListadoProducto;
import Productos.Producto;
import Productos.RegistroVenta;
import Productos.Venta;
import Productos.ListadoVentas;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import javax.swing.SwingConstants;

public class VistaMenuPrincipal extends JFrame
{
	private JPanel paneMenuPrincipal;
	
/*
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					VistaMenuPrincipal frame = new VistaMenuPrincipal();
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
	 * Creación de la Ventana de Menú Principal.
	 */
	public VistaMenuPrincipal(ListadoProducto<Producto> listProd, ListadoVentas<Integer, RegistroVenta<Venta>> listVentas)
	{		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/Imagenes/IconoVentana.png")));
		setTitle("Aurelia - Gesti\u00F3n de Stock");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(Color.WHITE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		
		
		paneMenuPrincipal = new JPanel();
		paneMenuPrincipal.setBackground(Color.WHITE);
		paneMenuPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(paneMenuPrincipal);
		paneMenuPrincipal.setLayout(null);
		
		// Etiquetas:
		
		JLabel pieDePagina1 = new JLabel("Almac\u00E9n de Alimentos Saludables - Gesti\u00F3n de Stock");
		pieDePagina1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pieDePagina1.setForeground(SystemColor.textInactiveText);
		pieDePagina1.setBounds(12, 543, 384, 22);
		paneMenuPrincipal.add(pieDePagina1);
		
		JLabel pieDePagina2 = new JLabel("\u00A9 2020 - AureliaMaster");
		pieDePagina2.setForeground(SystemColor.textInactiveText);
		pieDePagina2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pieDePagina2.setBounds(610, 543, 172, 22);
		paneMenuPrincipal.add(pieDePagina2);
		
		JLabel etiquetaGestionCaja = new JLabel("Gesti\u00F3n de Caja");
		etiquetaGestionCaja.setForeground(Color.DARK_GRAY);
		etiquetaGestionCaja.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaGestionCaja.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaGestionCaja.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaGestionCaja.setBounds(12, 209, 211, 41);
		paneMenuPrincipal.add(etiquetaGestionCaja);

		JLabel lblGestionDeProductos = new JLabel("Gesti\u00F3n de Productos");
		lblGestionDeProductos.setForeground(Color.DARK_GRAY);
		lblGestionDeProductos.setVerticalAlignment(SwingConstants.CENTER);
		lblGestionDeProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDeProductos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblGestionDeProductos.setBounds(291, 155, 211, 41);
		paneMenuPrincipal.add(lblGestionDeProductos);
		
		JLabel lblListados = new JLabel("Listados");
		lblListados.setForeground(Color.DARK_GRAY);
		lblListados.setVerticalAlignment(SwingConstants.CENTER);
		lblListados.setHorizontalAlignment(SwingConstants.CENTER);
		lblListados.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblListados.setBounds(571, 155, 211, 41);
		paneMenuPrincipal.add(lblListados);
		
		JLabel LogoAurelia = new JLabel("");
		LogoAurelia.setIcon(new ImageIcon(VistaMenuPrincipal.class.getResource("/Imagenes/AureliaLogoDibujo.jpg")));
		LogoAurelia.setBounds(66, 42, 100, 100);
		paneMenuPrincipal.add(LogoAurelia);
		
		JLabel lblMenPrincipal = new JLabel("Men\u00FA Principal");
		lblMenPrincipal.setVerticalAlignment(SwingConstants.CENTER);
		lblMenPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenPrincipal.setForeground(Color.DARK_GRAY);
		lblMenPrincipal.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		lblMenPrincipal.setBounds(291, 42, 211, 41);
		paneMenuPrincipal.add(lblMenPrincipal);
		
		// Botones: 

		JButton btnRegistrarVenta = new JButton("Registrar Venta");
		btnRegistrarVenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				try
				{
					VistaRegVentas frame = new VistaRegVentas(new JFrame(), true,listVentas,listProd);
					frame.setLocationRelativeTo(getContentPane());
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnRegistrarVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnRegistrarVenta.setForeground(Color.BLACK);
		btnRegistrarVenta.setBackground(Color.LIGHT_GRAY);
		btnRegistrarVenta.setBounds(12, 262, 211, 41);
		paneMenuPrincipal.add(btnRegistrarVenta);
		
		JButton btnListVentas = new JButton("Ventas\r\n\r\r\n");
		btnListVentas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnListVentas.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				try
				{
					VistaListVentas frame = new VistaListVentas(new JFrame(), true, listVentas);
					frame.setLocationRelativeTo(getContentPane());
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnListVentas.setForeground(SystemColor.activeCaptionText);
		btnListVentas.setBackground(Color.LIGHT_GRAY);
		btnListVentas.setBounds(571, 209, 211, 41);
		paneMenuPrincipal.add(btnListVentas);
		
		JButton btnAgregarProducto = new JButton("Agregar Producto");
		btnAgregarProducto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				try
				{
					VistaAgregProducto frame = new VistaAgregProducto(new JFrame(), true, listProd);
					frame.setLocationRelativeTo(getContentPane());
					frame.setVisible(true);
					
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnAgregarProducto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnAgregarProducto.setForeground(Color.BLACK);
		btnAgregarProducto.setBackground(Color.LIGHT_GRAY);
		btnAgregarProducto.setBounds(301, 209, 211, 41);
		paneMenuPrincipal.add(btnAgregarProducto);
		
		JButton btnEditarProducto = new JButton("Editar Producto");
		btnEditarProducto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				try
				{
					VistaEditarProducto frame = new VistaEditarProducto(new JFrame(), true, listProd);
					frame.setLocationRelativeTo(getContentPane());
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnEditarProducto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnEditarProducto.setForeground(Color.BLACK);
		btnEditarProducto.setBackground(Color.LIGHT_GRAY);
		btnEditarProducto.setBounds(301, 262, 211, 41);
		paneMenuPrincipal.add(btnEditarProducto);
		
		JButton btnListProdID = new JButton("Productos (por ID)");
		btnListProdID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try
				{
					VistaListProducID frame = new VistaListProducID(new JFrame(),true,listProd);
					frame.setLocationRelativeTo(getComponentAt(getLocationOnScreen()));
					frame.setVisible(true);
				} catch (Exception c)
				{
					c.printStackTrace();
				}
			
			}
		});
		
		btnListProdID.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		
		btnListProdID.setForeground(Color.BLACK);
		btnListProdID.setBackground(Color.LIGHT_GRAY);
		btnListProdID.setBounds(571, 262, 211, 41);
		paneMenuPrincipal.add(btnListProdID);
		
		JButton btnProductosAlfabetico = new JButton("Productos (Alfab\u00E9tico)");
		btnProductosAlfabetico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				try
				{
					VistaListProducAlfab frame = new VistaListProducAlfab(new JFrame(), true, listProd);
					frame.setLocationRelativeTo(getContentPane());
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnProductosAlfabetico.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnProductosAlfabetico.setForeground(Color.BLACK);
		btnProductosAlfabetico.setBackground(Color.LIGHT_GRAY);
		btnProductosAlfabetico.setBounds(571, 316, 211, 41);
		paneMenuPrincipal.add(btnProductosAlfabetico);
		
		JButton btnSalir = new JButton("Guardar y Salir");
		btnSalir.setForeground(new Color(153, 51, 51));
		btnSalir.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnSalir.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				try {
					listProd.guardarArchivo();
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
			}
		});
		btnSalir.setBackground(Color.LIGHT_GRAY);
		btnSalir.setBounds(571, 476, 211, 41);
		paneMenuPrincipal.add(btnSalir);
	}

	
	
	private void actionPerformed(ActionEvent arg0, ListadoProducto<Producto> listProd) 
	{
		try
		{
			VistaListProducID frame = new VistaListProducID(this,true,listProd);
			frame.setVisible(true);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
