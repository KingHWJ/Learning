package DataStructures.Array;

public class BasicArray {
    // 定义一个数组
    private int[] intArray;
    // 定义数组的实际有效长度
    private int elems;
    // 定义数组的最大长度
    private int length;

    public BasicArray() {
        elems = 0;
        length = 5;
        intArray = new int[length];
    }

    // 指定数组长度大小
    public BasicArray(int length){
        elems = 0;
        this.length = length;
        intArray = new int[length];
    }

    // 获取数组有效长度
    public int getSize(){
        return elems;
    }
    
    // 显示数组元素
    public void display(){
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 增：插入新的数据
    public boolean add(int num){
        if(elems > length){
            System.out.println("超出数组最大长度");
            return false;
        }else{
            intArray[elems] = num;
            elems++;
            return true;
        }
    }

    // 删：删除元素
    public boolean delete(int num){
        if(!contain(num)){
            System.out.println("删除失败，该数据不在数组中");
           return false;
        }else{
            int i;
            for(i = find(num);i<elems-1;i++){
                intArray[i] = intArray[i+1];
            }
            intArray[elems-1] = 0;
            elems--;
        }
        return true;
    }

    // 改：修改元素
    public boolean update(int oldValue,int newValue){
        int i = find(oldValue);
        if(i == -1){
            System.out.println("修改失败，该数据不在数组中");
            return false;
        }
        intArray[i] = newValue;
        return true;
    }

    // 查：查找某个数据项是否在数组中
    public boolean contain(int num){
        for (int i : intArray) {
            if(i == num){
                return true;
            }
        }
        return false;
    }

    // 查：查找某个数据项第一次出现的索引
    public int find(int num){
        int i;
        for (i = 0; i < elems; i++) {
            if(intArray[i] == num){
                break;
            }
        }
        if(i == elems){
            return -1;
        }
        return i;
    }

    // 查：根据下标获取到具体的值
    public int get(int i){
        if(i < 0 || i >= elems){
            System.out.println("超出最大索引范围");
        }
        return intArray[i];
    }

    public static void main(String[] args) {
        BasicArray oneArray = new BasicArray();
        oneArray.add(10);
        oneArray.add(10);
        oneArray.add(3);
        oneArray.add(1);
        oneArray.add(7);
        System.out.println(oneArray.get(1));
        oneArray.display();
        System.out.println(oneArray.contain(3));
        System.out.println(oneArray.delete(7));
        oneArray.display();
        System.out.println(oneArray.getSize());
        System.out.println(oneArray.update(10,20));
        oneArray.display();
//
//        oneArray.add(20);
//        System.out.println(oneArray.getSize());
//        System.out.println(oneArray.contain(10));
//        System.out.println(oneArray.contain(1));
//        System.out.println(oneArray.find(1));
//        System.out.println(oneArray.find(20));
    }
}
