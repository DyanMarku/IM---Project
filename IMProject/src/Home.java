import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;



public class Home extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the Applicant.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setBackground(new Color(1, 5, 61));
		setResizable(false);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\279047859_1007881573178208_4501628566212263289_n-removebg-preview.png"));
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\OneDrive - Polytechnic University of the Philippines\\\\Desktop\\\\1.png").getImage().getScaledInstance( 800, 500 , Image.SCALE_DEFAULT));
		
		JButton btnNewButton = new JButton("APPLY");
		btnNewButton.addActionListener(new ActionListener() {
		
	public void actionPerformed(java.awt.event.ActionEvent evt)  {
		Applicant apply = new Applicant ();	
		apply.show();
		dispose();
	}
	
		});
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(1, 29, 44));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(295, 286, 206, 38);
		contentPane.add(btnNewButton);
		
		JButton btnHrTeam = new JButton("HR TEAM");
		btnHrTeam.addActionListener(new ActionListener() {
			
	public void actionPerformed(java.awt.event.ActionEvent evt)  {
		HRLog hr = new HRLog ();	
		hr.show();
		dispose();
	}
			
			
		});
		btnHrTeam.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 17));
		btnHrTeam.setForeground(Color.WHITE);
		btnHrTeam.setBackground(new Color(0, 39, 51));
		btnHrTeam.setBounds(295, 343, 206, 38);
		contentPane.add(btnHrTeam);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 800, 500);
		lblNewLabel.setIcon(imageIcon);
		contentPane.add(lblNewLabel);
		
	
	
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}




