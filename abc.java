package thegioixe;
import java.util.Scanner;

public class abc {
	public double sotien;
	public long sotk;
	public String tentk;
	public String trangthai;
public abc(double sotien,long sotk,String tentk,String trangthai) {
this.sotien=sotien;
this.sotk=sotk;
this.tentk=tentk;
this.trangthai=trangthai;

}
public double getSotien() {
	return sotien;
}
public void setSotien(double sotien) {
	this.sotien = sotien;
}
public long getSotk() {
	return sotk;
}
public void setSotk(long i) {
	this.sotk = i;
}
public String getTentk() {
	return tentk;
}
public void setTentk(String tentk) {
	this.tentk = tentk;
}
public String getTrangthai() {
	return trangthai;
}
public void setTrangthai(String trangthai) {
	this.trangthai = trangthai;
}
public String tostring() {
	return sotien+"-"+sotk+"-"+tentk+"-"+trangthai;
}
public double napTien() {
	double nap = 0;
	Scanner sc=new Scanner(System.in);
	System.out.printf("nhap so tien ban can nao:");
	sc.nextDouble();
	
	if(nap>=0) {
		sotien=nap+sotien;
		System.out.printf(" ban vua nap ... vao tai khoan");}
		else {System.out.printf(" so tien nap vao khong hop le!");
				
		}
	return nap;
	}
public double rutTien() {
    double phi = 5;
    double rut = 0;
    Scanner sc=new Scanner(System.in);
    System.out.print("nhap so tien ban can rut: ");
    sc.nextDouble();
    
    if (rut <= (sotien - phi)) {
        sotien = sotien - (rut + phi);
        
     
     System.out.println("ban vua rut..tu tai khoan .phi $5.");
    } else {
        System.out.println("so tien muon rut khong hop le!");
        return rutTien();
    }
    return rut;
}
public double daoHan() {
    double laiSuat = 0.035;
    sotien = sotien + sotien * laiSuat;
   
   

    System.out.println("Bạn vừa được từ đáo hạn 1 tháng");
    return sotien;
}


void inTK() {
   
    System.out.printf("%-10d %-20s %-20s \n", sotk, tentk);
}
public class Main {
    final Scanner sc = new Scanner(System.in);
    void nhap (abc Tk ) {
        System.out.println("Nhập số tài khoản: ");
        Tk.setSotk(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên tài khoản: ");
  
        Tk.setSotien(50);
    }
    public void main(String[] args) {
      abc a[] = null;
        int k, b, n = 0;
        long s, d, c, f;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì: ");
            System.out.println("1.Nhập thông tin của các khách hàng\n"
                    + "2.Xuất danh sách thông tin của các khách hàng\n" + "3.Nạp tiền\n" + "4.Rút tiền\n"
                    + "5.Đáo hạn\n" + "6.Chuyển khoản\n" + "Số khác để thoát");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Nhập số lượng khách hàng bạn muốn nhập: ");
                    n = sc.nextInt();
                    a = new abc[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Khách hàng số: " + (i+1));
                        a[i] = new abc(sotien, sotk, tentk, trangthai);
                        nhap(a[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "Số tiền trong TK");
                    for (int i = 0; i < n; i++) {
                        a[i].inTK();
                    }
                    break;
                case 3:
                    System.out.println("Nhập số tài khoản khách hàng cần nạp tiền: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].napTien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập số tài khoản khách hàng cần rút tiền: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].rutTien();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhập số tài khoản khách hàng cần đáo hạn: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].daoHan();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 6:
                    double chuyen,
                            nhan,
                            tienChuyen;
                    System.out.print("Nhập số tài khoản khách hàng chuyển tiền: ");
                    s = sc.nextLong();
                    System.out.print("Nhập số tài khoản khách hàng nhận tiền: ");
                    c = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            chuyen = a[i].getSotien();
                            for (int j = 0; j < n; j++) {
                                f = a[j].getSotk();
                                if (c == f) {
                                    nhan = a[j].getSotien();
                                    System.out.println("Nhập số tiền cần chuyển");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setSotien(chuyen);
                                        a[j].setSotien(nhan);
                                        System.out.println("Tài khoản số " + d + " vừa chuyển: $" + tienChuyen);
                                        System.out.println("Tài khoản số " + f + " vừa nhận: $" + tienChuyen);
                                    } else {
                                        System.out.println("Số tiền nhập không hợp lệ!");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("Bye!!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
}

		