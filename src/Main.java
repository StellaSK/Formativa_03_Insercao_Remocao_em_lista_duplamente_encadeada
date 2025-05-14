public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirNoFim(10);
        lista.inserirNoInicio(5);
        lista.inserirNoFim(20);
        lista.exibirLista();

        lista.removerElemento(10);
        lista.exibirLista();

        lista.removerElemento(5);
        lista.exibirLista();

        lista.removerElemento(20);
        lista.exibirLista();
    }
}