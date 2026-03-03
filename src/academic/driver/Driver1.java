package academic.driver;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
// File: src/academic/driver/Driver1.java
    
    import academic.model.Course;
    import java.util.Scanner;
    import java.util.ArrayList; // Menggunakan ArrayList untuk penyimpanan dinamis
    import java.util.List;      // Menggunakan interface List

    public class Driver1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            List<Course> courses = new ArrayList<>(); // Menggunakan ArrayList untuk menyimpan Course

            String line;
          

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
                    String courseName = segments[1];
                    int credits = Integer.parseInt(segments[2]); // Konversi SKS ke integer
                    String grade = segments[3];

                    // Membuat objek Course baru dan menambahkannya ke list
                    Course course = new Course(courseCode, courseName, credits, grade);
                    courses.add(course);
                } else {
                    System.out.println("Format input tidak valid: " + line);
                }
            }

            // Setelah input berhenti, tampilkan semua courses yang tersimpan
           
            for (Course course : courses) {
                System.out.println(course.toString()); // Menggunakan metode toString() Course
            }

            input.close(); // Tutup scanner
        }
    }
    