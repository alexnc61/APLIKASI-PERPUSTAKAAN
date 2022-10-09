/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Member;


 
public class DAOMember implements DAOService<Member>{
    private List<Member> dataMember;

    public DAOMember(List<Member> dataMember) {
        this.dataMember = dataMember;
    }

    public DAOMember() {
        dataMember = new ArrayList<>();
    }
    
    
    @Override
    public List<Member> getAllData() {
        return dataMember;
    }

    @Override
    public boolean insertData(Member param) {
        if (dataMember.contains(param)) {
            return false;
        } else {
            dataMember.add(param);
            return true;
        }
    }

    @Override
    public boolean updateData(Member oldParam, Member newParan) {
        if (!dataMember.contains(newParan)) {
            dataMember.set((dataMember.indexOf(oldParam)), newParan);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteData(Member param) {
        if (dataMember.contains(param)) {
            dataMember.remove(param);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Member getData(int idx) {
        return dataMember.get(idx);
    }

    

    
    
}
