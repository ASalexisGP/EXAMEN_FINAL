package com.onpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GeneralPresidencial {

@Id

private int Numerop1;
private String TotalP1;
private int NumeroP2;
private String TotalP2;
private int NumeroAsistentes;
private String TotalAsistentes;
private int NumeroAusentes;
private String TotalAusentes;
private int ElectoresHabiles;
public int getNumerop1() {
	return Numerop1;
}
public void setNumerop1(int numerop1) {
	Numerop1 = numerop1;
}
public String getTotalP1() {
	return TotalP1;
}
public void setTotalP1(String totalP1) {
	TotalP1 = totalP1;
}
public int getNumeroP2() {
	return NumeroP2;
}
public void setNumeroP2(int numeroP2) {
	NumeroP2 = numeroP2;
}
public String getTotalP2() {
	return TotalP2;
}
public void setTotalP2(String totalP2) {
	TotalP2 = totalP2;
}
public int getNumeroAsistentes() {
	return NumeroAsistentes;
}
public void setNumeroAsistentes(int numeroAsistentes) {
	NumeroAsistentes = numeroAsistentes;
}
public String getTotalAsistentes() {
	return TotalAsistentes;
}
public void setTotalAsistentes(String totalAsistentes) {
	TotalAsistentes = totalAsistentes;
}
public int getNumeroAusentes() {
	return NumeroAusentes;
}
public void setNumeroAusentes(int numeroAusentes) {
	NumeroAusentes = numeroAusentes;
}
public String getTotalAusentes() {
	return TotalAusentes;
}
public void setTotalAusentes(String totalAusentes) {
	TotalAusentes = totalAusentes;
}
public int getElectoresHabiles() {
	return ElectoresHabiles;
}
public void setElectoresHabiles(int electoresHabiles) {
	ElectoresHabiles = electoresHabiles;
}

}
