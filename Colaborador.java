package com.projetojpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "colaborador")
public class Colaborador {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name = "ctps") 
private String ctps;
@Column(name = "tituloEleitor")
private String tituloEleitor;
@Column(name = "estadoCivil")
private String estadoCivil;
@Column(name = "numDependentes")
private int numDependentes;
@Column(name = "setor")
private String setor;
@Column(name = "cargo")
private String cargo;
@Column(name = "salario")
private double salario;
@Column(name = "telefone")
private String telefone;
@Column(name = "email")
private String email;

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getCtps() {
return ctps;
}

public void setCtps(String ctps) {
this.ctps = ctps;
}

public String getTituloEleitor() {
return tituloEleitor;
}

public void setTituloEleitor(String tituloEleitor) {
this.tituloEleitor = tituloEleitor;
}

public String getEstadoCivil() {
return estadoCivil;
}

public void setEstadoCivil(String estadoCivil) {
this.estadoCivil = estadoCivil;
}

public int getNumDependentes() {
return numDependentes;
}

public void setNumDependentes(int numDependentes) {
this.numDependentes = numDependentes;
}

public String getSetor() {
return setor;
}

public void setSetor(String setor) {
this.setor = setor;
}

public String getCargo() {
return cargo;
}

public void setCargo(String cargo) {
this.cargo = cargo;
}

public double getSalario() {
return salario;
}

public void setSalario(double salario) {
this.salario = salario;
}

public String getTelefone() {
return telefone;
}

public void setTelefone(String telefone) {
this.telefone = telefone;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}
}
