import java.io.*;
import java.util.concurrent.TimeUnit;

public class ternary_search {

	  
	    // Function to perform Ternary Search 
	    static int ternarySearch(int l, int r, int key, int ar[]) 
	  
	    { 
	        while (r >= l) { 
	  
	            // Find the mid1 nad mid2 
	            int mid1 = l + (r - l) / 3; 
	            int mid2 = r - (r - l) / 3; 
	  
	            // Check if key is present at any mid 
	            if (ar[mid1] == key) { 
	                return mid1; 
	            } 
	            if (ar[mid2] == key) { 
	                return mid2; 
	            } 
	  
	  
	            if (key < ar[mid1]) { 
	  
	                // The key lies in between l and mid1 
	                r = mid1 - 1; 
	            } 
	            else if (key > ar[mid2]) { 
	  
	                // The key lies in between mid2 and r 
	                l = mid2 + 1; 
	            } 
	            else { 
	  
	                // The key lies in between mid1 and mid2 
	                l = mid1 + 1; 
	                r = mid2 - 1; 
	            } 
	        } 
	  
	        // Key not found 
	        return -1; 
	    } 
	  
	    // Driver code 
	    public static void main(String args[]) throws IOException
	    {  
	  
	        File file = new File("1000.txt");
			BufferedReader br =new BufferedReader(new FileReader(file));
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			int key=Integer.parseInt(br1.readLine());
			long t0 = System.nanoTime();
			String line;
			//String str;
			int l = 1000;  // SIZE OF INPUT
			
			int i=0;
			
			int a[]= new int [l];
			do
			{
				line = br.readLine();
				//System.out.println(line);
				if (line!=null)
				{
			a[i]=Integer.parseInt(line);
			i++;
				}
			}while(line!=null);
			
				
	//int key=10;
			int left =0;
			int right =l;

	int pos = ternarySearch(left,right,key,a);
	if(pos == -1)
		System.out.println(-1);
	else
		System.out.println(pos);
	long t1 = System.nanoTime();
	long exe_time= t1-t0;
	System.out.println(exe_time);	
	    } 
	} 


