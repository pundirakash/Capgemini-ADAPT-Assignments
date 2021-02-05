class Student{
private int subjectA,subjectB,subjectC;
Student(){
    }
Student(int a, int b, int c){
    	subjectA = a;
    	subjectB = b;
    	subjectC = c;
    }
public int studentsTotalMarksInAllSubjects(Student[] students)
{
	int s1 = students[0].subjectA+students[0].subjectB+students[0].subjectC;
    	int s2 = students[1].subjectA+students[1].subjectB+students[1].subjectC;
    	int s3 = students[2].subjectA+students[2].subjectB+students[2].subjectC;
return s1+s2+s3;
}
 public double studentsAverageMarksInAllSubjects(Student[] students)
{
    	int s1 = students[0].subjectA+students[0].subjectB+students[0].subjectC;
    	int s2 = students[1].subjectA+students[1].subjectB+students[1].subjectC;
    	int s3 = students[2].subjectA+students[2].subjectB+students[2].subjectC;
return (s1+s2+s3)/3;
}
public int[] subjectWiseMarks(Student[] students,String subjectName)
{
	int[] subjectMarks=new int[3];
	if(subjectName=="subjectA")
	{
		for(int i=0;i<3;i++)
			{
				subjectMarks[i]=students[i].subjectA;
			}
	}
	else if(subjectName=="subjectB")
	{
		for(int i=0;i<3;i++)
			{
				subjectMarks[i]=students[i].subjectB;
			}
	}
	else
	{
		for(int i=0;i<3;i++)
			{
				subjectMarks[i]=students[i].subjectC;
			}
	

    }
return subjectMarks;
    
}
 public int subjectATotalByStudents(int[] marks)
{
int total=0;
for(int i=0;i<marks.length;i++)
{
	total+=marks[i];
}
return total;
}
public int subjectBTotalByStudents(int[] marks)
{
int total=0;
for(int i=0;i<marks.length;i++)
{
	total+=marks[i];
}
return total;
}
public int subjectCTotalByStudents(int[] marks)
{
int total=0;
for(int i=0;i<marks.length;i++)
{
	total+=marks[i];
}
return total;
}

public int subjectTotalByStudents(int[] marks)
{
int total=0;
for(int i=0;i<marks.length;i++)
{
	total+=marks[i];
}
return total;
}

public double subjectAverageByStudents(int[] marks) {
	   int total = 0;
	   for(int i=0;i<marks.length;i++) {
		   total+=marks[i];
	   }
	return total/3;
   }
public double subjectAAverageByStudents(int[] marks)
{
int total=0;
for(int i=0;i<marks.length;i++)
{
	total+=marks[i];
}
return total/3;
}
public double subjectBAverageByStudents(int[] marks)
{
int total=0;
for(int i=0;i<marks.length;i++)
{
	total+=marks[i];
}
return total/3;
}
public double subjectCAverageByStudents(int[] marks)
{
int total=0;
for(int i=0;i<marks.length;i++)
{
	total+=marks[i];
}
return total/3;
}

}

public class Assignment1Q9
{
	public static void main(String[] args)
  	{
	
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		

 
	}
}