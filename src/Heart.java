import java.io.*;

class dil1
{
   static int a,b,c=1,limit;
   public static void main(String[] arr)
     {
          
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Plz enter your HEART size");
       try
         {
        limit=Integer.parseInt(br.readLine());
        a=limit+1;
         }
       catch(IOException e)
               {
                   e.printStackTrace();
               }
          for(int i=limit;i>=1;i--)
            {
                  for(int j=1;j<=i;System.out.print(" "),j++) ;   
                  for(int j=limit-1;j>i;System.out.print("*"),j--); 
                  for(int j=limit-1;j>i;System.out.print("*"),j--) ;
                  for(int j=a;j>=1;System.out.print(" "),j--);
                  for(int j=1;j<i;System.out.print(" "),j++) ;   
                  for(int j=limit-1;j>i;System.out.print("*"),j--);
                  for(int j=limit-1;j>i;System.out.print("*"),j--) ;
                  System.out.println();  
                  a-=1;   
            } 
           
             for(b=16;b!=0;)
               {
               
                     for(int i=1;i<=b;System.out.print("*"),i++);
                     System.out.println();
                      for(int j=1;j<=c;j++)
                       {
                     System.out.print(" ");
                       }
                     b-=2; 
                     c+=1;
              }           
            
     }
}