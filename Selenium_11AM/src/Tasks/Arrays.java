package Tasks;

public class Arrays {
	public static int[][] multi(){
//		int b[]=new int[]{5,6,7,8,9};
//		for(int i=0;i<b.length;i++)
//			System.out.println(b[i]);
//		
//		
//		for(int x:b)
//			System.out.println(x);
		
//		
//		int b[][]=new int[][] {{5,6},{8,9},{10,12}};
//		
//		for(int i=0;i<b.length;i++) {
//			for(int j=0;j<b[i].length;j++) {
//				System.out.print(b[i][j]+ " ");
//		}
//			System.out.println();
//		}
		
		
		int b[][]=new int[2][2];
		b[0][0]=56;
		b[0][1]=67;
		b[1][0]=89;
		b[1][1]=97;
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+ " ");
		}
			System.out.println();
		}
		return b;
		
		
	}
	public static int[][] multi22(){
		int b2[][]=new int[][] {{5,6},{8,9},{10,12}};
		System.out.println(b2);
		return new int[][] {{5,6},{8,9},{10,12}};
	}
	public static void main(String[] args) {
		multi();
		multi22();
		//System.out.println(b);
		System.out.println(new int[][] {{5,6},{8,9},{10,12}});
	}
}