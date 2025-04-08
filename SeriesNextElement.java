import java.util.*;
class Main{

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            String[] parts=s.split(",");
            
            int n=parts.length;
            int a[]=new int [n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(parts[i]);
            }
            boolean AP=(a[1]-a[0]==a[2]-a[1]);
            boolean GP=(a[1]/a[0]==a[2]/a[1]);
            if(AP){
                int r=a[1]-a[0];

                int res=a[n-1]+r;

                System.out.println(res);
            }else if(GP){
                int r=a[1]/a[0];

                int res=a[n-1]*r;

                System.out.println(res);
            }else{
                System.out.println("Neither AP nor GP");
            }


        }}

