
import javax.swing.JOptionPane;

public class Principal {

    /**
     * Verifica se uma palavra é palindromo.
     *
     * @param palavra Palavra a ser verifica.
     * @return Retorna verdadeiro ou falso se a palavra é palindromo.
     */
    public static boolean ePalindromo(String palavra) {
        //Adiciona um terminador na palavra
        palavra = palavra + "$";

        //Descubro a quantidade de letras na palavra percorrento até o terminador
        int tamanho = 0;
        while (palavra.charAt(tamanho) != '$') {
            tamanho = tamanho + 1;
        }
        //Referência ao fim da palavra
        int fim = tamanho - 1;
        //Meio da palavra
        int meio = tamanho / 2;
        //Referência ao início da palavra
        int inicio = 0;
        //Percorre do início até o meio da palavra e verifica se as letras são iguais.
        while ((inicio < meio) && (palavra.charAt(inicio) == palavra.charAt(fim))) {
            //Incrementa o inicio
            inicio = inicio + 1;
            //Decrementa o fim
            fim = fim - 1;
        }
        //Se início é igual ao meio, todas as comparações são verdadeiras.
        //Pode ser usado tanto o inicio como o fim.
        if (inicio == meio) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //Entrada        
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para verificar se é palindromo:");

        //Processamento
        if (ePalindromo(palavra)) {
            //Saida
            JOptionPane.showMessageDialog(null, "A palavra " + palavra + " é palindromo!");
        } else {
            //Saida
            JOptionPane.showMessageDialog(null, "A palavra " + palavra + " não é palindromo!");
        }
    }
}
