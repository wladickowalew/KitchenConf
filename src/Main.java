import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Component;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField fio_tf;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel hello_lbl = new JLabel("\u041F\u0440\u0438\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u0435\u043C \u043D\u0430 \u043A\u043E\u043D\u0444\u0435\u0440\u0435\u043D\u0446\u0438\u0438 \u041F\u043E\u0432\u0430\u0440\u043E\u0432.\r\n\r\n \u041F\u043E\u0436\u0430\u043B\u0443\u0439\u0441\u0442\u0430, \u043E\u0442\u0432\u0435\u0442\u044C\u0442\u0435 \u043D\u0430 \u043D\u0435\u0441\u043A\u043E\u043B\u044C\u043A\u043E \u0432\u043E\u043F\u0440\u043E\u0441\u043E\u0432");
		hello_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hello_lbl.setBounds(70, 11, 842, 90);
		contentPane.add(hello_lbl);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(70, 157, 352, 90);
		contentPane.add(verticalBox);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		JLabel fio_lbl = new JLabel("\u0424\u0418\u041E");
		horizontalBox.add(fio_lbl);
		fio_lbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		fio_tf = new JTextField();
		horizontalBox.add(fio_tf);
		fio_tf.setColumns(10);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		JLabel label = new JLabel("\u0424\u0418\u041E");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		horizontalBox_1.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		horizontalBox_1.add(textField);
	}
}
