import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

class Student extends Project{
	
	
	protected int Roll_no;
	private String First_name;
	private String Last_name;
	
	private String Department;
	private String Area_of_interest;
	private float CGPA;
	
    public Student(){}
    
    public Student(int Roll_no,String First_name,String Last_name,int Group_no,String Department,String Area_of_interest,float CGPA)
    {
      this.Roll_no= Roll_no;
      this.First_name=First_name;
      this.Last_name = Last_name;
      this.Group_no= Group_no;
      this.Department = Department;
      this.Area_of_interest=  Area_of_interest;
      this.CGPA = CGPA;
    }

	public int getRollno() {
		return Roll_no;
	}

	public String getfname() {
		return First_name;
	}

	public String getlname() {
		return Last_name;
	}

	public int getgroupno() {
		return Group_no;
	}

	public String getdepartment() {
		return Department;
	}

	public String getareaofinterest() {
		return Area_of_interest;
	}

	public float getCGPA() {
		return CGPA;
	}

	public void setrollno(int rn) {
		Roll_no = rn;
	}

	public void setfname(String fnam) {
		First_name = fnam;
	}

	public void setlname(String lnam) {
		Last_name = lnam;
	}

	public void setDepartment(String dpt) {
		Department = dpt;
	}

	public void setAreaofInterest(String aoi) {
		Area_of_interest = aoi;
	}

	public void setgroupno(int gn) {
		Group_no = gn;
	}

	public void setCGPA(float cg) {
		CGPA = cg;
	}
	
	public void dispaly()
	{
		System.out.println("Roll no " + this.Roll_no);
		System.out.println("CGPA    " + this.CGPA);
		System.out.println("Group_no" + this.Group_no);
	}
}

class ratings extends Project
{
    public ratings() {
    }


	
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
	
	public void dispaly()
	{
		System.out.println("Group_no " + this.Group_no);
		System.out.println("Fid      " + this.fid);
		System.out.println("Review mark      " + this.Average);
	}
}


class group extends Project{
	public float avg_cgpa;
	public int expertise;
	
	public group()
	{

	}
	
	public group(float avg_cgpa,int expertise)
	{
		this.avg_cgpa = avg_cgpa;
		this.expertise = expertise;
	}

	public float getavgcgpa() {
		return avg_cgpa;
	}

	public int getexpertise() {
		return expertise;
	}

	public void setavg_cgpa(float avg) {
		avg_cgpa = avg;
	}

	public void setexpertise(int exp) {
		expertise = exp;
	}
	
	public void display()
	{
		System.out.println("avg_cgpa "+ this.avg_cgpa);
		System.out.println("Level "+ this.expertise);
	}
}

class Project {
	protected int Group_no;
	private String Project_title;
	private String Main_area;
	private String Sub_area;
	private boolean isGuideAssigned;
	private boolean isReviewAssigned;

	public Project() {
	}

	public Project(int Grp_no, String title, String MA, String SA) {
		Group_no = Grp_no;
		Project_title = title;
		Main_area = MA;
		Sub_area = SA;
	}

	public String GetTitle() {
		return Project_title;
	}

	public String GetMainArea() {
		return Main_area;
	}

	public String GetSubArea() {
		return Sub_area;
	}

	public boolean GetisGuideAssigned() {
		return isGuideAssigned;
	}

	public boolean GetisReviewAssigned() {
		return isReviewAssigned;
	}

	public void SetTitle(String title) {
		Project_title = title;
	}

	public void SetMainArea(String MA) {
		Main_area = MA;
	}

	public void SetSubArea(String SA) {
		Sub_area = SA;
	}

	public void SetisGuideAssigned(boolean IGA) {
		isGuideAssigned = IGA;
	}

	public void SetisReviewAssigned(boolean IRA) {
		isReviewAssigned = IRA;
	}

}

class Guide extends Project {
	private int FID;
	
	Guide(){
		
	}
	
	Guide(int fid){
		this.FID = fid;
	}
	public int getFID() {
		return FID;
	}

	public void setFID(int FID) {
		this.FID = FID;
	}
	
