package pattern.design;

public class Pattern10 {
	
	public static void pattern(int no) {
//		int cn=no;
//		for(int i=1;i<=no;i++) {
//			cn=0;
//			System.out.print(i+" ");
//			for(int j=1;j<i;j++) {
//				cn=cn+no-j;
//				System.out.print(i+cn+" ");				
//			}
//			System.out.println();
//		}
		
		int[][] arr=new int[no][no];
		int cn=1;
		for(int i=0;i<no;i++) {
			for(int j=i;j<no;j++) {
				arr[j][i]=cn;
				cn++;
			}
		}
		for(int i=0;i<no;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}

}
