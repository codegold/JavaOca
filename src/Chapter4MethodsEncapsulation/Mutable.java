package JavaOca.src.Chapter4MethodsEncapsulation;


public class Mutable {

    private StringBuilder builder;

    public Mutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }

    public StringBuilder getBuilder(){
        return new StringBuilder(builder);
    }

    public String getValue(){
        return builder.toString();
    }


    public static void main(String[] args) {
        Mutable mutable = new Mutable(new StringBuilder());
        //System.out.println(mutable.getBuilder().toString());
        mutable.getValue();
    }
}