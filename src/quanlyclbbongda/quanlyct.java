/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyclbbongda;

/**
 *
 * @author Admin
 */
public class quanlyct {
    String Tên,Vị_trí;
    int Số_áo,Chiều_cao,Cân_nặng,Năm_sinh;

    public quanlyct() {
    }

    public quanlyct(String Tên, String Vị_trí, int Số_áo, int Chiều_cao, int Cân_nặng, int Năm_sinh) {
        this.Tên = Tên;
        this.Vị_trí = Vị_trí;
        this.Số_áo = Số_áo;
        this.Chiều_cao = Chiều_cao;
        this.Cân_nặng = Cân_nặng;
        this.Năm_sinh = Năm_sinh;
    }

    public String getTên() {
        return Tên;
    }

    public void setTên(String Tên) {
        this.Tên = Tên;
    }

    public String getVị_trí() {
        return Vị_trí;
    }

    public void setVị_trí(String Vị_trí) {
        this.Vị_trí = Vị_trí;
    }

    public int getSố_áo() {
        return Số_áo;
    }

    public void setSố_áo(int Số_áo) {
        this.Số_áo = Số_áo;
    }

    public int getChiều_cao() {
        return Chiều_cao;
    }

    public void setChiều_cao(int Chiều_cao) {
        this.Chiều_cao = Chiều_cao;
    }

    public int getCân_nặng() {
        return Cân_nặng;
    }

    public void setCân_nặng(int Cân_nặng) {
        this.Cân_nặng = Cân_nặng;
    }

    public int getNăm_sinh() {
        return Năm_sinh;
    }

    public void setNăm_sinh(int Năm_sinh) {
        this.Năm_sinh = Năm_sinh;
    }
    
}
