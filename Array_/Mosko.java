package Array_;
public class Mosko{
	public static void main(String[] args){
	int nums[][] = new int[2][3];
		for(int i = 0; i<2; i++){
			for(int j=0; j<3; j++){
				 nums[i][j] = (int)(Math.random()*10);
				System.out.print(nums[i][j] + "	");
			}
			System.out.println();
		}
	}
}