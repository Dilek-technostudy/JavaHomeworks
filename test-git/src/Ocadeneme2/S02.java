public class S02 {
    public static void main(String[] args) {
        int iVar=100;
        float fVar=100.100f;
        char c='a';
        double dVar=123;
        iVar= (int) fVar;
        fVar=iVar;
        dVar=iVar;
        fVar= (float) dVar;
        dVar=iVar;
        iVar= (int) dVar;
        iVar=c;
        dVar=c;
        System.out.println(dVar);
      //  System.out.println(iVar);
    }
}
