package hoadon;

public class HoaDon {
	private String Ma, Ngay, Name;
	private int Tien;
	public HoaDon(String ma, String ngay, String name) {
		super();
		Ma = ma;
		Ngay = ngay;
		Name = name;
	}

	public String getMa() {
		return Ma;
	}

	public void setMa(String ma) {
		Ma = ma;
	}

	public String getNgay() {
		return Ngay;
	}

	public void setNgay(String ngay) {
		Ngay = ngay;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
