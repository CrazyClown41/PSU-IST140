import java.util.ArrayList;
public class Parser {
    public static void main(String args[]){
        sortArray(convertToArray(removeCommas(getNums())));
    }

    public static String getNums(){
        String nums = "22,33,44,55,66,77";
        return nums;
    }

    public static String removeCommas(String nums) {
        String numsWOCommas = "";
        for (int i = 0; i < nums.length(); i++) {
            char part = nums.charAt(i);
            if (part == ',') {
                numsWOCommas += " ";
            }
            else {
                numsWOCommas += part;
            }
        }
        return numsWOCommas;
    }

    public static ArrayList convertToArray(String numsWOCommas){
        ArrayList<Character> userString = new ArrayList<Character>();
        for (int i = 0; i < numsWOCommas.length();){
            char part = numsWOCommas.charAt(i);
            if (part != ' '){
                userString.add(part);
            }
        }
        return userString;
    }


    public static void sortArray(ArrayList userString){
        System.out.println(userString);
    }

    public static void printResults(){

    }
    }
