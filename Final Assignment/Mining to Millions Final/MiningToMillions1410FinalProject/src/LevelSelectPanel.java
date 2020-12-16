import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;

public class LevelSelectPanel extends JPanel {

	
	public LevelSelectPanel() {
		
		Color backgroundColor = new Color(210, 180, 140);
		Color borderColor = new Color(160, 82, 45);
		Color buttonColor = new Color(205, 133, 63);
		Color shopPanelColor = new Color(210, 180, 140);
		
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0,1));
		buttonPanel.setBackground(backgroundColor);
		
		JTextPane textPane = new JTextPane();
		Font font = new Font(Font.SANS_SERIF, 3, 30);
		textPane.setEditable(false);
		textPane.setBackground(null);
		textPane.setFont(font);
		textPane.setText("Select a Level");
		textPane.setBounds(225, 20, 230, 60);
		buttonPanel.add(textPane);
		
		
		int maxLevel = MainJFrame.player.maxRock.rockId;
		int y = 80;
		int x = 175;
		JButton testButton0 = new JButton("Level " + 0);
		testButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.selectRock(0);
				MainJFrame.switchToMine();
				MinePanel.setImage(0);
			}
		});
		testButton0.setBounds(x, y, 330, 30);
		testButton0.setBackground(buttonColor);
		buttonPanel.add(testButton0);
		
		if(maxLevel>=1) {
			y = y + 40;
			JButton testButton1 = new JButton("Level " + 1);
			testButton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(1);
					MainJFrame.switchToMine();
					MinePanel.setImage(0);
				}
			});
			testButton1.setBounds(x, y, 330, 30);
			testButton1.setBackground(buttonColor);
			buttonPanel.add(testButton1);
		} else {
			y = y + 40;
			JButton notUnlockedButton = new JButton("Purchase more rocks in the store");
			notUnlockedButton.setBounds(x, y, 330, 30);
			notUnlockedButton.setBackground(buttonColor);
			buttonPanel.add(notUnlockedButton);
		}
		
		if(maxLevel>=2) {
			y = y + 40;
			JButton testButton2 = new JButton("Level " + 2);
			testButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(2);
					MainJFrame.switchToMine();
					MinePanel.setImage(0);
				}
			});
			testButton2.setBounds(x, y, 330, 30);
			testButton2.setBackground(buttonColor);
			buttonPanel.add(testButton2);
		} else {
			y = y + 40;
			JButton notUnlockedButton = new JButton("Purchase more rocks in the store");
			notUnlockedButton.setBounds(x, y, 330, 30);
			notUnlockedButton.setBackground(buttonColor);
			buttonPanel.add(notUnlockedButton);
		}
		
		
		if(maxLevel>=3) {
			y = y + 40;
			JButton testButton3 = new JButton("Level " + 3);
			testButton3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(3);
					MainJFrame.switchToMine();
					MinePanel.setImage(1);
				}
			});
			testButton3.setBounds(175, y, 330, 30);
			testButton3.setBackground(buttonColor);
			buttonPanel.add(testButton3);
		} else {
			y = y + 40;
			JButton notUnlockedButton = new JButton("Purchase more rocks in the store");
			notUnlockedButton.setBounds(x, y, 330, 30);
			notUnlockedButton.setBackground(buttonColor);
			buttonPanel.add(notUnlockedButton);
		}
		
		
		if(maxLevel>=4) {
			y = y + 40;
			JButton testButton4 = new JButton("Level " + 4);
			testButton4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(4);
					MainJFrame.switchToMine();
					MinePanel.setImage(1);
				}
			});
			testButton4.setBounds(x, y, 330, 30);
			testButton4.setBackground(buttonColor);
			buttonPanel.add(testButton4);
		} else {
			y = y + 40;
			JButton notUnlockedButton = new JButton("Purchase more rocks in the store");
			notUnlockedButton.setBounds(x, y, 330, 30);
			notUnlockedButton.setBackground(buttonColor);
			buttonPanel.add(notUnlockedButton);
		}
		
		
		if(maxLevel>=5) {
			y = y + 40;
			JButton testButton5 = new JButton("Level " + 5);
			testButton5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(5);
					MainJFrame.switchToMine();
					MinePanel.setImage(1);
				}
			});
			testButton5.setBounds(x, y, 330, 30);
			testButton5.setBackground(buttonColor);
			buttonPanel.add(testButton5);
		} else {
			y = y + 40;
			JButton notUnlockedButton = new JButton("Purchase more rocks in the store");
			notUnlockedButton.setBounds(x, y, 330, 30);
			notUnlockedButton.setBackground(buttonColor);
			buttonPanel.add(notUnlockedButton);
		}
		
		
		if(maxLevel>=6) {
			y = y + 40;
			JButton testButton6 = new JButton("Level " + 6);
			testButton6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(6);
					MainJFrame.switchToMine();
					MinePanel.setImage(2);
				}
			});
			testButton6.setBounds(x, y, 330, 30);
			testButton6.setBackground(buttonColor);
			buttonPanel.add(testButton6);
		} else {
			y = y + 40;
			JButton notUnlockedButton = new JButton("Purchase more rocks in the store");
			notUnlockedButton.setBounds(x, y, 330, 30);
			notUnlockedButton.setBackground(buttonColor);
			buttonPanel.add(notUnlockedButton);
		}
		
		
		if(maxLevel>=7) {
			y = y + 40;
			JButton testButton7 = new JButton("Level " + 7);
			testButton7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(7);
					MainJFrame.switchToMine();
					MinePanel.setImage(2);
				}
			});
			testButton7.setBounds(x, y, 330, 30);
			testButton7.setBackground(buttonColor);
			buttonPanel.add(testButton7);
		} else {
			y = y + 40;
			JButton notUnlockedButton = new JButton("Purchase more rocks in the store");
			notUnlockedButton.setBounds(x, y, 330, 30);
			notUnlockedButton.setBackground(buttonColor);
			buttonPanel.add(notUnlockedButton);
		}
		
		
		if(maxLevel>=8) {
			y = y + 40;
			JButton testButton8 = new JButton("Level " + 8);
			testButton8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(8);
					MainJFrame.switchToMine();
					MinePanel.setImage(2);
				}
			});
			testButton8.setBounds(x, y, 330, 30);
			testButton8.setBackground(buttonColor);
			buttonPanel.add(testButton8);
		} else {
			y = y + 40;
			JButton notUnlockedButton = new JButton("Purchase more rocks in the store");
			notUnlockedButton.setBounds(x, y, 330, 30);
			notUnlockedButton.setBackground(buttonColor);
			buttonPanel.add(notUnlockedButton);
		}
		
		
		if(maxLevel>=9) {
			y = y + 40;
			JButton testButton9 = new JButton("Level " + 9);
			testButton9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(9);
					MainJFrame.switchToMine();
					MinePanel.setImage(3);
				}
			});
			testButton9.setBounds(x, y, 330, 30);
			testButton9.setBackground(buttonColor);
			buttonPanel.add(testButton9);
		}
		
		
		if(maxLevel>=10) {
			y = y + 40;
			JButton testButton10 = new JButton("Level " + 10);
			testButton10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(10);
					MainJFrame.switchToMine();
					MinePanel.setImage(3);
				}
			});
			testButton10.setBounds(x, y, 330, 30);
			testButton10.setBackground(buttonColor);
			buttonPanel.add(testButton10);
		}
		
		
		if(maxLevel>=11) {
			y = y + 40;
			JButton testButton11 = new JButton("Level " + 11);
			testButton11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(11);
					MainJFrame.switchToMine();
					MinePanel.setImage(3);
				}
			});
			testButton11.setBounds(x, y, 330, 30);
			testButton11.setBackground(buttonColor);
			buttonPanel.add(testButton11);
		}
		
		
		if(maxLevel>=12) {
			y = y + 40;
			JButton testButton12 = new JButton("Level " + 12);
			testButton12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(12);
					MainJFrame.switchToMine();
					MinePanel.setImage(4);
				}
			});
			testButton12.setBounds(x, y, 330, 30);
			testButton12.setBackground(buttonColor);
			buttonPanel.add(testButton12);
		}
		
		
		if(maxLevel>=13) {
			y = y + 40;
			JButton testButton13 = new JButton("Level " + 13);
			testButton13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(13);
					MainJFrame.switchToMine();
					MinePanel.setImage(4);
				}
			});
			testButton13.setBounds(x, y, 330, 30);
			testButton13.setBackground(buttonColor);
			buttonPanel.add(testButton13);
		}
		
		
		if(maxLevel>=14) {
			y = y + 40;
			JButton testButton14 = new JButton("Level " + 14);
			testButton14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(14);
					MainJFrame.switchToMine();
					MinePanel.setImage(4);
				}
			});
			testButton14.setBounds(x, y, 330, 30);
			testButton14.setBackground(buttonColor);
			buttonPanel.add(testButton14);
		}
		
		
		if(maxLevel>=15) {
			y = y + 40;
			JButton testButton15 = new JButton("Level " + 15);
			testButton15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(15);
					MainJFrame.switchToMine();
					MinePanel.setImage(5);
				}
			});
			testButton15.setBounds(x, y, 330, 30);
			testButton15.setBackground(buttonColor);
			buttonPanel.add(testButton15);
		}
		
		
		if(maxLevel>=16) {
			y = y + 40;
			JButton testButton16 = new JButton("Level " + 16);
			testButton16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(16);
					MainJFrame.switchToMine();
					MinePanel.setImage(5);
				}
			});
			testButton16.setBounds(x, y, 330, 30);
			testButton16.setBackground(buttonColor);
			buttonPanel.add(testButton16);
		}
		
		
		if(maxLevel>=17) {
			y = y + 40;
			JButton testButton17 = new JButton("Level " + 17);
			testButton17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(17);
					MainJFrame.switchToMine();
					MinePanel.setImage(5);
				}
			});
			testButton17.setBounds(x, y, 330, 30);
			testButton17.setBackground(buttonColor);
			buttonPanel.add(testButton17);
		}
		
		
		if(maxLevel>=18) {
			y = y + 40;
			JButton testButton18 = new JButton("Level " + 18);
			testButton18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(18);
					MainJFrame.switchToMine();
					MinePanel.setImage(6);
				}
			});
			testButton18.setBounds(x, y, 330, 30);
			testButton18.setBackground(buttonColor);
			buttonPanel.add(testButton18);
		}
		
		
		if(maxLevel>=19) {
			y = y + 40;
			JButton testButton19 = new JButton("Level " + 19);
			testButton19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(19);
					MainJFrame.switchToMine();
					MinePanel.setImage(6);
				}
			});
			testButton19.setBounds(x, y, 330, 30);
			testButton19.setBackground(buttonColor);
			buttonPanel.add(testButton19);
		}
		
		
		if(maxLevel>=20) {
			y = y + 40;
			JButton testButton20 = new JButton("Level " + 20);
			testButton20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(20);
					MainJFrame.switchToMine();
					MinePanel.setImage(6);
				}
			});
			testButton20.setBounds(x, y, 330, 30);
			testButton20.setBackground(buttonColor);
			buttonPanel.add(testButton20);
		}
		
		
		if(maxLevel>=21) {
			y = y + 40;
			JButton testButton21 = new JButton("Level " + 21);
			testButton21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainJFrame.selectRock(21);
					MainJFrame.switchToMine();
					MinePanel.setImage(7);
				}
			});
			testButton21.setBounds(x, y, 330, 30);
			testButton21.setBackground(buttonColor);
			buttonPanel.add(testButton21);
		} else {
			y = y + 40;
			JButton notUnlockedButton = new JButton("Purchase more rocks in the store");
			notUnlockedButton.setBounds(x, y, 330, 30);
			notUnlockedButton.setBackground(buttonColor);
			buttonPanel.add(notUnlockedButton);
		}
		
		

		
		
		
		
		
		
		
//		if(maxLevel>=@) {
//			y = y + 40;
//			JButton testButton@ = new JButton("Level " + @);
//			testButton@.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					MainJFrame.selectRock(@);
//				}
//			});
//			testButton@.setBounds(10, y, 330, 30);
//			scrollPane.add(testButton@);
//		}
		
		
		
		
		JScrollPane scrollPane = new JScrollPane(buttonPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setMinimumSize(new Dimension(680,680));
		scrollPane.setPreferredSize(new Dimension(680,680));
		add(scrollPane, BorderLayout.CENTER);

		
		
		
		
	}
	

}
