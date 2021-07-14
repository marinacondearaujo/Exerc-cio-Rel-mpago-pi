package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarEscolaridadeProfessor() {
        Professor professor = new Professor("Marco Antônio");
        Escolaridade escolaridadeProfessor = new Escolaridade("Doutorado");
        professor.setEscolaridade(escolaridadeProfessor);

        assertEquals("Doutorado", professor.getEscolaridadeProfessor());
    }

    @Test
    void deveRetornarCidadeNascimentoProfessor() {
        Professor professor = new Professor("Marco Antônio");
        Cidade cidade = new Cidade("Rio de Janeiro");
        professor.setNaturalidade(cidade);

        assertEquals("Rio de Janeiro", professor.getCidadeNascimentoProfessor());
    }

    @Test
    void getTipoEnsinoContratadoParaLecionar1() {
        Professor professor = new Professor("Marco Antônio");
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Fundamental");
        curso.setTipoEnsino(tipoEnsino);
        professor.setContratacao(curso);

        assertEquals("Ensino Fundamental", professor.getTipoEnsinoContratadoParaLecionar());
    }

    @Test
    void getTipoEnsinoContratadoParaLecionar2() {
        Professor professor = new Professor("Marco Antônio");
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Médio");
        curso.setTipoEnsino(tipoEnsino);
        professor.setContratacao(curso);

        assertEquals("Ensino Médio", professor.getTipoEnsinoContratadoParaLecionar());
    }

    @Test
    void getTipoEnsinoContratadoParaLecionar3() {
        Professor professor = new Professor("Marco Antônio");
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Superior");
        curso.setTipoEnsino(tipoEnsino);
        professor.setContratacao(curso);

        assertEquals("Ensino Superior", professor.getTipoEnsinoContratadoParaLecionar());
    }

    @Test
    void deveRetornarDiretorProfessor() {
        Professor professor = new Professor("Marco Antônio");
        Professor professorDiretor = new Professor("Marco Pereira");
        professorDiretor.setNome("Marco Araujo");
        Curso curso = new Curso();
        Escola escola = new Escola();
        escola.setDirecao(professorDiretor);
        curso.setEscola(escola);
        professor.setContratacao(curso);

        assertEquals("Marco Araujo", professor.getDiretorProfessor());

    }

    @Test
    void deveRetornarCoordenadorProfessor() {
        Professor professor = new Professor("Marco Antônio");
        Professor professorCoordenador = new Professor("Marina Conde");
        professorCoordenador.setNome("Marina Araujo");
        Curso curso = new Curso();
        curso.setCoordenacao(professorCoordenador);
        professor.setContratacao(curso);

        assertEquals("Marina Araujo", professor.getCoordenadorProfessor());
    }
}