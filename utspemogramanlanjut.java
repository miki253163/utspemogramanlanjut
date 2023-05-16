import java.util.*;

public class utspemogramanlanjut {
    public static void main(String[] args) {
        List<Integer> angka = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan daftar angka, pisahkan dengan spasi  : ");
        String input = scanner.nextLine();
        String[] angkaStr = input.split(" ");
        for (String a : angkaStr) {
            angka.add(Integer.parseInt(a));
        }

        Set<Integer> angkaUnik = new HashSet<>();
        Map<Integer, Integer> jumlahAngka = new HashMap<>();

        boolean isSama = false;

        for (int i = 0; i < angka.size(); i++) {
            int a = angka.get(i);

            if (angkaUnik.contains(a)) {
                isSama = true;
                int jumlah = jumlahAngka.get(a);
                jumlahAngka.put(a, jumlah + 1);
            } else {
                angkaUnik.add(a);
                jumlahAngka.put(a, 1);
            }
        }

        if (isSama) {
            System.out.println("True");
            for (Map.Entry<Integer, Integer> entry : jumlahAngka.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println( entry.getKey() + " ada " + entry.getValue());
                }
            }
        } else {
            System.out.println("False");
        }
    }

}