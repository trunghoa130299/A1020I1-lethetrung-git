-- Yêu cầu 2

select *
from nhanvien
where( `hoten` like 'T%' or 'H%' or 'K%') and char_length(`hoten`) <15;

-- Yêu cầu 3

select *,
year(ngaysinh),(year(now()) - year(ngaysinh)) as tuoi
from khachhang
where (diachi = 'Đà Nẵng' or diachi='Quảng Trị') having tuoi between 18 and 50;

-- Yêu Cầu 4

select kh.`hoten`,lk.tenloaikhach,count(hd.idkhachhang_hd) as solandat
from khachhang kh
inner join hopdong hd on hd.idkhachhang_hd = kh.idkhachhang
inner join loaikhach lk on lk.idloaikhach = kh.idloaikhach_kh

where tenloaikhach = 'diamond'
group by kh.idkhachhang
order by solandat;

-- Yêu cầu 5

select kh.idkhachhang,kh.`hoten`,lk.tenloaikhach,hd.idhopdong,dv.tendichvu,hd.ngaylamhopdong,hd.ngayketthuc,
(dv.chiphithue+ hdct.soluong*dvdk.gia) as tongtien, count(hd.idkhachhang_hd) as count
from khachhang kh
	left join loaikhach lk on kh.idloaikhach_kh = lk.idloaikhach
    left join hopdong hd on kh.idkhachhang = hd.idkhachhang_hd
    left join dichvu dv on hd.iddichvu_hd = dv.iddichvu
    left join hopdongchitiet hdct on hd.idhopdong = hdct.idhopdong_hdct
    left join dichvudikem dvdk on hdct.iddichvudikem_hdct = dvdk.iddichvudikem
group by kh.idkhachhang;

-- Yêu cầu 6

select dv.iddichvu,dv.`tendichvu`,dv.dientich,dv.chiphithue,ldv.tenloaidichvu
from dichvu dv
	inner join loaidichvu ldv on dv.idloaidichvu_dv = ldv.idloaidichvu
    inner join hopdong hd on hd.iddichvu_hd = dv.iddichvu
where (year(hd.ngaylamhopdong) <= 2018 or year(hd.ngaylamhopdong)= 2019)and month(hd.ngaylamhopdong)>3 or year(hd.ngaylamhopdong)>2019;

-- Yêu cầu 7

select hd.idhopdong,dv.iddichvu,dv.tendichvu,dv.dientich,dv.songuoitoida,dv.chiphithue,ldv.tenloaidichvu
from dichvu dv
	left join loaidichvu ldv on dv.idloaidichvu_dv = ldv.idloaidichvu
    inner join hopdong hd on dv.iddichvu = hd.iddichvu_hd
where (year(ngaylamhopdong) = 2018) and (year(ngaylamhopdong) != 2019) ;

-- Yêu cầu 8 

select distinct kh.hoten
from khachhang kh ;

select hoten
from khachhang
union 
select hoten
from khachhang;

select hoten
from khachhang 
group by hoten having count(hoten) =1;

-- Yêu cầu 9

select month(ngaylamhopdong) as 'tháng' ,count(month(ngaylamhopdong)) as 'số tháng đặt phòng'
from hopdong
group by ngaylamhopdong having (year(ngaylamhopdong)) =2019;

-- Yêu cầu 10

select hd.idhopdong,hd.ngaylamhopdong,hd.ngayketthuc,hd.tiendatcoc,count(hdct.idhopdongchitiet) as soluongdichvudikem
from hopdong hd
	inner join hopdongchitiet hdct on hd.idhopdong = hdct.idhopdong_hdct
group by hdct.idhopdongchitiet;

-- Yêu cầu 11

select kh.`hoten` as 'Tên Khách Hàng',dvdk.tendichvudikem as 'dịch vụ sử dụng',lk.`tenloaikhach`
from khachhang kh
left join loaikhach lk on kh.idloaikhach_kh = lk.idloaikhach
left join hopdong hd on kh.idkhachhang = hd.idkhachhang_hd
inner join hopdongchitiet hdct on  hd.idhopdong = hdct.idhopdong_hdct 
inner join dichvudikem dvdk on hdct.iddichvudikem_hdct = dvdk.iddichvudikem
where (`tenloaikhach` = 'diamond') and (diachi = 'Vinh' or diachi = 'Quảng Ngãi');

-- Yêu cầu 12

select hd.idhopdong,nv.`hoten`,kh.`hoten`,kh.sdt,dv.`tendichvu`,count(hdct.soluong) as soluongdichvudikem,hd.tiendatcoc,hd.ngaylamhopdong
from dichvu dv
left join hopdong hd on dv.iddichvu = hd.iddichvu_hd
inner join nhanvien nv on hd.idnhanvien_hd = nv.idnhanvien
inner join khachhang kh on kh.idkhachhang = hd.idkhachhang_hd
inner join hopdongchitiet hdct on hd.idhopdong = hdct.idhopdong_hdct
where (year(hd.ngaylamhopdong) = 2019 and ( month(hd.ngaylamhopdong) between 10 and 12 ))  ;

-- Yêu cầu 13

select kh.idkhachhang,kh.`hoten`, count(dvdk.tendichvudikem) as 'số lần sử dụng '
from khachhang kh
left join hopdong hd on kh.idkhachhang = hd.idkhachhang_hd
left join hopdongchitiet hdct on   hd.idhopdong= hdct.idhopdong_hdct
left join dichvudikem dvdk on  hdct.iddichvudikem_hdct = dvdk.iddichvudikem 
where (dvdk.tendichvudikem) >1;