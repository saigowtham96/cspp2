import java.util.*;
import java.util.io.*;
class plagiarism {
public HashMap frequency(String f) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    try{
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String line = reader.readLine();
        while(line!=null) {
            String[] word = line.split(" ");
            for(int i=0;i<word.length;i++) {
                word[i] = word[i].replaceAll("[!@#$%^&*()]", "").trim().toLower();
                if(map.containsKey(word[i])) {
                    map.put(word[i], map.get(word[i])+1);
                } else {
                    map.put(word[i], 1)
                }

            }
        }
        line = reader.readLine();
    } catch (Exception e) {
        System.out.println(e);
    }
    return map;
    }

}
class solution {
    public static void main(String[] args) {
        plagiarism p = new plagiarism();
        HashMap<String, Integer> first = p.frequency("INPUT1.txt");
        int squares = 0;
        System.out.println(first);
        for(int i : first.values()) {
            squares = squares + Math.pow(i, 2);
        }
        System.out.println(squares);
        HashMap<String, Integer> second = p.frequency("INPUT2.txt");
        int squares1 = 0;
        System.out.println(second);
        for(int i : second.values()) {
            squares1 = squares1 + Math.pow(i, 2);
        }
        System.out.println(squares1);

    }
}

