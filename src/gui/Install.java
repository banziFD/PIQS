package gui;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Install extends JFrame {
	public static void main(String args[]) {
		Install l = new Install();
		l.InstallPage();
		Install frm = new Install();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void InstallPage() {
		javax.swing.JFrame jf = new javax.swing.JFrame();
		jf.setTitle("商品信息录入界面");
		jf.setSize(360, 500);// 只对顶级容器有效
		jf.setDefaultCloseOperation(3);// 窗体关闭时结束程序
		jf.setLocationRelativeTo(null);// 居中
		jf.setResizable(false); // //选择布局类型，定义流式布局的对象,并且设置每个组件之间相隔5cm
		java.awt.FlowLayout fl = new java.awt.FlowLayout(FlowLayout.CENTER, 5, 5);
		jf.setLayout(fl);// 设置顶级容器的布局为流式布局

		java.awt.Dimension dim2 = new java.awt.Dimension(40, 50);// 商品标签的大小
		java.awt.Dimension dim4 = new java.awt.Dimension(60, 30);// 下架按钮的大小 //添加组件
		java.awt.Dimension dim6 = new java.awt.Dimension(40, 50);// 库存标签的大小
		java.awt.Dimension dim5 = new java.awt.Dimension(50, 30);// 库存输入框的大小
		java.awt.Dimension dim7 = new java.awt.Dimension(45, 30);// -+按钮大小
		java.awt.Dimension dim8 = new java.awt.Dimension(100, 30);// 主界面查看按钮的大小 //添加组件
		java.awt.Dimension dim9 = new java.awt.Dimension(80, 50);// 库存标签的大小
		java.awt.Dimension dim10 = new java.awt.Dimension(200, 40);// 商品大标签的大小
		java.awt.Dimension dim11 = new java.awt.Dimension(80, 35);// 产品属性标签的大小
		java.awt.Dimension dim12 = new java.awt.Dimension(80, 35);// 库存标签的大小
		java.awt.Dimension dim13 = new java.awt.Dimension(300, 200);// 展示界面图片大小
		java.awt.Dimension dim14 = new java.awt.Dimension(300, 150);// 上传界面图片大小
		JLabel[] labelname4_1 = new JLabel[15];
		JTextField[] textField4_1 = new JTextField[15];
		String label1_text[] = { "  ", "店铺编号", "产品编号", "产品标题", "产品类别", "产品批次", "产品进价", "产品售价", "库存余量", "生产日期", "有效日期",
				"供应商编号" };
		javax.swing.JButton button4_1 = new javax.swing.JButton();
		for (int i = 0; i < label1_text.length - 1; i++) {
			labelname4_1[i] = new JLabel();
			textField4_1[i] = new JTextField();

			labelname4_1[i].setText("⚪ " + label1_text[i]);
			jf.add(labelname4_1[i]);
			jf.add(textField4_1[i]);
			textField4_1[i].setPreferredSize(dim12);
			labelname4_1[i].setPreferredSize(dim12);
			final int index = i;
		}
		javax.swing.ImageIcon icon = new javax.swing.ImageIcon("F:\\wallpapers\\QQ图片20200615114922.png");
		JLabel labpic = new JLabel(icon);// 不可以直接把图片加到顶级容器中，需要先将其设置为标签
		labpic.setPreferredSize(dim14);
		jf.add(labpic);// 再将标签加到顶级容器中 //添加“账号”标签
		textField4_1[0].setFont(new Font("Serif", Font.BOLD, 22));
		textField4_1[0].setPreferredSize(dim10);
		labelname4_1[0].setText("⚪ " + "产品名称");
		button4_1.setText("提交");
		button4_1.setPreferredSize(dim4);
		button4_1.addActionListener(new ActionListener() {
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
		jf.add(button4_1, BorderLayout.EAST);
		jf.setVisible(true);
	}
}