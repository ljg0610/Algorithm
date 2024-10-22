    import java.io.*;
    import java.util.HashMap;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Double[] grade = new Double[20];
            String[] score = new String[20];

            HashMap<String, Double> resultMap = new HashMap<>();
            resultMap.put("A+", 4.5);
            resultMap.put("A0", 4.0);
            resultMap.put("B+", 3.5);
            resultMap.put("B0", 3.0);
            resultMap.put("C+", 2.5);
            resultMap.put("C0", 2.0);
            resultMap.put("D+", 1.5);
            resultMap.put("D0", 1.0);
            resultMap.put("F", 0.0);

            double sum = 0;
            double multi = 0;

            for (int i = 0; i < 20; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                grade[i] = Double.parseDouble(st.nextToken());
                score[i] = st.nextToken();
                
                if(score[i].equals("P")){
                    continue;
                }

                multi += grade[i] * resultMap.get(score[i]);
                sum += grade[i];
            }
            System.out.printf("%.6f\n", multi / sum);
        }
    }
