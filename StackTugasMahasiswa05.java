public class StackTugasMahasiswa05 {
    Mahasiswa05[] stack;
    int top;
    int size;

    public StackTugasMahasiswa05(int size) {
        this.size = size;
        stack = new Mahasiswa05[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa05 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa05 pop() {
        if (!isEmpty()) {
            Mahasiswa05 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa05 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;
        }
    }
}