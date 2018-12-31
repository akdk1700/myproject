package akdk99.SampleProject;

import java.util.ArrayList;

public class Uniqueno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,1,3,2,4,6,5,7,8,7,9,8,7};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);//pick a number and store it and k = 1;
				k++;
				
				for (int j = i+1; j < a.length; j++) {  // goes to next number to check it 
					
					if(a[i]==a[j])
					{
						k++; // if repeated again k+1 or k stays 1
					}
					
				}
				System.out.println(a[i]+" "+k+" times occured");
			}
			if(k==1)
			{
				System.out.println("Unique number is  "+a[i]);
			}
			
		}
		
	}

}
