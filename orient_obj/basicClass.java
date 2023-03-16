
package javaapplication1;

public class Funcionario {
    private String nome;
    private String registro;
    private String cargo;
    private double salario;
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setRegistro (String registro) {
        this.registro = registro;
    }
    
    public void setCargo (String cargo) {
        this.cargo = cargo;
    }
    
    public void setSalario (double salario){
        this.salario = salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getRegistro() {
        return this.registro;
    }
    
    public String getCargo() {
        return this.cargo;
    }
    
    public double getSalario() {
        return this.salario;
    }
}
