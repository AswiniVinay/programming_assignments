import java.io.*;
import java.util.concurrent.TimeUnit;
public class initial_linear_search {
	public static int initial_linear_search(int a[],int k)
	{
		int i =0;
		int n = a.length;
		while(i<n)
		{
			if(a[i]==k)
			{
			return (++i);	
			}
			else
			{
				i++;
			}
		}
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

int pos = initial_linear_search(a,key);
if(pos == -1)
	System.out.println(-1);
else
	System.out.println(pos);
long t1 = System.nanoTime();
long exe_time= t1-t0;
System.out.println(exe_time);
	}// end main
	
}
