package gui;

import javax.swing.*;

public class AppMainFrame extends JFrame {
	public String serverURL;
	public String databaseName;
	public String user;
	public String password;

	private JPanel loginPanel;
	private JPanel merchantPanel;
	private JPanel selSearchPanel;
	private JPanel selSearchDetailPanel;
	private JPanel installPanel;

	private JPanel cusSearchPanel;
	private JPanel cusSearchDetailPanel;
	private JPanel cusSearchPagePanel;

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
		this.setSize(300, 350);// 只对顶级容器有效
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

	public void showSelSearchPanel() {

		this.setTitle("商品总览");
		this.setSize(450, 500);// 鍙椤剁骇瀹瑰櫒鏈夋晥
		this.setDefaultCloseOperation(3);// 绐椾綋鍏抽棴鏃剁粨鏉熺▼搴�
		this.setLocationRelativeTo(null);// 灞呬腑
		this.setResizable(false);
		this.selSearchPanel = new SelSearchPanel(this);
		this.add(this.selSearchPanel);
		this.repaint();
	}

	public void closeSelSearchPanel() {
		this.remove(this.selSearchPanel);
		this.repaint();
	}

	public void showSelSearchDetailPanel(String prodName) {

		this.setTitle("商品详情页面");
		this.setSize(370, 520);// 鍙椤剁骇瀹瑰櫒鏈夋晥
		this.setDefaultCloseOperation(3);// 绐椾綋鍏抽棴鏃剁粨鏉熺▼搴�
		this.setLocationRelativeTo(null);// 灞呬腑
		this.setResizable(false);
		this.selSearchDetailPanel = new SelSearchDetailPanel(this);
		this.add(this.selSearchDetailPanel);
		this.repaint();
	}

	public void closeSelSearchDetailPanel() {
		this.remove(this.selSearchDetailPanel);
		this.repaint();
	}





	public void showInstallPanel() {
		this.setTitle("商品上新界面");
		this.setSize(360, 500);// 鍙椤剁骇瀹瑰櫒鏈夋晥
		this.setDefaultCloseOperation(3);// 绐椾綋鍏抽棴鏃剁粨鏉熺▼搴�
		this.setLocationRelativeTo(null);// 灞呬腑
		this.setResizable(false);
		this.installPanel = new InstallPanel(this);
		this.add(this.installPanel);
		this.repaint();
	}

	public void closeInstallPanel() {
		this.remove(this.installPanel);
		this.repaint();
	}

	public void showCusSearchPanel() {
		this.setTitle("顾客界面");
		this.setSize(300, 350);// 鍙椤剁骇瀹瑰櫒鏈夋晥
		this.setDefaultCloseOperation(3);// 绐椾綋鍏抽棴鏃剁粨鏉熺▼搴�
		this.setLocationRelativeTo(null);// 灞呬腑
		this.setResizable(false);
		this.cusSearchPanel = new CusSearchPanel(this);
		this.add(this.cusSearchPanel);
		this.repaint();
	}

	public void closeCusSearchPanel() {
		this.remove(this.cusSearchPanel);
		this.repaint();
	}

	public void showCusSearchDetailPanel() {
		this.setTitle("商品品类大全");
		this.setSize(400, 500);// 鍙椤剁骇瀹瑰櫒鏈夋晥
		this.setDefaultCloseOperation(3);// 绐椾綋鍏抽棴鏃剁粨鏉熺▼搴�
		this.setLocationRelativeTo(null);// 灞呬腑
		this.setResizable(false);
		this.cusSearchDetailPanel = new CusSearchDetailPanel(this);
		this.add(this.cusSearchDetailPanel);
		this.repaint();
	}

	public void closeCusSearchDetailPanel() {
		this.remove(this.cusSearchDetailPanel);
		this.repaint();
	}

	public void showCusSearchPagePanel(String sano, String prdno) {
		this.setTitle("商品详情界面");
		this.setSize(340, 500);// 鍙椤剁骇瀹瑰櫒鏈夋晥
		this.setDefaultCloseOperation(3);// 绐椾綋鍏抽棴鏃剁粨鏉熺▼搴�
		this.setLocationRelativeTo(null);// 灞呬腑
		this.setResizable(false);
		this.cusSearchPagePanel = new CusSearchPagePanel(this);
		this.add(this.cusSearchPagePanel);
		this.repaint();
	}

	public void closeCusSearchPagePanel() {
		this.remove(this.cusSearchPagePanel);
		this.repaint();
	}


}
