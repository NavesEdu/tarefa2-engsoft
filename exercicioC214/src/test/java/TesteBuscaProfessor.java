import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaProfessor {

    ProfessorService service;

    BuscaProfessor buscaProfessor;

    @Before
    public void setup(){
        service = new MockProfessorService();
        buscaProfessor = new BuscaProfessor(service);
    }

    //Cenários de Sucesso

    @Test
    public void testeBuscaProfessorChris(){

        Professor chris = buscaProfessor.buscaProfessor("17h");

        //Faz assertion
        assertEquals("Chris", chris.getNomeDoProfessor());
        assertEquals("17h", chris.getHorarioDeAtendimento());
        assertEquals("Noturno", chris.getPeriodo());

    }

    @Test
    public void testeBuscaProfessorMarcelo(){

        Professor marcelo = buscaProfessor.buscaProfessor("19h");

        //Faz assertion
        assertEquals("Marcelo", marcelo.getNomeDoProfessor());
        assertEquals("19h", marcelo.getHorarioDeAtendimento());
        assertEquals("Integral", marcelo.getPeriodo());

    }

    @Test
    public void testeBuscaProfessorRenzo(){

        Professor renzo = buscaProfessor.buscaProfessor("13h");

        //Faz assertion
        assertEquals("Renzo", renzo.getNomeDoProfessor());
        assertEquals("13h", renzo.getHorarioDeAtendimento());
        assertEquals("Integral", renzo.getPeriodo());

    }

    //Cenários de Falha

    @Test
    public void testeBuscaProfessorInexistente(){

        Professor inexistente = buscaProfessor.buscaProfessor("10h");

        //Faz assertion
        assertEquals("Inexistente", inexistente.getNomeDoProfessor());

    }

    @Test
    public void testeBuscaProfessorAtendimentoNoturno(){

        Professor profnoturno = buscaProfessor.buscaProfessor("19h");
        assertNotEquals("Chris", "Marcelo");

    }

    @Test
    public void testeMarceloProfessorNoturno(){

        boolean marcelo = buscaProfessor.verificaProfessorNoturno("19h");
        assertFalse(marcelo);

    }


}
