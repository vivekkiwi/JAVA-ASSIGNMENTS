public class Student_Report {

	private String name;
	private int e1,e2,e3,e4;
	
	//constructor
	Student_Report(String str,int t1, int t2, int t3, int t4)
	{
		name=str;
		e1=t1;
		e2=t2;
		e3=t3;
		e4=t4;
	}	
	
	//getters	
	public String getName() 
	{
		return name;
	}
	public int getE1() {
		return e1;
	}
	public int getE2() {
		return e2;
	}
	public int getE3() {
		return e3;
	}
	public int getE4() {
		return e4;
	}
	
	//setters
	
	public void setName(String name) {
		this.name = name;
	}
	public void setE1(int e1) {
		this.e1 = e1;
	}
	public void setE2(int e2) {
		this.e2 = e2;
	}
	public void setE3(int e3) {
		this.e3 = e3;
	}
	public void setE4(int e4) {
		this.e4 = e4;
	}
	
	public double average()
	{
		double sum,avg;
		sum=e1+e2+e3+e4;
		avg=sum/4;
		return avg;
	}
	
	public char getgrade()
	{
		double avg=average();
		
        if((avg>=90) && (avg<=100))
        {return 'A';}
        
        if((avg>=80) && (avg<=89))
    	{return 'B';}
        
        if((avg>=70) && (avg<=79))
    	{return 'C';}
        
        if((avg>=60) && (avg<=69))
    	{return 'D';}
        
        if((avg>=0) && (avg<=59))
    	{return 'E';}
        
        return 'U';
	}
	
	//Display
	void display()
	{
		System.out.print("\nStudent name : "+getName()+"\nExam marks : "+getE1()+" "+getE2()+" "+getE3()+" "+getE4()+"\nAverage Marks : "+average()+"\nGrade : "+getgrade());
	}

}
