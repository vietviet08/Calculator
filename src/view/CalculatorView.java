package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import controller.CalculatorListener;
import model.CalculatorModel;

import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class CalculatorView extends JFrame {
	private CalculatorModel cm;
	public JPanel contentPane;
	public JTextField textField;
	public JButton btnNewButton_1;
	public JButton btnNewButton_2;
	public JButton btnNewButton_3;
	public JButton btnNewButton_4;
	public JButton btnNewButton_5;
	public JButton btnNewButton_6;
	public JButton btnNewButton_7;
	public JButton btnNewButton_8;
	public JButton btnNewButton_9;
	public JButton btnNewButton_0;
	public JButton btnNewButton_cong;
	public JButton btnNewButton_tru;
	public JButton btnNewButton_nhan;
	public JButton btnNewButton_chia;
	public JButton btnNewButton_bang;
	public JButton btnNewButton_cham;
	public JButton btnNewButton_can;
	public JButton btnNewButton_sin;
	public JButton btnNewButton_cos;
	public JButton btnNewButton_tan;
	public JButton btnNewButton_mu;
	public JButton btnNewButton_delete;
	public JButton btnNewButton_ac;

	public JMenuBar menuBar;
	public JRadioButton rdbtnNewRadioButton_light;
	public JRadioButton rdbtnNewRadioButton_on;
	public JRadioButton rdbtnNewRadioButton_off;
	public JRadioButton rdbtnNewRadioButton_dark;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorView frame = new CalculatorView();
					frame.setVisible(true);
					frame.setResizable(false);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 493);
		setLocation(940, 170);
		contentPane = new JPanel();
//		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		cm = new CalculatorModel();
		
		CalculatorListener cl = new CalculatorListener(this);
		
		 menuBar = new JMenuBar();
//		menuBar.setBackground(Color.DARK_GRAY);
		menuBar.setBounds(0, 0, 306, 22);
		contentPane.add(menuBar);

		JMenu mnNewMenu = new JMenu("View");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem.addActionListener(cl);
		mnNewMenu.add(mntmNewMenuItem);

		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);

		JMenu mnNewMenu_2 = new JMenu("Help");
		menuBar.add(mnNewMenu_2);

		btnNewButton_1 = new JButton("1");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_1.setBounds(16, 338, 50, 50);
		contentPane.add(btnNewButton_1);

		btnNewButton_bang = new JButton("=");
		btnNewButton_bang.setEnabled(false);
		btnNewButton_bang.setBackground(new Color(224, 255, 255));
		btnNewButton_bang.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton_bang.setBounds(256, 338, 50, 108);
		contentPane.add(btnNewButton_bang);

		btnNewButton_4 = new JButton("4");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.setBackground(new Color(230, 230, 250));
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_4.setBounds(16, 277, 50, 50);
		contentPane.add(btnNewButton_4);

		btnNewButton_2 = new JButton("2");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBackground(new Color(230, 230, 250));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_2.setBounds(76, 338, 50, 50);
		contentPane.add(btnNewButton_2);

		btnNewButton_3 = new JButton("3");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBackground(new Color(230, 230, 250));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_3.setBounds(136, 338, 50, 50);
		contentPane.add(btnNewButton_3);

		btnNewButton_tru = new JButton("-");
		btnNewButton_tru.setEnabled(false);
		btnNewButton_tru.setBackground(new Color(255, 218, 185));
		btnNewButton_tru.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton_tru.setBounds(196, 338, 50, 50);
		contentPane.add(btnNewButton_tru);

		btnNewButton_0 = new JButton("0");
		btnNewButton_0.setEnabled(false);
		btnNewButton_0.setBackground(new Color(230, 230, 250));
		btnNewButton_0.setForeground(Color.BLACK);
		btnNewButton_0.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_0.setBounds(16, 396, 110, 50);
		contentPane.add(btnNewButton_0);

		btnNewButton_cham = new JButton(".");
		btnNewButton_cham.setEnabled(false);
		btnNewButton_cham.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton_cham.setBounds(136, 396, 50, 50);
		contentPane.add(btnNewButton_cham);

		btnNewButton_cong = new JButton("+");
		btnNewButton_cong.setEnabled(false);
		btnNewButton_cong.setBackground(new Color(255, 218, 185));
		btnNewButton_cong.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton_cong.setBounds(196, 396, 50, 50);
		contentPane.add(btnNewButton_cong);

		btnNewButton_7 = new JButton("7");
		btnNewButton_7.setEnabled(false);
		btnNewButton_7.setBackground(new Color(230, 230, 250));
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_7.setBounds(16, 216, 50, 50);
		contentPane.add(btnNewButton_7);

		btnNewButton_8 = new JButton("8");
		btnNewButton_8.setEnabled(false);
		btnNewButton_8.setBackground(new Color(230, 230, 250));
		btnNewButton_8.setForeground(Color.BLACK);
		btnNewButton_8.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_8.setBounds(76, 216, 50, 50);
		contentPane.add(btnNewButton_8);

		btnNewButton_9 = new JButton("9");
		btnNewButton_9.setEnabled(false);
		btnNewButton_9.setBackground(new Color(230, 230, 250));
		btnNewButton_9.setForeground(Color.BLACK);
		btnNewButton_9.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_9.setBounds(136, 216, 50, 50);
		contentPane.add(btnNewButton_9);

		btnNewButton_delete = new JButton("DEL");
		btnNewButton_delete.setEnabled(false);
		btnNewButton_delete.setBackground(new Color(255, 99, 71));
		btnNewButton_delete.setFont(new Font("Gadugi", Font.PLAIN, 9));
		btnNewButton_delete.setBounds(196, 216, 50, 50);
		contentPane.add(btnNewButton_delete);

		btnNewButton_5 = new JButton("5");
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.setBackground(new Color(230, 230, 250));
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_5.setBounds(76, 277, 50, 50);
		contentPane.add(btnNewButton_5);

		btnNewButton_6 = new JButton("6");
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.setBackground(new Color(230, 230, 250));
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_6.setBounds(136, 277, 50, 50);
		contentPane.add(btnNewButton_6);

		btnNewButton_nhan = new JButton("*");
		btnNewButton_nhan.setEnabled(false);
		btnNewButton_nhan.setBackground(new Color(255, 218, 185));
		btnNewButton_nhan.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton_nhan.setBounds(196, 277, 50, 50);
		contentPane.add(btnNewButton_nhan);

		btnNewButton_ac = new JButton("AC");
		btnNewButton_ac.setEnabled(false);
		btnNewButton_ac.setBackground(new Color(255, 99, 71));
		btnNewButton_ac.setFont(new Font("Gadugi", Font.BOLD, 10));
		btnNewButton_ac.setBounds(256, 216, 50, 50);
		contentPane.add(btnNewButton_ac);

		btnNewButton_chia = new JButton("/");
		btnNewButton_chia.setEnabled(false);
		btnNewButton_chia.setBackground(new Color(255, 218, 185));
		btnNewButton_chia.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton_chia.setBounds(256, 277, 50, 50);
		contentPane.add(btnNewButton_chia);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 33, 296, 93);
		contentPane.add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(7, 11, 279, 71);
		panel.add(textField);
		textField.setBorder(null);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);

		 rdbtnNewRadioButton_on = new JRadioButton("On");
