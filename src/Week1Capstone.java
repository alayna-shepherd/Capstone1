
public class Week1Capstone {

	Scanner keyIn = new Scanner(System.in);
    String original;
    String latin = "";
   
    System.out.println("Pig Latin Translator");
   
    while(true){
        System.out.println("Please enter a word: ");
        original = keyIn.nextLine();
        String temp = "";
   
        for(int i = 0; i < original.length(); i++){
            if (original.charAt(i) == 'a' || original.charAt(i) == 'A'
                   || original.charAt(i) == 'e' || original.charAt(i) == 'E' ||
                    original.charAt(i) == 'i' || original.charAt(i) == 'I' ||
                    original.charAt(i) == 'o' || original.charAt(i) == 'O' ||
                    original.charAt(i) == 'u' || original.charAt(i) == 'U' ){
                latin = original.substring(i);
                break;
            } else{
                temp = temp + original.charAt(i);
            }
        }
   
        if(original.charAt(0) == 'a' || original.charAt(0) == 'A'
                   || original.charAt(0) == 'e' || original.charAt(0) == 'E' ||
                    original.charAt(0) == 'i' || original.charAt(0) == 'I' ||
                    original.charAt(0) == 'o' || original.charAt(0) == 'O' ||
                    original.charAt(0) == 'u' || original.charAt(0) == 'U'){
            latin = latin + "way";
        }
        else {
            latin = latin + temp + "ay";
        }
   
        latin = latin.toLowerCase();
   
        System.out.println("Translated to Pig Latin: " + latin + "\n");
       
        System.out.println("Translate another word? (y/n): ");
        String cont = keyIn.nextLine();
        if (cont.equals("N") || cont.equals("n"))
            break;
   
    }
	}

