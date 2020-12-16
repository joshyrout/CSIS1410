
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class ShopPanel extends JPanel {

	int i = 0;
	/**
	 * Create the panel.
	 */
	public ShopPanel() {
		setLayout(null);
		
		Color backgroundColor = new Color(210, 180, 140);
		Color borderColor = new Color(160, 82, 45);
		Color buttonColor = new Color(205, 133, 63);
		
		setSize(680, 175);
		setBorder(new BevelBorder(BevelBorder.LOWERED, borderColor, borderColor, borderColor, borderColor));
		setBackground(backgroundColor);


		JButton mineLevelButton = new JButton("To Mine");
		mineLevelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.switchToMine();
			}
		});
		mineLevelButton.setBounds((520), 11, 150, 150);
		add(mineLevelButton);

		JButton buyButton = new JButton("Buy");
		buyButton.setBackground(new Color(205, 133, 63));
		buyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.switchToBuy();
			}
		});
		buyButton.setBounds(10, 11, 150, 150);
		add(buyButton);

		JButton sellButton = new JButton("Sell");
		sellButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainJFrame.switchToSell();
			}
		});
		sellButton.setBounds(170, 11, 150, 150);
		add(sellButton);


		mineLevelButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		sellButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		mineLevelButton.setBackground(buttonColor);
		buyButton.setBackground(buttonColor);
		sellButton.setBackground(buttonColor);
	}
}


