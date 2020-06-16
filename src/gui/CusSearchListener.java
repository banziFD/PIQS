package gui;

import java.awt.*;
import javax.swing.*; // ����ʵ�ֵ�¼����
import java.awt.event.*; //�����¼�

public class CusSearchListener implements ActionListener {
	private javax.swing.JFrame CusSearch;// ����һ���������
	private javax.swing.JButton button;
	private Object Search;

	public CusSearchListener(JButton button) {
		this.CusSearch = CusSearch;// ��ȡ��¼����
		this.button = button;// ��ȡ��¼�����е��˺���������
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("�û���¼")) {
			javax.swing.JFrame jf = new javax.swing.JFrame();
			jf.setTitle("�û���¼����");
			jf.setSize(340, 500);// ֻ�Զ���������Ч
			jf.setDefaultCloseOperation(3);// ����ر�ʱ��������
			jf.setLocationRelativeTo(null);// ����
			jf.setResizable(false);
			jf.setVisible(true); // ͨ�����ǻ�ȡ�ĵ�¼���������dispose�����ر���
			CusSearch.dispose();
		} else {
			javax.swing.JFrame jf = new javax.swing.JFrame();
			jf.setTitle("�̼ҵ�¼����");
			jf.setSize(340, 500);// ֻ�Զ���������Ч
			jf.setDefaultCloseOperation(3);// ����ر�ʱ��������
			jf.setLocationRelativeTo(null);// ����
			jf.setResizable(false);
			jf.setVisible(true); // ͨ�����ǻ�ȡ�ĵ�¼���������dispose�����ر���
			CusSearch.dispose();
		}
	}
}
