
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuyPanel extends JPanel {

	
	int uPPrice = 10;
	int dMPrice = 10;
	int bRPrice = 10;
	int iRPrice = 10;

    Font titleFont = new Font(Font.SANS_SERIF, 3, 13);
    Font priceFont = new Font(Font.SANS_SERIF, 3, 13);
    Font descriptionFont = new Font(Font.SANS_SERIF, 3, 13);
    Insets panelInsets = new Insets(5, 5, 20, 5);
    int panelFill = GridBagConstraints.VERTICAL;
    Color backgroundColor = new Color(210, 180, 140);
	Color borderColor = new Color(160, 82, 45);
	Color buttonColor = new Color(205, 133, 63);
	Color shopPanelColor = new Color(210, 180, 140);
	ObjRockLevel nextRock;
	ObjDamageMod nextDamageMod;
	ObjPickaxe nextPickaxe;
	ObjRolls nextRoll;
	
	
	public BuyPanel() {
		
		
		
		setLayout(new BorderLayout(0, 0));
	    
	  //==============================  Main Panel ==============================
	    JPanel mainPanel = new JPanel();
	    mainPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(160, 82, 45), new Color(160, 82, 45), new Color(139, 69, 19), new Color(139, 69, 19)));
	    mainPanel.setBackground(new Color(210, 180, 140));
	    mainPanel.setPreferredSize( new Dimension( 680, 505 ) );
	    mainPanel.setMinimumSize( new Dimension( 680, 505 ) );
	    GridBagLayout gridBagLayout = new GridBagLayout();
	    gridBagLayout.columnWidths = new int[]{133, 133, 0, 0};
	    gridBagLayout.rowHeights = new int[]{505, 0};
	    gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
	    gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
	    mainPanel.setLayout(gridBagLayout);
	    
	    
	    	    
	  //==============================  Shop Panel 1 ==============================
	    JPanel shopPanel1 = shopPanel1();
	    GridBagConstraints gbc_panel = new GridBagConstraints();
	    gbc_panel.fill = panelFill;
	    gbc_panel.insets = panelInsets;
	    gbc_panel.gridx = 0;
	    gbc_panel.gridy = 0;
	    mainPanel.add(shopPanel1, gbc_panel);
	    shopPanel1.setLayout(new BoxLayout(shopPanel1, BoxLayout.Y_AXIS));
	    
	    
	  //==============================  Shop Panel 2 ==============================
	    JPanel shopPanel2 = shopPanel2();
