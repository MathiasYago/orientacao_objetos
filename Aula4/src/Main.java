void main() {

    String palavraSecreta = "oficina";
    char[] painel = {'_', '_', '_', '_', '_', '_', '_'};
    int numeromaximo = 6;
    int erros = 0;
    IO.println(" oii vamos jogar o jogo da forca");

    while (erros < numeromaximo) {

        String.valueOf("Palavra:" + String.valueOf((painel)));
        IO.println("a palavra é:" + String.valueOf(painel));

        String letraDigitada = IO.readln("Digite uma letra: ");
        IO.println("voce digitou: " + letraDigitada);

        char letra = letraDigitada.charAt(0);
        boolean acertou = false;

        for (int i = 0; i < 7; i++) {
            if (palavraSecreta.charAt(i) == letra) {
                painel[i] = letra;
                acertou = true;
            }
        }

        if (String.valueOf(painel).equals(palavraSecreta)) {
            IO.println("Você acertou!!!! karaio");
            break;
        }

    }
}
