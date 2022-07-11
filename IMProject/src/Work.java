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
import com.toedter.calendar.JDateChooser;



public class Work extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Work frame = new Work();
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
	public Work() {
		setBackground(new Color(1, 5, 61));
		setResizable(false);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\279047859_1007881573178208_4501628566212263289_n-removebg-preview.png"));
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\OneDrive - Polytechnic University of the Philippines\\\\Desktop\\\\4.png").getImage().getScaledInstance( 800, 500 , Image.SCALE_DEFAULT));
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(128, 285, 138, 25);
		contentPane.add(dateChooser_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(144, 233, 122, 25);
		contentPane.add(dateChooser);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(205, 337, 85, 25);
		contentPane.add(textField_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 181, 298, 25);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(106, 129, 298, 25);
		contentPane.add(textField);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
		
	public void actionPerformed(java.awt.event.ActionEvent evt)  {
			Submit sub = new Submit ();	
			sub.show();
			dispose();		
	}
	
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		btnSubmit.setBackground(new Color(1, 29, 41));
		btnSubmit.setBounds(511, 387, 245, 63);
		contentPane.add(btnSubmit);
		
		JButton btnAddMoreExperience = new JButton("Add More Experience");
		btnAddMoreExperience.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
				
				
	}
		

		});
		btnAddMoreExperience.setForeground(Color.WHITE);
		btnAddMoreExperience.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		btnAddMoreExperience.setBackground(new Color(1, 29, 41));
		btnAddMoreExperience.setBounds(45, 387, 245, 63);
		contentPane.add(btnAddMoreExperience);
		
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