
public class Clear {
    public static void screen(){
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
// dsfsdf
