package edu.pradita.oop.session05;

/**
 * TUGAS001 – CRUD Buku
 * Model Buku untuk representasi data dari table `buku`
 */
public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private int stok;

    // TODO 1: Constructor kosong
    public Buku() {}

    // TODO 2: Constructor lengkap (semua field)
    public Buku(int id, String judul, String penulis, int tahunTerbit, int stok) {
        // TODO: assign semua field
    }

    // TODO 3: Getter & Setter untuk id
    public int getId() { return 0; }
    public void setId(int id) {}

    // TODO 4: Getter & Setter untuk judul
    public String getJudul() { return null; }
    public void setJudul(String judul) {}

    // TODO 5: Getter & Setter untuk penulis
    public String getPenulis() { return null; }
    public void setPenulis(String penulis) {}

    // TODO 6: Getter & Setter untuk tahunTerbit
    public int getTahunTerbit() { return 0; }
    public void setTahunTerbit(int tahunTerbit) {}

    // TODO 7: Getter & Setter untuk stok
    public int getStok() { return 0; }
    public void setStok(int stok) {}

    // TODO 8: Override toString() untuk debug
    // Format: "Buku{id=1, judul='Clean Code', penulis='Robert Martin', tahun=2008, stok=5}"
    @Override
    public String toString() {
        return "";
    }
}
