// Banane
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Memory extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memory frame = new Memory();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Memory() {
		setResizable(false);
//		Icon iconPic01 = createImageIcon("/resources/images/camel.jpg", "camel");		
        Icon icon_back = createImageIcon("/resources/images/back.jpg", "Back");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(700, 700));
		contentPane.add(panel, BorderLayout.WEST);
		
		
        final JLabel lblPic01 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic01.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic01.setIcon(icon_back);
        panel.add(lblPic01);
        lblPic01.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic02 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic02.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic02.setIcon(icon_back);
        panel.add(lblPic02);
        lblPic02.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic03 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic03.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic03.setIcon(icon_back);
        panel.add(lblPic03);
        lblPic03.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic04 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic04.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic04.setIcon(icon_back);
        panel.add(lblPic04);
        lblPic04.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic05 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic05.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic05.setIcon(icon_back);
        panel.add(lblPic05);
        lblPic05.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic06 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic06.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic06.setIcon(icon_back);
        panel.add(lblPic06);
        lblPic06.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic07 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic07.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic07.setIcon(icon_back);
        panel.add(lblPic07);
        lblPic07.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic08 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic08.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic08.setIcon(icon_back);
        panel.add(lblPic08);
        lblPic08.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic09 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic09.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic09.setIcon(icon_back);
        panel.add(lblPic09);
        lblPic09.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic10 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic10.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic10.setIcon(icon_back);
        panel.add(lblPic10);
        lblPic10.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic11 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic11.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic11.setIcon(icon_back);
        panel.add(lblPic11);
        lblPic11.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic12 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic12.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic12.setIcon(icon_back);
        panel.add(lblPic12);
        lblPic12.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic13 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic13.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic13.setIcon(icon_back);
        panel.add(lblPic13);
        lblPic13.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic14 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic14.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic14.setIcon(icon_back);
        panel.add(lblPic14);
        lblPic14.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic15 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic15.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic15.setIcon(icon_back);
        panel.add(lblPic15);
        lblPic15.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        final JLabel lblPic16 = new JLabel(); //final, da sonst die mouseClicked-Methode spackt -> Lösung finden!
        lblPic16.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblPic16.setIcon(icon_back);
        panel.add(lblPic16);
        lblPic16.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
        
        JPanel panel_1 = new JPanel();
        panel_1.setPreferredSize(new Dimension(250, 10));
        contentPane.add(panel_1, BorderLayout.EAST);
        
        JLabel lblSpielerAmZug = new JLabel("Spieler am Zug:");
        lblSpielerAmZug.setPreferredSize(new Dimension(200, 14));
        panel_1.add(lblSpielerAmZug);
        
        JLabel lblRunde = new JLabel("Runde:");
        lblRunde.setPreferredSize(new Dimension(200, 14));
        panel_1.add(lblRunde);
        
        JLabel lblPlayer1 = new JLabel("Gefundene Paare Spieler 1:");
        lblPlayer1.setPreferredSize(new Dimension(200, 14));
        panel_1.add(lblPlayer1);
        
        JLabel lblPlayer2 = new JLabel("Gefundene Paare Spieler 2:");
        lblPlayer2.setPreferredSize(new Dimension(200, 14));
        panel_1.add(lblPlayer2);
        
        JPanel panel_3 = new JPanel();
        panel_3.setPreferredSize(new Dimension(10, 50));
        contentPane.add(panel_3, BorderLayout.SOUTH);
        
        JButton btnStart = new JButton("Start!");
        panel_3.add(btnStart);
        lblPic08.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		lblPic08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/camel.jpg")));	 		
        	}
        });
	}
	
	/** Returns an ImageIcon, or null if the path was invalid. */
	protected ImageIcon createImageIcon(String path, String description) {
	    java.net.URL imgURL = getClass().getResource(path);
	    if (imgURL != null) {
	        return new ImageIcon(imgURL, description);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}
}

