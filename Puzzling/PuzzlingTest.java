

public class PuzzlingTest {
    public static void main(String[] args){
        Puzzling t1 = new Puzzling();
        
        int[] testArr = {3,5,1,2,7,9,8,13,25,32};
        t1.sumAndGreaterThan10(testArr);
    
        String[] testList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        t1.shuffleStrings(testList);
    
        t1.shuffleAlphabet();
    
        t1.randNumber();
    
        t1.randNumber2();
    
        t1.randomString();
    
        t1.randomStringOfStrings();
        }
    
}
