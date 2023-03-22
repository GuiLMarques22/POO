public class Hamburguer {
    public  String nome;
    public Double valor;
    public Boolean artesanal;

    public Double CalcularValor(Boolean artesanal) {
        if (artesanal) {
            return valor + 8.00;

        }
        return valor;
    }
        public String ConsultarNome(){
            return nome;
        }

}
