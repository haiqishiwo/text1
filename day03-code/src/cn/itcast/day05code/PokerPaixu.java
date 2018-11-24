package cn.itcast.day05code;

import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * 定义方法是在参数类表中写的参数名称和你在main方法中创建的变量名称没有掉关系；
 *
 *
 * */
public class PokerPaixu {
    public static void main(String[] args) throws ParseException {
        //1.准备牌
        //1.1创建牌的集合；
        ArrayList<Poker> pokers = new ArrayList<>();


        //造牌
        //1.2创建花色集合
        ArrayList<String> colors = new ArrayList<>();
        colors.add("♦");
        colors.add("♣");
        colors.add("♥");
        colors.add("♠");
        //1.3创建数字集合
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 3; i <= 10; i++) {
            numbers.add(i + "");
        }

        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        numbers.add("2");

        for (int i=0;i<numbers.size();i++){
            for (int j=0;j<colors.size();j++){

                Poker p = new Poker(colors.get(j),numbers.get(i));
                pokers.add(p);

            }

        }

        Poker xiaoWang = new Poker("","小王");
        Poker daWang = new Poker("","大王");

        pokers.add(xiaoWang);
        pokers.add(daWang);




        //洗牌
        Collections.shuffle(pokers);
        //看牌
//        System.out.println(pokers);

        //发牌
        ArrayList<Poker> player1 = new ArrayList<>();
        ArrayList<Poker> player2 = new ArrayList<>();
        ArrayList<Poker> player3 = new ArrayList<>();
        ArrayList<Poker> dipai = new ArrayList<>();

        for (int i = 0; i < pokers.size(); i++) {

            if (i>=51){
                dipai.add(pokers.get(i));
            }else if(i%3==0){
                player1.add(pokers.get(i));
            }else if(i%3==1){
                player2.add(pokers.get(i));
            }else if(i%3==2){
                player3.add(pokers.get(i));
            }

        }

        //看一下玩家的牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);

        //排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);








        Comparator c = new Comparator<Poker>() {
            @Override
            public int compare(Poker o1, Poker o2) {

                return o2.getId()-o1.getId();
            }
        };
        Collections.sort(player1, c);

        Collections.sort(player2, c);

        Collections.sort(player3,c);

        Collections.sort(dipai, c);

        Collections.sort(player1);




        System.out.println("==============================================================================");

        //看一下玩家的牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);

    }
}
