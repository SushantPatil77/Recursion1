package recusion3;

public class Student {
	
	  int rn;
	  String name;
	  int marks;
	  

	public Student(int rn, String name, int marks) 
	{
		super();
		this.rn = rn;
		this.name = name;
		this.marks = marks;
	}
	public static void main(String[] args)
	{
		  Student s1=new Student(1,"sousha", 50);
		  Student s2=new Student(2,"Rohit", 54);
		  Student s3=new Student(3,"sushant", 56);
		  Student s4=new Student(4,"suhsant", 56);
		  
		  Student[] s= {s1,s2,s3,s4};
		  printMyArrays(s,0);
		  for (int i = 0; i < s.length; i++) 
		  {
			System.out.println(s[i].rn+" "+s[i].name+" "+s[i].marks);
		  }
	}


	private static void printMyArrays(Student[] s, int i) 
	{
		 NameSort(s,i,i+1);
		 i++;
		 if(i<s.length)
			 printMyArrays(s, i);
		
	}
	private static void NameSort(Student[] s, int i, int j) 
	{		
		if(j<s.length)
	{
		if(s[i].marks==s[j].marks)
			{
				if(s[i].name.length()==s[j].name.length())
				{
					if(s[i].name.charAt(2)==s[j].name.charAt(2))
					{
						Student temp=s[i];
				        s[i]=s[j];
				        s[j]=temp;
					}
				}
			}
			else
			{
				Student temp=s[i];
		        s[i]=s[j];
		        s[j]=temp;
			}
		 j++;
			NameSort(s, i, j);
		}
	}

}
