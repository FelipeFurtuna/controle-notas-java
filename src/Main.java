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
            System.out.println("as notas vao de 0 a 10");
            System.out.println("notas erradas iram reiniciar o processo");
            System.out.println("--------------------------------------");
            System.out.println("Digite a primeira nota ser cadastrada!");
            nota1 = sc.nextDouble();

            //if da nota
            if (nota1 > 10 || nota1 < 0) {
                System.out.println("NOTA INVALIDA!");
                continue;

            }

            System.out.println("Digite a segunda nota a ser cadastrada!");
            nota2 = sc.nextDouble();

            if (nota2 > 10 || nota2 < 0) {
                System.out.println("NOTA INVALIDA!");
                continue;
            }
            System.out.println("Digite a terceira nota a ser cadastrada!");
            nota3 = sc.nextDouble();

            if (nota3 > 10 || nota3 < 0) {
                System.out.println("NOTA INVALIDA!");
                continue;
            } //fim do if da nota
            notasCadastradas = true;
            media = (nota1 + nota2 + nota3) / 3;//conta da media

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
                if (media >= 6.0) {
                    System.out.println("O aluno encontra se APROVADO");
                } else {
                    System.out.println("O aluno econtra se REPROVADO");
                }
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
}