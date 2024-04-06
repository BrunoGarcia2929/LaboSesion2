package Entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Estudiante
 */
public class Enemigo extends Personaje{
    private int tipo;

    public Enemigo() {

    }
    
    public Enemigo(int vidas, int tipo,int nivel) {
        super(nivel,vidas);

        this.tipo = tipo;

    }
       

    /**
     * @return the nivel
     */
    public int getTipo() {
        return tipo;
    }


    public void setTipo(int tipo) {
        this.tipo = tipo;
    }



    
    
}
