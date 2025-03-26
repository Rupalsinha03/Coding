
//print week num based on week name using switch case
public class Switchcaseweek {
    public static void main(String[] args) {
        String week="Tuesda";
        switch (week){
            case "Monday":
                System.out.println(1);break;
            case "Tuesday":
                System.out.println(2);break;
            case "Wednesday":
                System.out.println(3);break;
            default :
                System.out.println("no value matched");
        }
    }
}
