import java.io.*;
import java.util.concurrent.TimeUnit;
public class binary_search {
	public static int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = (l +r) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
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

int pos = binarySearch(a,key);
if(pos == -1)
	System.out.println(-1);
else
	System.out.println(pos);
long t1 = System.nanoTime();
long exe_time= t1-t0;
System.out.println(exe_time);	
	}

}
