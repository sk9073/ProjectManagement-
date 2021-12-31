import java.awt.*;
import javax.swing.*;

class ratings2 
{
    
	public int Groupno ;
    private int Creativity ;
    private int Design;
    private int Execution ;
    private int Budget ;
    private int Scope ;
    private float Average ;
    private int fid;
    

    public int getCreativity() {
    	return Creativity;
    }
    public void setCreativity(int Creativity) {
    	this.Creativity = Creativity;
    }
    public int getDesign() {
    	return Design;
    }
    public void setDesign(int Design) {
    	this.Design = Design;
    }
    public int getExecution() {
    	return Execution;
    }
    public void setExecution(int Execution) {
    	this.Execution = Execution;
    }
    public int getBudget() {
    	return Budget;
    }
    public void setBudget(int Budget) {
    	this.Budget = Budget;
    }
    public int getScope() {
    	return Scope;
    }
    public void setScope(int Scope) {
    	this.Scope = Scope;
    }
	public float getAverage() {
		return Average;
	}
	public void setAverage(float average) {
		Average = average;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
}

public class report extends JFrame
{
	JTable table;
	public report()
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
	public report(ratings[] rat) 
	{
		String[] columnNames = {"Gropu_no","Review id","Creativity","Budget","Design","Execution","Total"};
		
		String[][] datas = {
				{"1","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"2","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"3","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"4","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"5","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"6","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"},
				{"7","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned","Not Assigned"}
		};
		getContentPane().setLayout(null);
		
		for(int i =0; i != rat.length;i++)
		{
			for(int j=0;j != 7;j++)
			{
				if(Integer.parseInt(datas[j][0]) == rat[i].Group_no)
				{
					datas[j][1] =  String.valueOf(rat[i].getFid());
					datas[j][2] =  String.valueOf(rat[i].getCreativity());
					datas[j][3] =  String.valueOf(rat[i].getBudget());
					datas[j][4] =  String.valueOf(rat[i].getDesign());					
					datas[j][5] =  String.valueOf(rat[i].getExecution());
					datas[j][6] =  String.valueOf(rat[i].getAverage());
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


}