//	    panel2.setBounds(23, 21, 220, 450); OLD CODE REMOVE 12/6/2020
	    GridBagConstraints gbc_panel2 = new GridBagConstraints();
	    gbc_panel2.insets = panelInsets;
	    gbc_panel2.fill = panelFill;
	    gbc_panel2.gridx = 1;
	    gbc_panel2.gridy = 0;
	    mainPanel.add(shopPanel2, gbc_panel2);
	    shopPanel2.setLayout(new BoxLayout(shopPanel2, BoxLayout.Y_AXIS));
	    
	    
	  //==============================  Shop Panel 3 ==============================
	    JPanel shopPanel3 = shopPanel3();
	    GridBagConstraints gbc_panel3 = new GridBagConstraints();
	    gbc_panel3.insets = panelInsets;
	    gbc_panel3.fill = panelFill;
	    gbc_panel3.gridx = 2;
	    gbc_panel3.gridy = 0;
	    mainPanel.add(shopPanel3, gbc_panel3);
	    shopPanel3.setLayout(new BoxLayout(shopPanel3, BoxLayout.Y_AXIS));
	    
	    
	  //==============================  Shop Panel 4 ==============================
	    JPanel shopPanel4 = shopPanel4();
	    GridBagConstraints gbc_panel4 = new GridBagConstraints();
	    gbc_panel4.insets = panelInsets;
	    gbc_panel4.fill = panelFill;
	    gbc_panel4.gridx = 3;
	    gbc_panel4.gridy = 0;
	    mainPanel.add(shopPanel4, gbc_panel4);
	    shopPanel4.setLayout(new BoxLayout(shopPanel4, BoxLayout.Y_AXIS));
	    
	    
	  //==============================  Scroll Pane ==============================
	    JScrollPane scrollPane = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setMinimumSize(new Dimension(680, 505));
		scrollPane.setPreferredSize(new Dimension(680, 505));
	    add(scrollPane);
	}
	
	private JPanel shopPanel1() {
		
		JPanel panel = new JPanel();
	    panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel.setBackground(shopPanelColor);
		JTextPane titleTxtPane = new JTextPane();
	    titleTxtPane.setText(" Upgrade Pickaxe");
	    titleTxtPane.setMaximumSize(new Dimension( 130, 25 ));
	    titleTxtPane.setBackground(null);
	    titleTxtPane.setFont(titleFont);
	    panel.add(titleTxtPane);
	    nextPickaxe = MainJFrame.getPickaxe();
	    uPPrice = nextPickaxe.price;
	    try {
		    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream input = classloader.getResourceAsStream("littlePic.PNG");
			Image image = ImageIO.read(input);;
			JLabel picLabel = new JLabel(new ImageIcon(image));
		    picLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		    picLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		    picLabel.setMaximumSize(new Dimension( 150, 150 ));
		    panel.add(picLabel);
	    } catch (IOException e) {
			e.printStackTrace();
		}
	    
	    Component verticalStrut = Box.createVerticalStrut(20);
	    panel.add(verticalStrut);
	    JTextPane priceTxtPane = new JTextPane();
	    JButton btnNewButton = new JButton("Purchase");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		MainJFrame.buyPickaxe();
	    		nextPickaxe = MainJFrame.getPickaxe();
	    	    uPPrice = nextPickaxe.price;
	    	    priceTxtPane.setText("Price: $" + uPPrice);
	    	}
	    });
	    btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	    btnNewButton.setBackground(buttonColor);
	    panel.add(btnNewButton);
	    
	    
	    priceTxtPane.setText("Price: $" + uPPrice);
	    priceTxtPane.setMaximumSize(new Dimension(130, 25));
	    priceTxtPane.setFont(priceFont);
	    priceTxtPane.setBackground((Color) null);
	    panel.add(priceTxtPane);
	    
	    JTextPane descriptionTxtPane = new JTextPane();
	    descriptionTxtPane.setText("Description: Increases your pickaxe damage from " + MainJFrame.player.pickaxe.damage + " to " + nextPickaxe.damage);
	    descriptionTxtPane.setMaximumSize(new Dimension(150, 300));
	    descriptionTxtPane.setFont(descriptionFont);
	    descriptionTxtPane.setBackground((Color) null);
	    panel.add(descriptionTxtPane);
		
		return panel;
		
	}
	
private JPanel shopPanel2() {
		
		JPanel panel = new JPanel();
	    panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel.setBackground(shopPanelColor);
		JTextPane titleTxtPane = new JTextPane();
	    titleTxtPane.setText("Upgrade Strength");
	    titleTxtPane.setMaximumSize(new Dimension( 130, 25 ));
	    titleTxtPane.setBackground(null);
	    titleTxtPane.setFont(titleFont);
	    panel.add(titleTxtPane);
	    nextDamageMod = MainJFrame.getDamageMod();
	    dMPrice = nextDamageMod.price;
	    
	    
	    try {
		    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream input = classloader.getResourceAsStream("musclePic.PNG");
			Image image = ImageIO.read(input);;
			JLabel picLabel = new JLabel(new ImageIcon(image));
		    picLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		    picLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		    picLabel.setMaximumSize(new Dimension( 150, 150 ));
		    panel.add(picLabel);
	    } catch (IOException e) {
			e.printStackTrace();
		}
	    
	    Component verticalStrut = Box.createVerticalStrut(20);
	    panel.add(verticalStrut);
	    JTextPane priceTxtPane = new JTextPane();
	    JButton btnNewButton = new JButton("Purchase");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		MainJFrame.buyDamage();
	    		nextDamageMod = MainJFrame.getDamageMod();
	    	    dMPrice = nextDamageMod.price;
	    	    priceTxtPane.setText("Price: $" + dMPrice);
	    	}
	    });
	    btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	    btnNewButton.setBackground(buttonColor);
	    panel.add(btnNewButton);
	    
	    
	    priceTxtPane.setText("Price: $" + dMPrice);
	    priceTxtPane.setMaximumSize(new Dimension(130, 25));
	    priceTxtPane.setFont(priceFont);
	    priceTxtPane.setBackground((Color) null);
	    panel.add(priceTxtPane);
	    
	    JTextPane descriptionTxtPane = new JTextPane();
	    descriptionTxtPane.setText("Description: Increases your pickaxe damage  multiplier from " + MainJFrame.player.damageMod.damage + " to " + nextDamageMod.damage);
	    descriptionTxtPane.setMaximumSize(new Dimension(150, 300));
	    descriptionTxtPane.setFont(descriptionFont);
	    descriptionTxtPane.setBackground((Color) null);
	    panel.add(descriptionTxtPane);
		
		
		return panel;
		
	}

