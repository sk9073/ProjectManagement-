import java.awt.*;
import javax.swing.*;

class projectReview2 
{
	private String venue;
	private String date;
	private String time;
	private int fid;
	private int Groupno;
	
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
	public int getGroupno() {
		return Groupno;
	}
	public void setGroupno(int groupno) {
		Groupno = groupno;
	}
}

class Guide2 {
	private int FID;
	private int Group_no;

	public int getFID() {
		return FID;
	}

	public void setFID(int FID) {
		this.FID = FID;
	}

	public int getGrpno() {
		return Group_no;
	}

	public void setGrpno(int Group_no) {
		this.Group_no = Group_no;
	}

}

public class data extends JFrame
{
	JTable table;
	public data()
	{
		String[] columnNames = {"Gropu_no","Guide id","Review id","Venue","Date","Time"};
		
		String[][] datas = {
				{"1","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"2","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"3","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"4","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"5","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"6","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"7","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"}
		};
		getContentPane().setLayout(null);
		
		table = new JTable(datas,columnNames);
		table.setColumnSelectionAllowed(true);
		table.setEnabled(false);
		table.setPreferredScrollableViewportSize(new Dimension(500,50));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(65, 51, 607, 319);
		getContentPane().add(scrollPane);
	}
	public data(projectReview[] rec, Guide[] g)
	{
		String[] columnNames = {"Gropu_no","Guide id","Review id","Venue","Date","Time"};
		
		String[][] datas = {
				{"1","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"2","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"3","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"4","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"5","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"6","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"7","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"}
		};
		getContentPane().setLayout(null);
		for(int i =0; i != g.length;i++)
		{
			for(int j=0;j != 7;j++)
			{
				if(Integer.parseInt(datas[j][0]) == g[i].Group_no)
				{
					datas[j][1] = String.valueOf(g[i].getFID());
				}
				System.out.print("INSIDE ");
			
					
			}
		}
		
		for(int i =0; i != rec.length;i++)
		{
			for(int j=0;j != 7;j++)
			{
				if(Integer.parseInt(datas[j][0]) == rec[i].Group_no)
				{
					datas[j][2] = String.valueOf(rec[i].getFid());
					datas[j][3] = String.valueOf(rec[i].getVenue());
					datas[j][4] = String.valueOf(rec[i].getDate());
					datas[j][5] = String.valueOf(rec[i].getTime());
				}
				System.out.print("INSIDE ");
			
					
			}
		}
		table = new JTable(datas,columnNames);
		table.setColumnSelectionAllowed(true);
		table.setEnabled(false);
		table.setPreferredScrollableViewportSize(new Dimension(500,50));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(65, 51, 607, 319);
		getContentPane().add(scrollPane);
	}
	
	public static void main(String args[])
	{
		data gui = new data();
		gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		gui.setSize(600,200);
		gui.setVisible(true);
		gui.setTitle("Guide alloc");
	}
}