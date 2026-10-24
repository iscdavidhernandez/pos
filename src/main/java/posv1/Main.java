package posv1;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JPanel {

	private static final long serialVersionUID = 1L;


    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            MainFrame frame =
                    new MainFrame();

            frame.setVisible(true);

        });
    }

}
