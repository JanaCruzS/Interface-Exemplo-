import java.sql.SQLOutput;

public abstract class Animal {

    protected String nome;
    protected int idade;
    private boolean isVivo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isVivo() {
        return isVivo;
    }

    public Animal() {
        this.isVivo = true;
    }


    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.isVivo = true;
    }

    public void acordar() {
        if (this.isVivo) {
            System.out.println("O animal acordou!");
        }
//            throw new IllegalStateException("Esse animal esta morto");
//            // "Lançar o erro" caso queiram iniciar o codigo de
//            // coisa errada
        }


    public void dormir() {
        System.out.println("O animal dormiu");
    }

    public void morrer() {
        if (this.isVivo == true) {
            System.out.println("O animal morreu");
            this.isVivo = false;
        } else {
            throw new IllegalStateException("O animal está morto");
        }
    }
}

// ASSINATURA
// 1. tipo
// 2. parametros
// sobrecarga, metodos com mesmo nome e assinaturas diferentes.


//dentro do parenteses será o que o contrutor vai retornar, ou seja
// no contrutor abaixo, obrigatoriamente tera que ter
// (String) nome e (int) idade, como parametro.

//codigo deve ser claro!

// *****************************************************************

//SET -> Quando vc deseja ALTERAR o valor
//GET -> Quando vc deseja ACESSAR o valor

// GET você pode acessar e somente ler o atributo
// SET você pode acessar e alterar valor
