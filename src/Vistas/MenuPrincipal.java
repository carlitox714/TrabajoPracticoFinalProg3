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
		btnNewButton.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				
			}
		});
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.setBackground(SystemColor.controlDkShadow);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
			}
		});
		btnNewButton.setBounds(571, 209, 211, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Almac\u00E9n de Alimentos Saludables - Gesti\u00F3n de Stock");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1.setBounds(12, 522, 422, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u00A9 2020 - Los Hermosos");
		lblNewLabel_1_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(593, 522, 189, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnRegistrarVenta = new JButton("Registrar Venta");
		btnRegistrarVenta.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusGained(FocusEvent arg0)
			{
				
			}
		});
		btnRegistrarVenta.setForeground(Color.BLACK);
		btnRegistrarVenta.setBackground(SystemColor.controlDkShadow);
		btnRegistrarVenta.setBounds(12, 262, 211, 41);
		contentPane.add(btnRegistrarVenta);
		
		JButton btnNewButton_1_1 = new JButton("Agregar Producto");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(SystemColor.controlDkShadow);
		btnNewButton_1_1.setBounds(291, 209, 211, 41);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("Gesti\u00F3n de Caja");
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 155, 211, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1_1_1 = new JButton("Editar Producto");
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setBackground(SystemColor.controlDkShadow);
		btnNewButton_1_1_1.setBounds(291, 262, 211, 41);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Registrar Compra");
		btnNewButton_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_2.setBackground(SystemColor.controlDkShadow);
		btnNewButton_1_1_2.setBounds(291, 316, 211, 41);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnListaDeProductos = new JButton("Productos (por ID)");
		btnListaDeProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnListaDeProductos.setForeground(Color.BLACK);
		btnListaDeProductos.setBackground(SystemColor.controlDkShadow);
		btnListaDeProductos.setBounds(571, 262, 211, 41);
		contentPane.add(btnListaDeProductos);
		
		JButton btnProductosporStock = new JButton("Productos (por Stock)");
		btnProductosporStock.setForeground(Color.BLACK);
		btnProductosporStock.setBackground(SystemColor.controlDkShadow);
		btnProductosporStock.setBounds(571, 316, 211, 41);
		contentPane.add(btnProductosporStock);
		
		JLabel lblGestinDeProductos = new JLabel("Gesti\u00F3n de Productos");
		lblGestinDeProductos.setVerticalAlignment(SwingConstants.CENTER);
		lblGestinDeProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinDeProductos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGestinDeProductos.setBounds(291, 155, 211, 41);
		contentPane.add(lblGestinDeProductos);
		
		JLabel lblListados = new JLabel("Listados");
		lblListados.setVerticalAlignment(SwingConstants.CENTER);
		lblListados.setHorizontalAlignment(SwingConstants.CENTER);
		lblListados.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblListados.setBounds(571, 155, 211, 41);
		contentPane.add(lblListados);
	}
}
