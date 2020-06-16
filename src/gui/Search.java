package gui;

import java.awt.*;
import javax.swing.*; // ����ʵ�ֵ�¼����
public class Search {
		public static void main(String args[]) {
				Search l = new Search();
				l.showResult();
			}

		public void showResult() { 
			Image i=(new ImageIcon("F:\\wallpapers\\006ese5Bgy1g8krqbvymqj31hc0u04qq.jpg")).getImage();
			javax.swing.JFrame jf=new javax.swing.JFrame();
			jf.setTitle("�̼ҽ���");
			jf.setSize(300,350);// ֻ�Զ���������Ч
			jf.setDefaultCloseOperation(3);// ����ر�ʱ��������
			jf.setLocationRelativeTo(null);// ���� 
			jf.setResizable(false);								// //ѡ�񲼾����ͣ�������ʽ���ֵĶ���,��������ÿ�����֮�����5cm
			java.awt.FlowLayout fl = new java.awt.FlowLayout(FlowLayout.CENTER, 85, 85);
			jf.setLayout(fl);// ���ö��������Ĳ���Ϊ��ʽ����
			java.awt.Dimension dim1 = new java.awt.Dimension(400, 150);// ͼƬ��С
			//
			java.awt.Dimension dim4 = new java.awt.Dimension(100, 40);// ��ť�Ĵ�С //�������
			// //����ͼƬ����Ҫ��ͼƬ���ص��ڴ��С�����IamgeIcon���ͼƬ���ص��ڴ�
			javax.swing.ImageIcon icon = new javax.swing.ImageIcon("F:\\wallpapers\\006ese5Bgy1g8krqbvymqj31hc0u04qq.jpg");
			jf.setIconImage(i);
			JLabel labpic = new JLabel(icon);// ������ֱ�Ӱ�ͼƬ�ӵ����������У���Ҫ�Ƚ�������Ϊ��ǩ 
				labpic.setPreferredSize(dim1);
			javax.swing.JButton button1 = new javax.swing.JButton();
			javax.swing.JButton button2 = new javax.swing.JButton();
			button1.setText("�鿴��Ʒ");
			button2.setText("����");
			
			JLabel buttonL1 = new JLabel();
			button1.setPreferredSize(dim4);
			jf.add(button1);
			
			JLabel buttonL2 = new JLabel();
			button2.setPreferredSize(dim4);
			jf.add(button2);
			jf.setVisible(true); // ����ʵ������¼��ť������Ķ��󣬲��ѵ�¼�������˺ź����������Ķ��󴫸���
												//
			SearchListener ll = new SearchListener(button1,button2); // �Ե�ǰ�������Ӽ�������
			button1.addActionListener(ll);// ��ذ�ť
			button2.addActionListener(ll);// ��ذ�ť
		}

	}

