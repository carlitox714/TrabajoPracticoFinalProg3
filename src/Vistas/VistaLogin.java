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
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VistaLogin extends JFrame
{
	private JPanel paneLogin;
	private JPasswordField campoContraseña;
	private JLabel etiquetaContraseniaIncorrecta;

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
					VistaLogin frame = new VistaLogin();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creacion de la ventana Menú de Inicio.
	 */
	public VistaLogin()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaLogin.class.getResource("/Imagenes/IconoVentana.png")));
		setTitle("Aurelia - Gesti\u00F3n de Stock");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		paneLogin = new JPanel();
		paneLogin.setForeground(new Color(192, 192, 192));
		paneLogin.setBackground(Color.WHITE);
		paneLogin.setBorder(UIManager.getBorder("PasswordField.border"));
		setContentPane(paneLogin);
		paneLogin.setLayout(null);		

		JLabel etiquetaContraseniaIncorrecta = new JLabel("Contrase\u00F1a incorrecta.");
		etiquetaContraseniaIncorrecta.setVisible(false);
		etiquetaContraseniaIncorrecta.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaContraseniaIncorrecta.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaContraseniaIncorrecta.setForeground(new Color(153, 0, 0));
		etiquetaContraseniaIncorrecta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaContraseniaIncorrecta.setBounds(514, 318, 164, 22);
		paneLogin.add(etiquetaContraseniaIncorrecta);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String password = campoContraseña.getText();
				
				if(password.equals("admin"))
				{
					try
					{
						VistaMenuPrincipal frame = new VistaMenuPrincipal();
						frame.setVisible(true);
						dispose();
					} catch (Exception e)
					{
						e.printStackTrace();
					}
				}else
				{
					
					etiquetaContraseniaIncorrecta.setVisible(true);
					campoContraseña.setText("");
					campoContraseña.setFocusable(true);
				}
			}
		});
		btnIniciar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnIniciar.setForeground(SystemColor.activeCaptionText);
		btnIniciar.setBackground(Color.LIGHT_GRAY);
		btnIniciar.setBounds(291, 424, 211, 41);
		paneLogin.add(btnIniciar);
		
		JLabel LogoInicio = new JLabel("");
		LogoInicio.setBounds(66, 64, 662, 196);
		paneLogin.add(LogoInicio);
		LogoInicio.setIcon(new ImageIcon(VistaLogin.class.getResource("/Imagenes/AureliaLogoCompleto.png")));
		
		JLabel pieDePagina1 = new JLabel("Almac\u00E9n de Alimentos Saludables - Gesti\u00F3n de Stock");
		pieDePagina1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pieDePagina1.setForeground(SystemColor.textInactiveText);
		pieDePagina1.setBounds(12, 530, 384, 22);
		paneLogin.add(pieDePagina1);
		
		JLabel pieDePagina2 = new JLabel("\u00A9 2020 - Los Hermosos");
		pieDePagina2.setForeground(SystemColor.textInactiveText);
		pieDePagina2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pieDePagina2.setBounds(610, 530, 172, 22);
		paneLogin.add(pieDePagina2);		
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
		btnCerrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnCerrar.setForeground(new Color(153, 0, 0));
		btnCerrar.setBackground(Color.LIGHT_GRAY);
		btnCerrar.setBounds(571, 476, 211, 41);
		paneLogin.add(btnCerrar);
		

		JLabel etiquetaContrasenia = new JLabel("Contrase\u00F1a : ");
		etiquetaContrasenia.setForeground(Color.DARK_GRAY);
		etiquetaContrasenia.setVerticalAlignment(SwingConstants.CENTER);
		etiquetaContrasenia.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaContrasenia.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		etiquetaContrasenia.setBounds(291, 318, 94, 22);
		paneLogin.add(etiquetaContrasenia);
		
		campoContraseña = new JPasswordField();
		campoContraseña.setEchoChar('*');
		campoContraseña.setBackground(Color.LIGHT_GRAY);
		campoContraseña.setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
		campoContraseña.setBounds(397, 319, 105, 24);
		paneLogin.add(campoContraseña);		
	}
}
