package gui;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import db.UserTable;

public class LoginPanel extends JPanel {
    AppMainFrame mainFrame;
    UserTable userTable;

    LoginPanel(AppMainFrame parentFrame) {
        super();

        // 指向父JFrame的指针
        this.mainFrame = parentFrame;
        this.userTable = new UserTable(this.mainFrame.serverURL, this.mainFrame.databaseName, this.mainFrame.user,
                this.mainFrame.password);

        java.awt.FlowLayout fl = new java.awt.FlowLayout(FlowLayout.CENTER, 5, 5);
        this.setLayout(fl);

        // //设置格式大小
        java.awt.Dimension dim1 = new java.awt.Dimension(340, 300);// 图片大小
        //
        java.awt.Dimension dim2 = new java.awt.Dimension(50, 50);// 标签的大小
        //
        java.awt.Dimension dim3 = new java.awt.Dimension(250, 30);// 输入框的大小
        //
        java.awt.Dimension dim4 = new java.awt.Dimension(100, 40);// 按钮的大小 //添加组件
        // //添加图片，先要把图片加载到内存中。利用IamgeIcon类把图片加载到内存
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon("assets/loginBackground.jpeg");
        JLabel labpic = new JLabel(icon);// 不可以直接把图片加到顶级容器中，需要先将其设置为标签
        labpic.setPreferredSize(dim1);
        this.add(labpic);
        JLabel labname = new JLabel();
        labname.setText("账号：");
        labname.setPreferredSize(dim2);
        this.add(labname);
        // //添加账号输入框，并添加监控事件
        JTextField textname = new JTextField();
        textname.setPreferredSize(dim3);
        this.add(textname);
        //
        JLabel labpassword = new JLabel();
        labpassword.setText("密码：");
        labpassword.setPreferredSize(dim2);
        this.add(labpassword);
        //
        JPasswordField jp = new JPasswordField();
        jp.setPreferredSize(dim3);
        this.add(jp);

        javax.swing.JButton button = new javax.swing.JButton();
        button.setText("登录");
        button.setPreferredSize(dim4);

        // 登陆按钮监听器
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                String account = textname.getText();
                char[] charArray = jp.getPassword();
                String password = new String(charArray);
                boolean verify = userTable.login(account, password);

                if (verify) {
                    mainFrame.closeLoginPanel();
                    String userType = userTable.getUserType(account);
                    if (userType.equals("merchant")) {
                        mainFrame.showMerchantPanel();
                    } else {
                        mainFrame.showCusSearchPanel();
                    }
                } else {
                    JOptionPane.showMessageDialog(mainFrame, "登陆失败！");
                }

            }
        });
        this.add(button);
    }

}