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
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class MenuInicio extends JFrame
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
					MenuInicio frame = new MenuInicio();
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
	public MenuInicio()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuInicio.class.getResource("/Imagenes/AureliaTituloRecortado.png")));
		setTitle("Aurelia - Gesti\u00F3n de Stock");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
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
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(291, 361, 211, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(60, 80, 662, 196);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(MenuInicio.class.getResource("/Imagenes/AureliaLogoCompleto.png")));
		
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
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCerrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnCerrar.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				System.exit(0);
			}
		});
		btnCerrar.setForeground(new Color(153, 0, 0));
		btnCerrar.setBackground(Color.LIGHT_GRAY);
		btnCerrar.setBounds(571, 476, 211, 41);
		contentPane.add(btnCerrar);
	}
}
