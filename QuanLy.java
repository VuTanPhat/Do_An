package qlks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class QuanLy {
ArrayList<sach> s = new ArrayList<>();;
public QuanLy() {

}
public void themsach(sach a) {
Scanner sc = new Scanner(System.in);
System.out.print("Nhập số lượng cần thêm: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
System.out.println("Lần nhập thứ " + (i + 1) + ": ");
if (a instanceof sachhoctap) {
a = new sachhoctap();
a.nhap();
} else if (a instanceof sachgiaitri) {
a = new sachgiaitri();
a.nhap();
}
s.add(a);
}
}
//instanceof trường hợp của
public void xuatsgt() {
System.out.println("----------------------------------------------");

for (sach x : s) {
    if (x instanceof sachgiaitri) {
x.hien();
}
}
}
public void xuatsht() {
System.out.println("----------------------------------------------");
for (sach x : s) {
if (x instanceof sachhoctap) {
x.hien();
}
}
}
public void SuaDoi() {
Scanner sc = new Scanner(System.in);
int n;
do {
    System.out.println("Chọn: ");
    System.out.println("1. Sửa sách học tập");
    System.out.println("2. Xóa sách học tập");
    System.out.println("3. Sửa sách giải trí");
    System.out.println("4. Xóa sách giải trí");
    System.out.println("0. Quay lại");
    n = sc.nextInt();
switch (n) {
case 1: {
System.out.print("Nhập mã sách học tập cần sửa: ");
sc.nextLine();
String maSachht = sc.nextLine();
suasachhoctap(maSachht);
break;
}
case 2: {

System.out.print("Nhập mã sách học tập cần xóa: ");
sc.nextLine();
String maSachht = sc.nextLine();
xoasachhoctap(maSachht);
break;
}
case 3: {
System.out.print("Nhập mã sách giải trí sửa thông tin: ");
sc.nextLine();
String maSachgt = sc.nextLine();
suasachgiaitri(maSachgt);
break;
}
case 4: {
System.out.print("Nhập mã sách giải trí cần xóa : ");
sc.nextLine();
String maSachgt = sc.nextLine();
xoasachgiaitri(maSachgt);
break;
}
default:
break;
}
} while (n != 0);
}

//compareTo(: so sách với
public void suasachhoctap(String maSachht) {
for (sach x : s) {
if (x instanceof sachhoctap) {
if (((sachhoctap) x).getMaSach().compareTo(maSachht) == 0) {
    x.nhap();
}
}
}
}
public void xoasachhoctap(String maSachht) {
for (sach x : s) {
if (x instanceof sachhoctap) {
if (((sachhoctap) x).getMaSach().compareTo(maSachht) == 0) {
   s.remove(x);
    
}
}
}
}
public void suasachgiaitri(String maSachgt) {
for (sach x : s) {
if (x instanceof sachgiaitri) {
if (((sachgiaitri) x).getMaSach().compareTo(maSachgt) == 0) {
    x.nhap();
}
}
}
}
public void xoasachgiaitri(String maSachgt) {
for (sach x : s) {
if (x instanceof sachgiaitri) {
if (((sachgiaitri) x).getMaSach().compareTo(maSachgt) == 0) {
    s.remove(x);
}
}
}
}
public void timkiem(){
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập tên sách cần tìm");
    String a;
    a = sc.nextLine();
    for (sach x : s) {
if (((sach) x).getTensach().compareTo(a) == 0){
    if(x instanceof sachhoctap) {
    System.out.println("sách học tập");
    x.hien();
    }
    else if (x instanceof sachgiaitri){
    System.out.println("sách giải trí");
    x.hien();
    }
}
    else{
        }
}
}
public void hienDS()
{
for(sach x: s)
{
x.hien();
}
}
public void SapXep()
{
Collections.sort(s, new sapxep());
System.out.println(" sach sau khi sap xep");
hienDS();
}
public void menuChinh() {
    System.out.println("------menu------");
    System.out.println("1. Nhập sách học tập ");
    System.out.println("2. Nhập sách giải trí");
    System.out.println("3. xuất sách học tập");
    System.out.println("4. xuất sách giải trí");
    System.out.println("5. Sửa xóa sách");
    System.out.println("6. Tìm kiếm sách");
    System.out.println("7. Sắp xếp sách theo số lượng tăng dần");
    System.out.println("-----Nhấn phím 0 để thoát chương trình, xin cảm ơn!-----");
}

}