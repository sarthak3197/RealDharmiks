import java.util.Scanner;

public class Game {

	public static void main(String[] args){
		int q,n,leap,pos,k;
		System.out.println("Enter the number of querries");
		Scanner scanner = new Scanner(System.in);
		q = scanner.nextInt();
		for(int i =1 ; i<=q; i++) {
			System.out.println("Enter the array size");
			n = scanner.nextInt();
			System.out.println("Enter the leap size");
			leap = scanner.nextInt();
			int game[] = new int[n];
			System.out.println("Enter the elements of your array with 0th value equal to 0");
			for(int j = 0; j<n; j++) {
				game[j] = scanner.nextInt();
			}
			/*for(int k =0; k<n; k++) {
				if(k+1<=n && game[k+1]== 0)
					pos = k+1;
				else if(k+leap<=n && game[k+leap]== 0)
					pos = k+leap;*/
			pos = -1;
			k=0;
			while(k<n)
			{
				if(pos+1<=n && game[pos +1]== 0)
				{
					pos++;
					break;
				}
				else if((pos+leap)>n)
				{
					pos=n;
					break;
				}
				else if(game[pos+leap] == 0)
				{
					pos = pos+leap;
				}
				k++;
			}
			
			if(pos==n-1 || pos>=n)
				System.out.println("Congrats you won");
			else
				System.out.println("Oops you lose");
		}	
		scanner.close();
	}
  }


