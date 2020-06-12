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
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

public class RegistroVenta extends JFrame
{
	private JPanel contentPane;
	private JTable table;
	private JTable tablaVentas;

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
					RegistroVenta frame = new RegistroVenta();
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
	public RegistroVenta()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistroVenta.class.getResource("/Imagenes/AureliaTituloRecortado.png")));
		setTitle("Aurelia - Registro de Venta");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Almac\u00E9n de Alimentos Saludables - Gesti\u00F3n de Stock");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1.setBounds(12, 830, 384, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u00A9 2020 - Los Hermosos");
		lblNewLabel_1_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(610, 830, 172, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnRegistrarVenta = new JButton("Cancelar");
		btnRegistrarVenta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnRegistrarVenta.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusGained(FocusEvent arg0)
			{
				
			}
		});
		btnRegistrarVenta.setForeground(new Color(153, 0, 0));
		btnRegistrarVenta.setBackground(Color.LIGHT_GRAY);
		btnRegistrarVenta.setBounds(571, 776, 211, 41);
		contentPane.add(btnRegistrarVenta);
		
		table = new JTable();
		table.setBounds(247, 221, 73, -74);
		contentPane.add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Nueva Venta");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(291, 13, 211, 41);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(153, 67, 569, 41);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2_1 = new JLabel("Producto:");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_2_1.setBackground(Color.GRAY);
		lblNewLabel_2_1.setBounds(69, 74, 72, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("ID:");
		lblNewLabel_2_1_1.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(121, 128, 20, 22);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Stock:");
		lblNewLabel_2_1_2.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_2_1_2.setBackground(Color.GRAY);
		lblNewLabel_2_1_2.setBounds(305, 128, 45, 22);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Precio:");
		lblNewLabel_2_1_2_1.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_2_1_2_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_2_1.setBounds(514, 128, 50, 22);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Cantidad:");
		lblNewLabel_2_1_2_1_1.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_2_1_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_2_1_1.setBounds(249, 169, 69, 22);
		contentPane.add(lblNewLabel_2_1_2_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		spinner.setBounds(330, 171, 172, 22);
		contentPane.add(spinner);
		
		JButton btnRegistrarVenta_1 = new JButton("Registrar Venta");
		btnRegistrarVenta_1.setForeground(Color.BLACK);
		btnRegistrarVenta_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnRegistrarVenta_1.setBackground(Color.LIGHT_GRAY);
		btnRegistrarVenta_1.setBounds(348, 776, 211, 41);
		contentPane.add(btnRegistrarVenta_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(153, 128, 140, 28);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setBounds(362, 128, 140, 28);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textPane_2.setBackground(Color.LIGHT_GRAY);
		textPane_2.setBounds(571, 128, 140, 28);
		contentPane.add(textPane_2);
		
		JButton btnRegistrarVenta_1_1 = new JButton("A\u00F1adir a la Lista");
		btnRegistrarVenta_1_1.setForeground(Color.BLACK);
		btnRegistrarVenta_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnRegistrarVenta_1_1.setBackground(Color.LIGHT_GRAY);
		btnRegistrarVenta_1_1.setBounds(511, 169, 211, 41);
		contentPane.add(btnRegistrarVenta_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Lista de Venta");
		lblNewLabel_2_2.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		lblNewLabel_2_2.setBackground(Color.GRAY);
		lblNewLabel_2_2.setBounds(69, 221, 211, 41);
		contentPane.add(lblNewLabel_2_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(79, 275, 643, 350);
		contentPane.add(scrollPane);
		
		tablaVentas = new JTable();
		tablaVentas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Detalle Producto", "Precio Unidad", "Cantidad"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(100);
		tablaVentas.getColumnModel().getColumn(1).setPreferredWidth(450);
		tablaVentas.getColumnModel().getColumn(2).setPreferredWidth(100);
		tablaVentas.getColumnModel().getColumn(3).setPreferredWidth(150);
		tablaVentas.setFont(new Font("Courier New", Font.PLAIN, 16));
		scrollPane.setViewportView(tablaVentas);
	}
}
