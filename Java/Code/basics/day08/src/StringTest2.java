public class StringTest2 {
    // 将{1,2,3} 转换成 [word1#word2#word3]
    public static void main(String[] args) {

        int[] list1 = {1, 2, 3};

        System.out.println(fromArrayToString(list1));

    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {

            if(i == array.length -1){
                str = str + "word" + array[i] + "]";
            }else{
                str = str + "word" + array[i] + "#";
            }
        }
        return str;
    }
}
