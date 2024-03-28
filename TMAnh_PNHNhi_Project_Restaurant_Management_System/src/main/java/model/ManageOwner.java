/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author maianhtran
 */
public class ManageOwner {

    private ArrayList<Owner> listOwner = new ArrayList<>();

    public ManageOwner() {

    }

    public ArrayList<Owner> getListOwner() {
        return listOwner;
    }

    public void setListOwner(ArrayList<Owner> listOwner) {
        this.listOwner = listOwner;
    }

    public void addOwner(Owner o) {
        listOwner.add(o);
    }

    public void deleteOwner(Owner o) {
        listOwner.remove(o);
    }

    public boolean searchUsername(String username) {
        for (Owner owner : listOwner) {
            if (owner.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public boolean searchPassword(String password) {
        for (Owner owner : listOwner) {
            if (owner.getPassword().equals(password)) {
                return false;
            }
        }
        return true;
    }
}
