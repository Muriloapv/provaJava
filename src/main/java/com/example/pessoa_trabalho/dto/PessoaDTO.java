package com.example.pessoa_trabalho.dto;

public class PessoaDTO {
    private Long id;
    private String nome;
    private int cpf;
    private String cargo;
    private Double salario;

    public PessoaDTO(Long id, String nome, int cpf, String cargo, Double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getcpf() {
        return cpf;
    }

    public void setcpf(int cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}