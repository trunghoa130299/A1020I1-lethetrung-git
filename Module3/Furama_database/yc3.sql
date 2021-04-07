select *,
year(ngaysinh),(year(now()) - year(ngaysinh)) as tuoi
from khachhang
where (diachi = 'Đà Nẵng' or diachi='Quảng Trị') having tuoi between 18 and 50