	public void dispay()
	{
		System.out.print("Fid      " + this.FID);
		System.out.print("Group_no " + this.Group_no);
	}


}


class facultyo
{
	protected int fids;
	private String firstname;
	private String lastname= null;
	private String department = null;
	private String areaOfSpecialization;
	private int levelOfExpertise;
	private boolean isaGuide;
	private int NoG = 0;
	
    public facultyo(){}
	
    public facultyo(int fids,String firstname,String lastname,String department, String areaOfSpecialization, int levelOfExpertise,boolean isaGuide,int NoG){
    this.fids=fids;
    this.firstname = firstname;
    this.lastname = lastname;
    this.department = department;
    this.areaOfSpecialization = areaOfSpecialization;
    this.levelOfExpertise = levelOfExpertise;
    this.isaGuide = isaGuide;
    this.NoG = NoG;
    }
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAreaOfSpecialization() {
		return areaOfSpecialization;
	}
	public void setAreaOfSpecialization(String areaOfSpecialization) {
		this.areaOfSpecialization = areaOfSpecialization;
	}
	public boolean getisIsaGuide() {
		return isaGuide;
	}
	public void setIsaGuide(boolean isaGuide) {
		this.isaGuide = isaGuide;
	}
	public int getLevelOfExpertise() {
		return levelOfExpertise;
	}
	public void setLevelOfExpertise(int levelOfExpertise) {
		this.levelOfExpertise = levelOfExpertise;
	}
	public int getNoG() {
		return NoG;
	}
	public void setNoG(int noG) {
		NoG = noG;
	}
	
	public void dispay()
	{
		System.out.print("Fid       " + this.fids);
		System.out.print("firstname " + this.firstname);
		System.out.print("lastname  " + this.lastname);
	}
}


class passwordo 
{
	public  int fids;
	private String username;
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}


class projectReview extends Project
{
	private String venue;
	private String date;
	private String time;
	private int fid;
	
	
	public projectReview()
	{
	}
	
	public projectReview(int fid,int Groupno)
	{
		this.fid = fid;
		
	}	
	
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
	
	public void dispay()
	{
		System.out.print("Fid       " + this.fid);
		System.out.print("Group_no " + this.Group_no);

	}

}

