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

    public boolean verificaArrayListExistente(int id){
        boolean professorExistente = professorService.professorExistente(id);

        if (professorExistente){
            return true;
        }else{
            return false;
        }
    }

}
