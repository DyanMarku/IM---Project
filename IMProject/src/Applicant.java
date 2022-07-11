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
import javax.swing.JComponent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.List;
import java.awt.Checkbox;
import com.toedter.calendar.JCalendar;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.JDatePanelImpl;
import javax.swing.JFormattedTextField.AbstractFormatter;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;



public class Applicant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTable table_1;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the Applicant.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Applicant frame = new Applicant();
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
	public Applicant() {
		
		
		
		setBackground(new Color(1, 5, 61));
		setResizable(false);
		
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\279047859_1007881573178208_4501628566212263289_n-removebg-preview.png"));
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\Downloads\\\\T - WORK (Resume) (2).png").getImage().getScaledInstance( 590, 700, Image.SCALE_SMOOTH));
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
		
		public void actionPerformed(java.awt.event.ActionEvent evt)  {
			Submit sub = new Submit ();	
			sub.show();
			dispose();		
		}		
		
		});
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt)  {
			Educ educ = new Educ ();	
			educ.show();
			dispose();		
		}		
			
		});
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 505, 564, 131);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setBackground(Color.CYAN);
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", null, null, null},
				{null, null, null, null, null},
				{null, null, "", null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"COMPANY", "POSITION", "DATE STARTED", "DATE ENDED", "LENGTH OF EXP"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(174);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(163);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(86);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(88);
		
		panel = new JPanel();
		panel.setBounds(10, 306, 564, 136);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(-6, -16, 576, 158);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 11, 564, 141);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.CYAN);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, "", ""},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"SCHOOL", "SCHOOL ADDRESS", "DEGREE", "YEAR GRADUATED"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(156);
		table.getColumnModel().getColumn(1).setPreferredWidth(192);
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setPreferredWidth(102);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(384, 133, 70, 20);
		contentPane.add(dateChooser);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(537, 218, 37, 17);
		contentPane.add(textField_11);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(384, 217, 111, 17);
		contentPane.add(textField_10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(224, 218, 111, 17);
		contentPane.add(textField_9);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(81, 218, 115, 17);
		contentPane.add(textField_8);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(249, 190, 325, 17);
		contentPane.add(textField_7);
		
		JButton btnAdd_1 = new JButton("ADD");
		btnAdd_1.addActionListener(new ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt)  {
			Work worker = new Work ();	
			worker.show();
			dispose();		
		}		
			
		});
		btnAdd_1.setForeground(Color.WHITE);
		btnAdd_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 17));
		btnAdd_1.setBackground(Color.CYAN);
		btnAdd_1.setBounds(511, 458, 73, 34);
		contentPane.add(btnAdd_1);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 17));
		btnAdd.setBackground(Color.CYAN);
		btnAdd.setBounds(511, 259, 73, 34);
		contentPane.add(btnAdd);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(537, 133, 37, 17);
		contentPane.add(textField_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(476, 133, 37, 17);
		contentPane.add(textField_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(262, 133, 73, 17);
		contentPane.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(102, 134, 92, 17);
		contentPane.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(537, 105, 37, 17);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(308, 105, 149, 17);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(92, 106, 160, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		btnNewButton.setBackground(new Color(1, 29, 41));
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(361, 641, 188, 39);
		contentPane.add(btnNewButton);
		

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, -12, 698, 740);
		lblNewLabel.setIcon(imageIcon);
		contentPane.add(lblNewLabel);
		
	
	}
}




