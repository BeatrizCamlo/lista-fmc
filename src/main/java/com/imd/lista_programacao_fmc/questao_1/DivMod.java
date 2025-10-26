package com.imd.lista_programacao_fmc.questao_1;

public class DivMod {
    private double dividendo;
    private double divisor;
    private boolean isDivNegativo = false;

    public DivMod(double dividendo, double divisor){
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    
    public boolean isDivNegativo(){
        if (dividendo < 0 && divisor > 0 || dividendo > 0 && divisor < 0) {
            isDivNegativo = true;
        }else{
            isDivNegativo = false;
        }

        return isDivNegativo;
    }

    public int calcularParteInteira(){
        double quociente = dividendo / divisor;
        if(!isDivNegativo()){
            int i = 0;
            while (i <= quociente){
                i++;
            }
            return i - 1;
        }else{
            int i = 0;
            while (i >= quociente){
                i--;
            }
            return i;
        }
    }

    public int calcularTeto(){
        double quociente = dividendo / divisor;
        if (!isDivNegativo()){
            int piso = calcularParteInteira();
            return (quociente == piso) ? piso : piso + 1;
        } else {
            int piso = calcularParteInteira();
            return piso + 1;
        }
    }

    public int calcularPiso(){
        return calcularParteInteira();
    }    
    
    @Override
    public String toString(){
        return "Teto: " + calcularTeto() + "\nPiso: " + calcularPiso();
    }
}