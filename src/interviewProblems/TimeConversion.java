package interviewProblems;

public class TimeConversion {

    public static void main(String[] a) {
        String t = "12:30:00PM";

        String MT = "";
        String[] tx = t.split(":");
        int hh = Integer.parseInt(tx[0]);
        tx[2] = tx[2].replaceAll("[a-zA-Z]", "");

        if (t.contains("PM")) {
            if (1 <= hh && hh <= 11) {
                hh = 12 + hh;
                tx[0] = Integer.toString(hh);
            } else if (hh < 0 && hh > 12) {
                System.out.println("Invalid time");
            }
        } else if (t.contains("AM")) {
            if (hh == 12) {
                tx[0] = "00";
            } else if (hh < 0 && hh > 12) {
                System.out.println("Invalid time");
            }
        }

        for (int i = 0; i < tx.length; i++) {
            System.out.print(MT + tx[i]);
            if (i < tx.length - 1) {
                System.out.print(":");
            }
        }
    }
}
