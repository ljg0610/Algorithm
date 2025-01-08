    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            int n = Integer.parseInt(br.readLine());
            List<Student> students = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                String name = st.nextToken();
                int day = Integer.parseInt(st.nextToken());
                int month = Integer.parseInt(st.nextToken());
                int year = Integer.parseInt(st.nextToken());

                students.add(new Student(name, day, month, year));
            }
            br.close();
            
            Collections.sort(students);

            bw.write(students.get(0) + "\n");
            bw.write(students.get(students.size() - 1) + "\n");
            bw.flush();
            bw.close();
        } 
        
        public static class Student implements Comparable<Student>{
            private String name;
            private int day;
            private int month;
            private int year;

            Student(String name, int day, int month, int year) {
                this.name = name;
                this.day = day;
                this.month = month;
                this.year = year;
            }

            @Override
            public int compareTo(Student other) {
                if (this.year != other.year) {
                    return other.year - this.year;
                } else if (this.month != other.month) {
                    return other.month - this.month;
                } else {
                    return other.day - this.day;
                }
            }

            @Override
            public String toString() {
                return this.name;
            }
        }  
    }
