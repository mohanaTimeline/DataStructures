import java.util.Arrays;

public class rearrange {

	public static void main(String[] args) {
	int[] arr=new int[] {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};int[] k=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{	if(arr[i]!=i && arr[i]!=-1)
		{
			k[arr[i]]=arr[i];
		}
	}for(int i=0;i<arr.length;i++)
	{
		if(k[i]==0)
		{
			k[i]=-1;
		}
	}
	System.out.println(Arrays.toString(k));
	}
}
