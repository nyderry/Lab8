/**
 * Created by Ny Derry on 7/6/2017.
 * Lab8
 */
import java.util.Scanner;

public class BattingStatistics {
    public static void main(String[] args) {


                char contin1 = 'y';      //do-while loop variable
                String contin2 = "";     //do-while loop variable
                Scanner scan = new Scanner(System.in);  //do-while loop scanner and rest of application

                double bat = 0;        // double variable for calculations below
                double sumBat = 0;     // double variable for calculations below
                double avgBat = 0;     // double variable for calculations below
                double avg = 0;        // double variable for calculations below
                double sumSlug = 0;    // double variable for calculations below

                //display welcme message
                System.out.println("Welcome to Batting Average Calculator!\n");


                do {                                                            //do-while loop start
                    System.out.print("Enter number of times at bat: ");         // promt user input
                    int numberOfBats = scan.nextInt();                          // user input
                    System.out.println("\n0=Out, 1=single, 2=double, 3=triple, 4=home run"); // prompt user input
                    double[] battingArray = new double[numberOfBats];           // creating a new array
                    for (int i = 0; i < numberOfBats; i++) {                    // for loop to iterate through numbers at bat

                        System.out.print("Result for at-bat " + i + ":");       // user prompt
                        battingArray[i] = scan.nextDouble();                    // input into the array

                        if(battingArray[i] < 0.0 || battingArray[i] > 4.0)// this the data validation to accept only 0-4

                        {//if it is not 0-4, it ends the program, else runs program
                            System.out.println("The data is invalid. Only the numbers 0,1,2,3,or 4 can be used \n");
                            break;
                        }
                        else
                        {

                        }

                        sumSlug += battingArray[i]; // adds up (total) all of the array elements for Slugging Average


                        if (battingArray[i] > 0.0)  // if to reassign values to calculate the "batting average"
                        {                           // since batting average only cares if you hit the ball or not
                            bat = 1.0;
                        }
                        else
                        {
                            bat = 0.0;
                        }
                        sumBat += bat;               // adds up (total) all of the batting amounts
                    }

                    avg = sumSlug/numberOfBats;   // average of "Slugging" calculated for print out
                    avgBat = sumBat/numberOfBats; // average of "Batting" calculated for print out


                    System.out.println(""); // Print out results, notice formatting info
                    System.out.print("Batting average: ");
                    System.out.printf("%5.3f", avgBat);
                    System.out.println("");
                    System.out.print("Slugging Percentage: ");
                    System.out.printf("%5.3f", avg);
                    System.out.println("");
                    System.out.println("");

                    sumSlug = 0;   // Slugging and Batting totals are reset, so that if
                    sumBat = 0;    // if another batter is calculated, it does not keep the old tottals.


                    System.out.print("Another batter? (y/n): "); //do-while loop prompt
                    contin2 = scan.next();                       //do-while loop variable
                   // contin2 = contin2.toLowerCase();             //contin2 and contin1 values not needed, adding data validation
                    //contin1 = contin2.charAt(0);

                    final String contin3 = "nyNY";    //check if contain lower and upper n & y, same as PigLatin lab

                    if(!contin3.contains("" + contin2.charAt(0))) //this is the data validation to accept only n & y
                    {
                        System.out.println("The data is invalid. Only n, N, y, or Y can be used.\n");
                        break;//end the program if data is invalid
                    }
                    else {
                        System.out.println(" ");  //do-while loop formatting
                    }
                } while (contin1 != 'n');
            }
        }


