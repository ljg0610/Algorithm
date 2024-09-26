import java.util.Scanner;

public class Main{
    static String[] group;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int n = sc.nextInt();
        group = new String[n];
        for(int i = 0; i < n; i++){
            group[i] = sc.next().toLowerCase();
        }

        System.out.println(checker(group));
    }

    static int checker(String[] group){
        int count = 0;
        for(int i = 0; i < group.length; i++){ 
            boolean correct = true;  
            String[] word = group[i].split("");
            String check = word[0];
            for(int j = 1; j < group[i].length(); j++){
                if(!word[j-1].equals(word[j])){
                    if(check.contains(word[j])){
                        correct = false;
                        break;
                    }
                    check += word[j];
                }
            }
            if(correct == true){
                count++;
            }
        }
        return count;
    }
}