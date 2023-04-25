package lep;


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
		System.out.printf("nhap so tien ban can nao:", null);                                                                
		sc.nextDouble();                                                                                               
		                                                                                                               
		if(nap>=0) {                                                                                                   
			sotien=nap+sotien;                                                                                         
			System.out.print(" ban vua nap ... vao tai khoan");}                                                      
			else {System.out.print(" so tien nap vao khong hop le!");                                                 
					                                                                                                   
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
	                                                                                                                   
	                                                                                                                   
	                                                                                                                   
	    System.out.println("ban vua dao han 1 thang");                                                   
	    return sotien;                                                                                                 
	}                                                                                                                  
	                                                                                                                   
	                                                                                                                   
	void inTK() {                                                                                                      
	                                                                                                                   
	    System.out.println();                                                        
	}                                                                                                                  
	public class Main {                                                                                                
	    final Scanner sc = new Scanner(System.in);                                                                     
	    void nhap (abc Tk ) {                                                                                          
	        System.out.println("Nhap so tai khoan: ");                                                             
	        Tk.setSotk(sc.nextInt());                                                                                  
	        sc.nextLine();                                                                                             
	        System.out.println("Nhap ten tai khoan: ");                                                             
	                                                                                                                   
	        Tk.setSotien(50);                                                                                          
	    }                                                                                                              
	    public void main(String[] args) {                                                                              
	      abc a[] = null;                                                                                              
	        int k, b, n = 0;                                                                                           
	        long s, d, c, f;                                                                                           
	        boolean flag = true;                                                                                       
	        do {                                                                                                       
	            System.out.println("chon: ");                                                           
	            System.out.println("1.Nhập thông tin của các khách hàng\n"                                        
	                    + "2.Xuất danh sách thông tin của các khách hàng\n" + "3.Nạp tiền\n" + "4.Rút tiền\n"
	                    + "5.Đáo hạn\n" + "6.Chuyển khoản\n" + "Số khác để thoát");                            
	            b = sc.nextInt();                                                                                      
	            switch (b) {                                                                                           
	                case 1:                                                                                            
	                    System.out.println("so luong khach hang: ");                        
	                    n = sc.nextInt();                                                                              
	                    a = new abc[n];                                                                                
	                    for (int i = 0; i < n; i++) {                                                                  
	                        System.out.println("Khách hàng số: " + (i+1));                                          
	                        a[i] = new abc(sotien, sotk, tentk, trangthai);                                            
	                        nhap(a[i]);                                                                                
	                    }                                                                                              
	                    break;                                                                                         
	                case 2:                                                                                            
	                    System.out.println();            
	                    for (int i = 0; i < n; i++) {                                                                  
	                        a[i].inTK();                                                                               
	                    }                                                                                              
	                    break;                                                                                         
	                case 3:                                                                                            
	                    System.out.println("so tai khoan can nap: ");                      
	                    s = sc.nextLong();                                                                             
	                    for (int i = 0; i < n; i++) {                                                                  
	                        d = a[i].getSotk();                                                                        
	                        if (s == d) {                                                                              
	                            System.out.println("chon tai khoan: " + d);                                      
	                            a[i].napTien();                                                                        
	                        } else {                                                                                   
	                            System.out.println("");                                                                
	                        }                                                                                          
	                    }                                                                                              
	                    break;                                                                                         
	                case 4:                                                                                            
	                    System.out.println("so tai khoan can rut: ");                       
	                    s = sc.nextLong();                                                                             
	                    for (int i = 0; i < n; i++) {                                                                  
	                        d = a[i].getSotk();                                                                        
	                        if (s == d) {                                                                              
	                            System.out.println("chon tai khoan: " + d);                                      
	                            a[i].rutTien();                                                                        
	                        }                                                                                          
	                    }                                                                                              
	                    break;                                                                                         
	                case 5:                                                                                            
	                    System.out.println(" tai khoan dao han: ");                         
	                    s = sc.nextLong();                                                                             
	                    for (int i = 0; i < n; i++) {                                                                  
	                        d = a[i].getSotk();                                                                        
	                        if (s == d) {                                                                              
	                            System.out.println("chon tai khoan: " + d);                                      
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
	                    System.out.print("so tai khoan chuyen: ");                          
	                    s = sc.nextLong();                                                                             
	                    System.out.print("so tai khoan nhan: ");                            
	                    c = sc.nextLong();                                                                             
	                    for (int i = 0; i < n; i++) {                                                                  
	                        d = a[i].getSotk();                                                                        
	                        if (s == d) {                                                                              
	                            chuyen = a[i].getSotien();                                                             
	                            for (int j = 0; j < n; j++) {                                                          
	                                f = a[j].getSotk();                                                                
	                                if (c == f) {                                                                      
	                                    nhan = a[j].getSotien();                                                       
	                                    System.out.println("so tien can chuyen:");                            
	                                    tienChuyen = sc.nextDouble();                                                  
	                                    if (tienChuyen <= chuyen) {                                                    
	                                        chuyen = chuyen - tienChuyen;                                              
	                                        nhan = nhan + tienChuyen;                                                  
	                                        a[i].setSotien(chuyen);                                                    
	                                        a[j].setSotien(nhan);                                                      
	                                        System.out.println("Tai khoan so " + d + " vua chuyen: $" + tienChuyen);
	                                        System.out.println("Tài khoan so " + f + " vua nhan : $" + tienChuyen);
	                                    } else {                                                                       
	                                        System.out.println("so tien nhap khong hop le!");                     
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
	                    System.out.println("khong lam nua!!");                                                                   
	                    flag = false;                                                                                  
	                    break;                                                                                         
	            }                                                                                                      
	        } while (flag);                                                                                            
	    }                                                                                                              
	}                                                                                                                  
	}                                                                                                                  
	                                                                                                                   
			


