/**
 * Representa um nó individual na Árvore Binária de Busca (BST).
 */
class No {
    int valor;
    No esquerda;
    No direita;

    /**
     * Construtor para criar um novo nó.
     * @param valor O dado a ser armazenado no nó.
     */
    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}