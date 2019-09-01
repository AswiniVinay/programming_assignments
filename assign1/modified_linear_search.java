import java.io.*;
import java.util.concurrent.TimeUnit;
public class modified_linear_search {
	public static int modified_linear_search(int a[],int k)
	{
		int lb =0;
		int ub = a.length-1;
		int n=a.length;
		int mid1=(lb+ub)/3;
		int mid2=2*mid1;
		int i=0;
		int j=mid1;
		int l=mid2;
		while(i<mid1 && j<mid2 && l <n)
		{
			if(a[i]==k)
			{
			return (++i);	
			}
			else if(a[j]==k)
			{
				return (++j);
			}
			else if(a[l]==k)
			{
				return (++l);
			}
			else
			{
				i++;
				j++;
				l++;
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
		
			


int pos = modified_linear_search(a,key);
if(pos == -1)
	System.out.println(-1);
else
	System.out.println(pos);
long t1 = System.nanoTime();
long exe_time= t1-t0;
System.out.println(exe_time);
	}// end main
	
}
