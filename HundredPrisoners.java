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


// 1. Run the simulation many times

// 2. For each simulation:

//       a) Create drawers containing numbers 1–100

//       b) Shuffle the numbers randomly

//       c) For every prisoner:

//             i) Start by opening the drawer
//                with the prisoner's own number

//            ii) Read the card inside

//           iii) If the card matches the prisoner's number:
//                     prisoner succeeds

//            iv) Otherwise:
//                     open the drawer whose number
//                     matches the card found

//             v) Repeat until:
//                     - prisoner finds own number
//                     OR
//                     - 50 drawers are opened

//            vi) If one prisoner fails:
//                     simulation fails

//       d) If all prisoners succeed:
//              count one successful simulation

// 3. Probability =
//    successful simulations / total simulations

