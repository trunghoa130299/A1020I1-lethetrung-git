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
from hopdong hd
left join dichvu dv on   hd.iddichvu_hd =dv.iddichvu
inner join nhanvien nv on hd.idnhanvien_hd = nv.idnhanvien
inner join khachhang kh on kh.idkhachhang = hd.idkhachhang_hd
inner join hopdongchitiet hdct on hd.idhopdong = hdct.idhopdong_hdct
where not exists(
	select hd.idhopdong
    where hd.ngaylamhopdong between "2019-01-01" and  "2019-06-31")
    and exists(
    select hd.idhopdong
    where hd.ngaylamhopdong between "2019-09-01" and "2019-12-31");

-- Yêu cầu 13

select dvdk.iddichvudikem,dvdk.`tendichvudikem`, count(hdct.iddichvudikem_hdct) as 'số lần sử dụng '
from dichvudikem dvdk
inner join hopdongchitiet hdct on hdct.iddichvudikem_hdct = dvdk.iddichvudikem
group by hdct.iddichvudikem_hdct;

-- Yêu cầu 14

select dvdk.tendichvudikem,hd.idhopdong,ldv.`tenloaidichvu`,count(hdct.iddichvudikem_hdct)as solansudung
from hopdong hd
	left join hopdongchitiet hdct on hd.idhopdong = hdct.idhopdong_hdct
    left join dichvudikem dvdk  on hdct.iddichvudikem_hdct = dvdk.iddichvudikem
    inner join dichvu dv on dv.iddichvu = hd.iddichvu_hd
    inner join loaidichvu ldv on ldv.idloaidichvu = dv.idloaidichvu_dv
group by dvdk.`tendichvudikem` having solansudung =1;

-- Yêu cầu 15
select nv.idnhanvien,nv.`hoten`,td.trinhdo,bp.tenbophan,nv.sdt,nv.diachi, count(hd.idnhanvien_hd) as so_lan_lap_hd
from nhanvien nv
inner join bophan bp on bp.idbophan = nv.idbophan_nv
inner join trinhdo td on td.idtrinhdo = nv.idtrinhdo_nv
inner join hopdong hd on hd.idnhanvien_hd = nv.idnhanvien
where hd.ngaylamhopdong between "2018-01-01" and "2019-12-31"
group by nv.idnhanvien
having so_lan_lap_hd = 3
order by nv.idnhanvien;

-- Yêu cầu 16

delete from nhanvien
where not exists( select nhanvien.idnhanvien from hopdong hd
where hd.ngaylamhopdong between '2017-01-01' and '2019-12-31' and hd.idnhanvien_hd = nhanvien.idnhanvien
);
    
-- Yêu cầu 17
 update khachhang,
 (select hopdong.idkhachhang_hd as id, sum(hopdong.tongtien) as tong_tien
 from hopdong
 where year(hopdong.ngaylamhopdong)=2019
 group by hopdong.idkhachhang_hd
 having tong_tien>10000000)
 as temp set khachhang.idloaikhach_kh =(
 select loaikhach.idloaikhach
 from loaikhach
 where loaikhach.tenloaikhach = "diamond")
 where khachhang.idkhachhang = (
 select loaikhach.idloaikhach
 from loaikhach
 where loaikhach.tenloaikhach = "platinium")
 and temp.id=khachhang.idkhachhang;

-- Yêu cầu 18
delete hd, kh,hopdongchitiet
from khachhang kh
	left join hopdong hd on hd.idkhachhang_hd = kh.idkhachhang
	inner join hopdongchitiet on hopdongchitiet.idhopdong_hdct = hd.idhopdong
where not exists(
	select hd.idhopdong 
    where year(hd.ngaylamhopdong) > 2016 and kh.idkhachhang = hd.idkhachhang_hd
);

-- Yêu cầu 19

update dichvudikem inner join (select dichvudikem.`tendichvudikem` as ten_dich_vu_di_kem
from hopdongchitiet
inner join dichvudikem on hopdongchitiet.iddichvudikem_hdct = dichvudikem.iddichvudikem
inner join hopdong on hopdongchitiet.idhopdong_hdct = hopdong.idhopdong
where year(hopdong.ngaylamhopdong) = 2019
group by dichvudikem.`tendichvudikem`
having count(hopdongchitiet.iddichvudikem_hdct) >10) as temp set dichvudikem.gia = dichvudikem.gia*2
where dichvudikem.`tendichvudikem` = temp.ten_dich_vu_di_kem;

-- Yêu cầu 20

select kh.idkhachhang as id, kh.`hoten`,kh.email,kh.sdt,kh.ngaysinh,kh.diachi, "khachhang" as TypeTable
from khachhang kh
union all
select nv.idnhanvien as id,nv.`hoten`,nv.email,nv.sdt,nv.ngaysinh,nv.diachi, "nhanvien" as TypeTable
from nhanvien nv;


