import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao(("descriçao curso java"));
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao(("descriçao curso java"));
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        //instancia bootcamp e criar 2 devs

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao(("Descricao bootcamp java developer"));
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp((bootcamp));
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos() );


        devCamila.progredir();


        System.out.println("Conteúdos Concluidos" + devCamila.getConteudosInscritos() );
        System.out.println("Conteúdos Concluidos" + devCamila.getConteudosConcluidos() );
        System.out.println("XP:" + devCamila.calcularTotalXp() );


        System.out.println("----------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp((bootcamp));
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos() );



        devJoao.progredir();


        System.out.println("Conteúdos Concluidos" + devJoao.getConteudosInscritos() );
        System.out.println("Conteúdos Concluidos" + devJoao.getConteudosConcluidos() );
        System.out.println("XP:" + devJoao.calcularTotalXp() );

        devCamila.progredir();
        System.out.println("XP:" + devJoao.calcularTotalXp() );
    }
}
