package academic.driver;
   
    /**
     * @author NIM Nama
     * @author NIM Nama
     */
    
// File: src/academic/driver/Driver2.java

    import academic.model.Student; // Mengimpor kelas Student
    import java.util.Scanner;
    import java.util.ArrayList;
    import java.util.List;

    public class Driver2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            List<Student> students = new ArrayList<>(); // Menggunakan ArrayList untuk menyimpan Student

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
                    String nim = segments[0];
                    String nama = segments[1];
                    String entranceYear = segments[2]; // Tahun masuk
                    String jurusan = segments[3];

                    // Membuat objek Student baru dan menambahkannya ke list
                    Student student = new Student(nim, nama, entranceYear, jurusan);
                    students.add(student);
                } else {
                  
                }
            }

            // Setelah input berhenti, tampilkan semua students yang tersimpan
            
            for (Student student : students) {
                System.out.println(student.toString()); // Menggunakan metode toString() Student
            }

            input.close(); // Tutup scanner
        }
    }
    