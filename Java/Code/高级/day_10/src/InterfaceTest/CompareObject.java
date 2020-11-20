package InterfaceTest;

// 实现两个对象比较
interface CompareObject {
    // 若返回值为0 ，代表相等；若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}

class Circle{
    private double redius;

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }
}

class ComparableCircle extends Circle implements CompareObject{

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            // return (int) (this.getRedius() - c.getRedius()); double  -->  int 会造成精度丢失

            if(this.getRedius() > c.getRedius()){
                return 1;
            }else if(this.getRedius() == c.getRedius()){
                return 0;
            }else{
                return -1;
            }
        }else{
            return 0;
        }
    }
}