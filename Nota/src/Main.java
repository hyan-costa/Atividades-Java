public class Main {
    public static void main(String[] args) {
        Nota emissaoNota = new Nota();
        emissaoNota.inicializar();
        System.out.println("Item: " + emissaoNota.item);
        System.out.println("QTDE: " + emissaoNota.qtdeItem);
        System.out.println("preco unitario: " + emissaoNota.preco);
        System.out.println("Valor total:" + emissaoNota.obterValorNota());
    }
}