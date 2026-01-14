package org.example.yourchoiceshop.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity @Table(name = "phuong_thuc_thanh_toan") @Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhuongThucThanhToan extends PrimaryEntity {
    @Column(name = "ma_phuong_thuc") private String maPhuongThuc;
    @Column(name = "ten_phuong_thuc") private String tenPhuongThuc;
    private String ghiChu;
    private Integer trangThai;
}