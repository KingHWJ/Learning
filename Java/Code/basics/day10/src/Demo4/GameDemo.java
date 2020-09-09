package Demo4;

public class GameDemo {
    public static void main(String[] args) {
        // 英雄类
        Hero hero = new Hero();
        hero.setName("贾克斯");
        hero.setAge(50);

        // 武器类
        Weapon weapon = new Weapon();
        weapon.setCode("无尽之刃");

        // 设置技能 匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu");
            }
        };

        hero.setSkill(skill);
        // 为英雄配武器
        hero.setWeapon(weapon);

        hero.show();

        // 攻击
        hero.attack();

        // 使用匿名对象和匿名内部类
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("pia~pia~pia");
            }
        });
        hero.attack();
    }
}
