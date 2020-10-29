package hoadon;

public class HDNgay extends HoaDon implements TienThanhToan{
	private int soNgay;

	public HDNgay(String ma, String ngay, String name, int soNgay) {
		super(ma, ngay, name);
		// TODO Auto-generated constructor stub
		this.soNgay=soNgay;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	@Override
	public double getTienThanhToan()
	{
		if(soNgay<7) return 300*soNgay;
		else return 300*7+300*(soNgay-7)*0.9;
	}
	public String toString()
	{
		return getMa()+"\t"+getNgay()+"\t"+getName()+"\t"+"\t"+getSoNgay()+"\t"+getTienThanhToan();
	}
}
