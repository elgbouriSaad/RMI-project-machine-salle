/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.io.Serializable;

public class Salle  implements Serializable{

    private int id;
    private String code;

    public Salle(String code) {
        this.code = code;
    }

    public Salle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Getter and setter for machines

    @Override
    public String toString() {
        return " code = " + code ;
    }
}

