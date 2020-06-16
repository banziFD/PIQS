package gui;

import java.awt.*;
import javax.swing.*; // ����ʵ�ֵ�¼����
import java.awt.event.*; //�����¼�

public class SearchListener implements ActionListener{ 				
		private javax.swing.JFrame Character;//����һ���������	
		private javax.swing.JButton button1;//�˺���������	
		private javax.swing.JButton button2;//������������	
		private Object Search;
		public SearchListener(JButton button1, JButton button2) {
			this.Search = Search;//��ȡ��¼����		
			this.button1 = button1;//��ȡ��¼�����е��˺���������
			this.button2=button2;//��ȡ��¼�����е�������������	
		}
		
	public void actionPerformed(ActionEvent e) {		
			String command = e.getActionCommand();
			if(command.equals("�û���¼")) {
				javax.swing.JFrame jf=new javax.swing.JFrame();		
				jf.setTitle("�û���¼����");		
				jf.setSize(340,500);//ֻ�Զ���������Ч		
				jf.setDefaultCloseOperation(3);//����ر�ʱ��������		
				jf.setLocationRelativeTo(null);//����		
				jf.setResizable(false);		
				jf.setVisible(true);				// ͨ�����ǻ�ȡ�ĵ�¼���������dispose�����ر���		
				Character.dispose();
			}
			else {
				javax.swing.JFrame jf=new javax.swing.JFrame();		
				jf.setTitle("�̼ҵ�¼����");		
				jf.setSize(340,500);//ֻ�Զ���������Ч		
				jf.setDefaultCloseOperation(3);//����ر�ʱ��������		
				jf.setLocationRelativeTo(null);//����		
				jf.setResizable(false);		
				jf.setVisible(true);				// ͨ�����ǻ�ȡ�ĵ�¼���������dispose�����ر���		
				Character.dispose();
			}
		}
	}
