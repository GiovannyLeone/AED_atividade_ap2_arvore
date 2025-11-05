// A classe No e a classe ArvoreBinariaDeBusca (com a regra duplicata -> direita)
// permanecem as mesmas que foram fornecidas na resposta anterior.

public class Main {
    public static void main(String[] args) {
        // Sequência de Inserção: 2, 4, 0, 2, 4, 6, 4
        int[] sequenciaInsercao = {2, 4, 0, 2, 4, 6, 4};

        ArvoreBinariaDeBusca bst = new ArvoreBinariaDeBusca();

        // 1. Processo de Construção
        System.out.println("--- Processo de Construção da Árvore Binária de Busca (BST) ---");
        for (int valor : sequenciaInsercao) {
            bst.inserir(valor);
        }
        System.out.println("Inserção concluída.");
        System.out.println("\n");

        // 2. Características da Árvore Resultante
        System.out.println("--- Características da Árvore Resultante ---");

        // Raiz
        System.out.println("Raiz: " + bst.getRaiz().valor);

        // Folhas (Nós sem filhos)
        System.out.println("Folhas (Nós sem filhos): " + bst.folhas());

        // Altura da Árvore
        System.out.println("Altura da Árvore: " + bst.altura());

        // Percurso Em Ordem (Ordenado)
        bst.percursoEmOrdem();

        System.out.println("\n");

        // 3. Desenho da Estrutura da Árvore no Terminal (ASCII Art)
        System.out.println("--- Desenho da Estrutura Final da Árvore ---");
        System.out.println("       2 (Raiz)");
        System.out.println("      /      \\");
        System.out.println("    (0)      (4)");
        System.out.println("             / \\");
        System.out.println("           (2) (4)");
        System.out.println("                 \\");
        System.out.println("                  (6)");
        System.out.println("                 /  \\");
        System.out.println("               (4)   ()"); // NÓ (4) É FOLHA.
    }
}