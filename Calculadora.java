package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import View.formCalculadora;
/**
 *
 * @author nicholas
 */
public class Calculadora {
    
    private Character operador;
    private Float valor1;
    private Float valor2;
    private Double result;

    public void setResult(Double result) {
        this.result = result;
    }
    
    
    
    public double Resultado(){
        if(this.operador == "+".charAt(0)){      
            return this.valor1 + this.valor2;
        } else if (this.operador == "-".charAt(0)){
            return this.valor1 - this.valor2;
        } else if (this.operador == "*".charAt(0)){
            return this.valor1 * this.valor2;
        } else if (this.operador == "/".charAt(0)){
            return this.valor1 / this.valor2;
        } else if (this.operador == "cos".charAt(0)){
            return result = Math.cos(result);
        } else if (this.operador == "sen".charAt(0)){
            return result = Math.sin(result);
        } else if (this.operador == "tan".charAt(0)){
            return result = Math.tan(result);
        } else if (this.operador == "^".charAt(0)){
            return Math.pow(valor1, valor2);
        }
        
        return 0;
    }

    public void setOperador(Character operador) {
        this.operador = operador;
    }

    public void setValor1(Float valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(Float valor2) {
        this.valor2 = valor2;
    }

    public Double getResult() {
        return result;
    }
    
    
    
    
}