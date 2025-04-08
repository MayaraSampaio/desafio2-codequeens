import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner  sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();
        aluno.setNome(nome);

        System.out.println("Digite a idade do aluno:");
        Integer idade = sc.nextInt();
        aluno.setIdade(idade);

        System.out.println("Digite a primeira nota:");
        Double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        Double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        Double nota3 = sc.nextDouble();

        Double media = aluno.calcularMedia(nota1, nota2, nota3);
        aluno.setMedia(media);

        if (media >= 7) {
            System.out.println(
                    "Aluno " + aluno.getNome() + "\n" +
                    "Idade: " + aluno.getIdade() + "\n" +
                    "notas: " + nota1 + ", " + nota2 + ", " + nota3 + "\n" +
                    "média " + String.format("%.2f", aluno.getMedia() ) +   "\n" +
                    "Situação: Aprovado 🎉");

        } else {
            System.out.println(
                    "Aluno " + aluno.getNome() + "\n" +
                            "Idade: " + aluno.getIdade() + "\n" +
                            "notas: " + nota1 + ", " + nota2 + ", " + nota3 + "\n" +
                            "média " + String.format("%.2f", aluno.getMedia() ) +   "\n" +
                            "Situação: Reprovado \uD83D\uDE22");


        }
    }
}