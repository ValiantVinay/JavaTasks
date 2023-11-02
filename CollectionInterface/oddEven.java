import java.util.Scanner;
class oddEven{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int newArr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				newArr[i]=arr[i]*2;
			}
			else{
				newArr[i]=arr[i]*3;
			}
			
		}
		for(int i2=0;i2<n;i2++){
			System.out.println(newArr[i2]);
		}
		
		
	}
}