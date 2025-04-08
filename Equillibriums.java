import java.util.Scanner;
public class Equillibriums{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sumleft=0,sumright=0;
		for(int i=0;i<n;i++){
			sumleft=0;sumright=0;
			for(int j=i-1;j>=0;j--)
				if(sumleft==0)
					sumleft+=arr[j];
				else
				sumleft*=arr[j];
			for(int j=i;j<n;j++)
				if(sumright==0)
					sumright+=arr[j];
				else	
				sumright*=arr[j];
			if(sumleft==sumright){
				System.out.println(i);
				break;
			}
		}
		if(sumleft!=sumright)
			System.out.println(-1);
	}
}
