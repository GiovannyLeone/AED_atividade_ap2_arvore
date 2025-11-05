/**
 * Implementa a lógica da Árvore Binária de Busca (BST).
 * (Classe No permanece inalterada)
 */
class ArvoreBinariaDeBusca {
    private No raiz;

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }

    // --- Métodos de Inserção (COM MUDANÇA AQUI) ---

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        // Aplica as regras:
        if (valor < atual.valor) {
            // Se menor, vá para a esquerda.
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else {
            // Se MAIOR ou IGUAL, vá para a direita (permite duplicatas).
            atual.direita = inserirRecursivo(atual.direita, valor);
        }

        return atual;
    }

    // --- Métodos de Percurso, Altura, Folhas (Permanece inalterado) ---

    public void percursoEmOrdem() {
        System.out.print("Percurso Em Ordem (Ordenado): ");
        percursoEmOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void percursoEmOrdemRecursivo(No no) {
        if (no != null) {
            percursoEmOrdemRecursivo(no.esquerda);
            System.out.print(no.valor + " ");
            percursoEmOrdemRecursivo(no.direita);
        }
    }

    public No getRaiz() {
        return raiz;
    }

    public int altura() {
        return alturaRecursiva(this.raiz);
    }

    private int alturaRecursiva(No no) {
        if (no == null) {
            return -1;
        }
        int alturaEsquerda = alturaRecursiva(no.esquerda);
        int alturaDireita = alturaRecursiva(no.direita);

        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    public String folhas() {
        StringBuilder folhas = new StringBuilder();
        coletarFolhasRecursivo(this.raiz, folhas);
        if (folhas.length() > 0) {
            folhas.setLength(folhas.length() - 2);
        }
        return folhas.toString();
    }

    private void coletarFolhasRecursivo(No no, StringBuilder folhas) {
        if (no == null) {
            return;
        }
        if (no.esquerda == null && no.direita == null) {
            folhas.append(no.valor).append(", ");
        }
        coletarFolhasRecursivo(no.esquerda, folhas);
        coletarFolhasRecursivo(no.direita, folhas);
    }
}