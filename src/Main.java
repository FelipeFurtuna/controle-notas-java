void main() {


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);


    double nota1 = 0;
    double nota2 = 0;
    double nota3 = 0;
    double media = 0;
    int escolha = 1;
    boolean notasCadastradas = false;

    do {

        MostrarMenu();
        escolha = sc.nextInt();


        //if da escolha
        if (escolha == 1) {
            notasCadastradas = false;
            EscolhaDoMenuUm();
            nota1 = LerNotas(sc, "Digite a primeira nota: ");

            //if da nota
            if (nota1 > 10 || nota1 < 0) {
                System.out.println("NOTA INVALIDA!");
                continue;

            }

            nota2 = LerNotas(sc, "Digite a segunda nota: ");

            if (nota2 > 10 || nota2 < 0) {
                System.out.println("NOTA INVALIDA!");
                continue;
            }
            nota3 = LerNotas(sc, "digite a terceira nota: ");

            if (nota3 > 10 || nota3 < 0) {
                System.out.println("NOTA INVALIDA!");
                continue;
            } //fim do if da nota
            notasCadastradas = true;
            media = CalcularMedia(nota1, nota2, nota3);//conta da media

            //continuidade do if da escolha
        } else if (escolha == 2) {
            //if pra verificar se foi cadastrado alguma nota
            if (notasCadastradas == false){
                System.out.println("nenhuma nota cadastrada");
            } else {
                System.out.println("A media desse aluno é de: " + media);
            }
        } else if (escolha == 3) {
            if (notasCadastradas == false){
                System.out.println("nenhuma nota cadastrada");
            } else {
                AprovadoOuReprovado(media);
            }
        } else if (escolha == 0) {
            System.out.println("Finalizando....");
            System.out.println("obrigado por utilizar");
        } else {
            System.out.println("OPCAO INVALIDA");
        }
    } while (escolha != 0);

}

public static void MostrarMenu() {
    System.out.println("===== CONTROLE DE NOTAS =====");
    System.out.println("1 - Cadastrar notas");
    System.out.println("2 - Consultar média");
    System.out.println("3 - Consultar situação do aluno");
    System.out.println("0 - Sair");
    System.out.println("---------------------");
    System.out.println("Bem vindo professor");
    System.out.println("Escolha uma opcao: ");
} public static void EscolhaDoMenuUm(){
    System.out.println("as notas vao de 0 a 10");
    System.out.println("notas erradas iram reiniciar o processo");
    System.out.println("--------------------------------------");
} public static void AprovadoOuReprovado (double media){
    if (media >= 6.0) {
        System.out.println("O aluno encontra se APROVADO");
    } else {
        System.out.println("O aluno econtra se REPROVADO");
    }
} public static double LerNotas (Scanner sc, String texto){
    System.out.println(texto);
    double notalida = sc.nextDouble();
    return notalida;
} public static double CalcularMedia (double nota1, double nota2, double nota3){
    double media = (nota1 + nota2 + nota3) / 3;
    return media;
}