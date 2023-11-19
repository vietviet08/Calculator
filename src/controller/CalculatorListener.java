package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorView;

public class CalculatorListener implements ActionListener {

	private CalculatorView cv;

	public CalculatorListener(CalculatorView cv) {
		this.cv = cv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		if (action.equals("Off")) {
			cv.btnNewButton_1.setEnabled(false);
			cv.btnNewButton_2.setEnabled(false);
			cv.btnNewButton_3.setEnabled(false);
			cv.btnNewButton_4.setEnabled(false);
			cv.btnNewButton_5.setEnabled(false);
			cv.btnNewButton_6.setEnabled(false);
			cv.btnNewButton_7.setEnabled(false);
			cv.btnNewButton_8.setEnabled(false);
			cv.btnNewButton_9.setEnabled(false);
			cv.btnNewButton_0.setEnabled(false);
			cv.btnNewButton_cong.setEnabled(false);
			cv.btnNewButton_tru.setEnabled(false);
			cv.btnNewButton_nhan.setEnabled(false);
			cv.btnNewButton_chia.setEnabled(false);
			cv.btnNewButton_bang.setEnabled(false);
			cv.btnNewButton_cham.setEnabled(false);
			cv.btnNewButton_can.setEnabled(false);
			cv.btnNewButton_sin.setEnabled(false);
			cv.btnNewButton_cos.setEnabled(false);
			cv.btnNewButton_tan.setEnabled(false);
			cv.btnNewButton_mu.setEnabled(false);
			cv.btnNewButton_delete.setEnabled(false);
			cv.btnNewButton_ac.setEnabled(false);
		} else if (action.equals("On")) {
			cv.btnNewButton_1.setEnabled(true);
			cv.btnNewButton_2.setEnabled(true);
			cv.btnNewButton_3.setEnabled(true);
			cv.btnNewButton_4.setEnabled(true);
			cv.btnNewButton_5.setEnabled(true);
			cv.btnNewButton_6.setEnabled(true);
			cv.btnNewButton_7.setEnabled(true);
			cv.btnNewButton_8.setEnabled(true);
			cv.btnNewButton_9.setEnabled(true);
			cv.btnNewButton_0.setEnabled(true);
			cv.btnNewButton_cong.setEnabled(true);
			cv.btnNewButton_tru.setEnabled(true);
			cv.btnNewButton_nhan.setEnabled(true);
			cv.btnNewButton_chia.setEnabled(true);
			cv.btnNewButton_bang.setEnabled(true);
			cv.btnNewButton_cham.setEnabled(true);
			cv.btnNewButton_can.setEnabled(true);
			cv.btnNewButton_sin.setEnabled(true);
			cv.btnNewButton_cos.setEnabled(true);
			cv.btnNewButton_tan.setEnabled(true);
			cv.btnNewButton_mu.setEnabled(true);
			cv.btnNewButton_delete.setEnabled(true);
			cv.btnNewButton_ac.setEnabled(true);
		} else if (action.equals("Dark")) {
			cv.contentPane.setBackground(Color.DARK_GRAY);
			cv.rdbtnNewRadioButton_light.setBackground(Color.DARK_GRAY);
			cv.rdbtnNewRadioButton_dark.setBackground(Color.DARK_GRAY);
			cv.rdbtnNewRadioButton_on.setBackground(Color.DARK_GRAY);
			cv.rdbtnNewRadioButton_off.setBackground(Color.DARK_GRAY);
			cv.rdbtnNewRadioButton_on.setForeground(Color.WHITE);
			cv.rdbtnNewRadioButton_dark.setForeground(Color.WHITE);
			cv.rdbtnNewRadioButton_off.setForeground(Color.WHITE);
			cv.rdbtnNewRadioButton_light.setForeground(Color.WHITE);
		} else if (action.equals("Light")) {
			cv.contentPane.setBackground(Color.WHITE);
			cv.rdbtnNewRadioButton_light.setBackground(Color.WHITE);
			cv.rdbtnNewRadioButton_dark.setBackground(Color.WHITE);
			cv.rdbtnNewRadioButton_on.setBackground(Color.WHITE);
			cv.rdbtnNewRadioButton_off.setBackground(Color.WHITE);
			cv.rdbtnNewRadioButton_on.setForeground(Color.BLACK);
			cv.rdbtnNewRadioButton_dark.setForeground(Color.BLACK);
			cv.rdbtnNewRadioButton_off.setForeground(Color.BLACK);
			cv.rdbtnNewRadioButton_light.setForeground(Color.BLACK);
		} else if(action.equals("Exit")){
			System.exit(0);
		}
	}

}
