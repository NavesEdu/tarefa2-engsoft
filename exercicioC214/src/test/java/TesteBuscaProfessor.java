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

    @Test
    public void testeBuscaProfessorChris(){

        //Fiz a busca
        Professor chris = buscaProfessor.buscaProfessor(10);

        //Faz assertion
        assertEquals("Chris", chris.getNomeDoProfessor());
        assertEquals("17h", chris.getHorarioDeAtendimento());
        assertEquals("Noturno", chris.getPeriodo());

    }

    @Test
    public void testeBuscaProfessorMarcelo(){

        //Fiz a busca
        Professor marcelo = buscaProfessor.buscaProfessor(20);

        //Faz assertion
        assertEquals("Marcelo", marcelo.getNomeDoProfessor());
        assertEquals("19h", marcelo.getHorarioDeAtendimento());
        assertEquals("Integral", marcelo.getPeriodo());

    }

}
