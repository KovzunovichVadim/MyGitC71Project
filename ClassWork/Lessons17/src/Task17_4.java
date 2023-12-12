public class Task17_4 {
    public static void main(String[] args) {
        FuncInterface result = (a,b) ->{
            if (a<b){
                 return a;
            }else if(a>b){
                return b;
            }
            return 0;
        };
        System.out.println(result.getEquals(1,2));
    }
}
