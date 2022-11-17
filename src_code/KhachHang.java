import java.util.Scanner;

public class KhachHang {
	
	private String maKH;
	private String tenKH;
	private String gtinh;
	private String ngaySinh;
	private String diaChi;
	
	public KhachHang() {
		maKH = new String();
		tenKH = new String();
		gtinh = new String();
		ngaySinh = new String();
		diaChi = new String();
	}
	
	public KhachHang(KhachHang kh) {
		maKH = new String(kh.maKH);
		tenKH = new String(kh.tenKH);
		gtinh = new String(kh.gtinh);
		ngaySinh = new String(kh.ngaySinh);
		diaChi = new String(kh.diaChi);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		tenKH = sc.nextLine();
		gtinh = sc.nextLine();
		ngaySinh = sc.nextLine();
		diaChi = sc.nextLine();
	}
	
	public void in() {
		System.out.print(tenKH + " " + diaChi);
	}
	
	public void nhapMaKH() {
		Scanner sc = new Scanner(System.in);
		maKH = sc.nextLine();
	}
	
	public String toString() {
		return tenKH + " " + diaChi;
	}
	
	public void layMaKH_tuDong(String maBDau) {
		this.maKH = maBDau;
	}
	
	public String layMaKH() {
		return this.maKH;
	}
}
