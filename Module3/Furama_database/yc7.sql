select dv.iddichvu,dv.tendichvu,dv.dientich,dv.songuoitoida,dv.chiphithue,ldv.tenloaidichvu
from dichvu dv
	left join loaidichvu ldv on dv.idloaidichvu_dv = ldv.idloaidichvu
    inner join hopdong hd on dv.iddichvu = hd.iddichvu_hd
where year(ngaylamhopdong) = 2018;