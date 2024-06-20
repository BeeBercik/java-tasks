package MyTasks.chainingExceptions;

public class LeaveWithChaining {
    public static void main(String[] args) {
//        uruchamiamy metode wprawiajaca w ruch inne metody, jesli ktoraz z pomniejszych emtod rzuci jakims wyjatkiem, to jest rzucany "glowny" i przechwytywany tutaj wraz z informacjami
        try {
            getLeave();
        } catch(NoLeaveGrantedException e) {
            e.printStackTrace();
        }
    }

//    Metoda uruchamiajaca wywolujaca metody, ktore moga rzucic wyjatkami. Jesli rzuca to przechwytujemy i rzucamy "glowny" wyjatek, ktory znowy jest przechwytywany w glownej metodzie (po uruchomieniu obecnej metody)
    static void getLeave() throws NoLeaveGrantedException {
        try {
            workToBeDone();
            howIsTeamLead();
            System.out.println("Leave granted"); // gdy przejdzie, bez wyjatkow to wypisze
        } catch(Exception e) {
//            z przechwyconego wyjatku wypisze message, ktory podalem w konstruktorze mojego stoworzonego wyjatku, 2gi parametr to sam wyjatek - ktory zostal rzucony
            throw new NoLeaveGrantedException(e.getMessage(), e);
        }
    }

    static void howIsTeamLead() throws TeamLeadUpsetException {
        throw new LeaveWithChaining.TeamLeadUpsetException("Team is bad leading.");
    }

    static void workToBeDone() throws WorkToBeDoneException {
//        throw new WorkToBeDoneException("Much work to be done");
    }

//    MOJE WYJATKI - DE FACTO KLASY STATYCZNE
    static class NoLeaveGrantedException extends Exception {
        public NoLeaveGrantedException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    static class TeamLeadUpsetException extends Exception {
        public TeamLeadUpsetException(String message) {
            super(message);
        }
    }

    static class WorkToBeDoneException extends Exception {
        public WorkToBeDoneException(String message) {
            super(message);
        }
    }
}
