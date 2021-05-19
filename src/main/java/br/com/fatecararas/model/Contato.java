package br.com.fatecararas.model;

public class Contato {
    private string nome, apelido, email, telefone, end, empresa, observacoes;

    public Contato(string nome, string apelido, string email, string telefone, string end, string empresa, string observacoes) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.telefone = telefone;
        this.end = end;
        this.empresa = empresa;
        this.observacoes = observacoes;
    }

    public Contato() {
    }

    public string getNome() {
        return nome;
    }

    public Contato setNome(string nome) {
        this.nome = nome;
        return this;
    }

    public string getApelido() {
        return apelido;
    }

    public Contato setApelido(string apelido) {
        this.apelido = apelido;
        return this;
    }

    public string getEmail() {
        return email;
    }

    public Contato setEmail(string email) {
        this.email = email;
        return this;
    }

    public string getTelefone() {
        return telefone;
    }

    public Contato setTelefone(string telefone) {
        this.telefone = telefone;
        return this;
    }

    public string getEnd() {
        return end;
    }

    public Contato setEnd(string end) {
        this.end = end;
        return this;
    }

    public string getEmpresa() {
        return empresa;
    }

    public Contato setEmpresa(string empresa) {
        this.empresa = empresa;
        return this;
    }

    public string getObservacoes() {
        return observacoes;
    }

    public Contato setObservacoes(string observacoes) {
        this.observacoes = observacoes;
        return this;
    }
}
