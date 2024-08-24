/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebri
 */
public class Veiculo {
       private int id;
    private String modelo;
    // Outros atributos (ano, marca, etc.)

    // Construtor
    public Veiculo(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        // Inicialize outros atributos aqui, se necessário
    }

    // Métodos get/set para id e modelo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}



