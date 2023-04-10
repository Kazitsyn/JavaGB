
public class Main {
    public static boolean validate(String sTrue){
        StringBuilder val = new StringBuilder();
        int index = -1;
        for (char item: sTrue.toCharArray()){
            if (item == '(' || item == '{' || item == '['){
                val.append(item);
            } else if (item == ')') {
                index = val.indexOf("(");
                if (index == -1){
                    return false;
                }else {
                    val.deleteCharAt(index);
                }
            } else if (item == '}') {
                index = val.indexOf("{");
                if (index == -1){
                    return false;
                }else {
                    val.deleteCharAt(index);
                }

            } else if (item == ']') {
                index = val.indexOf("[");
                if (index == -1) {
                    return false;
                } else {
                    val.deleteCharAt(index);
                }
            }}
        if (val.length() > 0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        String sTrue = "(){}[]";
        String sFalse = "(){}[])";
        System.out.println(validate(sTrue));
        System.out.println(validate(sFalse));

    }
}