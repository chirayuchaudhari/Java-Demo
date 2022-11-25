package Array;

public class StudentMain {

	

	public static void main(String[] args) {
		StudentArray[] S=new StudentArray[5];
		S[0]=new StudentArray(1,"chirayu","Msc","Muktainagar",8.0f);
		S[1]=new StudentArray(2,"prasad","MCA","Shirpur",8.5f);
		S[2]=new StudentArray(3,"chandu","BE","Dhule",7.0f);
		S[3]=new StudentArray(4,"kunal","MCA","Jalgaon",6.9f);
		S[4]=new StudentArray(5,"ganesh","BE","Gondia",10.0f);
		
		for (int i = 0; i < S.length; i++)
		{
			//if(S[i].gp>7.0f)
				System.out.println(S[i]);
		}
		
		
		
	
		

	}

}
