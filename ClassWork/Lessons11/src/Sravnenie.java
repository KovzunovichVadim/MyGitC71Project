public class Sravnenie {
    public static void main(String[] args) {
        String line = "Hello bye";
        System.out.println(line.startsWith("Hell"));
        System.out.println(line.endsWith(" bye"));
        System.out.println(line.contains("ell"));

        System.out.println(line.regionMatches(2,"llo",0,3));


    }
}
