public class Body {

    public void method(){
        System.out.println("这是一个外部类方法");
        new Heart().beat();

    }

    public class Heart{
        public void beat(){
            System.out.println("心脏，砰砰跳");
        }

    }

}
