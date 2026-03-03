package academic.driver;

/**
 * Arya Pratama Sinambela - 12S24017
 */

    import academic.model.Course;
    import academic.model.Student;
    import academic.model.Enrollment;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Driver4 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            List<Course> courses = new ArrayList<>();
            List<Student> students = new ArrayList<>();
            List<Enrollment> enrollments = new ArrayList<>();

            String line;
           

            while (input.hasNextLine()) {
                line = input.nextLine();

                if (line.equals("---")) {
                    break; // Berhenti jika input adalah "---"
                }

                // Pisahkan segmen pertama untuk menentukan tipe entitas
                String[] parts = line.split("#", 2); // Split hanya pada '#' pertama
                String command = parts[0];
                String data = (parts.length > 1) ? parts[1] : ""; // Ambil sisa data setelah command

                // Proses data berdasarkan command
                switch (command) {
                    case "course-add":
                        // Format: course-add#courseCode#courseName#credits#grade
                        String[] courseSegments = data.split("#");
                        if (courseSegments.length == 4) {
                            String courseCode = courseSegments[0];
                            String courseName = courseSegments[1];
                            int credits = Integer.parseInt(courseSegments[2]);
                            String grade = courseSegments[3];
                            Course course = new Course(courseCode, courseName, credits, grade);
                            courses.add(course);
                        } else {
                            System.out.println("Format input Course tidak valid: " + line);
                        }
                        break;

                    case "student-add":
                        // Format: student-add#NIM#Nama#Tahun#Jurusan
                        String[] studentSegments = data.split("#");
                        if (studentSegments.length == 4) {
                            String nim = studentSegments[0];
                            String nama = studentSegments[1];
                            String entranceYear = studentSegments[2];
                            String jurusan = studentSegments[3];
                            Student student = new Student(nim, nama, entranceYear, jurusan);
                            students.add(student);
                        } else {
                            System.out.println("Format input Student tidak valid: " + line);
                        }
                        break;

                    case "enrollment-add":
                        // Format: enrollment-add#CourseCode#NIM#academicYear#semester
                        String[] enrollmentSegments = data.split("#");
                        if (enrollmentSegments.length == 4) {
                            String courseCode = enrollmentSegments[0];
                            String studentNim = enrollmentSegments[1];
                            String academicYear = enrollmentSegments[2];
                            String semester = enrollmentSegments[3];
                            // Grade akan diinisialisasi "None" secara default oleh konstruktor Enrollment
                            Enrollment enrollment = new Enrollment(courseCode, studentNim, academicYear, semester);
                            enrollments.add(enrollment);
                        } else {
                            System.out.println("Format input Enrollment tidak valid: " + line);
                        }
                        break;

                    default:
                        System.out.println("Command tidak dikenal: " + command);
                        break;
                }
            }

           

            // 1. Tampilkan Courses
            for (Course course : courses) {
                System.out.println(course.toString());
            }

            // 2. Tampilkan Students
            for (Student student : students) {
                System.out.println(student.toString());
            }

            // 3. Tampilkan Enrollments
            for (Enrollment enrollment : enrollments) {
                System.out.println(enrollment.toString());
            }

            input.close(); // Tutup scanner
        }
    }
    