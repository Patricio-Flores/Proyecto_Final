/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_final.Logica;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class Ingreso {
     private int id;
    private String tipoComprobante;
    private int serieComprovante;
    private int numeroComprobante;
    private Date fecha;
    private float inpuesto;
    private float total;
    
     public Ingreso() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public int getSerieComprovante() {
        return serieComprovante;
    }

    public void setSerieComprovante(int serieComprovante) {
        this.serieComprovante = serieComprovante;
    }

    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(int numeroComprovante) {
        this.numeroComprobante = numeroComprovante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getInpuesto() {
        return inpuesto;
    }

    public void setInpuesto(float inpuesto) {
        this.inpuesto = inpuesto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
     
     
    public boolean Eliminar(int id) {
        Conectar con = new Conectar();
        String sql = "update paises set estado = 0 where id= ?;";
        Boolean bandera = false;
        try {
            PreparedStatement st = con.Conectar().prepareStatement(sql);

            st.setInt(1, id);
            int filas = st.executeUpdate();
            if (filas > 0) {
                return true;

            }
        } catch (Exception e) {
            e.printStackTrace();
            bandera = false;
        } finally {

            return bandera;
        }
    }

    public boolean actualizar(Ingreso ingreso) {
        Conectar con = new Conectar();
        String sql = "update  paises set nombre=?, fechafundacion=? where id=? ;";
        Boolean bandera = false;
        try {
            PreparedStatement st = con.Conectar().prepareStatement(sql);
            st.setString(1, ingreso.getTipoComprobante());
            st.setInt(2, ingreso.getSerieComprovante());
            st.setInt(3, ingreso.getNumeroComprobante());
            st.setDate(4, ingreso.getFecha());
            st.setFloat(5, ingreso.getInpuesto());
            st.setFloat(5, ingreso.getTotal());
            st.setInt(3, id);
            int filas = st.executeUpdate();
            if (filas > 0) {
                return true;

            }
        } catch (Exception e) {
            e.printStackTrace();
            bandera = false;
        } finally {

            return bandera;
        }
    }

    public ArrayList<Ingreso> BuscarTodos() {
        Conectar con = new Conectar();
        String sql = "Select * from paises where estado =1 order by nombre;";
        try {
            Statement st = con.Conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            ArrayList<Ingreso> arrayList = new ArrayList<>();
            while (rs.next()) {
                Ingreso i = new Ingreso();
                i.setId(rs.getInt("id"));
                i.setTipoComprobante(rs.getString("tipocomprovante"));
                i.setSerieComprovante(rs.getInt("seriecomprovante"));
                i.setNumeroComprobante(rs.getInt("numerocomprovante"));
                i.setFecha(rs.getDate("fecha"));
                i.setInpuesto(rs.getFloat("impuesto"));
                i.setTotal(rs.getFloat("total"));
               
                arrayList.add(i);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Ingreso> BuscarPorNombre(String tipoComprobante) {
        Conectar con = new Conectar();
        String sql = "Select * from paises where estado = 1 and nombre like ('%"+nombre+"%') order by nombre;";
        try {
            Statement st = con.Conectar().createStatement();            
            ResultSet rs = st.executeQuery(sql);
            ArrayList<Ingreso> arrayList = new ArrayList<>();
            while (rs.next()) {
                 Ingreso i = new Ingreso();
                
               i.setId(rs.getInt("id"));
                i.setTipoComprobante(rs.getString("tipocomprovante"));
                i.setSerieComprovante(rs.getInt("seriecomprovante"));
                i.setNumeroComprobante(rs.getInt("numerocomprovante"));
                i.setFecha(rs.getDate("fecha"));
                i.setInpuesto(rs.getFloat("impuesto"));
                i.setTotal(rs.getFloat("total"));
               
                arrayList.add(i);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString(){
        return getTipoComprobante();
    }   
}
