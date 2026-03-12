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
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
    }

    // TODO 3: Getter & Setter untuk id
    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
    }

    // TODO 4: Getter & Setter untuk judul
    public String getJudul() { return judul; }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // TODO 5: Getter & Setter untuk penulis
    public String getPenulis() { return penulis; }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // TODO 6: Getter & Setter untuk tahunTerbit
    public int getTahunTerbit() { return tahunTerbit; }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    // TODO 7: Getter & Setter untuk stok
    public int getStok() { return stok; }
    public void setStok(int stok) {
        this.stok = stok;
    }

    // TODO 8: Override toString() untuk debug
    // Format: "Buku{id=1, judul='Clean Code', penulis='Robert Martin', tahun=2008, stok=5}"
    @Override
    public String toString() {
        return "Buku{" +
                "id=" + id +
                ", judul='" + judul + '\'' +
                ", penulis='" + penulis + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                ", stok=" + stok +
                '}';
    }
}
