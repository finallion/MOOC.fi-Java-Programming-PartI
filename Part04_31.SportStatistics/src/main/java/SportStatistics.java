
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> teams = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();
        int counter = 0;
        int win = 0;
        int lose = 0;

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String read = reader.nextLine();
                teams.add(read);

                String[] pieces = read.split(",");
                String homeTeam = pieces[0];
                String visitTeam = pieces[1];

                int homePoints = Integer.valueOf(pieces[2]);
                int visitPoints = Integer.valueOf(pieces[3]);


                if (team.equals(homeTeam)) {
                    counter++;
                }

                if (team.equals(visitTeam)) {
                    counter++;
                }

                if ((team.equals(homeTeam)) && (homePoints > visitPoints)) {
                    win++;
                }

                if ((team.equals(visitTeam)) && (visitPoints > homePoints)) {
                    win++;
                }
            }

            System.out.println("Games: " + counter);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + (counter-win));

        } catch (Exception e) {
             System.out.println("Error!");
        }

    }

}
