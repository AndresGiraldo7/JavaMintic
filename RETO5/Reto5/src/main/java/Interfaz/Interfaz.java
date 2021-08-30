package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class Interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		tabbedPane.addTab("Consulta 1", null, btnNewButton, null);
		
		JButton btnNewButton_1 = new JButton("New button");
		tabbedPane.addTab("Consulta 2", null, btnNewButton_1, null);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		tabbedPane.addTab("Consulta 3", null, btnNewButton_1_1, null);
	}
}
