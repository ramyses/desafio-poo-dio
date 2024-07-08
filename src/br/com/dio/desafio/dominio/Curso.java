package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //atributos


    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + getTitulo() + '\'' +
                "descricao=" + getDescricao() + '\'' +
                "data=" + cargaHoraria +
                '}';
    }

}
