public class Ave extends Animal implements Voador {
    private int tamanhoAsa;

    public int getTamanhoAsa() {
        return tamanhoAsa;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "tamanhoAsa=" + tamanhoAsa +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Ave (String nome, int idade, int tamanhoAsa) {
        super(nome, idade);
        this.tamanhoAsa = tamanhoAsa;
    }
    public void voar() {
        if (this.isVivo() == true) {
            System.out.println(getNome()+ " está voando! ");
    } else {
            throw new IllegalStateException("A ave " + getNome() + " está morta");
        }
    }


}

