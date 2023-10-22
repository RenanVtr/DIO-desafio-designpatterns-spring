package renan.DIOdesafiodesignpatternsspring.model;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Entity
public class Cliente {
 

//Atributos
@Id
@GeneratedValue( strategy = GenerationType.AUTO)
private Long id;
private String nome;
@ManyToOne
private Endereco endereco;


//Getter & Setters
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
public Endereco getEndereco() {
    return endereco;
}
public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}

}