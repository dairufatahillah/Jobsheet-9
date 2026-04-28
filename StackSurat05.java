public class StackSurat05 {
    Surat05[] stack;
    int top;
    int size;

    public StackSurat05(int size) {
        this.size = size;
        stack = new Surat05[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat05 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Admin prodi tidak bisa menerima surat lagi.");
        }
    }

    public Surat05 pop() {
        if (!isEmpty()) {
            Surat05 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang perlu diproses.");
            return null;
        }
    }

    public Surat05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Belum ada surat yang masuk.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        if (isEmpty()) {
            System.out.println("Stack kosong! Belum ada surat yang masuk.");
            return;
        }

        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("\n--- Surat Ditemukan ---");
                System.out.println("Posisi tumpukan ke-" + (top - i + 1) + " dari atas");
                System.out.println("ID Surat   : " + stack[i].idSurat);
                System.out.println("Nama       : " + stack[i].namaMahasiswa);
                System.out.println("Kelas      : " + stack[i].kelas);
                System.out.println("Jenis Izin : " + (stack[i].jenisIzin == 'S' ? "Sakit (S)" : "Izin Lain (I)"));
                System.out.println("Durasi     : " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat izin atas nama " + nama + " tidak ditemukan di tumpukan.");
        }
    }
}