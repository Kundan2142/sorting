package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {23,43,21,56,99};
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		 
		for(int i=0;i<5;i++)
			System.out.println(arr[i]);
	}

}
