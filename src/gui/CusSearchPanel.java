package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; // ����ʵ�ֵ�¼����


public class CusSearchPanel extends JPanel {
	AppMainFrame mainFrame;

	CusSearchPanel(AppMainFrame parentFrame) {
		super();

		this.mainFrame = parentFrame;

		java.awt.FlowLayout fl = new java.awt.FlowLayout(FlowLayout.CENTER, 85, 85);
        this.setLayout(fl);// 设置顶级容器的布局为流式布局

		java.awt.Dimension dim = new java.awt.Dimension(100, 40);

		javax.swing.JButton button = new JButton();
		javax.swing.JButton button2 = new JButton();
		button.setText("查看");
		button.setPreferredSize(dim);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.closeCusSearchPanel();
				mainFrame.showCusSearchDetailPanel();
			}
		});
		button2.setText("返回");
		button2.setPreferredSize(dim);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				mainFrame.closeCusSearchPanel();
				mainFrame.showLoginPanel();
			}
		});

		this.add(button);
		this.add(button2);
	}

}
