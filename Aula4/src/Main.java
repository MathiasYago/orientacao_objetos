void main() {

    String palavraSecreta = "oficina";
    char[] painel = {'_', '_', '_', '_', '_', '_', '_'};
    int numeromaximo = 6;
    int erros = 0;

    IO.println("oii vamos jogar o jogo da forca (maximo 6 erros)");

    while (erros < numeromaximo) {


        IO.println("A palavra é: " + String.valueOf(painel));

        String letraDigitada = IO.readln("Digite uma letra: ");
        IO.println("Você digitou: " + letraDigitada);

        char letra = letraDigitada.charAt(0);
        boolean acertou = false;

        for (int i = 0; i < 7; i++) {
            if (palavraSecreta.charAt(i) == letra) {
                painel[i] = letra;
                acertou = true;
            }
        }

        if (!acertou) {
            IO.println("Letra incorreta!");
            erros++;
        } else {
            IO.println("Você acertou uma letra!");
        }

        if (String.valueOf(painel).equals(palavraSecreta)) {
            IO.println("A palavra certa é: " + palavraSecreta + ", parabéns!");
            break;
        }
    }if (erros >= numeromaximo){
        IO.println("game over");
        IO.println("A palavra certa é: " + palavraSecreta);
    }
}