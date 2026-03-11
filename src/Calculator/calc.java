package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class calc {
     public static void main(String[] args) {
        Demo dd = new Demo();
    }
}

class Demo {

    JLabel label;
    String firstValue ="";
    String o;

    public Demo() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(425, 600);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent we) {
                super.windowDeactivated(we); //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
            }
        });

        Font font = new Font("Consolas", Font.PLAIN, 30);
        Font ButtonFont = new Font("Consolas", Font.PLAIN, 20);

        label = new JLabel("0");
        label.setBounds(10, 180, 400, 100);
        label.setFont(font);
        frame.add(label);

        JButton button1 = new JButton("÷");
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setForeground(Color.WHITE);
        button1.setBounds(310, 260, 90, 50);
        button1.setFont(ButtonFont);
        frame.add(button1);

        JButton button2 = new JButton("%");
        button2.setBounds(210, 260, 90, 50);
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setForeground(Color.WHITE);
        button2.setFont(ButtonFont);
        frame.add(button2);

        JButton button3 = new JButton("X");
        button3.setBounds(110, 260, 90, 50);
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setForeground(Color.RED);
        button3.setFont(ButtonFont);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s = label.getText();
                if (s.length() > 0) {
                    s = s.substring(0, s.length() - 1);
                    label.setText(s);
                }
                if (s.length() == 0) {
                    label.setText("0");
                }
            }
        });
        frame.add(button3);

        JButton button4 = new JButton("*");
        button4.setBounds(310, 320, 90, 50);
        button4.setBackground(Color.LIGHT_GRAY);
        button4.setForeground(Color.WHITE);
        button4.setFont(ButtonFont);
        frame.add(button4);

        JButton button5 = new JButton("-");
        button5.setBounds(310, 380, 90, 50);
        button5.setBackground(Color.LIGHT_GRAY);
        button5.setForeground(Color.WHITE);
        button5.setFont(ButtonFont);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                answer();
                o = "-";
                label.setText("0");
            }
        });
        frame.add(button5);

        JButton button6 = new JButton("+");
        button6.setBounds(310, 440, 90, 50);
        button6.setBackground(Color.LIGHT_GRAY);
        button6.setForeground(Color.WHITE);
        button6.setFont(ButtonFont);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                answer();
                o = "+";
                label.setText("0");
            }
        });
        frame.add(button6);

        JButton button7 = new JButton("=");
        button7.setBounds(310, 500, 90, 50);
        button7.setBackground(Color.darkGray);
        button7.setForeground(Color.WHITE);
        button7.setFont(ButtonFont);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                answer();
                label.setText(firstValue);
            }
        });
        frame.add(button7);

        JButton button8 = new JButton("9");
        button8.setBounds(210, 320, 90, 50);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button8);
            }
        });
        frame.add(button8);

        JButton button9 = new JButton("6");
        button9.setBounds(210, 380, 90, 50);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button9);
            }
        });
        frame.add(button9);

        JButton button10 = new JButton("3");
        button10.setBounds(210, 440, 90, 50);
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button10);
            }
        });
        frame.add(button10);

        JButton button11 = new JButton(".");
        button11.setBounds(210, 500, 90, 50);
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!label.getText().contains(".")) {
                    label.setText(label.getText() + ".");
                }
            }
        });
        frame.add(button11);

        JButton button12 = new JButton("8");
        button12.setBounds(110, 320, 90, 50);
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button12);
            }
        });
        frame.add(button12);

        JButton button13 = new JButton("5");
        button13.setBounds(110, 380, 90, 50);
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button13);
            }
        });
        frame.add(button13);

        JButton button14 = new JButton("2");
        button14.setBounds(110, 440, 90, 50);
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button14);
            }
        });
        frame.add(button14);

        JButton button15 = new JButton("0");
        button15.setBounds(110, 500, 90, 50);
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button15);
            }
        });
        frame.add(button15);

        JButton button16 = new JButton("C");
        button16.setBounds(10, 260, 90, 50);
        button16.setBackground(Color.LIGHT_GRAY);
        button16.setForeground(Color.WHITE);
        button16.setFont(ButtonFont);
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button16);
                firstValue = "0";
                label.setText("0");
            }
        });
        frame.add(button16);

        JButton button17 = new JButton("7");
        button17.setBounds(10, 320, 90, 50);
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button17);
            }
        });
        frame.add(button17);

        JButton button18 = new JButton("4");
        button18.setBounds(10, 380, 90, 50);
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button18);
            }
        });
        frame.add(button18);

        JButton button19 = new JButton("1");
        button19.setBounds(10, 440, 90, 50);
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ButtonClick(button19);
            }
        });
        frame.add(button19);

        JButton button20 = new JButton("00");
        button20.setBounds(10, 500, 90, 50);
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (label.getText().equals("0")) {
                    label.setText("0");
                } else {
                    ButtonClick(button20);
                }
            }
        });
        frame.add(button20);
    }

    private void ButtonClick(JButton b) {
        if (label.getText().equals("0")) {
            label.setText(b.getText());

        } else {
            label.setText(label.getText() + b.getText());
        }
    }

    private void answer() {
        if (firstValue.equals("")) {
            firstValue = label.getText();
            return;
        }
        float a = Float.parseFloat(firstValue);
        float b = Float.parseFloat(label.getText());

        if (o.equals("+")) {
            firstValue = "" + (a + b);
        } else {
            firstValue = "" + (a - b);
        }

    }
}