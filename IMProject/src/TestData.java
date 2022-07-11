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
import javax.swing.JTextField;



public class TestData extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestData frame = new TestData();
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
	public TestData() {
		setBackground(new Color(1, 5, 61));
		setResizable(false);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\279047859_1007881573178208_4501628566212263289_n-removebg-preview.png"));
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\OneDrive - Polytechnic University of the Philippines\\\\Desktop\\\\8.png").getImage().getScaledInstance( 800, 500 , Image.SCALE_DEFAULT));
		
		JButton btnGoBackTo = new JButton("EDIT");
		btnGoBackTo.addActionListener(new ActionListener() {
	
	public void actionPerformed(java.awt.event.ActionEvent evt)  {
			TestData test = new TestData ();	
			test.show();
			dispose();		
		}
	
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 47, 716, 338);
		contentPane.add(panel);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			
			
	public void actionPerformed(java.awt.event.ActionEvent evt)  {
		Home hom = new Home ();	
		hom.show();
		dispose();		
	}
			
		});
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		btnHome.setBackground(new Color(101, 128, 252));
		btnHome.setBounds(658, 11, 102, 36);
		contentPane.add(btnHome);
		
		JButton btnGoBackTo_1_1 = new JButton("DELETE");
		btnGoBackTo_1_1.setForeground(Color.WHITE);
		btnGoBackTo_1_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		btnGoBackTo_1_1.setBackground(new Color(101, 128, 252));
		btnGoBackTo_1_1.setBounds(510, 386, 246, 64);
		contentPane.add(btnGoBackTo_1_1);
		
		JButton btnShowRecords = new JButton("SHOW RECORDS");
		btnShowRecords.setForeground(Color.WHITE);
		btnShowRecords.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		btnShowRecords.setBackground(new Color(101, 128, 252));
		btnShowRecords.setBounds(282, 386, 246, 64);
		contentPane.add(btnShowRecords);
		btnGoBackTo.setForeground(Color.WHITE);
		btnGoBackTo.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		btnGoBackTo.setBackground(new Color(101, 128, 252));
		btnGoBackTo.setBounds(43, 386, 246, 64);
		contentPane.add(btnGoBackTo);
		
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




