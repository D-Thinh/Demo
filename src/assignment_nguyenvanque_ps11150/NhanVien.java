package assignment_nguyenvanque_ps11150;


import java.io.Serializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


/**
 *
 * @author GT70 DOMINATOR
 */
public class NhanVien implements Serializable {

    private String MaNV;
    private String TenNV;
    private int Tuoi;
    private String Email;
    private double Luong;
    private String anh;

    public NhanVien() {
    }
    public NhanVien(String MaNV, String TenNV, int Tuoi, String Email, double Luong) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.Tuoi = Tuoi;
        this.Email = Email;
        this.Luong = Luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getLuong() {
    
        return Luong;
    }

    public void setLuong(double Luong) {
       
        this.Luong = Luong;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + this.MaNV + ", TenNV=" + this.TenNV + ", Tuoi=" + this.Tuoi + ", Email=" + this.Email + ", Luong=" + this.Luong + '}';
    }
        
}
