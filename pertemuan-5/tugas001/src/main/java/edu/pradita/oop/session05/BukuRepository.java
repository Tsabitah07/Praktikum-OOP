package edu.pradita.oop.session05;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * TUGAS001 – CRUD Buku
 * Repository untuk 4 operasi: READ, CREATE, UPDATE, DELETE
 */
public class BukuRepository {

    /**
     * TODO 10: READ ALL – Ambil semua buku dari DB
     *
     * Query: SELECT * FROM buku
     * Return: List<Buku>
     */
    public List<Buku> findAll() throws SQLException {
        List<Buku> bukus = new ArrayList<>();

        // TODO: 
        // 1. Dapatkan connection
        // 2. Buat statement
        // 3. ExecuteQuery "SELECT * FROM buku"
        // 4. Loop ResultSet → buat Buku object → tambah ke list
        // 5. Close resource
        // 6. Return list

        return bukus;
    }

    /**
     * TODO 11: CREATE – Tambah buku baru
     *
     * Query: INSERT INTO buku (judul, penulis, tahun_terbit, stok) VALUES (?, ?, ?, ?)
     */
    public void save(Buku buku) throws SQLException {
        // TODO:
        // 1. Dapatkan connection
        // 2. PreparedStatement dengan INSERT
        // 3. Set parameter: judul, penulis, tahun_terbit, stok
        // 4. executeUpdate()
        // 5. Close resource
    }

    /**
     * TODO 12: UPDATE – Update stok buku
     *
     * Query: UPDATE buku SET stok = ? WHERE id = ?
     */
    public void updateStok(int id, int newStok) throws SQLException {
        // TODO: PreparedStatement UPDATE
    }

    /**
     * TODO 13: DELETE – Hapus buku berdasarkan ID
     *
     * Query: DELETE FROM buku WHERE id = ?
     *
     * Return: true jika berhasil hapus 1 row, false jika tidak ada
     */
    public boolean deleteById(int id) throws SQLException {
        // TODO:
        // 1. PreparedStatement DELETE
        // 2. executeUpdate()
        // 3. Return rowsAffected > 0

        return false;
    }
}