public class GetSelectedJCheckBox extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
   static int counts =0,count =0;
   static passwordo[] pwd;
   static projectReview[] rec;
   static ratings[] rat; 
   static Student[] sdt;
   static Project[] pro;
   static group[] grp;
   static Guide[] g;
	 

   GetSelectedJCheckBox()
   {
	   
      // Username Label
      user_label = new JLabel();
      user_label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
      user_label.setBounds(372, 162, 89, 33);
      user_label.setText("User Name :");
      userName_text = new JTextField();
      userName_text.setBounds(471, 159, 290, 40);
      
      // Password Label
      password_label = new JLabel();
      password_label.setFont(new Font("Times New Roman", Font.PLAIN, 14));
      password_label.setBounds(372, 221, 89, 40);
      password_label.setText("Password :");
      password_text = new JPasswordField();
      password_text.setBounds(471, 222, 290, 40);
      
      // Submit
      submit = new JButton("LOGIN");
      submit.setBounds(450, 303, 261, 40);
      panel = new JPanel();
      panel.setLayout(null);
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      getContentPane().add(panel, BorderLayout.CENTER);
      
      JButton btnNewButton = new JButton("Guide Allocation");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		data guide = new data(rec,g);
      		guide.setVisible(true);
      		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      		
      	}
      });
      btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
      btnNewButton.setBounds(48, 332, 166, 40);
      panel.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("Report");
      btnNewButton_1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		report mark = new report(rat);
      		mark.setVisible(true);
      		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      	}
      });
      btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
      btnNewButton_1.setBounds(48, 399, 166, 40);
      panel.add(btnNewButton_1);
      setTitle("Please Login Here !");
      setSize(785,519);
      setVisible(true);
      
      
      
   }



	
	public static void generateGroup(Student[] sdt, Project[] pro, group[] grp) {
		int i, j;
		for (i = 0; i != pro.length; i++) {
			int k = 0, exp = 0, countm = 0, counts = 0;
			float sum = 0;
			for (j = 0; j < sdt.length; j++) {
				if (sdt[j].getgroupno() == i + 1) {
					sum = sum + sdt[j].getCGPA();
					k++;
					if (sdt[j].getdepartment().equals(pro[i].GetMainArea())) {
						countm++;

					}
					if (sdt[j].getareaofinterest().equals(pro[i].GetSubArea())) {
						counts++;
					}
				}
			}
			float ac = sum / k;
			grp[i] = new group();
			grp[i].setavg_cgpa(ac);
			System.out.println("Average cgpa of group " + pro[i].Group_no + " is " + grp[i].avg_cgpa);
			if (ac > 5) {
				exp++;
			}
			if (k != 1) {
				if (countm >= k - 1) {
					exp++;
				}

				if (counts >= 1) {
					exp++;
				}
			} else {
				if (countm == 1) {
					exp++;
				}
				if (counts == 1) {
					exp++;
				}
			}
			grp[i].expertise = exp;
			System.out.println("Expertise of group " + pro[i].Group_no + " is " + grp[i].expertise);
		}
	}
	
	
	public static void generateGuide(Project[] pro, facultyo[] fac, Guide[] g) 
	{
	int i, j, limit = 4, count = 0;
	for (i = 0; i != fac.length; i++) {
		g[i] = new Guide();
	}
	for (i = 0; i != pro.length; i++) {
		for (j = 0; j != fac.length; j++) {

			if (fac[j].getNoG() != limit) { // Check if the limit of faculty is not reached

				if (pro[i].GetSubArea().equals(fac[j].getAreaOfSpecialization())) { // Check if SubArea of Project
																					// is equal to AoS of Faculty
					g[count].Group_no = (pro[i].Group_no);
					g[count].setFID(fac[j].fids);
					System.out.println(
							"Faculty " + g[count].getFID() + " is assigned to group " + g[count].Group_no);
					fac[j].setIsaGuide(true);
					count++;
					fac[j].setNoG(fac[j].getNoG() + 1);
					pro[i].SetisGuideAssigned(true);
					break;
				}

				else if (pro[i].GetMainArea().equals(fac[j].getDepartment())) { // Else check if Main Area is equal
																				// to department
					g[count].Group_no =(pro[i].Group_no);
					g[count].setFID(fac[j].fids);
					System.out.println(
							"Faculty " + g[count].getFID() + " is assigned to group " + g[count].Group_no);
					fac[j].setIsaGuide(true);
					count++;
					fac[j].setNoG(fac[j].getNoG() + 1);
					pro[i].SetisGuideAssigned(true);
					break;
				}

			}
		}
	}

	for (i = 0; i != pro.length; i++) {
		if (!pro[i].GetisGuideAssigned()) {
			System.out.println("Guide not assigned for Group " + pro[i].Group_no);
		}
	}
	}
   public GetSelectedJCheckBox(projectReview1 rec2) {
	
	   
	   
	      // Username Label
	      user_label = new JLabel();
	      user_label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	      user_label.setBounds(372, 162, 89, 33);
	      user_label.setText("User Name :");
	      userName_text = new JTextField();
	      userName_text.setBounds(471, 159, 290, 40);
	      
	      // Password Label
	      password_label = new JLabel();
	      password_label.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	      password_label.setBounds(372, 221, 89, 40);
	      password_label.setText("Password :");
	      password_text = new JPasswordField();
	      password_text.setBounds(471, 222, 290, 40);
	      
	      // Submit
	      submit = new JButton("LOGIN");
	      submit.setBounds(450, 303, 261, 40);
	      panel = new JPanel();
	      panel.setLayout(null);
	      panel.add(user_label);
	      panel.add(userName_text);
	      panel.add(password_label);
	      panel.add(password_text);
	      panel.add(submit);
	      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      // Adding the listeners to components..
	      submit.addActionListener(this);
	      getContentPane().add(panel, BorderLayout.CENTER);
	      
	      JButton btnNewButton = new JButton("Guide Allocation");
	      btnNewButton.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		data guide = new data(rec,g);
	      		guide.setVisible(true);
	      		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      		
	      	}
	      });
	      btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	      btnNewButton.setBounds(48, 332, 166, 40);
	      panel.add(btnNewButton);
	      
	      JButton btnNewButton_1 = new JButton("Report");
	      btnNewButton_1.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		report mark = new report(rat);
	      		mark.setVisible(true);
	      		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      	}
	      });
	      btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	      btnNewButton_1.setBounds(48, 399, 166, 40);
	      panel.add(btnNewButton_1);
	      setTitle("Please Login Here !");
	      setSize(785,519);
	      setVisible(true);
    
	for(int i=0;i != rec.length;i++)
	{
		if (rec[i].getFid() == rec2.getFid())
		{
			rec[i].setDate(rec2.getDate());
			rec[i].setTime(rec2.getTime());
			rec[i].Group_no = (rec2.Groupno);
			rec[i].setVenue(rec2.getVenue());
			
			System.out.print(rec[i].Group_no);
		}
	}
}



