package main;
import java.util.Scanner;
import quanly.QLKS;
public class Menu {
	public static void main(String[] args)
	{
		QLKS q=new QLKS();
		Scanner in =new Scanner(System.in);
		while(true)
		{
			System.out.println("0: thoat.");
			System.out.println("1: nhap hoa don ngay.");
			System.out.println("2: nhap hoa don gio.");
			System.out.println("3: viet danh sach.");
			System.out.println("4: sua danh sach.");
			System.out.println("5: sap xep theo ngay.");
			System.out.println("6: tinh tong tien.");
			int choise=Integer.parseInt(in.nextLine());
			switch(choise)
			{
			case 0: 
				System.out.println("0: thoat.");
				System.exit(0);
				break;
			case 1: 
				System.out.println("1: nhap hoa don ngay.");
				q.nhapHDN();
				break;
			case 2: 
				System.out.println("2: nhap hoa don gio.");
				q.nhapHDG();
				break;
			case 3: 
				System.out.println("3: viet danh sach.");
				q.vietDS();
				break;
			case 4: 
				System.out.println("4: sua danh sach.");
				String str=in.nextLine();
				q.suaDS(str);
				break;
			case 5: 
				System.out.println("5: sap xep theo ngay.");System.out.println("0: thoat.");
				q.sxTheoNgay();
				break;
			case 6: 
				System.out.println("6: tinh tong tien.");
				q.tongTien();
				break;
			}
		}
	}
}
