package com.example.demo.entidades;

import javax.persistence.*;

@Entity
@Table(name ="apicultores")
public class Apicultor {

    public Apicultor(){

    }

    public Apicultor(String id_apicultores, String nombre, Integer numero_apiarios, Integer numero_empleados, String correoElectronico) {
        this.idApicultores = id_apicultores;
        this.nombre = nombre;
        this.numeroApiarios = numero_apiarios;
        this.numeroEmpleados = numero_empleados;
        this.correoElectronico = correoElectronico;
    }

    @Id
    @Column(name = "id_apicultores")
    private String idApicultores;

    @Basic
    private String nombre;

    @Basic
    @Column(name = "numero_apiarios")
    private Integer numeroApiarios;

    @Basic
    @Column(name = "numero_empleados")
    private Integer numeroEmpleados;

    @Basic
    @Column(name = "correo_electronico")
    private String correoElectronico;


    public String getId_apicultor() {
        return idApicultores;
    }

    public void setId_apicultor(String id_apicultor) {
        this.idApicultores = id_apicultor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero_apiarios() {
        return numeroApiarios;
    }

    public void setNumero_apiarios(Integer numero_apiarios) {
        this.numeroApiarios = numero_apiarios;
    }

    public Integer getNumero_empleados() {
        return numeroEmpleados;
    }

    public void setNumero_empleados(Integer numero_empleados) {
        this.numeroEmpleados = numero_empleados;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
