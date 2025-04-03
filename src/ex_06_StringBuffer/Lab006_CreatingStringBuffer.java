package ex_06_StringBuffer;

public class Lab006_CreatingStringBuffer {
    public static void main(String[] args) {
        // 1 String creation
        StringBuffer sb = new StringBuffer("puja bhute");
        //System.out.println(sb);

        // 2 append()
        //sb.append(" bhute");
        //System.out.println(sb);

        //3 insert()
        //System.out.println(sb.insert(5," bhute"));

        //4 replace()
       // System.out.println(sb.replace(6,11,"java"));

        //5 delete()
//        StringBuffer sb1 = new StringBuffer("hello java");
//        System.out.println(sb1.delete(6,10));

        //6  revers()
//        System.out.println(sb.reverse());

        // 7 capacity
        //System.out.println(sb.capacity());

        // 8 ensureCapacity()
        //sb.ensureCapacity(30);
        //System.out.println(sb.capacity());

        //9.charAt()
        System.out.println(sb.charAt(8));

        //10 setCharAt()
        //sb.setCharAt(1,'a');
//        System.out.println(sb);

        //11 length()
        //System.out.println(sb.length());

        //12 substring()
        //System.out.println(sb.substring(5));

        //13. subString(int start, int end)
        //System.out.println(sb.substring(0,6));

        //14 tostring()
        //System.out.println(sb.toString());

        //15 trimToSize()
        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Hello");
        sb2.trimToSize();
        System.out.println(sb2.capacity());

    }
}
