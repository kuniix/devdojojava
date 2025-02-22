package devdojo.serializacao.domain;

import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 3308142702218275007L;
    private Long id;
    private String nome;
    private transient String password;

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
