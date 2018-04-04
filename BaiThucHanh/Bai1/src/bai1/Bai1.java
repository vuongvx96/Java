/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JPanel;

/**
 *
 * @author louis
 */
public class Bai1 extends Frame {
    public Bai1(){
        setTitle("Bai1 AWT");
        setSize(300,300);
        setLayout(new GridLayout(4,2,10,10));
        lblA = new Label("a ");
        lblA.setSize(10,10);
        add(lblA);
        txtA = new TextField(20);
        add(txtA);

        lblB = new Label("b ");
        add(lblB);
        txtB = new TextField(20);
        add(txtB);
        
        add(new Label());
        JPanel panelPhepToan = new JPanel();
        
        btnCong = new Button("+");
        btnCong.addActionListener(new LangNgheCong());
        panelPhepToan.add(btnCong);
        
        btnTru = new Button("-");
        btnTru.addActionListener(new LangNgheTru());
        panelPhepToan.add(btnTru);
        
        btnNhan =new Button("*");
        btnNhan.addActionListener(new LangNgheNhan());
        panelPhepToan.add(btnNhan);
        
        btnChia = new Button("/");
        btnChia.addActionListener(new LangNgheChia());
        panelPhepToan.add(btnChia);
        
        add(panelPhepToan);
        lblKQ = new Label("kq ");
        add(lblKQ);
        txtKQ = new TextField(20);
        add(txtKQ);

        addWindowListener(new SuKienCuaSo());
        setVisible(true);
    }
    Label lblA, lblB, lblKQ;
    TextField txtA, txtB, txtKQ;
    Button btnCong, btnTru, btnNhan, btnChia;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Bai1();
    }
    
    class LangNgheCong implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Lay a
            int a = Integer.parseInt(txtA.getText());
            //Lay b
            int b = Integer.parseInt(txtB.getText());
            // Tinh tong
            int Tong = a + b;
            // Xuat
            txtKQ.setText(String.valueOf(Tong));
        }
    }
    
    class LangNgheTru implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            //Lay b
            int b = Integer.parseInt(txtB.getText());
            // Tinh tong
            int Tong = a - b;
            // Xuat
            txtKQ.setText(String.valueOf(Tong));
        } 
    }
    
    class LangNgheNhan implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            //Lay b
            int b = Integer.parseInt(txtB.getText());
            // Tinh tong
            int Tong = a * b;
            // Xuat
            txtKQ.setText(String.valueOf(Tong));
        }
    }
    
    class LangNgheChia implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            //Lay b
            int b = Integer.parseInt(txtB.getText());
            // Tinh tong
            int Tong = a / b;
            // Xuat
            txtKQ.setText(String.valueOf(Tong));
        }
    }
    
    class SuKienCuaSo implements WindowListener{
        public void windowOpened(WindowEvent e) {
        }

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        public void windowClosed(WindowEvent e) {
        }

        public void windowIconified(WindowEvent e) {
        }

        public void windowDeiconified(WindowEvent e) {
        }

        public void windowActivated(WindowEvent e) {
        }

        public void windowDeactivated(WindowEvent e) {
        }
        
    }
}