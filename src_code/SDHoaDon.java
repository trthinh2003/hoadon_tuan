import java.util.Scanner;

public class SDHoaDon {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Nhap thong tin cho KhachHang
		int so_luongKH = sc.nextInt(); sc.nextLine();
		KhachHang kh[] = new KhachHang[so_luongKH];
		for (int i = 0; i < so_luongKH; i++) {
			kh[i] = new KhachHang();
			kh[i].nhap();
			String s = new String("");
			s += "KH00" + (i + 1);
			kh[i].layMaKH_tuDong(s);
		}
		
		//Nhap thong tin cho MatHang
		int so_luongMH = sc.nextInt(); sc.nextLine();
		MatHang mh[] = new MatHang[so_luongMH];
		for (int i = 0; i < so_luongMH; i++) {
			mh[i] = new MatHang();
			mh[i].nhap();
			String s = new String("");
			s += "MH00" + (i + 1);
			mh[i].layMaMH_tuDong(s);
		}
		
		//Nhap thong tin cho HoaDon
		int so_luongHD = sc.nextInt(); sc.nextLine();
		HoaDon hd[] = new HoaDon[so_luongHD];
		for (int i = 0; i < so_luongHD; i++) {
			hd[i] = new HoaDon();
			hd[i].nhap();
		}
		
		//In
		long thanhTien[] = new long[so_luongHD];
		for (int i = 0; i < so_luongHD; i++) {
			for (int j = 0; j < so_luongMH; j++) {
				if (hd[i].layMaMH().equals(mh[j].layMaMH())) {
					thanhTien[i] = hd[i].laySoLuong() * mh[j].layGiaBan();
				}
			}
		}
		for (int i = 0; i < so_luongHD; i++) {
			System.out.print(hd[i].layMaHD() + (i + 1) + " ");
			for (int j = 0; j < so_luongKH; j++) {
				if (hd[i].layMaKH().equals(kh[j].layMaKH())) {
					System.out.print(kh[j] + " ");
				}
			}
			for (int k = 0; k < so_luongMH; k++) {
				if (hd[i].layMaMH().equals(mh[k].layMaMH())) {
					System.out.print(mh[k] + " ");
				}
			}
			System.out.println(hd[i] + " " + thanhTien[i]);
		}
	}
}
