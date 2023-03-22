import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog("Digite as opções abaixo \n 1.Pizza \n 2.Hamburguer \n 3.Sair");
        if(opcao.equals("1")){
            String nome = JOptionPane.showInputDialog("Informe o nome da pizza:");
            Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza");
            String bordaDigitada = JOptionPane.showInputDialog("Você deseja borda? S - Sim \n N - Nao" );
        boolean bordaParaCalculo;
        if(bordaDigitada.equals("S")){
            bordaParaCalculo = true;
        }
        else {
            bordaParaCalculo = false;
        }
        Pizza p = new Pizza();
        p.nome = nome;
        p.valor = valor;
        Double valorTotal = p.CalcularValor(bordaParaCalculo);

        JOptionPane.showInputDialog(null,"pedido"+valorTotal,"pedido",JOptionPane.INFORMATION_MESSAGE);
        }
        if(opcao.equals("2")){
            String nome = JOptionPane.showInputDialog("Informe o nome da Hamburguer:");
            Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Hamburguer");
            String artesanal = JOptionPane.showInputDialog("Você deseja hamburguer artesanal? S - Sim \n N - Nao" );
            boolean artesanalCalculo;
            if(artesanal.equals("S")){
                artesanalCalculo = true;
            }
            else {
                artesanalCalculo = false;
            }
            Hamburguer H = new Hamburguer();
            H.nome = nome;
            H.valor = valor;
            Double valorTotal = H.CalcularValor(artesanalCalculo);

            JOptionPane.showInputDialog(null,"pedido"+valorTotal,"pedido",JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
