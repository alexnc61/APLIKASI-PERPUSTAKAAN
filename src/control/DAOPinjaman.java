/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Member;
import model.Pinjaman;


public class DAOPinjaman implements DAOService<Pinjaman>{
    private List<Pinjaman> dataPinjaman;

    public DAOPinjaman(List<Pinjaman> dataPinjamans) {
        this.dataPinjaman = dataPinjaman;
    }

    public DAOPinjaman() {
        dataPinjaman = new ArrayList<>();
    }
    @Override
    public List<Pinjaman> getAllData() {
        return  dataPinjaman;
    }

    @Override
    public boolean insertData(Pinjaman param) {
        if (dataPinjaman.contains(param)) {
            return false;
        } else {
            dataPinjaman.add(param);
            return true;
        }
    }

    @Override
    public boolean updateData(Pinjaman oldParam, Pinjaman newParan) {
        if (!dataPinjaman.contains(newParan)) {
            dataPinjaman.set((dataPinjaman.indexOf(oldParam)), newParan);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteData(Pinjaman param) {
        if (dataPinjaman.contains(param)) {
            dataPinjaman.remove(param);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Pinjaman getData(int idx) {
        return dataPinjaman.get(idx);
    }
    
}
