import java.util.Scanner;
public class ThreeDimArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][][] = new int[3][4][5];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the elements:");
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
		}

	}

}