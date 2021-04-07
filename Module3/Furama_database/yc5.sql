select kh.idkhachhang,kh.`hoten`,lk.tenloaikhach,hd.idhopdong,dv.tendichvu,hd.ngaylamhopdong,hd.ngayketthuc,
(dv.chiphithue+ hdct.soluong*dvdk.gia) as tongtien, count(hd.idkhachhang_hd) as count
from khachhang kh
	left join loaikhach lk on kh.idloaikhach_kh = lk.idloaikhach
    left join hopdong hd on kh.idkhachhang = hd.idkhachhang_hd
    left join dichvu dv on hd.iddichvu_hd = dv.iddichvu
    left join hopdongchitiet hdct on hd.idhopdong = hdct.idhopdong_hdct
    left join dichvudikem dvdk on hdct.iddichvudikem_hdct = dvdk.iddichvudikem
group by kh.idkhachhang