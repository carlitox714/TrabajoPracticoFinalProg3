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

public class MenuPrincipal extends JFrame
{
	private JPanel contentPane;

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
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/Imagenes/AureliaTituloRecortado.png")));
		setTitle("Aurelia - Gesti\u00F3n de Stock");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Registros de Venta\r\n\r\n");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				
			}
		});
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
			}
		});
		btnNewButton.setBounds(571, 209, 211, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Almac\u00E9n de Alimentos Saludables - Gesti\u00F3n de Stock");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1.setBounds(12, 530, 384, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u00A9 2020 - Los Hermosos");
		lblNewLabel_1_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(610, 530, 172, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnRegistrarVenta = new JButton("Registrar Venta");
		btnRegistrarVenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					RegistroVenta frame = new RegistroVenta();
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
		contentPane.add(btnRegistrarVenta);
		
		JButton btnNewButton_1_1 = new JButton("Agregar Producto");
		btnNewButton_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setBounds(301, 209, 211, 41);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("Gesti\u00F3n de Caja");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel.setBounds(12, 155, 211, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1_1_1 = new JButton("Editar Producto");
		btnNewButton_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_1.setBounds(301, 262, 211, 41);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Registrar Compra");
		btnNewButton_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_2.setBounds(301, 316, 211, 41);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnListaDeProductos = new JButton("Productos (por ID)");
		btnListaDeProductos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnListaDeProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnListaDeProductos.setForeground(Color.BLACK);
		btnListaDeProductos.setBackground(Color.LIGHT_GRAY);
		btnListaDeProductos.setBounds(571, 262, 211, 41);
		contentPane.add(btnListaDeProductos);
		
		JButton btnProductosporStock = new JButton("Productos (por Stock)");
		btnProductosporStock.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnProductosporStock.setForeground(Color.BLACK);
		btnProductosporStock.setBackground(Color.LIGHT_GRAY);
		btnProductosporStock.setBounds(571, 316, 211, 41);
		contentPane.add(btnProductosporStock);
		
		JLabel lblGestinDeProductos = new JLabel("Gesti\u00F3n de Productos");
		lblGestinDeProductos.setForeground(Color.DARK_GRAY);
		lblGestinDeProductos.setVerticalAlignment(SwingConstants.CENTER);
		lblGestinDeProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinDeProductos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblGestinDeProductos.setBounds(291, 155, 211, 41);
		contentPane.add(lblGestinDeProductos);
		
		JLabel lblListados = new JLabel("Listados");
		lblListados.setForeground(Color.DARK_GRAY);
		lblListados.setVerticalAlignment(SwingConstants.CENTER);
		lblListados.setHorizontalAlignment(SwingConstants.CENTER);
		lblListados.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblListados.setBounds(571, 155, 211, 41);
		contentPane.add(lblListados);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Imagenes/AureliaLogoDibujo.jpg")));
		lblNewLabel_2.setBounds(12, 13, 100, 100);
		contentPane.add(lblNewLabel_2);
		
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
		contentPane.add(btnCerrar);
		
		JLabel lblMenPrincipal = new JLabel("Men\u00FA Principal");
		lblMenPrincipal.setVerticalAlignment(SwingConstants.CENTER);
		lblMenPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenPrincipal.setForeground(Color.DARK_GRAY);
		lblMenPrincipal.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		lblMenPrincipal.setBounds(291, 13, 211, 41);
		contentPane.add(lblMenPrincipal);
	}
}
