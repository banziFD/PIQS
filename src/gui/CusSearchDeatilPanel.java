package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CusSearchDetailPanel extends JPanel {
	AppMainFrame mainFrame;

	CusSearchDetailPanel(AppMainFrame parentFrame) {
		super();

		this.mainFrame = parentFrame;

		java.awt.Dimension dim2 = new java.awt.Dimension(40, 50);// ��Ʒ��ǩ�Ĵ�С
		java.awt.Dimension dim4 = new java.awt.Dimension(60, 30);// �¼ܰ�ť�Ĵ�С //�������
		java.awt.Dimension dim6 = new java.awt.Dimension(40, 50);// ����ǩ�Ĵ�С
		java.awt.Dimension dim5 = new java.awt.Dimension(50, 30);// ��������Ĵ�С
		java.awt.Dimension dim7 = new java.awt.Dimension(45, 30);// -+��ť��С
		java.awt.Dimension dim8 = new java.awt.Dimension(100, 30);// ������鿴��ť�Ĵ�С //�������
		java.awt.Dimension dim11 = new java.awt.Dimension(80, 35);// ��Ʒ���Ա�ǩ�Ĵ�С
		java.awt.Dimension dim16 = new java.awt.Dimension(100, 35);// ���ﳵ��ť
		JLabel[] labelname7_1 = new JLabel[15];
		JLabel[] labelname7_2 = new JLabel[15];
		JLabel[] labelname7_3 = new JLabel[15];
		JLabel[] labelname7_4 = new JLabel[15];
		JLabel[] labelname7_5 = new JLabel[15];
		JTextField[] textname7_1 = new JTextField[15];
		javax.swing.JButton[] button7_1 = new javax.swing.JButton[15];
		javax.swing.JButton[] button7_2 = new javax.swing.JButton[15];
		javax.swing.JButton[] button7_3 = new javax.swing.JButton[15];
		javax.swing.JButton button7_5 = new javax.swing.JButton();
		String label2_text[] = { "ƻ��", "�㽶", "ë��", "��ˢ", "ϴ��Һ", "����", "����" };
		for (int i = 0; i < label2_text.length; i++) {
			labelname7_1[i] = new JLabel();
			labelname7_2[i] = new JLabel();
			labelname7_3[i] = new JLabel();
			labelname7_4[i] = new JLabel();
			labelname7_5[i] = new JLabel();
			button7_1[i] = new javax.swing.JButton();
			labelname7_1[i].setText(label2_text[i]);
			labelname7_2[i].setText("   ���");
			labelname7_3[i].setText(String.valueOf(i));
			labelname7_4[i].setText("�۸�");
			labelname7_5[i].setText(String.valueOf(i));
			button7_1[i].setText("����������");
			button7_1[i].setPreferredSize(dim8);
			labelname7_1[i].setPreferredSize(dim11);
			labelname7_2[i].setPreferredSize(dim6);
			labelname7_3[i].setPreferredSize(dim6);
			labelname7_4[i].setPreferredSize(dim6);
			labelname7_5[i].setPreferredSize(dim6);
			this.add(labelname7_1[i]);
			this.add(button7_1[i]);
			this.add(labelname7_2[i]);
			this.add(labelname7_3[i]);
			this.add(labelname7_4[i]);
			this.add(labelname7_5[i]);
			final int index = i;
			/*
			 * button7_1[i].addActionListener(new ActionListener(){ public void
			 * actionPerformed(ActionEvent e) { String command = e.getActionCommand();
			 * mainFrame.closeCusSearchDetailPanel(); mainFrame.showCusSearchPagePanel(); }
			 *
			 * });
			 */
		}
		button7_1[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeCusSearchDetailPanel();
				mainFrame.showCusSearchPagePanel();
			}

		});

		button7_1[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeCusSearchDetailPanel();
				mainFrame.showCusSearchPagePanel1();
			}

		});
		button7_1[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeCusSearchDetailPanel();
				mainFrame.showCusSearchPagePanel2();
			}

		});
		button7_1[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeCusSearchDetailPanel();
				mainFrame.showCusSearchPagePanel3();
			}

		});
		button7_1[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeCusSearchDetailPanel();
				mainFrame.showCusSearchPagePanel3();
			}

		});
		button7_1[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeCusSearchDetailPanel();
				mainFrame.showCusSearchPagePanel3();
			}

		});
		button7_1[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeCusSearchDetailPanel();
				mainFrame.showCusSearchPagePanel3();
			}

		});
		button7_5.setText("����");
		button7_5.setPreferredSize(dim16);
		button7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				mainFrame.closeCusSearchDetailPanel();
				mainFrame.showCusSearchPanel();
			}
		});
		this.add(button7_5, BorderLayout.EAST);
	}
}