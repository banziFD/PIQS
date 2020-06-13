package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class AppMainFrame extends JFrame {
	public String serverURL;
	public String databaseName;
	public String user;
	public String password;



	private JPanel loginPanel;
	private JPanel merchantPanel;

	public AppMainFrame(String serverURL, String databaseName, String user, String password) {
		super();

		this.serverURL = serverURL;
		this.databaseName = databaseName;
		this.user = user;
		this.password = password;

		this.showLoginPanel();
		this.setVisible(true);
	}

	public void showLoginPanel() {

		this.setTitle("登录界面");
		this.setSize(340, 500);// 只对顶级容器有效
		this.setDefaultCloseOperation(3);// 窗体关闭时结束程序
		this.setLocationRelativeTo(null);// 居中
		this.setResizable(false); // //选择布局类型，定义流式布局的对象,并且设置每个组件之间相隔5cm
		this.loginPanel = new LoginPanel(this);
		this.add(this.loginPanel);
	}

	public void closeLoginPanel() {
		this.remove(this.loginPanel);
		this.repaint();
	}

	public void showMerchantPanel() {
		this.setTitle("商家界面");
		this.setSize(300,350);// 只对顶级容器有效
		this.setDefaultCloseOperation(3);// 窗体关闭时结束程序
		this.setLocationRelativeTo(null);// 居中
		this.setResizable(false);
		this.merchantPanel = new MerchantPanel(this);
		this.add(this.merchantPanel);
		this.repaint();
	}

	public void closeMerchantPanel() {
		this.remove(this.merchantPanel);
		this.repaint();
	}



	public void showCustomerPanel() {

	}

	public void closeCustomerPanel() {

	}


}
