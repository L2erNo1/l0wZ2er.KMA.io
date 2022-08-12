package BTVeNha1;

import java.util.*;

public class BTVeNha {
	public static void soNguyenTo(int n) {
		int length = 0;	
		for(int i = 2; i <= n; i++) {
			int count = 0;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 0) {
				length++;
				System.out.print(i + " ");
				if(length % 5 == 0) {
					System.out.println("\t");
				}
			}
		}
	}
	
	public static void inTamGiac(int h) {
		for(int i = 1; i <= h; i++){
		  for(int j = 1; j <= h + i - 1; j++){
			  if(j < h - i + 1)
				  System.out.print(" ");
			  else
				  System.out.print("*");
		  }
		  System.out.print('\n');
		}
	}
	
	public static int GCDLoop(int k, int l) {
		if (k == 0 || l == 0){
	        return k + l;
	    }
	    while (k != l){
	        if (k > l){
	            k = k - l;
	        }else{
	            l = l - k;
	        }
	    }
	    return k;
	}
	public static int GCDDeQui(int k, int l) {
	    if (l == 0) return k;
	    return GCDDeQui(l, k % l);
	}
	
	public static void main(String[] args) {
		int n;
		int h;
		int k;
		int l;
		int select;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. In so nguyen to.\n2. In thap tam giac.\n3. Tim uoc chung lon nhat.");
			System.out.println("Moi chon bai tap:");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("Bai toan in so nguyen to trong doan 1 den n.");
				System.out.println("Moi nhap n:");
				n = sc.nextInt();	
				soNguyenTo(n);
				break;
			case 2: 
				System.out.println("Bai toan in tam giac.");
				System.out.println("Nhap chieu cao h:");
				h = sc.nextInt();
				inTamGiac(h);
				break;
			case 3: 
				int select1;
				System.out.println("1. Bai toan tim uoc chung lon nhat voi vong lap.");
				System.out.println("2. Bai toan tim uoc chung lon nhat voi de quy.");
				System.out.println("Moi chon:");
				select1 = sc.nextInt();
				do {
					switch(select1) {
					case 1:
						System.out.println("Bai toan tim GCP(k,l) bang vong lap.");
						System.out.println("Moi nhap k:");
						k = sc.nextInt();
						System.out.println("Moi nhap l:");
						l = sc.nextInt();
						System.out.println("Uoc chung lon nhat la: " + GCDLoop(k,l));
						break;
					case 2:
						System.out.println("Bai toan tim GCP(k,l) bang de qui.");
						System.out.println("Moi nhap k:");
						k = sc.nextInt();
						System.out.println("Moi nhap l:");
						l = sc.nextInt();
						System.out.println("Uoc chung lon nhat la: " + GCDDeQui(k,l));
						break;	
					}
				
				}while(select1 <= 0 || select1 >2);
				break;
			}
		}while(select >= 3 || select <= 0);
		
	}

}
