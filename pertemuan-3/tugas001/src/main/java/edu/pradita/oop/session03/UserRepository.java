package edu.pradita.oop.session03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * TUGAS 001 – Simulasi ORM: UserRepository
 *
 * - Simulasi "tabel users" dalam memory menggunakan List<User>
 * - Mirip konsep CRUD di Hibernate:
 *   - save(User user)
 *   - findAll()
 *   - findById(Long id)
 *   - deleteById(Long id)
 */
public class UserRepository {

    // Simulasi database: List sebagai "tabel"
    private final List<User> users = new ArrayList<>();
    private long nextId = 1L;   // auto-increment id

    /**
     * TODO 4:
     * Simulasi INSERT:
     * - Jika user.getId() == null  set id dengan nextId, lalu nextId++
     * - Tambahkan user ke list
     * - Return user (dengan id yang sudah terisi)
     */
    public User save(User user) {
        // TODO: implement
        if (user.getId() == null) {
            user.setId(nextId++);
        }
        users.add(user);
        return user;
    }

    /**
     * TODO 5:
     * Return semua user (simulasi SELECT * FROM users)
     */
    public List<User> findAll() {
        // TODO: implement (boleh return users langsung)
        return users;
    }

    /**
     * TODO 6:
     * Cari user berdasarkan id (simulasi SELECT ... WHERE id = ?)
     * - Jika ketemu  kembalikan Optional.of(user)
     * - Jika tidak  Optional.empty()
     */
    public Optional<User> findById(Long id) {
        // TODO: implement loop atau stream
        for (User user : users) {
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    /**
     * TODO 7:
     * Hapus user berdasarkan id (simulasi DELETE FROM users WHERE id = ?)
     * - Return true jika ada yang terhapus
     * - Return false jika tidak ada yang cocok
     */
    public boolean deleteById(Long id) {
        // TODO: implement
        return users.removeIf(user -> user.getId().equals(id));
    }

    /**
     * TODO 8 (opsional):
     * Cari user by name (mirip query custom).
     */
    public List<User> findByName(String name) {
        List<User> result = new ArrayList<>();
        // TODO: loop users dan tambahkan yang name-nya sama
        for (User user : users) {
            if (user.getName().equals(name)) {
                result.add(user);
            }
        }
        return result;
    }
}
