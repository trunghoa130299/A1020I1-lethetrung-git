select kh.`hoten`,lk.tenloaikhach,count(hd.idkhachhang_hd) as solandat
from khachhang kh
inner join hopdong hd on hd.idkhachhang_hd = kh.idkhachhang
inner join loaikhach lk on lk.idloaikhach = kh.idloaikhach_kh

where tenloaikhach = 'diamond'
group by kh.idkhachhang
order by solandat
