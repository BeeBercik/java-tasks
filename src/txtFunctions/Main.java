package txtFunctions;

public class Main {
    public static void main(String[] args) {
        String txt = "Ola ma kota";
        txt = txt.repeat(3);
        System.out.println(txt);
        txt = txt.replaceAll("Ola", "Kasia");
        System.out.println(txt);
        txt = txt.replaceFirst("Kasia", "Monika");
        System.out.println(txt);
        int nr = txt.indexOf("Kasia");
        System.out.println(nr);
        int nrLast = txt.lastIndexOf("Kasia");
        System.out.println(nrLast);
        txt = txt.substring(nr, txt.length());
        System.out.println(txt);
    }
}
