import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class MinePanel extends JPanel {

	int i = 0;
	static JTextPane tp8 = new JTextPane();
	static JTextPane tp7 = new JTextPane();
	static JTextPane tp6 = new JTextPane();
	static JTextPane tp5 = new JTextPane();
	static JTextPane tp4 = new JTextPane();
	static JTextPane tp3 = new JTextPane();
	static JTextPane tp2 = new JTextPane();
	static JTextPane tp1 = new JTextPane();
	static JTextPane tp0 = new JTextPane();
	
	public static JButton rockButton = new JButton();
	
	public MinePanel() {
		Color backgroundColor = new Color(210, 180, 140);
		Color borderColor = new Color(160, 82, 45);
		Color buttonColor = new Color(205, 133, 63);
		Font font = new Font(Font.SANS_SERIF, 3, 10);
		setLayout(null);
		setBackground(backgroundColor);
		
		rockButton.setBackground(new Color(211, 211, 211));
		rockButton.getActionListeners();
		ActionListener[] actionList = rockButton.getActionListeners();
		if(actionList.length == 0) {
			rockButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.swingPickaxe();
				}
			});
		}
		
		
		rockButton.setBounds(170, 325, 340, 355);
		add(rockButton);
		
		JButton goShopButton = new JButton("To Shop");
		goShopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.switchToShop();
			}
		});
		goShopButton.setBounds(10, 11, 150, 150);
		add(goShopButton);
		
		JButton mineLevelButton = new JButton("Select Level");
		mineLevelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.levelSelect();
			}
		});
		mineLevelButton.setBounds(520, 11, 150, 150);
		add(mineLevelButton);
		setImage(0);
		
		goShopButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		goShopButton.setBackground(buttonColor);
		mineLevelButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		mineLevelButton.setBackground(buttonColor);
		rockButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		rockButton.setBackground(buttonColor);
		
		JPanel resourcePanel = new JPanel();
		resourcePanel.setBackground(backgroundColor);
		resourcePanel.setBounds(170, 11, 340, 240);
		add(resourcePanel);
		resourcePanel.setLayout(new GridLayout(0, 1, 0, 0));
		tp0.setEditable(false);
		tp0.setBackground(null);
		tp0.setFont(font);
		tp0.setText("Currency: " + MainJFrame.player.currency);
		resourcePanel.add(tp0);
		tp1.setEditable(false);
		tp1.setBackground(null);
		tp1.setFont(font);
		tp1.setText("Dirt: " + MainJFrame.player.dirt);
		resourcePanel.add(tp1);
		tp2.setEditable(false);
		tp2.setBackground(null);
		tp2.setFont(font);
		tp2.setText("Stone: " + MainJFrame.player.stone);
		resourcePanel.add(tp2);
		tp3.setEditable(false);
		tp3.setBackground(null);
		tp3.setFont(font);
		tp3.setText("Copper: " + MainJFrame.player.copper);
		resourcePanel.add(tp3);
		tp4.setEditable(false);
		tp4.setBackground(null);
		tp4.setFont(font);
		tp4.setText("Iron: " + MainJFrame.player.iron);
		resourcePanel.add(tp4);
		tp5.setEditable(false);
		tp5.setBackground(null);
		tp5.setFont(font);
		tp5.setText("Sapphire: " + MainJFrame.player.sapphire);
		resourcePanel.add(tp5);
		tp6.setEditable(false);
		tp6.setBackground(null);
		tp6.setFont(font);
		tp6.setText("Silver: " + MainJFrame.player.silver);
		resourcePanel.add(tp6);
		tp7.setEditable(false);
		tp7.setBackground(null);
		tp7.setFont(font);
		tp7.setText("Gold: " + MainJFrame.player.gold);
		resourcePanel.add(tp7);
		tp8.setEditable(false);
		tp8.setBackground(null);
		tp8.setFont(font);
		tp8.setText("Diamond: " + MainJFrame.player.diamond);
		resourcePanel.add(tp8);
	}
	
	public static void updateText() {

		tp0.setText("Currency: " + MainJFrame.player.currency);
		tp1.setText("Dirt: " + MainJFrame.player.dirt);
		tp2.setText("Stone: " + MainJFrame.player.stone);
		tp3.setText("Copper: " + MainJFrame.player.copper);
		tp4.setText("Iron: " + MainJFrame.player.iron);
		tp5.setText("Sapphire: " + MainJFrame.player.sapphire);
		tp6.setText("Silver: " + MainJFrame.player.silver);
		tp7.setText("Gold: " + MainJFrame.player.gold);
		tp8.setText("Diamond: " + MainJFrame.player.diamond);
	}

	
	public static void setImage(int select) {
		
		switch (select) {
		
		case 0:
			try {
			    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream input = classloader.getResourceAsStream("dirtRockPic.PNG");
				Image image = ImageIO.read(input);
				rockButton.setIcon(new ImageIcon(image));
		    } catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
			
		case 1:
			try {
			    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream input = classloader.getResourceAsStream("stoneRockPic.PNG");
				Image image = ImageIO.read(input);
				rockButton.setIcon(new ImageIcon(image));
		    } catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
			
		case 2:
			try {
			    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream input = classloader.getResourceAsStream("copperRockPic.PNG");
				Image image = ImageIO.read(input);
				rockButton.setIcon(new ImageIcon(image));
		    } catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
			
		case 3:
			try {
			    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream input = classloader.getResourceAsStream("ironRockPic.PNG");
				Image image = ImageIO.read(input);
				rockButton.setIcon(new ImageIcon(image));
		    } catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
			
		case 4:
			try {
			    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream input = classloader.getResourceAsStream("sapphireRockPic.PNG");
				Image image = ImageIO.read(input);
				rockButton.setIcon(new ImageIcon(image));
		    } catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
			
		case 5:
			try {
			    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream input = classloader.getResourceAsStream("silverRockPic.PNG");
				Image image = ImageIO.read(input);
				rockButton.setIcon(new ImageIcon(image));
		    } catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
			
		case 6:
			try {
			    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream input = classloader.getResourceAsStream("goldRockPic.PNG");
				Image image = ImageIO.read(input);
				rockButton.setIcon(new ImageIcon(image));
		    } catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
			
		case 7:
			try {
			    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream input = classloader.getResourceAsStream("diamondRockPic.PNG");
				Image image = ImageIO.read(input);
				rockButton.setIcon(new ImageIcon(image));
		    } catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
			
		default:
			try {
			    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream input = classloader.getResourceAsStream("dirtRockPic.PNG");
				Image image = ImageIO.read(input);
				rockButton.setIcon(new ImageIcon(image));
		    } catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
			
			
			
		}
		
		
		
		
		
	}
}

