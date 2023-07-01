package progaiming;
import java.util.*;
public abstract class programing {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of equation");
		int num_equation=sc.nextInt();	
		System.out.println("enter the max number of unknowns like(x,y,z,etc) in one equation");
  		int num_unknowns=sc.nextInt();
	    
  		int arr[][]=new int[num_equation][num_unknowns+1];
  		
  		for(int i=0;i<num_equation;i++) {
  			for(int j=0;j<num_unknowns+1;j++) {
               System.out.println("enter the number for "+(i+1)+" equation");
               arr[i][j]=sc.nextInt();
  				}
  		}
	
  	for(int pivot=0;pivot<num_unknowns;pivot++) {
  		for(int n=(pivot+1);n<num_equation;n++) {
  			 int x=arr[pivot][pivot];
  			 int y=arr[n][pivot];
  			
  			 for(int i=0;i<num_unknowns+1;i++) {
  				 arr[n][i]=(y*arr[pivot][i])-(x*arr[n][i]);
  			 }
  			 
  		}
  	}
  		
  	int sum1=0;	
	for(int i=0;i<num_equation;i++) {
			for(int j=0;j<num_unknowns;j++) {
				
				if (arr[i][j] != 0) {
					sum1+=1;
					if(i==num_equation-1)
						break;
					i+=1;			}
	
			}
			
	     		}
	int sum2=0;	
	for(int i=0;i<num_equation;i++) {
			for(int j=0;j<num_unknowns+1;j++) {
				
				if (arr[i][j] != 0) {
					sum2+=1;
					if(i==num_equation-1)
						break;
					i+=1;			}
	
			}
	}
    double answer[]=new double[num_unknowns];
	for (int i=0;i<answer.length;i++) {
		answer[i]=1;
	}
    
    
	if(sum1!=sum2) {
    	 System.out.println("system is  unconstant and has no solution");
     }else if (sum1!=num_unknowns) {
    	 System.out.println("system is constant and has infnity number of  solution");
    	 for(int i=0;i<num_equation;i++) {
 			for(int j=0;j<num_unknowns+1;j++) {
 			System.out.print(arr[i][j]+" ");
 			}
 			System.out.println();
 		}
        System.out.println("you can solve it by back substition");    	
 	 	 }else {
 	 	    System.out.println("system is constat and has specific number of solution");    	
 	 	
 	 	    for(int i=num_equation-1;i>=0;i--) {
 	 			double z=0;
 	 		  for(int j=num_unknowns-1;j>i;j--) {
 	 			 z+=(arr[i][j]*answer[j]);
 	 			}
 	 			if(i != num_equation-1)
 	 				z=z*(-1);
 	 			answer[i]=((arr[i][num_unknowns]+z)/arr[i][i]);
 	 			}
 	 	    
 	 	    for(int i=0;i<answer.length;i++) {
 	 	    	System.out.println("the answer is: "+answer[i]);
 	 	    }
 	 	 }	
	}
	 }

