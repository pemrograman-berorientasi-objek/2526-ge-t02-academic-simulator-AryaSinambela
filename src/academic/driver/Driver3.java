package academic.driver;

/**
 * @author NIM Nama
 * @author NIM Nama
 */

    import academic.model.Enrollment; // Mengimpor kelas Enrollment
    import java.util.Scanner;
    import java.util.ArrayList;
    import java.util.List;

    public class Driver3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            List<Enrollment> enrollments = new ArrayList<>(); // Menggunakan ArrayList untuk menyimpan Enrollment

            String line;
            System.out.println("Masukkan data enrollment (format: CourseCode#NIM#TahunAkademik#Semester), ketik '---' untuk berhenti:");

            while (input.hasNextLine()) {
                line = input.nextLine();

                if (line.equals("---")) {
                    break; // Berhenti jika input adalah "---"
                }

                // Memisahkan segmen input menggunakan delimiter '#'
                String[] segments = line.split("#");

                // Memastikan jumlah segmen sesuai dengan yang diharapkan (4 segmen)
                if (segments.length == 4) {
                    String courseCode = segments[0];
                    String studentNim = segments[1];
                    String academicYear = segments[2];
                    String semester = segments[3];

                    // Membuat objek Enrollment baru dan menambahkannya ke list
                    // Grade akan diinisialisasi "None" secara default oleh konstruktor Enrollment
                    Enrollment enrollment = new Enrollment(courseCode, studentNim, academicYear, semester);
                    enrollments.add(enrollment);
                } else {
                    System.out.println("Format input tidak valid: " + line);
                }
            }

            // Setelah input berhenti, tampilkan semua enrollments yang tersimpan
            System.out.println("\n--- Daftar Enrollment yang Tersimpan ---");
            for (Enrollment enrollment : enrollments) {
                System.out.println(enrollment.toString()); // Menggunakan metode toString() Enrollment
            }

            input.close(); // Tutup scanner
        }
    }