import javax.swing.*;
import java.awt.*;

public class JFrameEx extends JFrame{
	public JFrameEx() {
		setTitle("프레임 구성");
		
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editmenu = new JMenu("Edit");
		JMenu sourceMenu = new JMenu("Source");
		JMenu searchMenu = new JMenu("search");
		JMenu windowMenu = new JMenu("Window");
	}
}