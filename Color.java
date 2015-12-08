
class Color
{
   String x,y;
   Color(String a,String b){
       x=a;
       y=b;
    }
    Color(){
        x="yellow";
        y="purple";
    }
    
    public static void main (String args[]){
        Color obj1 = new Color("green","orange");
        Color obj2 = new Color();
        System.out.println(obj1.x+obj1.y);
        System.out.println(obj2.x+obj2.y);
    }
}
