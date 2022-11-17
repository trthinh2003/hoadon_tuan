import java.util.Scanner;

public class HoaDon {
	
	private String maHD;
	private int so_luong;
	
	//Cac thanh phan quan he
	private KhachHang kh;
	private MatHang mh;
	
	public HoaDon() {
		maHD = new String();
		so_luong = 0;
		kh = new KhachHang();
		mh = new MatHang();
	}
	
	public HoaDon(HoaDon hd) {
		maHD = new String(hd.maHD);
		so_luong = hd.so_luong;
		kh = new KhachHang(hd.kh);
		mh = new MatHang(hd.mh);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		kh.nhapMaKH();
		mh.nhapMaMH();
		so_luong = sc.nextInt();
	}
	
	public void nhapMaHD() {
		Scanner sc = new Scanner(System.in);
		maHD = sc.nextLine();
	}
	
	public void in() {
		System.out.print(so_luong);
	}
	
	public String toString() {
		String s = new String("");
		return s + so_luong;
	}
	
	public String layMaKH() {
		return this.kh.layMaKH();
	}
	
	public String layMaMH() {
		return this.mh.layMaMH();
	}
	
	public String layMaHD() {
		return "HD00";
	}
	
	public int laySoLuong() {
		return this.so_luong;
	}
}
