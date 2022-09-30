package com.mycompany.controle.de.funcionarios;

public class Funcionario { 
//    artibutos
    private String nome;
    private String cargo;
    private String matricula;
    private double salario;
//    contrutor

    public Funcionario() {
    }

//    setter
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
//    getter

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }  

    public void reajustarSalario(){
        if (this.cargo.equalsIgnoreCase("gerente")){        //reajuste de 10% no salario
            this.salario = this.salario * 1.1;
        }else if (this.cargo.equalsIgnoreCase("vendedor")){ //reajuste de 5% no salario
            this.salario = this.salario * 1.05;
        }else {                                             //reajuste de 1% no salario
            this.salario = this.salario * 1.01;
        }
    }
    
}
