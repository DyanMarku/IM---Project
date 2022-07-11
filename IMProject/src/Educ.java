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
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JYearChooser;



public class Educ extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Educ frame = new Educ();
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
	public Educ() {
		setBackground(new Color(1, 5, 61));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\279047859_1007881573178208_4501628566212263289_n-removebg-preview.png"));
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\Lenovo\\OneDrive - Polytechnic University of the Philippines\\Desktop\\3.png").getImage().getScaledInstance( 800, 500, Image.SCALE_DEFAULT));
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(160, 309, 61, 25);
		contentPane.add(yearChooser);
		
		JButton btnAddMoreEducation = new JButton("GO BACK");
		btnAddMoreEducation.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt)  {
				Applicant app = new Applicant ();	
				app.show();
				dispose();		
			}		
			
		});
		btnAddMoreEducation.setForeground(Color.WHITE);
		btnAddMoreEducation.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		btnAddMoreEducation.setBackground(new Color(1, 29, 41));
		btnAddMoreEducation.setBounds(45, 387, 245, 63);
		contentPane.add(btnAddMoreEducation);
		
		JButton btnNewButton = new JButton("ADD EDUCATION");
		btnNewButton.addActionListener(new ActionListener() {
		
		public void actionPerformed(java.awt.event.ActionEvent evt)  {
		
		}		
		
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(1, 29, 41));
		btnNewButton.setBounds(509, 387, 245, 63);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(101, 259, 120, 25);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 206, 594, 25);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(101, 154, 571, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 800, 500);
		lblNewLabel.setIcon(imageIcon);
		contentPane.add(lblNewLabel);
		
		
	
	}
}




