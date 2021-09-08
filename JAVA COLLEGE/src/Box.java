public class Box {
    //6 _ 3
    int length;
    int height;
    int width;
    Box(int a,int b,int c){
        length=a;
        height=b;
        width=c;
    }
    public int Volume(){
        return length*height*width;
    }
}
