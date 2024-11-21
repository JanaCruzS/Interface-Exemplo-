public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("Oracio", 1);
//        animal.acordar();
//        animal.dormir();
//
//        System.out.println("o nome do animal é: " + animal.getNome());
//        System.out.println("A idade do animal é " + animal.getIdade());


        // Por causa do contrutor obrigatoriamente dentro dos parenteses.
        // o codigo pede os parametros passados na classe "Animal"

        // animal.nome = "Oracio";
        // animal.idade = 1;
        //animal.isVivo= true;

        // JIT - JUST IN TIME- le- se o codigo linha por linha
        // e o que esta em statico "STATIC" é executado primeiro


        Ave ave = new Ave("Pitty", 1, 7);
        System.out.println(ave);
        ave.acordar();
        ave.isVivo();
        ave.voar();


        // libertarAnimal(ave);
        // LSP -> Liskov Substitution Principle
        Voador tucano = new Ave("Tucano", 2, 15);
        Animal passarinho = new Ave("Passarinho", 3, 15);

        libertarAnimal(tucano);
    }

    private static void libertarAnimal(Voador voador) {

        System.out.println("Libertando o animal...");
        voador.voar();

    }
}


