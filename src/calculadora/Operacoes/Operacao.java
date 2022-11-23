/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.Operacoes;

/**
 *
 * @author Matheus
 */
public class Operacao implements iCalculadora {
    
    
    public String resultado;
    
    
    public Operacao() {}
    
    @Override
    public String somar(double a, double b) {
        return resultado = String.valueOf(a + b);
    }

    @Override
    public String subtrair(double a, double b) {
        return resultado = String.valueOf(a - b);
    }

    @Override
    public String dividir(double a, double b) {
        return resultado = String.valueOf(a / b);
    }

    @Override
    public String multiplicar(double a, double b) {
        return resultado = String.valueOf(a * b);
    }

    @Override
    public String exibir() {
        return resultado;
    }
    
}
