public class Boolean {

  public static void main(String[] args) {

    boolean fimDeSemana = false;
    boolean fazendoSol = false;
    boolean vamosAPraia = fimDeSemana && fazendoSol;

    System.out.println(vamosAPraia);

    String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
    System.out.println(mensagem);

  }

}
