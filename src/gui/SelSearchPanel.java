package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class SelSearchPanel extends JPanel {
	AppMainFrame mainFrame;

	SelSearchPanel(AppMainFrame parentFrame) {
		super();

		this.mainFrame = parentFrame;
		java.awt.Dimension dim2 = new java.awt.Dimension(40, 50);// ��Ʒ��ǩ�Ĵ�С
		java.awt.Dimension dim4 = new java.awt.Dimension(60, 30);// �¼ܰ�ť�Ĵ�С //�������
		java.awt.Dimension dim6 = new java.awt.Dimension(40, 50);// ����ǩ�Ĵ�С
		java.awt.Dimension dim5 = new java.awt.Dimension(50, 30);// ��������Ĵ�С
		java.awt.Dimension dim7 = new java.awt.Dimension(45, 30);// -+��ť��С
		java.awt.Dimension dim8 = new java.awt.Dimension(100, 30);// ������鿴��ť�Ĵ�С //�������
		java.awt.Dimension dim16 = new java.awt.Dimension(100, 35);// ���ﳵ��ť
		javax.swing.JButton button7_5 = new javax.swing.JButton();

		JLabel[] labelname = new JLabel[15];
		JLabel[] labelname2 = new JLabel[15];
		JTextField[] textname = new JTextField[15];

		// javax.swing.JButton[] button7_1 = new javax.swing.JButton[15];
		// javax.swing.JButton[] button = new javax.swing.JButton[15];
		// javax.swing.JButton[] button2 = new javax.swing.JButton[15];
		// javax.swing.JButton[] button3 = new javax.swing.JButton[15];
		String productArray[] = { "苹果", "香蕉", "毛巾", "牙刷", "洗衣液", "长茄", "豆角" };
		for (int i = 0; i < productArray.length; i++) {

			JLabel productNameLabel = new JLabel();
			productNameLabel.setText(productArray[i]);
			productNameLabel.setPreferredSize(dim2);
			this.add(productNameLabel);

			JButton enterMainPageButton = new JButton();
			enterMainPageButton.setText("进入主界面");
			enterMainPageButton.setPreferredSize(dim8);
			enterMainPageButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainFrame.closeSelSearchPanel();
					mainFrame.showSelSearchDetailPanel("");
				}
			});
			this.add(enterMainPageButton);

			JButton deleteButton = new JButton();
			deleteButton.setPreferredSize(dim4);
			deleteButton.setText("下架");

			deleteButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					deleteProduct("");
				}
			});
			this.add(deleteButton);

			JLabel remainLabel = new JLabel();
			remainLabel.setText("库存");
			remainLabel.setPreferredSize(dim6);
			this.add(remainLabel);

			JTextField quantity = new JTextField();
			quantity.setText(String.valueOf(i));
			quantity.setPreferredSize(dim5);
			this.add(quantity);

			JButton substract = new JButton();
			substract.setText("-");
			substract.setPreferredSize(dim7);
			substract.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String command = e.getActionCommand();
					String stock = quantity.getText();
					int n = JOptionPane.showConfirmDialog(null, "请确认是否修改库存", "确认对话框", JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION) {
						Integer k = new Integer(stock);
						if (k - 1 < 0) {
							String warning = "确定";
							int n2 = JOptionPane.showConfirmDialog(null, "库存不合法禁止修改", "库存修改未成功", JOptionPane.YES_NO_OPTION);
						} else {
							substractProductQuantity("");
						}
					}
				}
			});
			this.add(substract);

			JButton addButton = new JButton();
			addButton.setText("+");
			addButton.setPreferredSize(dim7);
			addButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int n = JOptionPane.showConfirmDialog(null, "请确认是否修改库存", "确认对话框", JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION) {
						addProductQuantity("");
					}
				}
			});
			this.add(addButton);
		}

		JButton returnButton = new JButton();
		returnButton.setText("返回");
		returnButton.setPreferredSize(dim16);
		this.add(returnButton, BorderLayout.EAST);
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				mainFrame.closeSelSearchPanel();
				mainFrame.showMerchantPanel();
			}
		});
	}


	public void deleteProduct(String prdno) {

	}

	public void addProductQuantity(String prdno) {

	}

	public void substractProductQuantity(String prdno) {

	}
}
