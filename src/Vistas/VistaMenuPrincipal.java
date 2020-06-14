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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;

public class VistaMenuPrincipal extends JFrame
{
	private JPanel paneMenuPrincipal;

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
					VistaMenuPrincipal frame = new VistaMenuPrincipal();
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
	public VistaMenuPrincipal()
	{
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/Imagenes/IconoVentana.png")));
		setTitle("Aurelia - Gesti\u00F3n de Stock - Men\u00FA Principal");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		paneMenuPrincipal = new JPanel();
		paneMenuPrincipal.setBackground(Color.WHITE);
		paneMenuPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(paneMenuPrincipal);
		paneMenuPrincipal.setLayout(null);
		
		JButton btnRegistroVentas = new JButton("Registro de Ventas\n\r\n");
		btnRegistroVentas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnRegistroVentas.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				
			}
		});
		btnRegistroVentas.setForeground(SystemColor.activeCaptionText);
		btnRegistroVentas.setBackground(Color.LIGHT_GRAY);
		btnRegistroVentas.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
			}
		});
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setSize(20, 20);
		popupMenu.setLocation(500, 500);
		addPopup(paneMenuPrincipal, popupMenu);
		btnRegistroVentas.setBounds(571, 209, 211, 41);
		paneMenuPrincipal.add(btnRegistroVentas);
		
		JLabel pieDePagina1 = new JLabel("Almac\u00E9n de Alimentos Saludables - Gesti\u00F3n de Stock");
		pieDePagina1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pieDePagina1.setForeground(SystemColor.textInactiveText);
		pieDePagina1.setBounds(12, 530, 384, 22);
		paneMenuPrincipal.add(pieDePagina1);
		
		JLabel pieDePagina2 = new JLabel("\u00A9 2020 - Los Hermosos");
		pieDePagina2.setForeground(SystemColor.textInactiveText);
		pieDePagina2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pieDePagina2.setBounds(610, 530, 172, 22);
		paneMenuPrincipal.add(pieDePagina2);
		
		JButton btnRegistrarVenta = new JButton("Registrar Venta");
		btnRegistrarVenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					VistaRegVentas frame = new VistaRegVentas(null);
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
		
		JButton btnAgregarProducto = new JButton("Agregar Producto");
		btnAgregarProducto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					VistaAgregProducto frame = new VistaAgregProducto(null);
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
		
		JLabel etiquetaGestionCaja = new JLabel("Gesti\u00F3n de Caja");
		etiquetaGestionCaja.setForeground(Color.DARK_GRAY);
		etiquetaGestionCaja.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaGestionCaja.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaGestionCaja.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaGestionCaja.setBounds(12, 209, 211, 41);
		paneMenuPrincipal.add(etiquetaGestionCaja);
		
		JButton btnEditarProducto = new JButton("Editar Producto");
		btnEditarProducto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnEditarProducto.setForeground(Color.BLACK);
		btnEditarProducto.setBackground(Color.LIGHT_GRAY);
		btnEditarProducto.setBounds(301, 262, 211, 41);
		paneMenuPrincipal.add(btnEditarProducto);
		
		JButton btnRegistrarCompra = new JButton("Registrar Compra");
		btnRegistrarCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					VistaRegCompras frame = new VistaRegCompras(null);
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnRegistrarCompra.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnRegistrarCompra.setForeground(Color.BLACK);
		btnRegistrarCompra.setBackground(Color.LIGHT_GRAY);
		btnRegistrarCompra.setBounds(301, 316, 211, 41);
		paneMenuPrincipal.add(btnRegistrarCompra);
		
		JButton btnListaDeProductos = new JButton("Productos (por ID)");
		btnListaDeProductos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnListaDeProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnListaDeProductos.setForeground(Color.BLACK);
		btnListaDeProductos.setBackground(Color.LIGHT_GRAY);
		btnListaDeProductos.setBounds(571, 262, 211, 41);
		paneMenuPrincipal.add(btnListaDeProductos);
		
		JButton btnProductosporStock = new JButton("Productos (por Stock)");
		btnProductosporStock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnProductosporStock.setForeground(Color.BLACK);
		btnProductosporStock.setBackground(Color.LIGHT_GRAY);
		btnProductosporStock.setBounds(571, 316, 211, 41);
		paneMenuPrincipal.add(btnProductosporStock);
		
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
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(new Color(153, 51, 51));
		btnCerrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnCerrar.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				System.exit(0);
			}
		});
		btnCerrar.setBackground(Color.LIGHT_GRAY);
		btnCerrar.setBounds(571, 476, 211, 41);
		paneMenuPrincipal.add(btnCerrar);
		
		JLabel lblMenPrincipal = new JLabel("Men\u00FA Principal");
		lblMenPrincipal.setVerticalAlignment(SwingConstants.CENTER);
		lblMenPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenPrincipal.setForeground(Color.DARK_GRAY);
		lblMenPrincipal.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		lblMenPrincipal.setBounds(291, 13, 211, 41);
		paneMenuPrincipal.add(lblMenPrincipal);
	}
	private static void addPopup(Component component, final JPopupMenu popup)
	{
		component.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e)
			{
				if (e.isPopupTrigger())
					showMenu(e);
			}
			public void mouseReleased(MouseEvent e)
			{
				if (e.isPopupTrigger())
					showMenu(e);
			}
			private void showMenu(MouseEvent e)
			{
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
