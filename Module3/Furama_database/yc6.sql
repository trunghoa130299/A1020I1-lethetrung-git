select dv.iddichvu,dv.`tendichvu`,dv.dientich,dv.chiphithue,ldv.tenloaidichvu
from dichvu dv
	inner join loaidichvu ldv on dv.idloaidichvu_dv = ldv.idloaidichvu
    inner join hopdong hd on hd.iddichvu_hd = dv.iddichvu
where (year(hd.ngaylamhopdong) <= 2018 or year(hd.ngaylamhopdong)= 2019)and month(hd.ngaylamhopdong)>3 or year(hd.ngaylamhopdong)>2019;