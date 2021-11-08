/*
1-)Bu program bir online sinema bileti satýþ sistemidir.
2-)Ýlk olarak vizyondaki filmler programda gözükmektedir.
3-)Müþteriye 3 farklý soru yöneltilmiþtir.
4-)Müþterinin seçtiði seçeneklere göre bir bilet fiþi oluþturulup müþterinin ödemesi gerek miktar belirtilir
5-)Dikkat edilmesi gerekenler programda ki kutucuklarýn açýklamalarýna göre kutucuklarý doldurmak gerekir.
6-)Örneðin 1.soruda büyük harf kullanmadan günleri yazmanýz gerekir (monday,tuesday,wednesday) gibi.
7-)Daha sonra izlemek istenilen film seçilir.
8-)Kaç tane bilet almak istediðimizi gireriz
9-)En sonunda müþteriye bir bilet faturasý gösterilir
*/
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class CinemaHall extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField txt_day;
	private JTextField txt_option;
	private JTextField txt_number;
	private JTextField txtWeekdaystlOn;
	private JTextField txtMoviesInVision;
	static String day;
	static int option;
	static int number;
	static int price;
	static String movie;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaHall frame = new CinemaHall();
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
	public CinemaHall() {
		
		setTitle("Online Ticket Sales System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 613);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/Aquaman.jpg")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/JohnWiccK3.jpg")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/EndGame.jpg")).getImage();
		
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel1.setBounds(0, 0, 736, 574);
		contentPane.add(panel1);
		panel1.setVerifyInputWhenFocusTarget(false);
		panel1.setLayout(null);
		JLabel lblStarCityHall = DefaultComponentFactory.getInstance().createTitle("Star City Hall");
		lblStarCityHall.setForeground(Color.BLUE);
		lblStarCityHall.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStarCityHall.setHorizontalAlignment(SwingConstants.CENTER);
		lblStarCityHall.setBounds(2, 0, 716, 30);
		panel1.add(lblStarCityHall);
		
		JLabel lblHall = DefaultComponentFactory.getInstance().createLabel("Aquaman");
		lblHall.setForeground(Color.RED);
		lblHall.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHall.setHorizontalAlignment(SwingConstants.CENTER);
		lblHall.setBounds(51, 41, 117, 37);
		panel1.add(lblHall);
		
		JLabel lblHall_1 = DefaultComponentFactory.getInstance().createLabel("John Wick\r\n");
		lblHall_1.setForeground(Color.RED);
		lblHall_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHall_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHall_1.setBounds(316, 41, 117, 37);
		panel1.add(lblHall_1);
		
		JLabel lblHall_2 = DefaultComponentFactory.getInstance().createLabel("Avangers:End Game");
		lblHall_2.setForeground(Color.RED);
		lblHall_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHall_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHall_2.setBounds(549, 42, 146, 37);
		panel1.add(lblHall_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(img));
		label.setBounds(27, 89, 184, 283);
		panel1.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(284, 90, 184, 282);
		panel1.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(img3));
		label_1.setBounds(534, 90, 184, 282);
		panel1.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("1-)Which day do you want to buy ticket?");
		lblNewLabel_1.setBounds(25, 383, 233, 37);
		panel1.add(lblNewLabel_1);
		
		txt_day = new JTextField();
		txt_day.setToolTipText("Please enter a day like \u00E7ar\u015Famba,per\u015Fembe,cuma and \r\ndon't use capital letters.");
		txt_day.setBounds(294, 383, 105, 37);
		panel1.add(txt_day);
		txt_day.setColumns(10);
		
		JLabel lblWhichOne = new JLabel("2-)Which movie do you want to select? ");
		lblWhichOne.setBounds(25, 431, 233, 37);
		panel1.add(lblWhichOne);
		
		txt_option = new JTextField();
		txt_option.setToolTipText("Please Choose a option like 1-2 or 3.");
		txt_option.setBounds(294, 431, 105, 37);
		panel1.add(txt_option);
		txt_option.setColumns(10);
		
		JLabel lblHowMany = new JLabel("3-) How many ticket do you want to buy?");
		lblHowMany.setBounds(25, 479, 233, 37);
		panel1.add(lblHowMany);
		
		txt_number = new JTextField();
		txt_number.setToolTipText("Please enter a number.");
		txt_number.setBounds(294, 479, 105, 37);
		panel1.add(txt_number);
		txt_number.setColumns(10);
		
		JButton btnNewButton = new JButton("Buy");
		
		btnNewButton.setBounds(294, 527, 105, 36);
		panel1.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlShadow);
		panel.setBounds(445, 383, 273, 180);
		panel1.add(panel);
		panel.setLayout(null);
		
		JLabel lblBiletFiyatlar = DefaultComponentFactory.getInstance().createTitle("Ticket Priceses");
		lblBiletFiyatlar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBiletFiyatlar.setForeground(Color.RED);
		lblBiletFiyatlar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiletFiyatlar.setBounds(0, 0, 273, 25);
		panel.add(lblBiletFiyatlar);
		
		JLabel lblNewLabel_2 = new JLabel("1-) Aquaman 15TL");
		lblNewLabel_2.setBounds(10, 72, 113, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2-) JohnWick-3 20TL");
		lblNewLabel_3.setBounds(10, 108, 121, 25);
		panel.add(lblNewLabel_3);
		
		JLabel lblAvangerstl = new JLabel("3-) Avangers 20TL");
		lblAvangerstl.setBounds(10, 144, 113, 25);
		panel.add(lblAvangerstl);
		
		txtWeekdaystlOn = new JTextField();
		txtWeekdaystlOn.setEditable(false);
		txtWeekdaystlOn.setText("!Explanation!");
		txtWeekdaystlOn.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeekdaystlOn.setBounds(133, 38, 130, 23);
		panel.add(txtWeekdaystlOn);
		txtWeekdaystlOn.setColumns(10);
		
		JTextPane txtpnWE = new JTextPane();
		txtpnWE.setEditable(false);
		txtpnWE.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnWE.setText("Weekdays 3TL \r\nOn Discount");
		txtpnWE.setBounds(133, 66, 130, 59);
		panel.add(txtpnWE);
		
		txtMoviesInVision = new JTextField();
		txtMoviesInVision.setEditable(false);
		txtMoviesInVision.setHorizontalAlignment(SwingConstants.CENTER);
		txtMoviesInVision.setText("Movies in Vision");
		txtMoviesInVision.setBounds(10, 38, 113, 23);
		panel.add(txtMoviesInVision);
		txtMoviesInVision.setColumns(10);
		
		JLabel lbloption = new JLabel("1.Option");
		lbloption.setHorizontalAlignment(SwingConstants.CENTER);
		lbloption.setBounds(61, 79, 107, 14);
		panel1.add(lbloption);
		
		JLabel lbloption_1 = new JLabel("2.Option");
		lbloption_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbloption_1.setBounds(326, 79, 105, 14);
		panel1.add(lbloption_1);
		
		JLabel lbloption_2 = new JLabel("3.Option");
		lbloption_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbloption_2.setBounds(572, 79, 105, 14);
		panel1.add(lbloption_2);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		day = txt_day.getText();
		option = Integer.parseInt(txt_option.getText());
		number = Integer.parseInt(txt_number.getText());
		
		if(option==1) {
		price = 15;
		movie="Aquaman";
		}
		else if(option==2) {
			price = 20;
		 movie="JohnWick-3";
		}
		else if(option==3) {
			price = 20;
		movie="Avenger:End Game";
		}
		
			if(day.equals("monday")) {
			price =	price-3;
			}
			else if(day.equals("tuesday")) {
				price = price-3;
			}
			else if(day.equals("wednesday")) {
				price = price-3;
			}
			else if(day.equals("thursday")) {
				price = price-3;
			}
			else if(day.equals("friday")) {
				price = price-3;
			}
			else {
				price=price+0;
			}
			
		price = price*number;
		
		JOptionPane.showMessageDialog(null,"Day : "+day+"\nMovie : "+movie+"\nTicket Numbers : "+number+"\nYou should pay : "+price);
			}
		});
		
	}
}
