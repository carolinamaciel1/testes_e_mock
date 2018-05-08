package Classes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class Principal {

    public static void main (String args[]) {
        // Criar um Cliente
        Cliente C1 = new Cliente("Jose Maria");
        // Criar tres obejtos de Produto
        Produto p1 = new Produto("Farinha", "KG", 1.00f);
        Produto p2 = new Produto("Feijão", "KG", 5.00f);
        Produto p3 = new Produto("Macarrao", "PC", 3.50f);
        // Cria uma Nota Fiscal

        NotaFiscal nf1 = new NotaFiscal();
        // Assosciar a Nota ao Cliente
        nf1.setCliente(C1);

        // Armazena a data atual (pega a data do sistema)
        nf1.setDataEmissao(java.util.Calendar.getInstance());

        // Armazena o numero da Nota Fiscal
        nf1.setNumero(123);

        // cria três items de nota fiscal
        // Item 1 sequnecial=1, 10 KG de Farinha
        ItemNotaFiscal itnf1 = new ItemNotaFiscal(1,10,p1);
        // Item 2 sequnecial=2, 5 KG de Feijão
        ItemNotaFiscal itnf2 = new ItemNotaFiscal(2,5,p2);
        // Item 3 sequnecial=2, 6 pacotes de Macarrão
        ItemNotaFiscal itnf3 = new ItemNotaFiscal(3,6,p3);

        // Inserir os items na Nota Fiscal
        nf1.inserirItemNotaFiscal(itnf1);
        nf1.inserirItemNotaFiscal(itnf2);
        nf1.inserirItemNotaFiscal(itnf3);
        
        
        //
        System.out.println("O valor da Nota Fiscal= " + nf1.calcularValorNota());


        

    }

}


