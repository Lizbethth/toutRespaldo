package com.tout.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class patientsEntity {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String a_Paterno;
    private String a_Materno;
    private int edad;
    private String edocivil;
    private String fnacimiento;
    private String lnacimiento;
    private String ocupacion;
    private String direccion;
    private String ciudad;
    private String telefono;

    public patientsEntity() {
    }

    public patientsEntity(int id, String nombre, String a_Paterno, String a_Materno, int edad, String edocivil, String fnacimiento, String lnacimiento, String ocupacion, String direccion, String ciudad, String telefono) {
        super();
        this.id=id;
        this.nombre=nombre;
        this.a_Materno=a_Materno;
        this.a_Paterno=a_Paterno;
        this.edad=edad;
        this.edocivil=edocivil;
        this.fnacimiento=fnacimiento;
        this.lnacimiento=lnacimiento;
        this.ocupacion=ocupacion;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.telefono=telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getA_Paterno() {
        return a_Paterno;
    }

    public void setA_Paterno(String a_Paterno) {
        this.a_Paterno = a_Paterno;
    }

    public String getA_Materno() {
        return a_Materno;
    }

    public void setA_Materno(String a_Materno) {
        this.a_Materno = a_Materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEdocivil() {
        return edocivil;
    }

    public void setEdocivil(String edocivil) {
        this.edocivil = edocivil;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getLnacimiento() {
        return lnacimiento;
    }

    public void setLnacimiento(String lnacimiento) {
        this.lnacimiento = lnacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