//		rdbtnNewRadioButton_on.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_on.setBounds(212, 133, 48, 16);
		rdbtnNewRadioButton_on.setActionCommand("On");
		rdbtnNewRadioButton_on.addActionListener(cl);
		contentPane.add(rdbtnNewRadioButton_on);

		 rdbtnNewRadioButton_off = new JRadioButton("Off");
//		rdbtnNewRadioButton_off.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_off.setBounds(258, 133, 48, 16);
		rdbtnNewRadioButton_off.setActionCommand("Off");
		rdbtnNewRadioButton_off.setSelected(true);
		rdbtnNewRadioButton_off.addActionListener(cl);
		contentPane.add(rdbtnNewRadioButton_off);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton_on);
		bg.add(rdbtnNewRadioButton_off);

		btnNewButton_can = new JButton("√");
		btnNewButton_can.setEnabled(false);
		btnNewButton_can.setBackground(new Color(173, 216, 230));
		btnNewButton_can.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton_can.setBounds(16, 155, 50, 50);
		contentPane.add(btnNewButton_can);

		btnNewButton_mu = new JButton("^");
		btnNewButton_mu.setEnabled(false);
		btnNewButton_mu.setBackground(new Color(173, 216, 230));
		btnNewButton_mu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton_mu.setBounds(76, 155, 50, 50);
		contentPane.add(btnNewButton_mu);

		btnNewButton_sin = new JButton("Sin");
		btnNewButton_sin.setEnabled(false);
		btnNewButton_sin.setBackground(new Color(173, 216, 230));
		btnNewButton_sin.setFont(new Font("Gadugi", Font.PLAIN, 10));
		btnNewButton_sin.setBounds(136, 155, 50, 50);
		contentPane.add(btnNewButton_sin);

		btnNewButton_cos = new JButton("Cos");
		btnNewButton_cos.setEnabled(false);
		btnNewButton_cos.setBackground(new Color(173, 216, 230));
		btnNewButton_cos.setFont(new Font("Gadugi", Font.PLAIN, 10));
		btnNewButton_cos.setBounds(196, 155, 50, 50);
		contentPane.add(btnNewButton_cos);

		btnNewButton_tan = new JButton("Tan");
		btnNewButton_tan.setEnabled(false);
		btnNewButton_tan.setBackground(new Color(173, 216, 230));
		btnNewButton_tan.setFont(new Font("Gadugi", Font.PLAIN, 9));
		btnNewButton_tan.setBounds(256, 155, 50, 50);
		contentPane.add(btnNewButton_tan);
		
		 rdbtnNewRadioButton_dark = new JRadioButton("Dark");
//		rdbtnNewRadioButton_dark.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_dark.setActionCommand("Dark");
		rdbtnNewRadioButton_dark.setBounds(16, 133, 68, 16);
		rdbtnNewRadioButton_dark.addActionListener(cl);
		contentPane.add(rdbtnNewRadioButton_dark);
		
		 rdbtnNewRadioButton_light = new JRadioButton("Light");
//		rdbtnNewRadioButton_light.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_light.setActionCommand("Light");
		rdbtnNewRadioButton_light.setBounds(86, 133, 68, 16);
		rdbtnNewRadioButton_light.setSelected(true);
		rdbtnNewRadioButton_light.addActionListener(cl);
		contentPane.add(rdbtnNewRadioButton_light);
		
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rdbtnNewRadioButton_light);
		bg1.add(rdbtnNewRadioButton_dark);
		
	}
}
