package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;

public class SelSearchDetailPanel extends JPanel{
	AppMainFrame mainFrame;

    SelSearchDetailPanel(AppMainFrame parentFrame) {
        super();
        this.mainFrame = parentFrame;
        java.awt.Dimension dim1 = new java.awt.Dimension(340, 300);
    	java.awt.Dimension dim2 = new java.awt.Dimension(40, 50);// 商品标签的大小
    	java.awt.Dimension dim4 = new java.awt.Dimension(60, 30);// 下架按钮的大小 //添加组件
    	java.awt.Dimension dim6 = new java.awt.Dimension(40, 50);// 库存标签的大小
    	java.awt.Dimension dim5 = new java.awt.Dimension(50, 30);// 库存输入框的大小
    	java.awt.Dimension dim7 = new java.awt.Dimension(45, 30);//-+按钮大小
    	java.awt.Dimension dim8 = new java.awt.Dimension(100, 30);// 主界面查看按钮的大小 //添加组件
    	java.awt.Dimension dim9 = new java.awt.Dimension(80, 50);// 库存标签的大小
    	java.awt.Dimension dim10 = new java.awt.Dimension(200, 40);// 商品大标签的大小
    	java.awt.Dimension dim11 = new java.awt.Dimension(80, 35);// 产品属性标签的大小
    	java.awt.Dimension dim13 = new java.awt.Dimension(300, 150);
    	java.awt.Dimension dim16 = new java.awt.Dimension(100, 35);//购物车按钮
    	javax.swing.JButton button7_5 = new javax.swing.JButton();
    	JLabel[] labelname3_1 = new JLabel[15];
    	JLabel[] labelname3_2 = new JLabel[15];
    	String[] label2_text = new String[15];
    	String label1_text[]= {"  ","店铺编号","产品编号","产品标题","产品类别","产品批次",
    			"产品进价","产品售价","库存余量","生产日期","有效日期","供应商编号"};
    	for(int i=0;i<label1_text.length-1;i++) {
    		labelname3_1[i] = new JLabel();
    		labelname3_2[i] = new JLabel();
    		labelname3_1[i].setText("⚪ "+label1_text[i]);
    		labelname3_2[i].setText(String.valueOf(i));
    		this.add(labelname3_1[i]);
    		this.add(labelname3_2[i]);
    		labelname3_1[i].setPreferredSize(dim11);
    		labelname3_2[i].setPreferredSize(dim11);
    		final int index = i;
    	}
    	//jf.add(labelname3_2[label1_text.length-1],BorderLayout.CENTER);
    	labelname3_2[0].setFont(new Font("Serif",Font.BOLD,22));
    	labelname3_2[0].setPreferredSize(dim10);
    	labelname3_2[0].setText("苹果");
    	labelname3_1[0].setText(null);
    		javax.swing.ImageIcon icon = new javax.swing.ImageIcon("F:\\wallpapers\\苹果.jpg");
         	JLabel labpic = new JLabel(icon);// 不可以直接把图片加到顶级容器中，需要先将其设置为标签 
         	labpic.setPreferredSize(dim13);
         	this.add(labpic);
         	button7_5.setText("返回");
        	button7_5.setPreferredSize(dim16);
            button7_5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent a) {
                	mainFrame.closeSelSearchDetailPanel1();
                	mainFrame.showSelSearchDetailPanel1();
                }
            });
            this.add(button7_5,BorderLayout.EAST);
         	
    }
}

