public class ListaDuplamenteEncadeada {

    public No inicio;
    public No fim;

    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);

        if (inicio == null) {
            inicio = fim = novoNo;
        }
        else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void inserirNoFim(int valor) {
        No novoNo = new No(valor);

        if (fim == null) {
            inicio = fim = novoNo;
        }
        else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void removerElemento(int valor) {
        if (inicio == null) {
            System.out.println("Erro: Lista vazia");
            return;
        }

        No atual = inicio;

        while (atual != null) {
            if (atual.dado == valor) {
                if (inicio == fim) {
                    inicio = fim = null;
                }
                else if (atual == inicio) {
                    inicio = inicio.proximo;
                    inicio.anterior = null;
                }
                else if (atual == fim) {
                    fim = fim.anterior;
                    fim.proximo = null;
                }
                else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Erro: Elemento não encontrado");
    }

    public void exibirLista() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        System.out.print("Frente: ");
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ⇄ ");
            atual = atual.proximo;
        }

        System.out.println("null");

        System.out.print("Trás  : ");
        atual = fim;
        while (atual != null) {
            System.out.print(atual.dado + " ⇄ ");
            atual = atual.anterior;
        }

        System.out.println("null\n");
    }
}
