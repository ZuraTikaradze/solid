package tikaradze.s.solved.logging;

// 3. მხოლოდ ერთი მიზეზი აქვს შესაცვლელად - ლოგირება
public class ConsoleLogger {
    public static void infoLog(String txt) {
        System.out.println(txt);
    }
    public static void errorLog(String txt, Exception e) {
        System.out.println(txt + " " + e.toString());
    }
}
