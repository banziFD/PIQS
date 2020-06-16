package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; // ����ʵ�ֵ�¼����

import app.UserTable;//??????

public class CusSearchPanel extends JPanel {
	AppMainFrame mainFrame;

	CusSearchPanel(AppMainFrame parentFrame) {
		super();

		this.mainFrame = parentFrame;

		java.awt.Dimension dim1 = new java.awt.Dimension(400, 150);// ͼƬ��С
		java.awt.Dimension dim4 = new java.awt.Dimension(100, 40);// ��ť�Ĵ�С //�������
		java.awt.Dimension dim16 = new java.awt.Dimension(100, 35);// ���ﳵ��ť//
																	// //����ͼƬ����Ҫ��ͼƬ���ص��ڴ��С�����IamgeIcon���ͼƬ���ص��ڴ�
		/*
		 * javax.swing.ImageIcon icon1_2 = new
		 * javax.swing.ImageIcon("F:\\wallpapers\\006ese5Bgy1g8krqbvymqj31hc0u04qq.jpg")
		 * ; this.setIconImage(i); JLabel labpic = new JLabel(icon);//
		 * ������ֱ�Ӱ�ͼƬ�ӵ����������У���Ҫ�Ƚ�������Ϊ��ǩ labpic.setPreferredSize(dim1);
		 */
		javax.swing.JButton button = new javax.swing.JButton();
		javax.swing.JButton button2 = new javax.swing.JButton();
		button.setText("�鿴��Ʒ");
		button.setPreferredSize(dim4);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.closeCusSearchPanel();
				mainFrame.showCusSearchDetailPanel();
			}
		});
		button2.setText("����");
		button2.setPreferredSize(dim4);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				mainFrame.closeCusSearchPanel();
				mainFrame.showLoginPanel();
			}
		});

		this.add(button);
		this.add(button2, BorderLayout.EAST);
	}

}
