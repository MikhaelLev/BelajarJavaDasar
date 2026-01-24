public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Eko Kurniawan Khannedy";

        System.out.println(name);

        //contoh default value
        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        //kalau buat variable yang sama lagi, akan dibaca variable terbaru
        name = "Budi Nugraha";
        System.out.println(name);

        //contoh pembuatan variable dengan var (wajib langsung memasukkan value)
//        var name; //error
//        name = "Eko Kurniawan Khannedy";

        var umur = 30;
        var alamad = "Indonesia";

        System.out.println(umur);
        System.out.println(alamad);

        //cara agar variable yang tidak akan diubah dengan menggunakan final
        final String namaGweh = "Eko Kurnawan Khannedy";
        var umurr = 30;
        var alamade = "Indonesia";

        System.out.println(name);
    }
}
