void main(){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double nota1 = 0;
    double nota2 = 0;
    double nota3 = 0;
    double media = 0;
    int escolha = 1;
    do {
        MostrarMenu();
       escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a primeira nota ser cadastrada!");
            nota1 = sc.nextDouble();
            System.out.println("Digite a segunda nota a ser cadastrada!");
            nota2 = sc.nextDouble();
            System.out.println("Digite a terceira nota a ser cadastrada!");
            nota3 = sc.nextDouble();
        } else if (escolha == 2) {
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A media desse aluno é de: " + media);

        }
    }while (escolha != 0);

} public static void MostrarMenu(){
    System.out.println("===== CONTROLE DE NOTAS =====");
    System.out.println("1 - Cadastrar notas");
    System.out.println("2 - Consultar média");
    System.out.println("3 - Consultar situação do aluno");
    System.out.println("0 - Sair");
    System.out.println("---------------------");
    System.out.println("Bem vindo professor");
    System.out.println("Escolha uma opcao: ");
}