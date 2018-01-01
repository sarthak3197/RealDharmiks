package kanika;

public class game{
	private int n;
	private int leap;
	int arr[]= new int[n];
	int position = -1;
	int k=0;
    int x =1;
	  
	public void MovesBackwards() {
		if(position-1>=0 && arr[position-1]==0) {
			position--;
			if(position+leap<n && arr[position+leap] == 0) {
				position = position+leap;
			}
		}
		else {
			System.out.println("You lose");
		}
	}
	
	public void MovesForward() {
		
		
		while(k<n){
			if(position+1<=n && arr[position+1] == 0) {
				position++;
			    break;
			}
			else if(position+leap>n){
				position = n;
				break;
			}
			else if(position+leap<=n && arr[position+leap]==0) {
				position = position+leap;
				break;
			}
			
			k++;
		}		
		 if(position == n-1 || position>=n)
  	   {
  		
  		  System.out.println("you won");
  	   }
  	   else {
  		   x=0;
  		   System.out.println("you lose");
  	   }
		 if(x==0) {
			 while(arr[position]==0) {
				 MovesBackwards();
			 }
		 }
	}
}
