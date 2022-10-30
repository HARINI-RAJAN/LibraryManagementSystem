package com.Library.Main;
import javax.swing.*;
import java.awt.*;

//completed design.
public class UserView {
    JFrame frame  = new JFrame();

    UserView()
    {
        frame.getContentPane().setLayout(null);
        JLabel pic = new JLabel();
        Image img = new ImageIcon(this.getClass().getResource("/img/user.png")).getImage() ;

        pic.setIcon(new ImageIcon(img));

        pic.setBounds(50, 50, 150, 150);
        JLabel name = new JLabel("Name : ");
        JLabel phone = new JLabel("Ph.No : ");
        JLabel bTaken = new JLabel("Books Taken : ");
        JLabel bReturned = new JLabel("Books Returned : ");

        name.setBounds(500, 60, 300, 40);
        phone.setBounds(500, 90, 300, 40 );
        bTaken.setBounds(500, 120, 300, 40);
        bReturned.setBounds(500,150, 300, 40);

        JTable table = createTable();

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0,350,1550,350);


        frame.add(pic);
        frame.add(name);
        frame.add(phone);
        frame.add(bTaken);
        frame.add(bReturned);
        frame.add(pane);

        frame.setBounds(0,0,1800,1000);
        frame.setVisible(true);

    }

    public JTable createTable()
    {
        String[][] details =
                {
                        {"USER001",  "Harini","HAR202212","2022-08-08","2022-08-23","Yes"},
                        {"USER002",  "Rishi","HAR202213","2022-08-09","2022-08-24","No"},
                        {"USER003",  "Akshaya","HAR202214","2022-08-10","2022-08-25","Yes"}
                   
                };

        String[] columns = {"User Id", "Name", "Book Id", "Issue Date","Due Date", "Returned"};

        return new JTable(details, columns);
    }

    public static void main(String[] args) {
        new UserView();
    }
}
