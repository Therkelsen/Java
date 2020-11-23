
package src.extraassignments;

public class ExtraAssignments {
    // 45^2 = 2025
    // 20 + 25 = 45
    public static void Assignment1() {
        System.out.println("");
        System.out.println("Assignment 1");
        for (int i = 2; i < 100; i++) {
            String iStr = String.valueOf(i);

            String iSqr = String.valueOf(i * i);

            if (iSqr.length() >= 2) {
                String iStr1 = iSqr.substring(0, iSqr.length() / 2);
                String iStr2 = iSqr.substring(iSqr.length() / 2, iSqr.length());
                int i1 = 0;
                int i2 = 0;

                try {
                    i1 = Integer.parseInt(iStr1);
                } catch (NumberFormatException ex) {
                    System.out.println("Can't parse " + iStr1);
                }

                try {
                    i2 = Integer.parseInt(iStr2);
                } catch (NumberFormatException ex) {
                    System.out.println("Can't parse " + iStr2);
                }

                if (i1 + i2 == i) {
                    System.out.println(
                            "Number = [" + iStr + "] Square = [" + iSqr + "] Number 2 = [" + iStr1 + "] Number 3 = ["
                            + iStr2 + "] [" + i1 + "] + [" + i2 + "] = [" + iStr + "]?: " + (i1 + i2 == i));
                }
            }
        }
    }

    public static void Assignment2() {
        System.out.println("");
        System.out.println("Assignment 2");
        for (int i = 0; i < 1000; i++) {
            String iStr = String.valueOf(i);
            String iStr1 = "";
            String iStr2 = "";
            String iStr3 = "";
            int i1 = 0;
            int i2 = 0;
            int i3 = 0;
            switch (iStr.length()) {
                case 1:
                    iStr1 = String.valueOf(i);
                    i1 = i;
                    if (i1 == i) {
                        System.out.println(
                                "Number = [" + i + "] Number 2 = [" + i1 + "] " + i1 + "¹ = " + i + "?: " + (i1 == i));
                    }
                    break;

                case 2:
                    iStr1 = String.valueOf(iStr.charAt(0));
                    iStr2 = String.valueOf(iStr.charAt(1));
                    i1 = Integer.parseInt(iStr1);
                    i2 = Integer.parseInt(iStr2);
                    if (i1 + Math.pow(i2, 2) == i) {
                        System.out.println(i);
                    }
                    break;

                case 3:
                    iStr1 = String.valueOf(iStr.charAt(0));
                    iStr2 = String.valueOf(iStr.charAt(1));
                    iStr3 = String.valueOf(iStr.charAt(2));
                    i1 = Integer.parseInt(iStr1);
                    i2 = Integer.parseInt(iStr2);
                    i2 = Integer.parseInt(iStr3);
                    System.out.println("Number = " + i + " " + (i1 + Math.pow(i2, 2) + Math.pow(i3, 3) == i));
                    if (i1 + Math.pow(i2, 2) + Math.pow(i3, 3) == i) {
                        System.out.println("true");
                    }
                    break;

                default:
                    break;

            }

        }
    }
}
