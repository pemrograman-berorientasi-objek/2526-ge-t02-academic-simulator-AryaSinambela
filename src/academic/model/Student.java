// File: src/academic/model/Student.java
    package academic.model;

    /**
     * @author NIM Nama
     * @author NIM Nama
     */
    public class Student {
        // Atribut (Properti) kelas Student
        private String nim; // Nomor Induk Mahasiswa
        private String nama;
        private String entranceYear; // Menambahkan atribut tahun masuk
        private String jurusan;

        // Konstruktor untuk inisialisasi objek Student baru
        // Sekarang menerima 4 parameter sesuai format input
        public Student(String nim, String nama, String entranceYear, String jurusan) {
            this.nim = nim;
            this.nama = nama;
            this.entranceYear = entranceYear;
            this.jurusan = jurusan;
        }

        // Metode Getter (untuk membaca nilai atribut)
        public String getNim() {
            return nim;
        }

        public String getNama() {
            return nama;
        }

        public String getEntranceYear() {
            return entranceYear;
        }

        public String getJurusan() {
            return jurusan;
        }

        // Metode Setter (untuk mengatur nilai atribut setelah objek dibuat)
        public void setNim(String nim) {
            this.nim = nim;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setEntranceYear(String entranceYear) {
            this.entranceYear = entranceYear;
        }

        public void setJurusan(String jurusan) {
            this.jurusan = jurusan;
        }

        // Override metode toString() untuk menampilkan informasi student sesuai format output yang diminta
        @Override
        public String toString() {
            return nim + "|" + nama + "|" + entranceYear + "|" + jurusan;
        }
    }
    