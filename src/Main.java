
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso em java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO");
        curso2.setDescricao("Descrição do curso em java 2");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Aula de mentoria voltada para a linguagem java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição do bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("**");
        System.out.println("Conteudos Inscritos" + devRodrigo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devRodrigo.getConteudoConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());


        System.out.println("********************************");

        Dev devAna = new Dev();
        devAna.setNome("Ana Beatriz");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("**");
        System.out.println("Conteudos Inscritos" + devAna.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devAna.getConteudoConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());
    }
}
