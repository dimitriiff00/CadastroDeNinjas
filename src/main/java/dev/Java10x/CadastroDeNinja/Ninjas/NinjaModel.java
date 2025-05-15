package dev.Java10x.CadastroDeNinja.Ninjas;

import dev.Java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;

//Entity transforma uma classe em uma entidade do DB
//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id //O atributo logo abaixo vai ser o id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // estrategia de como vai ser passado o id
    //usei a strategy pro id gerar automaticamente
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key
    private MissoesModel missoes;


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
