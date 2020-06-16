package gui;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class CusSearchPage extends JFrame {
	public static void main(String args[]) {
		CusSearchPage l = new CusSearchPage();
		l.SelshowDetail();
		CusSearchPage frm = new CusSearchPage();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void SelshowDetail() {
		javax.swing.JFrame jf = new javax.swing.JFrame();
		jf.setTitle("商品主界面");
		jf.setSize(360, 500);// 只对顶级容器有效
		jf.setDefaultCloseOperation(3);// 窗体关闭时结束程序
		jf.setLocationRelativeTo(null);// 居中
		jf.setResizable(false); // //选择布局类型，定义流式布局的对象,并且设置每个组件之间相隔5cm
		java.awt.FlowLayout fl = new java.awt.FlowLayout(FlowLayout.CENTER, 5, 5);
		jf.setLayout(fl);// 设置顶级容器的布局为流式布局
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
		javax.swing.ImageIcon icon = new javax.swing.ImageIcon("F:\\wallpapers\\苹果.jpg");
		JLabel labpic = new JLabel(icon);// 不可以直接把图片加到顶级容器中，需要先将其设置为标签
		labpic.setPreferredSize(dim14);
		jf.add(labpic);
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
			jf.add(labelname3_1[i]);

			jf.add(labelname3_2[i], BorderLayout.EAST);
			labelname3_1[i].setPreferredSize(dim11);
			labelname3_2[i].setPreferredSize(dim15);
			final int index = i;
		}

		labelname3_2[0].setFont(new Font("Serif", Font.BOLD, 22));
		labelname3_2[0].setPreferredSize(dim10);
		labelname3_2[0].setText("苹果");
		labelname3_1[0].setText("品名：");
		button6_1.setText("加入购物车");
		button6_1.setPreferredSize(dim16);
		button6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				/*
				 * String account = textname.getText(); char[] charArray = jp.getPassword();
				 * String password = new String(charArray); boolean verify =
				 * userTable.login(account, password);
				 *
				 * if (verify) { mainFrame.closeLoginPanel(); String userType =
				 * userTable.getUserType(account); if (userType.equals("merchant")) {
				 * mainFrame.showMerchantPanel(); } else { mainFrame.showCustomerPanel(); } }
				 * else { JOptionPane.showMessageDialog(mainFrame, "登陆失败！"); }
				 *
				 */}
		});
		button6_2.setText("返回");
		button6_2.setPreferredSize(dim16);
		button6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				/*
				 * String account = textname.getText(); char[] charArray = jp.getPassword();
				 * String password = new String(charArray); boolean verify =
				 * userTable.login(account, password);
				 *
				 * if (verify) { mainFrame.closeLoginPanel(); String userType =
				 * userTable.getUserType(account); if (userType.equals("merchant")) {
				 * mainFrame.showMerchantPanel(); } else { mainFrame.showCustomerPanel(); } }
				 * else { JOptionPane.showMessageDialog(mainFrame, "登陆失败！"); }
				 *
				 */}
		});
		jf.add(button6_1, BorderLayout.EAST);
		jf.add(button6_2, BorderLayout.EAST);
		jf.setVisible(true);
	}
}