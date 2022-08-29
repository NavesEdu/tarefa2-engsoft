import java.util.ArrayList;

public class MockProfessorService implements ProfessorService{


    @Override
    public String busca(String atendimento) {
        if (atendimento == "17h"){
            return ProfessorConst.CHRIS;
        }else if (atendimento == "19h"){
            return ProfessorConst.MARCELO;
        }else if(atendimento == "13h"){
            return ProfessorConst.RENZO;
        }else {
            return ProfessorConst.INEXISTENTE;
        }
    }

    @Override
    public boolean verificaProfessorNoturno(String atendimento) {

        if(ProfessorConst.MARCELO.contains("13h")){
            return true;
        }else
            return false;
    }


}
