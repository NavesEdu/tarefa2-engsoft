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
    public boolean professorExistente(int id) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(id) || list.get(i).equals(id)){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }



}
