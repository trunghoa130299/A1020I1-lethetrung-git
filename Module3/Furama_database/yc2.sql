select *
from nhanvien
where( `hoten` like 'T%' or 'H%' or 'K%') and char_length(`hoten`) <15