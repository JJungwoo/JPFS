package SourceVIewer;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class SourceViewer extends Frame {

    TextField tf = new TextField();
    TextArea ta = new TextArea();

    SourceViewer(String title) {
        super(title);

        add(tf, "North");
        add(ta, "Center");

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySource();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        setBounds(500, 200, 500, 300);
        setVisible(true);
    }

    void displaySource() {
        URL url = null;
        BufferedReader input = null;
        String address = tf.getText().trim();
        String line = "";

        ta.setText("");

        System.out.println("address : " + address);

        try {
            if(!address.startsWith("http://"))
                address = "http://" + address;

            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while((line = input.readLine()) != null) {
                System.out.println(line);
                //ta.setText("test");
                //ta.add(line);
            }
            input.close();
        } catch (Exception e) {
            ta.setText("유효하지 않은 URL 입니다.");
        }
    }

    public static void main(String[] args) {
        SourceViewer mainWindow = new SourceViewer("Source Viewer");
    }

}
