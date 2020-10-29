package hoadon;

public class HDGio extends HoaDon implements TienThanhToan{
	private int soGio;

	public HDGio(String ma, String ngay, String name, int soGio) {
		super(ma, ngay, name );
		// TODO Auto-generated constructor stub
		this.soGio=soGio;
	}

	public int getSoGio() {
		return soGio;
	}

	public void setSoGio(int soGio) {
		this.soGio = soGio;
	}
	@Override
	public double getTienThanhToan()
	{
		if(soGio<5) return 50*soGio;
		else return 50*soGio+50*(soGio-5)*0.7;
	}
	public String toString()
	{
		return getMa()+"\t"+getNgay()+"\t"+getName()+"\t"+"\t"+soGio+"\t"+getTienThanhToan();
	}
}
