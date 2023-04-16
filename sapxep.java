package qlks;

import java.util.Comparator;
//Comparator: để sắp xếp các đối tượng của lớp do người dùng định nghĩa
public class sapxep implements Comparator<sach>{
    @Override
    public int compare(sach o1, sach o2) {
        int sx=o1.getSoLuong()-o2.getSoLuong(); 
        if(sx< 0)
return -1;
else if(sx ==0)
return 0;
else

return 1;
    }
}
