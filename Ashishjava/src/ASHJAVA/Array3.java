package ASHJAVA;

public class Array3 {

	public static void main(String[] args) {
	int []a= {51,17,33,70,85};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%17==0)
		{
		 // System.out.println("it is present");
		  count++;
		   
		}
		else 
		{
			//System.out.println("it is not present");
		
		}
	}
	  if(count>=1){
		  System.out.println("it is present");
	  }

	}

}
