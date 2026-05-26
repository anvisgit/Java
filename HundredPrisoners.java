import java.util.*;

public class HundredPrisoners {
    public static void main(String[] args) {
        int successfulSimulations = 0;
        int totalPrisoners = 100;
        int maximumDrawersAllowed = 50;
        int totalSimulations = 10000;
        for (int simulation = 0; simulation < totalSimulations; simulation++) {
            List<Integer> drawers = new ArrayList<>();
            for (int i = 1; i <= totalPrisoners; i++) {
                drawers.add(i);
            }
            Collections.shuffle(drawers);
            boolean allPrisonersSucceeded = true;
            for (int prisonerNumber = 1;prisonerNumber <= totalPrisoners && allPrisonersSucceeded;prisonerNumber++) {
                int currentDrawerNumber = prisonerNumber;
                boolean prisonerFoundOwnNumber = false;
                for (int openedDrawerCount = 0;
                     openedDrawerCount < maximumDrawersAllowed;
                     openedDrawerCount++) {
                    int cardFound =
                            drawers.get(currentDrawerNumber - 1);
                    if (cardFound == prisonerNumber) {
                        prisonerFoundOwnNumber = true;
                        break;
                    }
                    currentDrawerNumber = cardFound;
                }
                if (!prisonerFoundOwnNumber) {
                    allPrisonersSucceeded = false;
                }
            }
            if (allPrisonersSucceeded) {
                successfulSimulations++;
            }
        }
        double successProbability =
                (double) successfulSimulations / totalSimulations;

        System.out.println("probab = "
                           + successProbability);
    }
}

// Repeat 10000 times:

//     Randomly shuffle numbers 1 to 100 into drawers

//     For each prisoner:

//         Start with own drawer number

//         Open up to 50 drawers:

//             Look at number inside

//             If own number found:
//                 success

//             Else:
//                 open drawer with that number

//         If prisoner fails:
//             whole game fails

//     If all prisoners succeed:
//         count success

// Print success probability
