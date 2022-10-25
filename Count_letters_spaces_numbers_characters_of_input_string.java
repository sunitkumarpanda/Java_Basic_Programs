public class Count_letters_spaces_numbers_characters_of_input_string {
    public static void main(String[] args) {
        String test="Aa kiu,I swdskieo 236587.GH kiu:sieo??25.33";
        count(test);

    }
    public static void count(String x){
        char[]ch=x.toCharArray();
        int letter=0;
        int space=0;
        int num=0;
        int other=0;
        for(int i=0;i<x.length();i++){
            if(Character.isLetter(ch[i])){
                letter++;

            }
            else if(Character.isDigit(ch[i])){
            }
            else if (Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
                other++;
            }
        }
        System.out.println("The string is:Aa kiu,I swdskieo 236587.GH kiu:sieo??25.33");
        System.out.println("letter:"+letter);
        System.out.println("space:"+space);
        System.out.println("number:"+num);
        System.out.println("other:"+other);
    }
}

