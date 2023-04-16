package qlks;
public class sachgiaitri extends sach{

public sachgiaitri() 
{
}
public sachgiaitri(String maSach, String tensach, String nhaXuatBan, double donGia, int soLuong,String ngaynhap,String ngayxuat) 
{
	super(maSach, tensach, nhaXuatBan,donGia,soLuong,ngaynhap, ngayxuat);
}

@Override
public void hien()
{
	System.out.print("loại sách giải trí");
	super.hien();
}
}