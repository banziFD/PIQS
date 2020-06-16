package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class SelSearchPanel extends JPanel {
	AppMainFrame mainFrame;
	UserTable userTable;

	SelSearchPanel(AppMainFrame parentFrame) {
		super();

		// ָ��JFrame��ָ��
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

		javax.swing.JButton[] button7_1 = new javax.swing.JButton[15];
		javax.swing.JButton[] button = new javax.swing.JButton[15];
		javax.swing.JButton[] button2 = new javax.swing.JButton[15];
		javax.swing.JButton[] button3 = new javax.swing.JButton[15];
		String label2_text[] = { "ƻ��", "�㽶", "ë��", "��ˢ", "ϴ��Һ", "����", "����" };
		for (int i = 0; i < label2_text.length; i++) {

			labelname[i] = new JLabel();
			textname[i] = new JTextField();
			button7_1[i] = new javax.swing.JButton();
			button[i] = new javax.swing.JButton();
			button2[i] = new javax.swing.JButton();
			button3[i] = new javax.swing.JButton();
			labelname2[i] = new JLabel();

			labelname[i].setText(label2_text[i]);
			button7_1[i].setText("����������");

			labelname2[i].setText("   ���");
			textname[i].setText(String.valueOf(i));
			;
			button[i].setText("�¼�");
			button2[i].setText("+");
			button3[i].setText("-");
			button7_1[i].setPreferredSize(dim8);
			button[i].setPreferredSize(dim4);
			button2[i].setPreferredSize(dim7);
			button3[i].setPreferredSize(dim7);
			labelname[i].setPreferredSize(dim2);
			labelname2[i].setPreferredSize(dim6);
			textname[i].setPreferredSize(dim5);
			this.add(labelname[i]);
			this.add(button7_1[i]);
			this.add(button[i]);
			this.add(labelname2[i]);
			this.add(textname[i]);
			this.add(button3[i]);
			this.add(button2[i]);

			final int index = i;
			button[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String command = e.getActionCommand();
					int n = JOptionPane.showConfirmDialog(textname[index], "��ȷ���Ƿ��¼�", "ȷ�϶Ի���",
							JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION)// ������ȷ�϶Ի����е�"��"��ť
					{
						labelname[index].setText(null);
						button[index].setText(null);
						labelname2[index].setText(null);
						textname[index].setText(null);
						button2[index].setText(null);
						button3[index].setText(null);
						button7_1[index].setText(null);
						mainFrame.closeSelSearchPanel();
						mainFrame.showSelSearchPanel();
					} else if (n == JOptionPane.NO_OPTION) {
						mainFrame.showSelSearchPanel();
					}
				}
			});

			button2[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String command = e.getActionCommand();
					String stock = textname[index].getText();
					int n = JOptionPane.showConfirmDialog(textname[index], "��ȷ���Ƿ��޸Ŀ��", "ȷ�϶Ի���",
							JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION)// ������ȷ�϶Ի����е�"��"��ť
					{
						Integer k = new Integer(stock); // 10
						int stockNum = k.intValue() + 1;
						stock = String.valueOf(stockNum);
						textname[index].setText(stock);
						mainFrame.showSelSearchPanel();
					} else if (n == JOptionPane.NO_OPTION) {
						mainFrame.showSelSearchPanel();
					}
				}
			});
			button3[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String command = e.getActionCommand();
					String stock = textname[index].getText();
					int n = JOptionPane.showConfirmDialog(textname[index], "��ȷ���Ƿ��޸Ŀ��", "ȷ�϶Ի���",
							JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION)// ������ȷ�϶Ի����е�"��"��ť
					{
						Integer k = new Integer(stock); // 10
						int stockNum = k.intValue() - 1;
						if (stockNum < 0) {
							String[] warning = { "ȷ��" };
							int n2 = JOptionPane.showOptionDialog(textname[index], "��治�Ϸ���ֹ�޸ģ�", "����޸�δ�ɹ�",
									JOptionPane.WARNING_MESSAGE, 0, null, warning, warning[0]);

							mainFrame.showSelSearchPanel();
						} else {
							stock = String.valueOf(stockNum);
							textname[index].setText(stock);
						}
					} else if (n == JOptionPane.NO_OPTION) {
						mainFrame.showSelSearchPanel();
					}
				}
			});
		}
		button7_1[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeSelSearchPanel();
				mainFrame.showSelSearchDetailPanel();
			}

		});

		button7_1[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeSelSearchPanel();
				mainFrame.showSelSearchDetailPanel1();
			}

		});
		button7_1[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeSelSearchPanel();
				mainFrame.showSelSearchDetailPanel2();
			}

		});
		button7_1[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeSelSearchPanel();
				mainFrame.showSelSearchDetailPanel3();
			}

		});
		button7_1[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeSelSearchPanel();
				mainFrame.showSelSearchDetailPanel4();
			}

		});
		button7_1[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeSelSearchPanel();
				mainFrame.showSelSearchDetailPanel4();
			}

		});
		button7_1[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				mainFrame.closeSelSearchPanel();
				mainFrame.showSelSearchDetailPanel4();
			}

		});
		this.add(button7_5, BorderLayout.EAST);

		button7_5.setText("����");
		button7_5.setPreferredSize(dim16);
		button7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				mainFrame.closeSelSearchPanel();
				mainFrame.showMerchantPanel();
			}
		});
		this.add(button7_5, BorderLayout.EAST);
	}
}
