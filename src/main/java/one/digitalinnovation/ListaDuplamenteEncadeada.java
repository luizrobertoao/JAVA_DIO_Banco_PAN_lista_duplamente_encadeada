package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;


    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = tamanhoLista;
    }

    public int size(){
        return tamanhoLista;
    }
}
