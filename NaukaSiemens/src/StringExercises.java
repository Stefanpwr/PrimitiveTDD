import static java.lang.Character.isDigit;

public class StringExercises {

    public String converter(String str){
        String result = new String();
        int counter = 0;

        char[] conteiner = str.toCharArray();
        char last = conteiner[0];
        for(int i=0;i<conteiner.length;i++){
            if(isDigit(conteiner[i])){
                return "error";
            }
            else{
                if(last==conteiner[i]){
                    counter++;
                    last=conteiner[i];
                }else{
                    result+=counter+""+String.valueOf(last);
                    counter=1;
                    last=conteiner[i];
                }
            }
        }
        result+=counter+""+String.valueOf(last);
        return result;
    }

}
