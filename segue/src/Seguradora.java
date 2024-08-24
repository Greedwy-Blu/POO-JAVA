/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Gabriel Oliveira Alves da silva
 * @author autologon
 */

public class Seguradora {
  private Seguro seguros[] = new Seguro[10];
    private int count;

    public Seguradora(int count) {
        this.count = count;
    }

    
    public void inserir(Seguro seguro) {
        if (count < seguros.length) {
            seguros[count] = seguro;
            count++;
            System.out.println("Seguro inserido com sucesso.");
        } else {
            System.out.println("Não foi possível inserir o seguro. Array cheio.");
        }
    }

    public boolean remover(int numeroApolice) {
        for (int i = 0; i < count; i++) {
            if (seguros[i].getNumeroApolice() == numeroApolice) {
                seguros[i] = seguros[count - 1];
                seguros[count - 1] = null;
                count--;
                System.out.println("Seguro removido com sucesso.");
                return true;
            }
        }
        System.out.println("Seguro não encontrado.");
        return false;
    }

    public void mostraTodosOsSeguros() {
        for (int i = 0; i < count; i++) {
            System.out.println("Seguro " + (i + 1) + ": " + seguros[i]);
        }
    }

    public Seguro buscarPorNumeroApolice(int numeroApolice) {
        for (int i = 0; i < count; i++) {
            if (seguros[i].getNumeroApolice() == numeroApolice) {
                return seguros[i];
            }
        }
        System.out.println("Seguro não encontrado.");
        return null;
    }
}
}