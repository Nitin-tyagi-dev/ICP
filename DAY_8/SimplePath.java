import java.util.Stack;

public class SimplePath {

    public String makeSimple(String pathName) {
        Stack<String> st = new Stack<>();
        String[] parts = pathName.split("/");

        for (String p : parts) {
            if (p.equals("") || p.equals(".")) {
                
                continue;
            } else if (p.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(p);
            }
        }

        StringBuilder finalPath = new StringBuilder();
        for (String s : st) {
            finalPath.append("/").append(s);
        }

        if (finalPath.length() == 0) {
            return "/";
        }

        return finalPath.toString();
    }

    public static void main(String[] args) {
        SimplePath obj = new SimplePath();
        String path = "/a/./b/../../c/";
        String ans = obj.makeSimple(path);
        System.out.println("After simplifying: " + ans);
    }
}
