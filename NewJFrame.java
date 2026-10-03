import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class NewJFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField authorField;
	private JTextField genreField;
	private JTextField ratingField;
	private JTextField titleField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJFrame frame = new NewJFrame();
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
	public NewJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea bookListArea = new JTextArea();
		bookListArea.setBounds(10, 128, 276, 124);
		bookListArea.setEditable(false);
		contentPane.add(bookListArea);
		
		JLabel lblNewLabel = new JLabel("Book Manager");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(127, 11, 179, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Author:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 53, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Genre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 86, 72, 20);
		contentPane.add(lblNewLabel_2);
		
		authorField = new JTextField();
		authorField.setBounds(83, 53, 96, 20);
		contentPane.add(authorField);
		authorField.setColumns(10);
		
		genreField = new JTextField();
		genreField.setBounds(83, 89, 96, 20);
		contentPane.add(genreField);
		genreField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Title:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(214, 51, 60, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rating:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(214, 81, 72, 31);
		contentPane.add(lblNewLabel_4);
		
		ratingField = new JTextField();
		ratingField.setBounds(296, 89, 96, 20);
		contentPane.add(ratingField);
		ratingField.setColumns(10);
		
		titleField = new JTextField();
		titleField.setBounds(296, 53, 96, 20);
		contentPane.add(titleField);
		titleField.setColumns(10);
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookListArea.setText("");
			}
		});
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		deleteButton.setBounds(304, 190, 122, 29);
		contentPane.add(deleteButton);
		
		JButton addButton = new JButton("Add Book");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title  = titleField.getText();
				String author = authorField.getText();
				String genre  = genreField.getText();
				int    rating = Integer.parseInt(ratingField.getText());
				
				if (e.getSource() == addButton) {
					Book book = new Book(title, author, genre, rating);
					bookListArea.append(book + "\n");
				}
				
			}
		});
		addButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		addButton.setBounds(304, 150, 122, 29);
		contentPane.add(addButton);
		

	}
}
