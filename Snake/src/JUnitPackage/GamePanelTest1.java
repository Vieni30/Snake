package JUnitPackage;

import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;

import snake.GamePanel;

public class GamePanelTest1 {

	@Test
	public static void test()
	{
		JFrame jframe = new JFrame();
		GamePanel gamePanel = new GamePanel(jframe);

		gamePanel.setExtraWidth(20);

		assertEquals(20, 20);
	}

}
