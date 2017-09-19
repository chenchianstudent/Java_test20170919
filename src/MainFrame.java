import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button bt1 = new Button("Exit");
    private Button bt2 = new Button("Add");
private Label lab1=new Label("0");
private int n=0;
    public MainFrame() {
        init();
    }

    private void init() {
        this.setBounds(100, 120, 500, 400);
        this.setLayout(null);
        bt1.setBounds(50, 60, 100, 100);
        bt1.setBackground(new Color(70, 255, 213));
        bt2.setBounds(100, 60, 100, 100);
        lab1.setBounds(300,200,100,100);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lab1.setText(Integer.toString(n));
            }
        });
        this.add(bt1);
        this.add(bt2);
        this.add(lab1);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
