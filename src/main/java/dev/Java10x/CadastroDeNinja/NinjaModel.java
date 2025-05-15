package dev.Java10x.CadastroDeNinja;

import jakarta.persistence.*;

//Entity transforma uma classe em uma entidade do DB
//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id //O atributo logo abaixo vai ser o id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // estrategia de como vai ser passado o id
    //usei a estrategia pro id gerar automaticamente
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
