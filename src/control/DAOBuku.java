/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Buku;

public class DAOBuku implements DAOService<Buku>{
    private List<Buku> dataBuku;

    public DAOBuku() {
        dataBuku = new ArrayList<>();
    }

    @Override
    public List<Buku> getAllData() {
        return dataBuku;
    }

    @Override
    public boolean insertData(Buku param) {
        
        if (!dataBuku.contains(param)) {
            dataBuku.add(param);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateData(Buku oldParam, Buku newParan) {
        if (!dataBuku.contains(newParan)) {
            dataBuku.set((dataBuku.indexOf(oldParam)), newParan);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteData(Buku param) {
        if (dataBuku.contains(param)) {
            dataBuku.remove(param);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Buku getData(int idx) {
        return dataBuku.get(idx);
    }

}
