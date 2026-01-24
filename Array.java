public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Eko";
        arrayString[1] = "Kurniawan";
        arrayString[2] = "Khannedy";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Budi";

        System.out.println(arrayString[0]);

        //bentuk lain pembuatan array awal:
        //String[] stringArray2 = new String[10];

        String[] namaNama = {
                "Eko", "Kurniawan", "Khannedy"
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };
        System.out.println(arrayLong.length);

        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
