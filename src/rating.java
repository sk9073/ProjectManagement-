import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class rating2
{
    
	private int Groupno ;
    private int Creativity ;
    private int Design;
    private int Execution ;
    private int Budget ;
    private int Scope ;
    private float Average ;
    private int fid;
    
    public int getGroupno() {
    	return Groupno;
    }
    public void setGroupno(int groupno) {
    	this.Groupno = groupno;
    }
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

public class rating extends JFrame {
	private JTextField group;
	public int create,des,execute,budge,scop,grp;
	public static int fid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rating frame = new rating(fid);
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
	public rating(int i) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 434);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Creativity");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel.setBounds(148, 60, 81, 26);
		getContentPane().add(lblNewLabel);
		
		JLabel lblDesign = new JLabel("Design");
		lblDesign.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblDesign.setBounds(148, 102, 81, 26);
		getContentPane().add(lblDesign);
		
		JLabel lblExecution = new JLabel("Execution");
		lblExecution.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblExecution.setBounds(148, 149, 81, 26);
		getContentPane().add(lblExecution);
		
		JLabel lblBudget = new JLabel("Budget");
		lblBudget.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblBudget.setBounds(148, 198, 81, 26);
		getContentPane().add(lblBudget);
		
		JLabel lblScope = new JLabel("Scope");
		lblScope.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblScope.setBounds(148, 249, 81, 26);
		getContentPane().add(lblScope);
		
		JSpinner creativity = new JSpinner();
		creativity.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		creativity.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		creativity.setBounds(250, 65, 67, 26);
		getContentPane().add(creativity);
		
		JSpinner design = new JSpinner();
		design.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		design.setBounds(250, 108, 67, 26);
		getContentPane().add(design);
		
		JSpinner execution = new JSpinner();
		execution.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		execution.setBounds(250, 155, 67, 26);
		getContentPane().add(execution);
		
		JSpinner budget = new JSpinner();
		budget.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		budget.setBounds(250, 204, 67, 26);
		getContentPane().add(budget);
		
		JSpinner scope = new JSpinner();
		scope.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		scope.setBounds(250, 255, 67, 26);
		getContentPane().add(scope);
		
		JButton btnNewButton = new JButton("SUBMIT & LOG OUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rating2 rate = new rating2();
				 rate.setCreativity((Integer) creativity.getValue());
				 rate.setDesign((Integer) design.getValue());
				 rate.setExecution((Integer) execution.getValue());
				 rate.setBudget((Integer) budget.getValue()); 
				 rate.setScope((Integer) scope.getValue()); 
				 rate.setGroupno(Integer.parseInt(group.getText()));
				 rate.setFid(i);
				
				
				
				GetSelectedJCheckBox submission = new GetSelectedJCheckBox(rate);
				submission.setVisible(true);
	            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(437, 329, 217, 45);
		getContentPane().add(btnNewButton);
		
		group = new JTextField();
		group.setBounds(252, 22, 116, 26);
		getContentPane().add(group);
		group.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Group no :");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(148, 18, 94, 28);
		getContentPane().add(lblNewLabel_1);
		
		
		
	}
}
