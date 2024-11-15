package homework.exceptions;

//Na podstawie programu zaprezentowanego na zajęciach demonstrującym tzw. "chained exceptions" napisz program
//LeaveWithChaining, który sprawdza, czy szef udzieli nam urlopu. Szef może nie udzielić urlopu gdy jest
//jeszcze dużo pracy do wykonania lub gdy ma zły humor. Proszę wykorzystać poniższy schemat.

import java.util.Random;

public class LeaveWithChaining {
    private static final Random random = new Random();

    public static void main(String[] args) {
        try {
            getLeave();
        } catch(NoLeaveGrantedException e) {
            e.printStackTrace();
        }
    }

    static void getLeave() throws NoLeaveGrantedException {
        try {
            workToBeDone();
            howIsTeamLead();
            System.out.println("Leave granted");
        } catch(TeamLeadUpsetException e) {
            throw new NoLeaveGrantedException(e.getMessage(), e);
        } catch(WorkToBeDoneException e) {
            throw new NoLeaveGrantedException(e.getMessage(), e);
        }
    }

    static void howIsTeamLead() throws TeamLeadUpsetException {
        int nr = random.nextInt(3);
        if(nr == 1) throw new TeamLeadUpsetException("Boss is angry.");
    }

    static void workToBeDone() throws WorkToBeDoneException {
        int nr = random.nextInt(3);
        if(nr == 1) throw new WorkToBeDoneException("There is a lot of work.");
    }

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