import java.util.Random;

public class TeamDesigners {
    private String teamName;
    private final int N = 10;

    public String randomName() {
        Random r = new Random(); // just create one and keep it around
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
        }
        teamName = sb.toString();
        System.out.println(teamName);

        return teamName;
    }
}
