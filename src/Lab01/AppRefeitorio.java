package Lab01;

public class AppRefeitorio {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Tecnico tecnico = new Tecnico();

        aluno.setNome("Fernanda");
        aluno.setMatricula("2024med0012");
        aluno.setNivel("Superior");
        aluno.setCpf("444.555.666-77");

        professor.setNome("Renata");
        professor.setMatricula("2024prof004");
        professor.setCpf("555.666.777-88");
        professor.setSaldo(15.25);

        tecnico.setNome("Raissa");
        tecnico.setMatricula("2024tec005");
        tecnico.setCpf("457.498.758.45");
        tecnico.setSaldo(15.25);

        System.out.println("Estudante \n" + aluno + "\n");
        System.out.println("Professor(a) \n" + professor + "\n");
        System.out.println("Técnico(a) \n" + tecnico + "\n");

    }
}
