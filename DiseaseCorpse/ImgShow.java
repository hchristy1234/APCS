import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImgShow {
	public void showPills() throws IOException {
		File pill = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/pill bottle.png");
		BufferedImage bufferedImage = ImageIO.read(pill);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(500, 750);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void showMaskBox() throws IOException {
		File box = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/masks.png");
		BufferedImage bufferedImage = ImageIO.read(box);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(500, 400);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void showHandSanitizer() throws IOException {
		File sanitizer = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/hand sanitizer.png");
		BufferedImage bufferedImage = ImageIO.read(sanitizer);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(500, 700);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void showTeddyBear() throws IOException {
		File bear = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/teddy bear.png");
		BufferedImage bufferedImage = ImageIO.read(bear);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(500, 600);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void showGraduateCylinder() throws IOException {
		File cylinder = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/graduated cylinder.jpg");
		BufferedImage bufferedImage = ImageIO.read(cylinder);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(500, 730);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void showOintment() throws IOException {
		File oint = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/ointment.png");
		BufferedImage bufferedImage = ImageIO.read(oint);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(500, 400);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void showMug() throws IOException {
		File mug = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/#1 boss mug.jpg");
		BufferedImage bufferedImage = ImageIO.read(mug);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(700, 800);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void showPaperBag() throws IOException {
		File bag = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/Paper bag.jpg");
		BufferedImage bufferedImage = ImageIO.read(bag);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(500, 800);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void showSafe() throws IOException {
		File safe = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/Safe.jpg");
		BufferedImage bufferedImage = ImageIO.read(safe);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(1000, 800);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void showShelf() throws IOException {
		File shelf = new File("C:/Users/Whitney-Linux/eclipse-workspace/DiseaseCorp/src/project/hospital shelf.jpg");
		BufferedImage bufferedImage = ImageIO.read(shelf);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout()); 
        
        jFrame.setSize(1000, 1000);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}