import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;



class projectReview1 
{
	private String venue;
	private String date;
	private String time;
	private int fid;
	public int Groupno;
	
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}

}


public class form extends JFrame {

	private JPanel contentPane;
	private JTextField venue;
	private JTextField date;
	private JTextField time;
	private JLabel lblNewLabel_4;
	static projectReview1 rec;	
	String selectedCheckBox=" "; 
	private JTextField group;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form(0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param i 
	 */
	public form(int i) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 658, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		venue = new JTextField();
		venue.setBounds(156, 67, 96, 19);
		contentPane.add(venue);
		venue.setColumns(10);
		
		date = new JTextField();
		date.setBounds(156, 106, 96, 19);
		contentPane.add(date);
		date.setColumns(10);
		
		time = new JTextField();
		time.setBounds(156, 146, 96, 19);
		contentPane.add(time);
		time.setColumns(10);
		
		group = new JTextField();
		group.setBounds(156, 225, 96, 19);
		contentPane.add(group);
		group.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("VENUE");
		lblNewLabel.setBounds(89, 70, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DATE");
		lblNewLabel_1.setBounds(89, 109, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TIME");
		lblNewLabel_2.setBounds(89, 149, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GROUP :");
		lblNewLabel_3.setBounds(78, 226, 56, 17);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("ASSIGN GRADES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rating nextStep = new rating(i);
				nextStep.setVisible(true);
	            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton.setBounds(368, 322, 177, 30);
		contentPane.add(btnNewButton);
		

		
		JButton btnNewButton_1 = new JButton("SUBMIT REPORT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			rec = new projectReview1();
			rec.setDate(date.getText());
			rec.Groupno = Integer.parseInt(group.getText());
			rec.setTime(time.getText());
			rec.setVenue(venue.getText());
			rec.setFid(i);
			
			GetSelectedJCheckBox back = new GetSelectedJCheckBox(rec);

			}
		});
		btnNewButton_1.setBounds(368, 282, 177, 30);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(368, 70, 190, 95);
		contentPane.add(lblNewLabel_4);
		

		
		
	}
	
}
