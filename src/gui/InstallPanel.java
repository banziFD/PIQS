package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InstallPanel extends JPanel {
	AppMainFrame mainFrame;

	InstallPanel(AppMainFrame parentFrame) {
		super();

		this.mainFrame = parentFrame;
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
		java.awt.Dimension dim16 = new java.awt.Dimension(100, 35);// 购物车按钮
		javax.swing.JButton button7_5 = new javax.swing.JButton();
		JLabel[] labelname4_1 = new JLabel[15];
		JTextField[] textField4_1 = new JTextField[15];
		Icon icon1_1 = new ImageIcon("F:\\wallpapers\\icon2.png");
		String label1_text[] = { "  ", "店铺编号", "产品编号", "产品标题", "产品类别", "产品批次", "产品进价", "产品售价", "库存余量", "生产日期", "有效日期",
				"供应商编号" };
		javax.swing.JButton button4_1 = new javax.swing.JButton();
		for (int i = 0; i < label1_text.length - 1; i++) {
			labelname4_1[i] = new JLabel();
			textField4_1[i] = new JTextField();

			labelname4_1[i].setText("⚪ " + label1_text[i]);
			this.add(labelname4_1[i]);
			this.add(textField4_1[i]);
			textField4_1[i].setPreferredSize(dim12);
			labelname4_1[i].setPreferredSize(dim12);
			final int index = i;
		}
		javax.swing.ImageIcon icon1 = new javax.swing.ImageIcon("F:\\wallpapers\\QQ图片20200615114922.png");
		JLabel labpic1 = new JLabel(icon1);// 不可以直接把图片加到顶级容器中，需要先将其设置为标签
		labpic1.setPreferredSize(dim14);
		this.add(labpic1);// 再将标签加到顶级容器中 //添加“账号”标签
		textField4_1[0].setFont(new Font("Serif", Font.BOLD, 22));
		textField4_1[0].setPreferredSize(dim10);
		labelname4_1[0].setText("⚪ " + "产品名称");
		button4_1.setText("提交");
		button4_1.setPreferredSize(dim16);
		button4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				int n = JOptionPane.showConfirmDialog(labelname4_1[10], "请确认是否提交", "确认对话框", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION)// 若单击确认对话框中的"是"按钮
				{
					String[] message = { "确定" };
					JOptionPane.showMessageDialog(labelname4_1[10], "您已提交成功！", "上传页面提示", JOptionPane.PLAIN_MESSAGE,
							icon1_1);
					mainFrame.showInstallPanel();
				} else if (n == JOptionPane.NO_OPTION) {
					String[] message = { "确定" };
					Object n2 = JOptionPane.showInputDialog(labelname4_1[10], "已取消提交申请", "上传页面提示", 0, null, message,
							message[0]);
					mainFrame.showInstallPanel();
				}
			}
		});
		button7_5.setText("返回");
		button7_5.setPreferredSize(dim16);
		button7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				mainFrame.closeInstallPanel();
				mainFrame.showMerchantPanel();
			}
		});

		this.add(button4_1, BorderLayout.EAST);
		this.add(button7_5, BorderLayout.EAST);
	}
}
