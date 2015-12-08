
/**
 * Write a description of class OverridingClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Super_class{
    int test(int num){
        return num;
    }
}
    class Sub_class extends Super_class{
        int test(int num){
            return 100+num;
        }
    }
public class OverridingClass
{
    public static void main(String[]args){
    Super_class obj= new Super_class();
    System.out.print(obj.test(200));
}
}
