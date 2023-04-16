package qlks;
public class sachhoctap extends sach{

public sachhoctap() 
{
}
public sachhoctap(String maSach, String tensach, String nhaXuatBan, double donGia, int soLuong,String ngaynhap,String ngayxuat) 
{
	super(maSach, tensach, nhaXuatBan,donGia,soLuong,ngaynhap, ngayxuat);
}

@Override
public void hien()
{
	System.out.print("loại sách học tập");
	super.hien();
}
}
