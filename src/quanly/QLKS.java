package quanly;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import hoadon.HDGio;
import hoadon.HDNgay;
import hoadon.HoaDon;

public class QLKS implements ChucNang{
	private List<HoaDon> list;
	private Scanner in;
	public QLKS()
	{
		list=new ArrayList<>();
		in=new Scanner(System.in);
	}
	public HoaDon get()
	{
		String Ma, Ngay, Name;
		System.out.print("Ma: ");
		Ma=in.nextLine();
		while(true)
		{
			System.out.print("Ngay: ");
			Ngay=in.nextLine().toUpperCase();
			if(Ngay.matches("^\\d{1,2}/\\d{1,2}/\\d{4}"))
					break;
			else
				System.out.println("nhap lai");
		}
		System.out.print("Ho Ten: ");
		Name=in.nextLine();
		return new HoaDon(Ma,Ngay,Name);
	}
	@Override
	public void nhapHDN()
	{
		HoaDon d=get();
		int soNgay;
		System.out.print("so ngay: ");
		soNgay=Integer.parseInt(in.nextLine());
		HDNgay n=new HDNgay(d.getMa(),d.getNgay(),d.getName(),soNgay);
		list.add(n);
	}
	@Override
	public void nhapHDG()
	{
		HoaDon d=get();
		int soGio;
		System.out.print("so gio: ");
		soGio=Integer.parseInt(in.nextLine());
		HDNgay n=new HDNgay(d.getMa(),d.getNgay(),d.getName(),soGio);
		list.add(n);
	}
	@Override
	public void vietDS()
	{
		System.out.println("Ma\tNgay\tName\tso ngay\tthanh tien");
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) instanceof HDNgay)
				System.out.println(list.get(i).toString());
		}
		System.out.println("Ma\tNgay\tName\tso gio\tthanhtien");
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) instanceof HDGio)
				System.out.println(list.get(i).toString());
		}
	}
	private int getVTMa(String Ma)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getMa().equalsIgnoreCase(Ma))
				return i;
		}
		return -1;
	}
	@Override
	public void suaDS(String Ma)
	{
		int VT=getVTMa(Ma);
		if(VT==-1) System.out.println("khong tim thay");
		else
		{
			HDNgay b=(HDNgay) list.get(VT);
			System.out.print("ngay: ");
			String Ngay=in.nextLine();
			b.setNgay(Ngay);
			System.out.print("ho ten: ");
			String Name=in.nextLine();
			b.setName(Name);
			System.out.println("sua thanh cong.");
		}
	}
	@Override
	public void sxTheoNgay()
	{
		Collections.sort(list,new Comparator<HoaDon>(){
			@Override
			public int compare(HoaDon b1, HoaDon b2)
			{
				return b1.getNgay().compareToIgnoreCase(b2.getNgay());
			}
		});
	}
	@Override
	public double tongTien()
	{
		double tongTien=0;
		for(int i=0;i<list.size();i++)
		{
			tongTien+=list.get(i).getTienThanhToan();
		}
		return tongTien;
	}
}
