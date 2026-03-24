package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int idCurso;
    private String descricao;
    private int cargaHoraria;
    private String unidade;
    private List<Aluno> listaAlunos;
    private List<Disciplina> listaDisciplina;

    //metodo construtor padrao
    public Curso(){
        //Inicializar as listas de curso e disciplinas vazias
        listaAlunos = new ArrayList<>();
        listaDisciplina = new ArrayList<>();
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(List<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DADOS COMPLETO DO CURSO\n");
        sb.append("=-=-=-=-=-=-=-=-=-=-=-=\n");
        sb.append("Id.").append(idCurso).append("\n");
        sb.append("Descrição: " + descricao + "\n");
        sb.append("Carga Horaria: " + cargaHoraria + "\n");
        sb.append("LISTA DAS DISCIPLINAS DO CURSO \n");
        for(Disciplina disciplina : listaDisciplina){
            sb.append(disciplina).append("\n");
        }
        sb.append("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        sb.append("LISTA DE ALUNOS DESTE CURSO \n");
        for(Aluno aluno : listaAlunos){
            sb.append("Nome: ").append(aluno.getNome()).append("\n");
        }
        return sb.toString();
    }

    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }
    public void adicionarDisciplina(Disciplina disciplina){
        listaDisciplina.add(disciplina);
    }

}
