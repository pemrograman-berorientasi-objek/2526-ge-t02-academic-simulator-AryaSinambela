package academic.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
    public class Course {
        // Atribut-atribut untuk menyimpan kode mata kuliah, nama mata kuliah, SKS, dan grade
        private String courseCode;
        private String courseName;
        private int credits;
        private String grade; // Menambahkan atribut grade

        // Konstruktor untuk inisialisasi objek Course
        // Sekarang menerima 4 parameter sesuai format input
        public Course(String courseCode, String courseName, int credits, String grade) {
            this.courseCode = courseCode;
            this.courseName = courseName;
            this.credits = credits;
            this.grade = grade; // Inisialisasi grade
        }

        // Metode getter untuk mengakses kode mata kuliah
        public String getCourseCode() {
            return courseCode;
        }

        // Metode getter untuk mengakses nama mata kuliah
        public String getCourseName() {
            return courseName;
        }

        // Metode getter untuk mengakses jumlah SKS
        public int getCredits() {
            return credits;
        }

        // Metode getter untuk mengakses grade
        public String getGrade() {
            return grade;
        }

        // Metode setter (opsional, jika ingin memungkinkan perubahan setelah inisialisasi)
        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public void setCredits(int credits) {
            this.credits = credits;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        // Metode toString() untuk representasi string objek Course sesuai format output yang diminta
        @Override
        public String toString() {
            return courseCode + "|" + courseName + "|" + credits + "|" + grade;
        }
    }
    
