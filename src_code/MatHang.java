import java.util.Scanner;

public class MatHang {

	private String maMH;
	private String tenMH;
	private String dviTinh;
	private int giaMua;
	private int giaBan;
	
	public MatHang() {
		maMH = new String();
		tenMH = new String();
		dviTinh = new String();
		giaMua = 0;
		giaBan = 0;
	}
	
	public MatHang(MatHang mh) {
		maMH = new String(mh.maMH);
		tenMH = new String(mh.tenMH);
		dviTinh = new String(mh.dviTinh);
		giaMua = mh.giaMua;
		giaBan = mh.giaBan;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		tenMH = sc.nextLine();
		dviTinh = sc.nextLine();
		giaMua = sc.nextInt();
		giaBan = sc.nextInt();
	}
	
	public void nhapMaMH() {
		Scanner sc = new Scanner(System.in);
		maMH = sc.nextLine();
	}
	
	public void in() {
		System.out.print(tenMH + " " + dviTinh + " " + giaMua + " " + giaBan);
	}
	
	public String toString() {
		return tenMH + " " + dviTinh + " " + giaMua + " " + giaBan;
	}
	
	public void layMaMH_tuDong(String maBDau) {
		this.maMH = maBDau;
	}
	
	public String layMaMH() {
		return this.maMH;
	}
	
	public int layGiaBan() {
		return this.giaBan;
	}
}
