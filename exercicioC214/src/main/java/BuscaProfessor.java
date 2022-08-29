import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProfessor {

    ProfessorService professorService;

    public BuscaProfessor(ProfessorService service) {
        this.professorService = service;
    }

    public Professor buscaProfessor(String atendimento){

        String professorJson = professorService.busca(atendimento);

        JsonObject jsonObject = JsonParser.parseString(professorJson).getAsJsonObject();

        return new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString());
    }

    public boolean verificaProfessorNoturno(String atendimento){
        boolean professorNoturno = professorService.verificaProfessorNoturno(atendimento);

        if (professorNoturno){
            return true;
        }else{
            return false;
        }
    }

}
