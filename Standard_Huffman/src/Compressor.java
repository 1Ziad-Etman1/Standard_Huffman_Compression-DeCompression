import java.util.ArrayList;

public class Compressor {
    public ArrayList<Integer> compress(String test){
        //String test = "AAAAAABBBAABBBBCDCCC";

        // We get the chars and the freq of each char
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> freq = new ArrayList<>();
        for (int i = 0; i < test.length(); i++) {
            if (!chars.isEmpty()){
                boolean new_char = true;
                for(int j=0 ; j<chars.size() ;j++){
                    if (chars.get(j).equals(test.charAt(i))){
                        new_char =false;
                        freq.set(j,freq.get(j)+1);
                        break;
                    }
                }
                if (new_char){
                    chars.addLast(test.charAt(i));
                    freq.addLast(1);
                }
            }
        }

        // now we get the ratios between the freq and the population
//        for (int i = 0; i < freq.size(); i++) {
//            freq.set(i, freq.get(i)/test.length());
//        }

        



        return new ArrayList<>();
    }
}
