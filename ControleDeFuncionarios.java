package com.mycompany.controle.de.funcionarios;

import javax.swing.JOptionPane;

public class ControleDeFuncionarios {

    public static void main(String[] args) {
        Funcionario funcionario;
//        instancia um objeto da classe funcionario
        funcionario = new Funcionario();
//        cadastrando os dados
        funcionario.setNome(JOptionPane.showInputDialog(null, "Qual o nome do funcioánrio"));
        funcionario.setCargo(JOptionPane.showInputDialog(null, "Qual o cargo do funcioánrio"));
        funcionario.setMatricula(JOptionPane.showInputDialog(null, "Qual o numero da matricula do funcioánrio"));
        funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o salario do funcioánrio")));
//    exibição dos dados armazenados 
        JOptionPane.showMessageDialog(null, "nome : " + funcionario.getNome());
        JOptionPane.showMessageDialog(null, "cargo : " + funcionario.getCargo());
        JOptionPane.showMessageDialog(null, "matricula : " + funcionario.getMatricula());
        JOptionPane.showMessageDialog(null, "salario : " + funcionario.getSalario());
    
        funcionario.reajustarSalario();
    
        JOptionPane.showMessageDialog(null, "o salario reajustado sera : " + funcionario.getSalario());
        
    }
}
