/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaaplicaciones;

/**
 *
 * @author andresbaezrincon
 */
public class CalculoResistencia{
    public double calculoValorResistencia(double banda1,double banda2, double multiplicador){
        double valor;
        valor = (banda1*10+banda2)*multiplicador;
        return valor;
    }
    public double calculoTolerancia(double color){
        double tolerancia=0;
        if(color == 1){
            tolerancia = 5;
        }
        if(color == 2){
            tolerancia = 10;
        }
        if(color == 3){
            tolerancia = 1;
        }
        if(color == 4){
            tolerancia = 2;
        }
        if(color == 5){
            tolerancia = 0.05;
        }
        if(color == 6){
            tolerancia = 0.02;
        }
        if(color == 7){
            tolerancia = 0.5;
        }
        if(color == 8){
            tolerancia = 0.25;
        }
        if(color == 9){
            tolerancia = 0.1;
        }
        if(color == 10){
            tolerancia = 0.01;
        }
            return tolerancia;
    }

    public CalculoResistencia() {
    }
    
}
