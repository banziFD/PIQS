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

		java.awt.Dimension dim6 = new java.awt.Dimension(40, 50);
		java.awt.Dimension dim8 = new java.awt.Dimension(100, 30);
		java.awt.Dimension dim11 = new java.awt.Dimension(80, 35);
		java.awt.Dimension dim16 = new java.awt.Dimension(100, 35);

		String labelText[] = { "苹果", "香蕉", "毛巾", "牙刷", "洗衣液", "长茄", "豆角" };

		for (int i = 0; i < labelText.length; i++) {
			JLabel productNameLabel = new JLabel();
			productNameLabel.setPreferredSize(dim11);
			productNameLabel.setText(labelText[i]);
			JButton enterDetailPageButton = new JButton();
			enterDetailPageButton.setText("进入主界面");
			String productInformation = String.format("库存  %d  价格  %d", i, i);
			JLabel productInformationLabel = new JLabel();
			productInformationLabel.setText(productInformation);
			productInformationLabel.setPreferredSize(new Dimension(160, 50));

			enterDetailPageButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					mainFrame.closeCusSearchDetailPanel();
					mainFrame.showCusSearchPagePanel("", "");
				}

			});

			this.add(productNameLabel);
			this.add(enterDetailPageButton);
			this.add(productInformationLabel);
		}

		JButton returnButton = new JButton();
		returnButton.setText("返回");
		returnButton.setPreferredSize(dim16);
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				mainFrame.closeCusSearchDetailPanel();
				mainFrame.showCusSearchPanel();
			}
		});
		this.add(returnButton, BorderLayout.EAST);
	}
}