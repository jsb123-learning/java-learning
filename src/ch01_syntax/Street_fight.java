public class Street_fight {
    public static void main(String[] args) {
        /*
        我方：叉子            对方：长手
        攻击:220              攻击:210
        防御:100              防御:90
        血量:1000             血量:1000
        技能加成:1.2          技能加成:1.3
        技能伤害=攻击*技能加成-防御
        普攻伤害=攻击-防御
        计算
        我方第一次进行普通攻击,造成多少伤害,对方还剩多少血量
        对方第一次技能攻击,造成多少上海,我方还剩多血量
         */

        //定义我方变量
        int my_attack = 220;
        int my_defense = 100;
        int my_hp = 1000;
        double my_skill_damage = 1.2;
        //定义对方变量
        int enemy_attack = 210;
        int enemy_defense = 90;
        int enemy_hp = 1000;
        double enemy_skill_damage = 1.3;
        //我方第一次进行普通攻击造成多少伤害,对方剩多少血量
        int my_attack_damage = my_attack - enemy_defense;
        enemy_hp = enemy_hp - my_attack_damage;
        System.out.println("我方第一次进行普通攻击,造成" + my_attack_damage + "伤害,对方还剩" + enemy_hp + "血量");
        //对方第一次技能攻击造成多少伤害,我方剩多少血量
        int enemy_skill_damage2 = (int)(enemy_attack * enemy_skill_damage - my_defense);
        my_hp = my_hp - enemy_skill_damage2;
        System.out.println("对方第一次技能攻击,造成" + enemy_skill_damage2 + "伤害,我方还剩" + my_hp + "血量");
    }
}
