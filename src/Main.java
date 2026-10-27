void main(){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    MostrarMenu();

} public static void MostrarMenu(){
    System.out.println("========== CONTROLE DE NOTAS ==========");
    System.out.println("1 - Cadastrar notas");
    System.out.println("2 - Consultar média");
    System.out.println("3 - Consultar situação do aluno");
    System.out.println("0 - Sair");
}