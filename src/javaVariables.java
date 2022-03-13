public class javaVariables {
    static int memberVar = 123;
    public static void main(String[] args) {
        int twoLine;
        twoLine = 2;

        int oneLine = 1;
       // oneLine =4;
        oneLine= twoLine;

        int fromExpression = 2+3;

        final int finalVar = 10;
        int myVar = getInt();
        int myInnerVar= memberVar+20;

        System.out.println(myInnerVar);
    }
    public static int getInt(){
        int methodScope = 22;
        return methodScope;
    }
}
