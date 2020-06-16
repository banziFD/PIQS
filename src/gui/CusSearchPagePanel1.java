package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CusSearchPagePanel1 extends JPanel {
	protected static final int JOptionPaneQUESTION_MESSAGE = 0;
	AppMainFrame mainFrame;

	CusSearchPagePanel1(AppMainFrame parentFrame) {
		super();
		this.mainFrame = parentFrame;
		java.awt.Dimension dim1 = new java.awt.Dimension(340, 300);
		java.awt.Dimension dim2 = new java.awt.Dimension(40, 50);// 商品标签的大小
		java.awt.Dimension dim4 = new java.awt.Dimension(60, 30);// 下架按钮的大小 //添加组件
		java.awt.Dimension dim6 = new java.awt.Dimension(40, 50);// 库存标签的大小
		java.awt.Dimension dim5 = new java.awt.Dimension(50, 30);// 库存输入框的大小
		java.awt.Dimension dim7 = new java.awt.Dimension(45, 30);// -+按钮大小
		java.awt.Dimension dim8 = new java.awt.Dimension(100, 30);// 主界面查看按钮的大小 //添加组件
		java.awt.Dimension dim9 = new java.awt.Dimension(80, 50);// 库存标签的大小
		java.awt.Dimension dim10 = new java.awt.Dimension(200, 40);// 商品大标签的大小
		java.awt.Dimension dim11 = new java.awt.Dimension(80, 35);// 产品属性标签的大小
		java.awt.Dimension dim13 = new java.awt.Dimension(300, 250);
		java.awt.Dimension dim14 = new java.awt.Dimension(300, 150);// 上传界面图片大小
		java.awt.Dimension dim15 = new java.awt.Dimension(180, 35);// 顾客商品大界面属性值标签大小
		java.awt.Dimension dim16 = new java.awt.Dimension(100, 35);// 购物车按钮
		java.awt.Dimension dim17 = new java.awt.Dimension(35100, 35);// 提示图片的大小
		javax.swing.ImageIcon icon = new javax.swing.ImageIcon("F:\\wallpapers\\香蕉.jpg");
		JLabel labpic = new JLabel(icon);// 不可以直接把图片加到顶级容器中，需要先将其设置为标签
		labpic.setPreferredSize(dim14);
		this.add(labpic);
		Icon icon1_1 = new ImageIcon("F:\\wallpapers\\icon2.png");
		JLabel[] labelname3_1 = new JLabel[15];
		JLabel[] labelname3_2 = new JLabel[15];
		String[] label2_text = new String[15];
		javax.swing.JButton button6_1 = new javax.swing.JButton();
		javax.swing.JButton button6_2 = new javax.swing.JButton();
		String label1_text[] = { "  ", "售价", "产品标题", "产品门类", "库存余量", "有效日期" };
		for (int i = 0; i < label1_text.length; i++) {
			labelname3_1[i] = new JLabel();
			labelname3_2[i] = new JLabel();
			labelname3_1[i].setText("⚪ " + label1_text[i]);
			labelname3_2[i].setText(String.valueOf(i));
			this.add(labelname3_1[i]);

			this.add(labelname3_2[i], BorderLayout.EAST);
			labelname3_1[i].setPreferredSize(dim11);
			labelname3_2[i].setPreferredSize(dim15);
			final int index = i;
		}

		labelname3_2[0].setFont(new Font("Serif", Font.BOLD, 22));
		labelname3_2[0].setPreferredSize(dim10);
		labelname3_2[0].setText("香蕉");
		labelname3_1[0].setText("品名：");
		button6_1.setText("加入购物车");
		button6_1.setPreferredSize(dim16);
		button6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				int n = JOptionPane.showConfirmDialog(labelname3_1[10], "请确认加入购物车", "确认对话框", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION)// 若单击确认对话框中的"是"按钮
				{
					String[] message = { "确定" };
					JOptionPane.showMessageDialog(labelname3_1[10], "您已成功加入购物车！", "购物车提示", JOptionPane.PLAIN_MESSAGE,
							icon1_1);
				} else if (n == JOptionPane.NO_OPTION) {
					String[] message = { "确定" };
					int n2 = JOptionPane.showOptionDialog(labelname3_1[10], "已取消加入购物车", "购物车提示",
							JOptionPaneQUESTION_MESSAGE, 0, null, message, message[0]);
				}
			}
		});
		button6_2.setText("返回");
		button6_2.setPreferredSize(dim16);
		button6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				mainFrame.closeCusSearchPagePanel1();
				mainFrame.showCusSearchDetailPanel();
			}
		});
		this.add(button6_1, BorderLayout.EAST);
		this.add(button6_2, BorderLayout.EAST);
	}
}