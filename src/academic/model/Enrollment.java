package academic.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
// File: src/academic/model/Enrollment.java

    /**
     * @author NIM Nama
     * @author NIM Nama
     */
    public class Enrollment {
        // Atribut-atribut untuk menyimpan data pendaftaran mata kuliah
        private String courseCode;
        private String studentNim; // Mengubah nim menjadi studentNim agar lebih spesifik
        private String academicYear;
        private String semester;
        private String grade; // Menambahkan atribut grade, default "None" jika belum ada

        // Konstruktor untuk inisialisasi objek Enrollment baru
        // Konstruktor ini akan dipanggil saat Anda membuat objek baru
        public Enrollment(String courseCode, String studentNim, String academicYear, String semester) {
            this.courseCode = courseCode;
            this.studentNim = studentNim;
            this.academicYear = academicYear;
            this.semester = semester;
            this.grade = "None"; // Inisialisasi grade default "None" sesuai output yang diminta
        }

        // Metode Getter untuk mendapatkan nilai Kode Mata Kuliah
        public String getCourseCode() {
            return courseCode;
        }

        // Metode Setter untuk mengubah nilai Kode Mata Kuliah
        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        // Metode Getter untuk mendapatkan nilai NIM Mahasiswa
        public String getStudentNim() {
            return studentNim;
        }

        // Metode Setter untuk mengubah nilai NIM Mahasiswa
        public void setStudentNim(String studentNim) {
            this.studentNim = studentNim;
        }

        // Metode Getter untuk mendapatkan nilai Tahun Akademik
        public String getAcademicYear() {
            return academicYear;
        }

        // Metode Setter untuk mengubah nilai Tahun Akademik
        public void setAcademicYear(String academicYear) {
            this.academicYear = academicYear;
        }

        // Metode Getter untuk mendapatkan nilai Semester
        public String getSemester() {
            return semester;
        }

        // Metode Setter untuk mengubah nilai Semester
        public void setSemester(String semester) {
            this.semester = semester;
        }

        // Metode Getter untuk mendapatkan nilai Grade
        public String getGrade() {
            return grade;
        }

        // Metode Setter untuk mengubah nilai Grade
        public void setGrade(String grade) {
            this.grade = grade;
        }

        // Metode toString() untuk representasi string objek Enrollment sesuai format output yang diminta
        @Override
        public String toString() {
            return courseCode + "|" + studentNim + "|" + academicYear + "|" + semester + "|" + grade;
        }
    }
    