public GetSelectedJCheckBox(rating2 rate) {
	// TODO Auto-generated constructor stub
	
	
	   
    // Username Label
    user_label = new JLabel();
    user_label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    user_label.setBounds(372, 162, 89, 33);
    user_label.setText("User Name :");
    userName_text = new JTextField();
    userName_text.setBounds(471, 159, 290, 40);
    
    // Password Label
    password_label = new JLabel();
    password_label.setFont(new Font("Times New Roman", Font.PLAIN, 14));
    password_label.setBounds(372, 221, 89, 40);
    password_label.setText("Password :");
    password_text = new JPasswordField();
    password_text.setBounds(471, 222, 290, 40);
    
    // Submit
    submit = new JButton("LOGIN");
    submit.setBounds(450, 303, 261, 40);
    panel = new JPanel();
    panel.setLayout(null);
    panel.add(user_label);
    panel.add(userName_text);
    panel.add(password_label);
    panel.add(password_text);
    panel.add(submit);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    // Adding the listeners to components..
    submit.addActionListener(this);
    getContentPane().add(panel, BorderLayout.CENTER);
    
    JButton btnNewButton = new JButton("Guide Allocation");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		data guide = new data(rec,g);
    		guide.setVisible(true);
    		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    		
    	}
    });
    btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
    btnNewButton.setBounds(48, 332, 166, 40);
    panel.add(btnNewButton);
    
    JButton btnNewButton_1 = new JButton("Report");
    btnNewButton_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		report mark = new report(rat);
    		mark.setVisible(true);
    		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	}
    });
    btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
    btnNewButton_1.setBounds(48, 399, 166, 40);
    panel.add(btnNewButton_1);
    setTitle("Please Login Here !");
    setSize(785,519);
    setVisible(true);
    

    for(int i =0;i != rat.length;i++)
    {
    	if(rat[i].Group_no == rate.getGroupno())
    	{
    		rat[i].setFid(rate.getFid());
    		rat[i].setDesign(rate.getDesign());
    		rat[i].setScope(rate.getScope());
    		rat[i].setBudget(rate.getBudget());
    		rat[i].setCreativity(rate.getCreativity());
    		rat[i].setExecution(rate.getExecution());
    		rat[i].setAverage(((rat[i].getBudget())+(rat[i].getCreativity())+(rat[i].getExecution())+(rat[i].getScope())+(rat[i].getDesign()))/5);
    		 	
    		System.out.println("fid: " + rat[i].getFid()  + "grp " + rat[i].Group_no);
    	}
    }
}
public static void main(String[] args) throws Exception {
      new GetSelectedJCheckBox();
 	 File file = new File("D:\\Java\\first\\src\\1.txt");
	 
 	 Scanner sc = new Scanner(file);
 	 int fid=0,levelOfExp;
 	 boolean IsaGuide;
 	 String fname = null,lname=null,dept=null,areaOfSpec;
 	 

 	 		
 	 facultyo[] fac = new facultyo[9];

 	 for(int i=0;i != fac.length;i++)
 	 {	
 		 fac[i] = new facultyo();
 		 fid = sc.nextInt();
 		 fname = sc.next();
 		 lname = sc.next();
 		 dept = sc.next();
 		 areaOfSpec = sc.next(); 
 		 levelOfExp = sc.nextInt();	
 		 IsaGuide = sc.nextBoolean();
 		 
 		 
 		 fac[i].fids = fid;
 		 fac[i].setFirstname(fname);
 		 fac[i].setLastname(lname);
 		 fac[i].setDepartment(dept);
 		 fac[i].setAreaOfSpecialization(areaOfSpec);
 		 fac[i].setLevelOfExpertise(levelOfExp);
 		 fac[i].setIsaGuide(IsaGuide);
 	 	 if(fac[i].getisIsaGuide() == false)
 	 	 {
 	 		 count++;
 	 	 }
 	 }
 	 
 	 sc.close();
 	 
		File fstu = new File("D:\\Java\\first\\src\\student_details.txt");
		sdt = new Student[18];

		
		Scanner ssc = new Scanner(fstu);
		for (int i = 0; i != sdt.length; i++) {
			sdt[i] = new Student();
			sdt[i].Roll_no = ssc.nextInt();
			sdt[i].setfname(ssc.next());
			sdt[i].setlname(ssc.next());
			sdt[i].setgroupno(ssc.nextInt());
			sdt[i].setDepartment(ssc.next());
			sdt[i].setAreaofInterest(ssc.next());
			sdt[i].setCGPA(ssc.nextFloat());
		}
		ssc.close();

		File fpro = new File("D:\\Java\\first\\src\\project_details.txt");
		pro = new Project[7];
		rat = new ratings[7];

		
		Scanner psc = new Scanner(fpro);
		
		for (int i = 0; i != pro.length; i++) {
			pro[i] = new Project();
			pro[i].Group_no = psc.nextInt();
			rat[i] = new ratings();
			rat[i].Group_no = i+1;
			pro[i].SetTitle(psc.next());
			pro[i].SetMainArea(psc.next());
			pro[i].SetSubArea(psc.next());
			
		}
		psc.close();
		

		
		grp = new group[7];

		generateGroup(sdt, pro, grp);
		

		
		g = new Guide[fac.length];

		generateGuide(pro, fac, g);
		pwd = new passwordo[count];
		rec = new projectReview[count];
  	
 	 for(int i=0;i != fac.length;i++)
 	 {	//CREATING REVIEW PANEL MEMBERS who are not guides
 		 if(fac[i].getisIsaGuide() == false)
 		 {
 		 pwd[counts] = new passwordo();
		 rec[counts] = new projectReview();
 		 pwd[counts].fids = fac[i].fids;
 		 
 		 pwd[counts].setPassword(String.valueOf(fac[i].fids));
 		 pwd[counts].setUsername(String.valueOf(fac[i].fids));
 		 rec[counts].setFid(fac[i].fids);
 		System.out.println("useranme:"+pwd[counts].getUsername()+"\npassword:"+pwd[counts].getPassword());
 		 counts++;
 		 
 		 }
 	 }
   }
   
   
   public void actionPerformed(ActionEvent ae) 
   {
      String userName = userName_text.getText();
      String password = password_text.getText();
      
      for(int i=0;i != pwd.length;i++)
      { 
    	  try 
      	{
          if (userName.trim().equals(pwd[i].getUsername().trim()) && password.trim().equals(pwd[i].getPassword().trim())) 
          {
             form back = new form(pwd[i].fids);
             back.setVisible(true);
             setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             break;
          } 
          else 
          {
        	  if(i+1 == pwd.length  )
        	  {  
        		  JOptionPane.showMessageDialog(null, "INVALID USERNAME AND PASSWORD ");
        	    break;
        	  }

        	  else 
        		  continue;
          } 
      }
    	  catch (Exception e)
    	  {
    		  System.out.print("ERROR");
    	  }
   	  
      }

   }
}