private JPanel shopPanel3() {
	
	JPanel panel = new JPanel();
    panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
    panel.setBackground(shopPanelColor);
	JTextPane titleTxtPane = new JTextPane();
    titleTxtPane.setText("New Rock to Mine");
    titleTxtPane.setMaximumSize(new Dimension( 130, 25 ));
    titleTxtPane.setBackground(null);
    titleTxtPane.setFont(titleFont);
    panel.add(titleTxtPane);
    nextRock = MainJFrame.getRocks();
    bRPrice = nextRock.price;
    
    try {
	    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream input = classloader.getResourceAsStream("newRockPic.PNG");
		Image image = ImageIO.read(input);;
		JLabel picLabel = new JLabel(new ImageIcon(image));
	    picLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    picLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    picLabel.setMaximumSize(new Dimension( 150, 150 ));
	    panel.add(picLabel);
    } catch (IOException e) {
		e.printStackTrace();
	}
    
    Component verticalStrut = Box.createVerticalStrut(20);
    panel.add(verticalStrut);
    JTextPane priceTxtPane = new JTextPane();
    JButton btnNewButton = new JButton("Purchase");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		MainJFrame.buyRock();
    		nextRock = MainJFrame.getRocks();
    		bRPrice = nextRock.price;
    	    priceTxtPane.setText("Price: $" + bRPrice);
    	}
    });
    btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    btnNewButton.setBackground(buttonColor);
    panel.add(btnNewButton);
    
    
    priceTxtPane.setText("Price: $" + bRPrice);
    priceTxtPane.setMaximumSize(new Dimension(130, 25));
    priceTxtPane.setFont(priceFont);
    priceTxtPane.setBackground((Color) null);
    panel.add(priceTxtPane);
    
    JTextPane descriptionTxtPane = new JTextPane();
    descriptionTxtPane.setText("Description: Unlocks the next tier of rock");
    descriptionTxtPane.setMaximumSize(new Dimension(150, 300));
    descriptionTxtPane.setFont(descriptionFont);
    descriptionTxtPane.setBackground((Color) null);
    panel.add(descriptionTxtPane);
	
	
	return panel;
	
}


private JPanel shopPanel4() {
	
	JPanel panel = new JPanel();
    panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
    panel.setBackground(shopPanelColor);
	JTextPane titleTxtPane = new JTextPane();
    titleTxtPane.setText("Ore Per Rock");
    titleTxtPane.setMaximumSize(new Dimension( 130, 25 ));
    titleTxtPane.setBackground(null);
    titleTxtPane.setFont(titleFont);
    panel.add(titleTxtPane);
    nextRoll = MainJFrame.getRolls();
    iRPrice = nextRoll.price;
    
    try {
	    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream input = classloader.getResourceAsStream("dicePic.PNG");
		Image image = ImageIO.read(input);;
		JLabel picLabel = new JLabel(new ImageIcon(image));
	    picLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    picLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    picLabel.setMaximumSize(new Dimension( 150, 150 ));
	    panel.add(picLabel);
    } catch (IOException e) {
		e.printStackTrace();
	}
    
    Component verticalStrut = Box.createVerticalStrut(20);
    panel.add(verticalStrut);
    JTextPane priceTxtPane = new JTextPane();
    JButton btnNewButton = new JButton("Purchase");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		MainJFrame.buyRoll();
    		nextRoll = MainJFrame.getRolls();
    	    iRPrice = nextRoll.price;
    	    priceTxtPane.setText("Price: $" + iRPrice);
    	}
    });
    btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    btnNewButton.setBackground(buttonColor);
    panel.add(btnNewButton);
    
    
    priceTxtPane.setText("Price: $" + iRPrice);
    priceTxtPane.setMaximumSize(new Dimension(130, 25));
    priceTxtPane.setFont(priceFont);
    priceTxtPane.setBackground((Color) null);
    panel.add(priceTxtPane);
    
    JTextPane descriptionTxtPane = new JTextPane();
    descriptionTxtPane.setText("Description: Increases the number of ore your get per rock from " + MainJFrame.player.rolls.rolls + " to " + nextRoll.rolls);
    descriptionTxtPane.setMaximumSize(new Dimension(150, 300));
    descriptionTxtPane.setFont(descriptionFont);
    descriptionTxtPane.setBackground((Color) null);
    panel.add(descriptionTxtPane);
	
	
	return panel;
	
}



	
	
}


//panel.setLayout(null);
//JLabel picLabel = new JLabel(new ImageIcon(pickaxe));
//picLabel.setBounds(34,62,150,150);
//panel.add(picLabel);
