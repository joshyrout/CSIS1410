
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class ShopSplit extends JFrame {

	
	private JSplitPane splitPane;
	private static JPanel menuPane;
	/**
	 * Create the panel.
	 */
	public ShopSplit(JFrame frame, JPanel contentPane, JPanel shopPane) {
		
		
		frame.setLayout(new BorderLayout());
		frame.setContentPane(contentPane);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension d = tk.getScreenSize();
	    int height = d.height;
		
	    
		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		
		menuPane = new ShopPanel();
		splitPane.setTopComponent(menuPane);
		splitPane.setBottomComponent(shopPane);
		splitPane.setDividerSize(0);
		splitPane.setDividerLocation(height - 250);
		
	}

}
