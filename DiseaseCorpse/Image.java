import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Image {
    private JFrame frame;
    private ImageIcon icon;
    private JLabel label;

    public Image(String filename){
        String path = "C:\\Users\\ju_w9\\Desktop\\School 2021-2022\\AP CS\\DiseaseCorp\\Imgs\\" + filename;
        frame = new JFrame();
        icon = new ImageIcon(path);
        label = new JLabel(icon);
        frame.add(label);
        frame.pack();
    }

    public void show(boolean b){
        frame.setVisible(b);
    }
}
