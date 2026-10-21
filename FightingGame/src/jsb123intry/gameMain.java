package jsb123intry;

import com.sun.nio.sctp.HandlerResult;

import java.beans.beancontext.BeanContext;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;

public class  gameMain {
    public static void run(User user) {
        //开始战斗
       roundAndRound(user);
    }
    public static  void roundAndRound(User user){
        Scanner sc = new Scanner(System.in);
        gameRole gamerole = new gameRole();
        //设置胜利场次；
        int winCount=0;
        //角色初始化；
        gamerole.setName(user.getUsername());
        //初始属性设置，包括后续增张功能；
        setGameRole(gamerole);
        pointSet(gamerole);
        //敌人初始化//创建数组接收初始化数据
        ArrayList<enemyRole> enemyList = new ArrayList<>();
        setEnemyRole(enemyList,winCount);
        double maxhp=gamerole.getHP();
        int whos=0;
        while(gamerole.getHP()>0){
            setEnemyRole(enemyList,whos);//对手属性重置并增加
            System.out.println("============================");
            System.out.println("第"+(whos+1)+"场战斗开始！ 对手："+enemyList.get(whos%4).getName()+enemyList.get(whos%4).getHP());
            theFightStart(gamerole,enemyList.get(whos%4),maxhp);
            //胜利判断
            if(gamerole.getHP()<=0)
                break;
            whos++;
            System.out.println("当前胜利场次："+(whos));
            if((whos)%3==0){
                playerLevelUp(gamerole);
            }
            //询问用户是否继续
            System.out.println("============================");
            System.out.println("继续下一场战斗？输入y开始下一场，其他都是退出：");
            if(!sc.nextLine().equals("y"))
                break;
        }
        //玩家自愿判断
        if(gamerole.getHP()<0) {
            System.out.println("你已阵亡，是否再来一把,输入y开始下一把，其他都是退出：");
            if(sc.nextLine().equals("y")){
                roundAndRound(user);
            }
        }
    }
    public static void theFightStart(gameRole gamerole ,enemyRole enemyrole,double maxhpG){
        Scanner sc = new Scanner(System.in);
        Random r =new Random();
        int turnsCount =1;
        double hurt =0;
        double maxhpE=enemyrole.getHP();
        while(enemyrole.getHP()>0&&gamerole.getHP()>0){
            System.out.println("第"+turnsCount+"回合开始");
            //玩家生命显示
            System.out.print(gamerole.getName());
            theHpWatch(gamerole.getHP(),maxhpG);
            //敌人生命显示
            System.out.print(enemyrole.getName());
            theHpWatch(enemyrole.getHP(),maxhpE);
            //对战开始
            System.out.println("====你的回合====");
            System.out.println("1、普通攻击");
            System.out.println("2、强力一击");
            System.out.println("3、生命汲取");
            System.out.println("选择行动（1-3）：");
            int choice =sc.nextInt();
            hurt=hurtCount(playerSkillList(choice,gamerole), enemyrole.getDEF());
            //敌人buff判断；
            if(enemyrole.isDefending()){
                hurt=hurt/2;
                enemyrole.setDefending(false);
            }
            enemyrole.setHP(enemyrole.getHP()-hurt);
            System.out.println("对"+enemyrole.getName()+"造成了"+hurt+"点伤害");
            //判断对手是否死亡
            if(enemyrole.getHP()<=0)break;
            System.out.println("===="+enemyrole.getName()+"的回合====");
            //对手进行随机攻击
            int echoice= r.nextInt(1,3);
            if(echoice==1){
                hurt=hurtCount(enemyrole.getATK(),gamerole.getDEF());
                gamerole.setHP(gamerole.getHP()-hurt);
                System.out.println(enemyrole.getName()+"对你使用了普通攻击，造成了"+hurt+"点伤害");
            }else {
                hurt=hurtCount(enemyrole.skill(),gamerole.getDEF());
                gamerole.setHP(gamerole.getHP()-hurt);
                System.out.println(enemyrole.getName()+"造成了"+hurt+"点伤害");
                //进行刺客连击判断
                if(enemyrole.isDoubleShot()){
                    hurt=hurtCount(enemyrole.skill(),gamerole.getDEF());
                    gamerole.setHP(gamerole.getHP()-hurt);
                    System.out.println(enemyrole.getName()+"造成了"+hurt+"点伤害");
                    enemyrole.setDefending(false);
                }
            }
        }
        if(gamerole.getHP()>enemyrole.getHP()){
            System.out.println("你击败了"+enemyrole.getName());
            int hpAdd=r.nextInt(20,41);
            gamerole.setHP(gamerole.getHP()+hpAdd);
            System.out.println("战斗结束，你恢复了"+hpAdd+"点生命值");
        }

    }
    public static void theHpWatch(double nowHp,double maxHp){
        int black =(int)(nowHp)/10;
        int max =(int)maxHp/10;
        System.out.print(": [");
        for (int i = 0; i < black; i++) {
            System.out.print("🖤");
        }
        for (int i = 0; i < max- black; i++) {
            System.out.print(" ");
        }
        System.out.println("] "+nowHp+"/"+maxHp);
    }//生命值显示系统
    public static double hurtCount(double atk,double def){
        double hurt=atk-def;
        if(hurt<=1){
            hurt=1;
        }
        return hurt;
    }//伤害计算
    public static void playerLevelUp(gameRole gamerole){
        gamerole.setHP(gamerole.getHP()+30);
        gamerole.setATK(gamerole.getATK()+5);
        gamerole.setDEF(gamerole.getDEF()+3);
    }//玩家属性提升
    public static void enemyLevelup(enemyRole enemyrole){
        enemyrole.setHP(enemyrole.getHP()+10);
        enemyrole.setATK(enemyrole.getATK()+3);
        enemyrole.setDEF(enemyrole.getDEF()+2);
    }//敌人属性提升
    public static void setEnemyRole(ArrayList<enemyRole> enemyList,int wincount) {
        Warrior warrior =new Warrior();
        Assassin assassin =new Assassin();
        Tank tank =new Tank();
        Mage mage= new Mage();
        //清空集合内容；
        enemyList.clear();
        int sum=0;
        sum=10*wincount;
        warrior.setHP(80+sum);
        assassin.setHP(60+sum);
        tank.setHP(120+sum);
        mage.setHP(70+sum);
        sum=3*wincount;
        warrior.setATK(15+sum);
        assassin.setATK(20+sum);
        tank.setATK(10+sum);
        mage.setATK(25+sum);
        sum=2*wincount;
        warrior.setDEF(10+sum);
        assassin.setDEF(5+sum);
        tank.setDEF(20+sum);
        mage.setDEF(8+sum);
        warrior.setName("初级战士");
        assassin.setName("敏捷刺客");
        tank.setName("重装坦克");
        mage.setName("神秘法师");
        enemyList.add(warrior);
        enemyList.add(assassin);
        enemyList.add(tank);
        enemyList.add(mage);
    }
    public static void setGameRole(gameRole gamerole){
        //HP
        gamerole.setHP(100);
        //atk
        gamerole.setATK(10);
        //def
        gamerole.setDEF(0);
    }//角色初始化
    public static  void pointSet(gameRole gamerole){
        System.out.println("你现在有20点技能点");
        int count=20;
        Scanner sc = new Scanner(System.in);
        //循环输入分配点数；
        while(count>=0){
            //生命力分配
            System.out.println("请输入你要分配给生命力的点数：");
            double hp= sc.nextInt();
            while (hp>count){
                System.out.println("技能点不足，请重新输入");
                hp=sc.nextInt();
            }
            gamerole.setHP(gamerole.getHP()+10*hp);
            count-=hp;
            System.out.println("当前你的生命力："+gamerole.getHP());
            System.out.println("还剩余"+count+"点技能点");
            if(count==0)
                break;
            //攻击力分配
            System.out.println("请输入你要分配给攻击力的点数：");
            double atk= sc.nextInt();
            while (atk>count){
                System.out.println("技能点不足，请重新输入");
                atk=sc.nextInt();
            }
            gamerole.setATK(gamerole.getATK()+2*atk);
            count-=atk;
            System.out.println("当前你的攻击力："+gamerole.getATK());
            System.out.println("还剩余"+count+"点技能点");
            if(count==0)
                break;
            //防御力分配
            System.out.println("请输入你要分配给防御力的点数：");
            double def= sc.nextInt();
            while (def>count){
                System.out.println("技能点不足，请重新输入");
                def=sc.nextInt();
            }
            gamerole.setDEF(gamerole.getDEF()+def);
            count-=def;
            System.out.println("当前你的防御力："+gamerole.getDEF());
            System.out.println("还剩余"+count+"点技能点");
            if(count==0){
                System.out.println("角色创建成功");
                System.out.println("初始属性：攻击："+gamerole.getATK()+"防御："+gamerole.getDEF()+"生命："+gamerole.getHP());
                break;
            }

        }
    }//点数分配
    public static  double playerSkillList(int choice,gameRole gamerole){
        double hurt=0;
        switch (choice){
            case 1://普通攻击
                System.out.print("使用普通攻击，");
                hurt= gamerole.getATK();
                break;
            case 2://强力一击
                System.out.print("使用强力一击，扣除10点生命值，");
                gamerole.setHP(gamerole.getHP()-10);
                hurt= gamerole.getATK()*1.8;
                break;
            case 3://生命汲取
                System.out.print("使用生命汲取，扣除10点生命值，");
                gamerole.setHP(gamerole.getHP()-10);
                Random r= new Random();
                int reback=r.nextInt(0,21);
                gamerole.setHP(gamerole.getHP()+reback);
                System.out.println("恢复"+reback+"点生命值，");
                break;
        }
        return hurt;
    }
}
