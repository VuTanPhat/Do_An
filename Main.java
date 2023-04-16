package qlks;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
QuanLy a= new QuanLy();
sach b;
int n;
Scanner sc= new Scanner(System.in);
do
{
a.menuChinh();
System.out.print("Lựa chọn: ");

n= sc.nextInt();
switch(n)
{
case 1:
{

b= new sachhoctap();
a.themsach(b);
break;
}
case 2:
{

b= new sachgiaitri();
a.themsach(b);
break;
}

case 3:
{

a.xuatsht();
break;
}
//
case 4:
{

a.xuatsgt();
break;


}
//
case 5:
{
    a.SuaDoi();
    break;
}
case 6:
{
    a.timkiem();
    break;
}
case 7:
{
    a.SapXep();
    break;
}
case 8:
default:
break;
}
}
while(n!=0);
}
}

