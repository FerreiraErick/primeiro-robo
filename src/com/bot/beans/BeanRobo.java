package com.bot.beans;

public class BeanRobo {

    private String nome;
    private Double bateria;
    private Double distancia;
    private Double angulo;
    private Balistica balistica;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getBateria() {
        return bateria;
    }
    public void setBateria(Double bateria) {
        this.bateria = bateria;
    }
    public Double getDistancia() {
        return distancia;
    }
    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
    public Double getAngulo() {
        return angulo;
    }
    public void setAngulo(Double angulo) {
        this.angulo = angulo;
    }
    public Balistica getBalistica() {
	return balistica;
    }
    public void setBalistica(Balistica balistica) {
	this.balistica = balistica;
    }

}
