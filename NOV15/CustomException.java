package NOV15;

class NewException extends Exception{
    public String getMessage(){
        return "This is a New Exception ";
    }
}
public class CustomException {
    public static void main(String[] args) {
        try{
            int n1=2,n2=20;
            if(n1<n2){
                throw new NewException ();
            }
        }catch(NewException n){
            System.out.println(n.getMessage ());
        }
    }
}
