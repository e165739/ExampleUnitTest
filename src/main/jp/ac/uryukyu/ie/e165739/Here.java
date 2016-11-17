package jp.ac.uryukyu.ie.e165739;

public class Here extends LivingThing{
    public Here (String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("勇者%sはその場に倒れてしまった。\n", name);
        }
    }
}
