package com.kitcenter.runners.homework.lesson15;

import com.kitcenter.app.homework.lesson15.Celebrities;

import java.util.Scanner;

/**
 * Created by Nastya on 28.10.2017.
 */
public class CelebritiesRunner {

    public static void main(String[] args) {

        //Launching CelebritiesRunner
        runCelebritiesRunner();

    }

    //Method with main running logic
    public static void runCelebritiesRunner( ){

        //Exporting all Celebrities objects to one array "celebrities[]"
        Celebrities celebrities[] = Celebrities.values();

        //Public "WinCounter" variable to stop program running after 3 win of game
        int winCounter = 0;

        //Game will be closed after 3 win of game
        do {
           winCounter = executeScanningComparing(celebrities, winCounter);
            System.out.println("Counter" + winCounter);
            //Checking if user has 3 Successful try of game
            if (winCounter == 3) {
                System.out.println("YOU WIN. Game is over");
            }
            else {
                System.out.println("Press \"C\" to Continue game || Press \"Q\" to Exit game ");
                String reset = scanning();
                if (reset.toLowerCase().equals("q")){
                    System.out.println("Thanks for attention");
                }
            }
        } while (winCounter < 3);
    }

    //Method that executes main logic of running several times
    public  static int executeScanningComparing(Celebrities celebrities[], int winCounter){
        //Randomly selecting object Celebrity
        Celebrities randomSelectedCelebrity = selectCelebrity(celebrities);
        String requestName = randomSelectedCelebrity.getName();

        System.out.print("Please, input Age of this Person: " + requestName + " :");
        //Scanning Age of Celebrity
        String requestAge = scanning();
        System.out.print("Please, input  Status (Dead / Alive) of Person : " + requestName + " :");
        //Scanning requestDead/Alive Status Celebrity
        String requestStatus = scanning();

        //Compaiting input info with info from Enumeration
        winCounter = compareSelebrity(requestAge,requestStatus,randomSelectedCelebrity, winCounter);

        return winCounter;
    }

    //Method that Randomly selects object from Enumeration Celebrity
    public static Celebrities selectCelebrity( Celebrities celebrities[]){
        Celebrities selectedCelebrity = celebrities[(int) (Math.random()*10)];
        return selectedCelebrity;
    }

    //Method that is comparing user input data and info from "Celebrities" Enumeration
    public static int compareSelebrity(String requestAge, String requestStatus,
                                        Celebrities selectedCelebrity,int winCounter){
        if (( (requestAge.toLowerCase()).equals(selectedCelebrity.getAge().toLowerCase())) &&
                (requestStatus.toLowerCase().equals(selectedCelebrity.getStatus().toLowerCase()))) {
            System.out.println("Successful try");
            winCounter++;
        } else {
            System.out.println("UnSuccessful try");
        }
        return winCounter;
    }

    //Method that is scanning data from PC
    public static String scanning(){
       Scanner scan = new Scanner(System.in);
       String data = scan.nextLine();
       return data;
    }
}
