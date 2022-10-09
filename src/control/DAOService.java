/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;


public interface DAOService<E> {
    List<E> getAllData(); //READ

    boolean insertData(E param); //CREATE

    boolean updateData(E oldParam, E newParan); //UPDATE

    public boolean deleteData(E param); //DELETE

    public E getData(int idx);
}
