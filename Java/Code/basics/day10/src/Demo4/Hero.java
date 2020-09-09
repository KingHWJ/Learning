package Demo4;

public class Hero {
    private String name;
    private int age;
    private Weapon weapon;
    private Skill skill;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero() {
    }

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("我是：" + name + "年龄：" + age + "我有：" + weapon.getCode());
    }

    public void attack(){
        System.out.println("开始攻击：");
        skill.use();
        System.out.println("结束攻击");
    }
}
