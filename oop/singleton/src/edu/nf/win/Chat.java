package edu.nf.win;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 天文学
 */
public class Chat {

    private static Chat instance;
    private static String key="key";

    private Chat() {
        JFrame f=new JFrame("聊天框");
        f.setSize(400,500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static Chat getInstance(){
        if (instance==null){
//            synchronized (key){
//                if (instance==null){
//                    instance=new Chat();
//                }
//            }
            instance=new Chat();
        }
        return instance;
    }

}
