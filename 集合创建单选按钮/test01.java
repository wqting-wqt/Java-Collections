package example.集合创建单选按钮;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class test01  extends JFrame implements ItemListener {
    JRadioButton b1, b2;
    ButtonGroup buttonGroup;
    JLabel label;
    JScrollPane jScrollPane;
    JPanel jPanel;
    JSplitPane jSplitPane;

    test01() {
        setSize(200, 100);
        buttonGroup = new ButtonGroup();
        setTitle("使用集合创建单选按钮");
        Container container = getContentPane();
        java.util.List list = new ArrayList<String>();
        list.add("java");
        list.add("c");
        jPanel = new JPanel();
        label = new JLabel();
        jScrollPane = new JScrollPane(label);
        b1 = new JRadioButton((String) list.get(0));
        b2 = new JRadioButton((String) list.get(1));
        buttonGroup.add(b1);
        buttonGroup.add(b2);
        jPanel.add(b1);
        jPanel.add(b2);
        b1.addItemListener(this);
        b2.addItemListener(this);
        jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, jPanel, jScrollPane);
        container.add(jSplitPane);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getItemSelectable() == b1) {
            label.setText("java");
        }
        if (e.getItemSelectable() == b2) {
            label.setText("c");
        }
    }

    public static void main(String[] args) {
        new test01();
    }
}
