
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class SellPanel extends JPanel {

	private static JTextPane tp2_1 = new JTextPane();
	private static JTextPane tp2_2 = new JTextPane();
	private static JTextPane tp2_4 = new JTextPane();
	private static JTextPane tp2_5 = new JTextPane();
	private static JTextPane tp2_8 = new JTextPane();
	private static JTextPane tp2_7 = new JTextPane();
	private static JTextPane tp2_6 = new JTextPane();
	private static JTextPane tp2_3 = new JTextPane();
	
	
	public SellPanel() {
		
		setBackground(Color.CYAN);
		setLayout( new BorderLayout());
		setMinimumSize( new Dimension(680,505));
		Font font = new Font(Font.SANS_SERIF, 3, 30);
		String setText;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
	    gridBagLayout.columnWidths = new int[]{100, 100, 0, 0};
	    gridBagLayout.rowHeights = new int[]{50, 0};
	    gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
	    gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		
	    JPanel sellPanel = new JPanel();
		sellPanel.setLayout(gridBagLayout);
		sellPanel.setBackground(design.backgroundColor);
		sellPanel.setMinimumSize( new Dimension(680,505));
		
		
		// row 0
		JTextPane tp1_0 = new JTextPane();
		GridBagConstraints gbc_tp1_0 = new GridBagConstraints();
		gbc_tp1_0.insets = new Insets(5, 5, 5, 5);
		gbc_tp1_0.fill = GridBagConstraints.VERTICAL;
		gbc_tp1_0.gridx = 0;
		gbc_tp1_0.gridy = 0;
		tp1_0.setEditable(false);
		tp1_0.setBackground(null);
		tp1_0.setFont(font);
		tp1_0.setText("Resource");
		sellPanel.add(tp1_0, gbc_tp1_0);
		
		JTextPane tp2_0 = new JTextPane();
		GridBagConstraints gbc_tp2_0 = new GridBagConstraints();
		gbc_tp2_0.insets = new Insets(5, 5, 5, 5);
		gbc_tp2_0.fill = GridBagConstraints.VERTICAL;
		gbc_tp2_0.gridx = 1;
		gbc_tp2_0.gridy = 0;
		tp2_0.setEditable(false);
		tp2_0.setBackground(null);
		tp2_0.setFont(font);
		tp2_0.setText("# Owned");
		sellPanel.add(tp2_0,gbc_tp2_0);
		
		JTextPane tp3_0 = new JTextPane();
		GridBagConstraints gbc_tp3_0 = new GridBagConstraints();
		gbc_tp3_0.insets = new Insets(5, 5, 5, 5);
		gbc_tp3_0.fill = GridBagConstraints.VERTICAL;
		gbc_tp3_0.gridx = 2;
		gbc_tp3_0.gridy = 0;
		tp3_0.setEditable(false);
		tp3_0.setBackground(null);
		tp3_0.setFont(font);
		tp3_0.setText("Sell Price");
		sellPanel.add(tp3_0, gbc_tp3_0);
		
		
		JButton sellButton_0 = new JButton("Sell All");
		sellButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.sellDirt();
				MainJFrame.sellStone();
				MainJFrame.sellCopper();
				MainJFrame.sellIron();
				MainJFrame.sellSapphire();
				MainJFrame.sellSilver();
				MainJFrame.sellGold();
				MainJFrame.sellDiamond();
				updateText();
			}
		});
		GridBagConstraints gbc_sb_0 = new GridBagConstraints();
		gbc_sb_0.insets = new Insets(5, 5, 5, 5);
		gbc_sb_0.fill = GridBagConstraints.VERTICAL;
		gbc_sb_0.gridx = 3;
		gbc_sb_0.gridy = 0;
		sellButton_0.setBackground(design.buttonColor);
		sellPanel.add(sellButton_0,gbc_sb_0);
		
		
		// row 1 Dirt
		JTextPane tp1_1 = new JTextPane();
		GridBagConstraints gbc_tp1_1 = new GridBagConstraints();
		gbc_tp1_1.insets = new Insets(5, 5, 5, 5);
		gbc_tp1_1.fill = GridBagConstraints.VERTICAL;
		gbc_tp1_1.gridx = 0;
		gbc_tp1_1.gridy = 1;
		tp1_1.setEditable(false);
		tp1_1.setBackground(null);
		tp1_1.setFont(font);
		tp1_1.setText("Dirt");
		sellPanel.add(tp1_1, gbc_tp1_1);
		
		GridBagConstraints gbc_tp2_1 = new GridBagConstraints();
		gbc_tp2_1.insets = new Insets(5, 5, 5, 5);
		gbc_tp2_1.fill = GridBagConstraints.VERTICAL;
		gbc_tp2_1.gridx = 1;
		gbc_tp2_1.gridy = 1;
		tp2_1.setEditable(false);
		tp2_1.setBackground(null);
		tp2_1.setFont(font);
		setText = "" + MainJFrame.player.dirt;
		tp2_1.setText(setText);
		sellPanel.add(tp2_1,gbc_tp2_1);
		
		JTextPane tp3_1 = new JTextPane();
		GridBagConstraints gbc_tp3_1 = new GridBagConstraints();
		gbc_tp3_1.insets = new Insets(5, 5, 5, 5);
		gbc_tp3_1.fill = GridBagConstraints.VERTICAL;
		gbc_tp3_1.gridx = 2;
		gbc_tp3_1.gridy = 1;
		tp3_1.setEditable(false);
		tp3_1.setBackground(null);
		tp3_1.setFont(font);
		setText = "" + MainJFrame.resourceList.get(0).price;
		tp3_1.setText(setText);
		sellPanel.add(tp3_1, gbc_tp3_1);
		
		JButton sellButton_1 = new JButton("Sell");
		sellButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.sellDirt();
				updateText();
			}
		});
		GridBagConstraints gbc_sb_1 = new GridBagConstraints();
		gbc_sb_1.insets = new Insets(5, 5, 5, 5);
		gbc_sb_1.fill = GridBagConstraints.VERTICAL;
		gbc_sb_1.gridx = 3;
		gbc_sb_1.gridy = 1;
		sellButton_1.setBackground(design.buttonColor);
		sellPanel.add(sellButton_1,gbc_sb_1);
		
		
		// row 2 Stone
		JTextPane tp1_2 = new JTextPane();
		GridBagConstraints gbc_tp1_2 = new GridBagConstraints();
		gbc_tp1_2.insets = new Insets(5, 5, 5, 5);
		gbc_tp1_2.fill = GridBagConstraints.VERTICAL;
		gbc_tp1_2.gridx = 0;
		gbc_tp1_2.gridy = 2;
		tp1_2.setEditable(false);
		tp1_2.setBackground(null);
		tp1_2.setFont(font);
		tp1_2.setText("Stone");
		sellPanel.add(tp1_2, gbc_tp1_2);
		
		GridBagConstraints gbc_tp2_2 = new GridBagConstraints();
		gbc_tp2_2.insets = new Insets(5, 5, 5, 5);
		gbc_tp2_2.fill = GridBagConstraints.VERTICAL;
		gbc_tp2_2.gridx = 1;
		gbc_tp2_2.gridy = 2;
		tp2_2.setEditable(false);
		tp2_2.setBackground(null);
		tp2_2.setFont(font);
		setText = "" + MainJFrame.player.stone;
		tp2_2.setText(setText);
		sellPanel.add(tp2_2,gbc_tp2_2);
		
		JTextPane tp3_2 = new JTextPane();
		GridBagConstraints gbc_tp3_2 = new GridBagConstraints();
		gbc_tp3_2.insets = new Insets(5, 5, 5, 5);
		gbc_tp3_2.fill = GridBagConstraints.VERTICAL;
		gbc_tp3_2.gridx = 2;
		gbc_tp3_2.gridy = 2;
		tp3_2.setEditable(false);
		tp3_2.setBackground(null);
		tp3_2.setFont(font);
		setText = "" + MainJFrame.resourceList.get(1).price;
		tp3_2.setText(setText);
		sellPanel.add(tp3_2, gbc_tp3_2);
		
		JButton sellButton_2 = new JButton("Sell");
		sellButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.sellStone();
				updateText();
			}
		});
		GridBagConstraints gbc_sb_2 = new GridBagConstraints();
		gbc_sb_2.insets = new Insets(5, 5, 5, 5);
		gbc_sb_2.fill = GridBagConstraints.VERTICAL;
		gbc_sb_2.gridx = 3;
		gbc_sb_2.gridy = 2;
		sellButton_2.setBackground(design.buttonColor);
		sellPanel.add(sellButton_2,gbc_sb_2);
		
		
		// row 3 Copper
		JTextPane tp1_3 = new JTextPane();
		GridBagConstraints gbc_tp1_3 = new GridBagConstraints();
		gbc_tp1_3.insets = new Insets(5, 5, 5, 5);
		gbc_tp1_3.fill = GridBagConstraints.VERTICAL;
		gbc_tp1_3.gridx = 0;
		gbc_tp1_3.gridy = 3;
		tp1_3.setEditable(false);
		tp1_3.setBackground(null);
		tp1_3.setFont(font);
		tp1_3.setText("Copper");
		sellPanel.add(tp1_3, gbc_tp1_3);
		
		GridBagConstraints gbc_tp2_3 = new GridBagConstraints();
		gbc_tp2_3.insets = new Insets(5, 5, 5, 5);
		gbc_tp2_3.fill = GridBagConstraints.VERTICAL;
		gbc_tp2_3.gridx = 1;
		gbc_tp2_3.gridy = 3;
		tp2_3.setEditable(false);
		tp2_3.setBackground(null);
		tp2_3.setFont(font);
		setText = "" + MainJFrame.player.copper;
		tp2_3.setText(setText);
		sellPanel.add(tp2_3,gbc_tp2_3);
		
		JTextPane tp3_3 = new JTextPane();
		GridBagConstraints gbc_tp3_3 = new GridBagConstraints();
		gbc_tp3_3.insets = new Insets(5, 5, 5, 5);
		gbc_tp3_3.fill = GridBagConstraints.VERTICAL;
		gbc_tp3_3.gridx = 2;
		gbc_tp3_3.gridy = 3;
		tp3_3.setEditable(false);
		tp3_3.setBackground(null);
		tp3_3.setFont(font);
		setText = "" + MainJFrame.resourceList.get(2).price;
		tp3_3.setText(setText);
		sellPanel.add(tp3_3, gbc_tp3_3);
		
		JButton sellButton_3 = new JButton("Sell");
		sellButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.sellCopper();
				updateText();
			}
		});
		GridBagConstraints gbc_sb_3 = new GridBagConstraints();
		gbc_sb_3.insets = new Insets(5, 5, 5, 5);
		gbc_sb_3.fill = GridBagConstraints.VERTICAL;
		gbc_sb_3.gridx = 3;
		gbc_sb_3.gridy = 3;
		sellButton_3.setBackground(design.buttonColor);
		sellPanel.add(sellButton_3,gbc_sb_3);
		
		
		// row 4 Iron
		JTextPane tp1_4 = new JTextPane();
		GridBagConstraints gbc_tp1_4 = new GridBagConstraints();
		gbc_tp1_4.insets = new Insets(5, 5, 5, 5);
		gbc_tp1_4.fill = GridBagConstraints.VERTICAL;
		gbc_tp1_4.gridx = 0;
		gbc_tp1_4.gridy = 4;
		tp1_4.setEditable(false);
		tp1_4.setBackground(null);
		tp1_4.setFont(font);
		tp1_4.setText("Iron");
		sellPanel.add(tp1_4, gbc_tp1_4);
		
		GridBagConstraints gbc_tp2_4 = new GridBagConstraints();
		gbc_tp2_4.insets = new Insets(5, 5, 5, 5);
		gbc_tp2_4.fill = GridBagConstraints.VERTICAL;
		gbc_tp2_4.gridx = 1;
		gbc_tp2_4.gridy = 4;
		tp2_4.setEditable(false);
		tp2_4.setBackground(null);
		tp2_4.setFont(font);
		setText = "" + MainJFrame.player.iron;
		tp2_4.setText(setText);
		sellPanel.add(tp2_4,gbc_tp2_4);
		
		JTextPane tp3_4 = new JTextPane();
		GridBagConstraints gbc_tp3_4 = new GridBagConstraints();
		gbc_tp3_4.insets = new Insets(5, 5, 5, 5);
		gbc_tp3_4.fill = GridBagConstraints.VERTICAL;
		gbc_tp3_4.gridx = 2;
		gbc_tp3_4.gridy = 4;
		tp3_4.setEditable(false);
		tp3_4.setBackground(null);
		tp3_4.setFont(font);
		setText = "" + MainJFrame.resourceList.get(3).price;
		tp3_4.setText(setText);
		sellPanel.add(tp3_4, gbc_tp3_4);
		
		JButton sellButton_4 = new JButton("Sell");
		sellButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.sellIron();
				updateText();
			}
		});
		GridBagConstraints gbc_sb_4 = new GridBagConstraints();
		gbc_sb_4.insets = new Insets(5, 5, 5, 5);
		gbc_sb_4.fill = GridBagConstraints.VERTICAL;
		gbc_sb_4.gridx = 3;
		gbc_sb_4.gridy = 4;
		sellButton_4.setBackground(design.buttonColor);
		sellPanel.add(sellButton_4,gbc_sb_4);
		
		
		// row 5 Sapphire
		JTextPane tp1_5 = new JTextPane();
		GridBagConstraints gbc_tp1_5 = new GridBagConstraints();
		gbc_tp1_5.insets = new Insets(5, 5, 5, 5);
		gbc_tp1_5.fill = GridBagConstraints.VERTICAL;
		gbc_tp1_5.gridx = 0;
		gbc_tp1_5.gridy = 5;
		tp1_5.setEditable(false);
		tp1_5.setBackground(null);
		tp1_5.setFont(font);
		tp1_5.setText("Sapphire");
		sellPanel.add(tp1_5, gbc_tp1_5);
		
		GridBagConstraints gbc_tp2_5 = new GridBagConstraints();
		gbc_tp2_5.insets = new Insets(5, 5, 5, 5);
		gbc_tp2_5.fill = GridBagConstraints.VERTICAL;
		gbc_tp2_5.gridx = 1;
		gbc_tp2_5.gridy = 5;
		tp2_5.setEditable(false);
		tp2_5.setBackground(null);
		tp2_5.setFont(font);
		setText = "" + MainJFrame.player.sapphire;
		tp2_5.setText(setText);
		sellPanel.add(tp2_5,gbc_tp2_5);
		
		JTextPane tp3_5 = new JTextPane();
		GridBagConstraints gbc_tp3_5 = new GridBagConstraints();
		gbc_tp3_5.insets = new Insets(5, 5, 5, 5);
		gbc_tp3_5.fill = GridBagConstraints.VERTICAL;
		gbc_tp3_5.gridx = 2;
		gbc_tp3_5.gridy = 5;
		tp3_5.setEditable(false);
		tp3_5.setBackground(null);
		tp3_5.setFont(font);
		setText = "" + MainJFrame.resourceList.get(4).price;
		tp3_5.setText(setText);
		sellPanel.add(tp3_5, gbc_tp3_5);
		
		JButton sellButton_5 = new JButton("Sell");
		sellButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.sellSapphire();
				updateText();
			}
		});
		GridBagConstraints gbc_sb_5 = new GridBagConstraints();
		gbc_sb_5.insets = new Insets(5, 5, 5, 5);
		gbc_sb_5.fill = GridBagConstraints.VERTICAL;
		gbc_sb_5.gridx = 3;
		gbc_sb_5.gridy = 5;
		sellButton_5.setBackground(design.buttonColor);
		sellPanel.add(sellButton_5,gbc_sb_5);
		
		
		// row 6 Silver
		JTextPane tp1_6 = new JTextPane();
		GridBagConstraints gbc_tp1_6 = new GridBagConstraints();
		gbc_tp1_6.insets = new Insets(5, 5, 5, 5);
		gbc_tp1_6.fill = GridBagConstraints.VERTICAL;
		gbc_tp1_6.gridx = 0;
		gbc_tp1_6.gridy = 6;
		tp1_6.setEditable(false);
		tp1_6.setBackground(null);
		tp1_6.setFont(font);
		tp1_6.setText("Silver");
		sellPanel.add(tp1_6, gbc_tp1_6);
		
		GridBagConstraints gbc_tp2_6 = new GridBagConstraints();
		gbc_tp2_6.insets = new Insets(5, 5, 5, 5);
		gbc_tp2_6.fill = GridBagConstraints.VERTICAL;
		gbc_tp2_6.gridx = 1;
		gbc_tp2_6.gridy = 6;
		tp2_6.setEditable(false);
		tp2_6.setBackground(null);
		tp2_6.setFont(font);
		setText = "" + MainJFrame.player.silver;
		tp2_6.setText(setText);
		sellPanel.add(tp2_6,gbc_tp2_6);
		
		JTextPane tp3_6 = new JTextPane();
		GridBagConstraints gbc_tp3_6 = new GridBagConstraints();
		gbc_tp3_6.insets = new Insets(5, 5, 5, 5);
		gbc_tp3_6.fill = GridBagConstraints.VERTICAL;
		gbc_tp3_6.gridx = 2;
		gbc_tp3_6.gridy = 6;
		tp3_6.setEditable(false);
		tp3_6.setBackground(null);
		tp3_6.setFont(font);
		setText = "" + MainJFrame.resourceList.get(5).price;
		tp3_6.setText(setText);
		sellPanel.add(tp3_6, gbc_tp3_6);
		
		JButton sellButton_6 = new JButton("Sell");
		sellButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.sellSilver();
				updateText();
			}
		});
		GridBagConstraints gbc_sb_6 = new GridBagConstraints();
		gbc_sb_6.insets = new Insets(5, 5, 5, 5);
		gbc_sb_6.fill = GridBagConstraints.VERTICAL;
		gbc_sb_6.gridx = 3;
		gbc_sb_6.gridy = 6;
		sellButton_6.setBackground(design.buttonColor);
		sellPanel.add(sellButton_6,gbc_sb_6);
		
		
		// row 7 Gold
		JTextPane tp1_7 = new JTextPane();
		GridBagConstraints gbc_tp1_7 = new GridBagConstraints();
		gbc_tp1_7.insets = new Insets(5, 5, 5, 5);
		gbc_tp1_7.fill = GridBagConstraints.VERTICAL;
		gbc_tp1_7.gridx = 0;
		gbc_tp1_7.gridy = 7;
		tp1_7.setEditable(false);
		tp1_7.setBackground(null);
		tp1_7.setFont(font);
		tp1_7.setText("Gold");
		sellPanel.add(tp1_7, gbc_tp1_7);
		
		GridBagConstraints gbc_tp2_7 = new GridBagConstraints();
		gbc_tp2_7.insets = new Insets(5, 5, 5, 5);
		gbc_tp2_7.fill = GridBagConstraints.VERTICAL;
		gbc_tp2_7.gridx = 1;
		gbc_tp2_7.gridy = 7;
		tp2_7.setEditable(false);
		tp2_7.setBackground(null);
		tp2_7.setFont(font);
		setText = "" + MainJFrame.player.gold;
		tp2_7.setText(setText);
		sellPanel.add(tp2_7,gbc_tp2_7);
		
		JTextPane tp3_7 = new JTextPane();
		GridBagConstraints gbc_tp3_7 = new GridBagConstraints();
		gbc_tp3_7.insets = new Insets(5, 5, 5, 5);
		gbc_tp3_7.fill = GridBagConstraints.VERTICAL;
		gbc_tp3_7.gridx = 2;
		gbc_tp3_7.gridy = 7;
		tp3_7.setEditable(false);
		tp3_7.setBackground(null);
		tp3_7.setFont(font);
		setText = "" + MainJFrame.resourceList.get(6).price;
		tp3_7.setText(setText);
		sellPanel.add(tp3_7, gbc_tp3_7);
		
		JButton sellButton_7 = new JButton("Sell");
		sellButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.sellGold();
				updateText();
			}
		});
		GridBagConstraints gbc_sb_7 = new GridBagConstraints();
		gbc_sb_7.insets = new Insets(5, 5, 5, 5);
		gbc_sb_7.fill = GridBagConstraints.VERTICAL;
		gbc_sb_7.gridx = 3;
		gbc_sb_7.gridy = 7;
		sellButton_7.setBackground(design.buttonColor);
		sellPanel.add(sellButton_7,gbc_sb_7);
		
		
		// row 8 Diamond
		JTextPane tp1_8 = new JTextPane();
		GridBagConstraints gbc_tp1_8 = new GridBagConstraints();
		gbc_tp1_8.insets = new Insets(5, 5, 5, 5);
		gbc_tp1_8.fill = GridBagConstraints.VERTICAL;
		gbc_tp1_8.gridx = 0;
		gbc_tp1_8.gridy = 8;
		tp1_8.setEditable(false);
		tp1_8.setBackground(null);
		tp1_8.setFont(font);
		tp1_8.setText("Diamond");
		sellPanel.add(tp1_8, gbc_tp1_8);
		
		GridBagConstraints gbc_tp2_8 = new GridBagConstraints();
		gbc_tp2_8.insets = new Insets(5, 5, 5, 5);
		gbc_tp2_8.fill = GridBagConstraints.VERTICAL;
		gbc_tp2_8.gridx = 1;
		gbc_tp2_8.gridy = 8;
		tp2_8.setEditable(false);
		tp2_8.setBackground(null);
		tp2_8.setFont(font);
		setText = "" + MainJFrame.player.diamond;
		tp2_8.setText(setText);
		sellPanel.add(tp2_8,gbc_tp2_8);
		
		JTextPane tp3_8 = new JTextPane();
		GridBagConstraints gbc_tp3_8 = new GridBagConstraints();
		gbc_tp3_8.insets = new Insets(5, 5, 5, 5);
		gbc_tp3_8.fill = GridBagConstraints.VERTICAL;
		gbc_tp3_8.gridx = 2;
		gbc_tp3_8.gridy = 8;
		tp3_8.setEditable(false);
		tp3_8.setBackground(null);
		tp3_8.setFont(font);
		setText = "" + MainJFrame.resourceList.get(7).price;
		tp3_8.setText(setText);
		sellPanel.add(tp3_8, gbc_tp3_8);
		
		JButton sellButton_8 = new JButton("Sell");
		sellButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.sellDiamond();
				updateText();
			}
		});
		GridBagConstraints gbc_sb_8 = new GridBagConstraints();
		gbc_sb_8.insets = new Insets(5, 5, 5, 5);
		gbc_sb_8.fill = GridBagConstraints.VERTICAL;
		gbc_sb_8.gridx = 3;
		gbc_sb_8.gridy = 8;
		sellButton_8.setBackground(design.buttonColor);
		sellPanel.add(sellButton_8,gbc_sb_8);
		

		
		
		
		JScrollPane scrollPane = new JScrollPane(sellPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setMinimumSize( new Dimension(680,505));
		scrollPane.setPreferredSize( new Dimension(680,505));
		add(scrollPane, BorderLayout.CENTER);
	    
	}
	
	
	public static void updateText() {
		String setText = "";
		setText = "" + MainJFrame.player.dirt;
		tp2_1.setText(setText);
		setText = "" + MainJFrame.player.stone;
		tp2_2.setText(setText);
		setText = "" + MainJFrame.player.copper;
		tp2_3.setText(setText);
		setText = "" + MainJFrame.player.iron;
		tp2_4.setText(setText);
		setText = "" + MainJFrame.player.sapphire;
		tp2_5.setText(setText);
		setText = "" + MainJFrame.player.silver;
		tp2_6.setText(setText);
		setText = "" + MainJFrame.player.gold;
		tp2_7.setText(setText);
		setText = "" + MainJFrame.player.diamond;
		tp2_8.setText(setText);
	}

	
}
