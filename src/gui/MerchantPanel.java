package gui;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField; // 首先实现登录界面

public class MerchantPanel extends JPanel {
    AppMainFrame mainFrame;

    MerchantPanel(AppMainFrame parentFrame) {
        super();

        // 指向父JFrame的指针
        this.mainFrame = parentFrame;

        java.awt.FlowLayout fl = new java.awt.FlowLayout(FlowLayout.CENTER, 85, 85);
        this.setLayout(fl);// 设置顶级容器的布局为流式布局
        java.awt.Dimension dim1 = new java.awt.Dimension(400, 150);// 图片大小
        //
        java.awt.Dimension dim4 = new java.awt.Dimension(100, 40);// 按钮的大小 //添加组件
        javax.swing.JButton button1 = new javax.swing.JButton();
        javax.swing.JButton button2 = new javax.swing.JButton();
        button1.setText("查看商品");
        button2.setText("上新");

        JLabel buttonL1 = new JLabel();
        button1.setPreferredSize(dim4);
        this.add(button1);

        JLabel buttonL2 = new JLabel();
        button2.setPreferredSize(dim4);
        this.add(button2);
    }

}
