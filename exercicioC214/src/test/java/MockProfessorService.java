public class MockProfessorService implements ProfessorService{


    @Override
    public String busca(int id) {
        if (id == 10){
            return ProfessorConst.CHRIS;
        }else if (id == 20){
            return ProfessorConst.MARCELO;
        }else if(id < 0){
            return ProfessorConst.RENZO;
        }else{
            return ProfessorConst.INEXISTENTE;
        }
    }

    @Override
    public boolean professorExistente(int id) {
        return false;
    }
}
