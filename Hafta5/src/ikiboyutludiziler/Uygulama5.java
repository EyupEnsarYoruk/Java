package ikiboyutludiziler;

public class Uygulama5 {

	public static void main(String[] args) {
		// Ýki boyutlu dizilerde statik baðlama
		
		int[][] dizi= {{1,2,3},{4,5},{6,7,8,9}};
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println();
		}
	}

}
