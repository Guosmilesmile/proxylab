package com.edu.memento;

import java.util.*;

public class Gamer {
	private Memento memento;
    private int money;                          // 所持金
    private List fruits = new ArrayList();      // フルーツ
    private Random random = new Random();       // 乱数発生器
    private static String[] fruitsname = {      // フルーツ名の表
        "リンゴ", "ぶどう", "バナナ", "みかん",
    };
    public Gamer(int money) {                   // コンストラクタ
        this.money = money;
        memento = createMemento();
    }
    public int getMoney() {                     // 現在の所持金を得る
        return money;
    }
    public void bet() {                         // 賭ける…ゲームの進行
        int dice = random.nextInt(6) + 1;           // サイコロを振る
        if (dice == 1) {                            // 1の目…所持金が増える
            money += 100;
            System.out.println("所持金が増えました。");
        } else if (dice == 2) {                     // 2の目…所持金が半分になる
            money /= 2;
            System.out.println("所持金が半分になりました。");
        } else if (dice == 6) {                     // 6の目…フルーツをもらう
            String f = getFruit();
            System.out.println("フルーツ(" + f + ")をもらいました。");
            fruits.add(f);
        } else {                                    // それ以外…何も起きない
            System.out.println("何も起こりませんでした。");
        }
    }
    private Memento createMemento() {                // スナップショットをとる
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String)it.next();
            if (f.startsWith("おいしい")) {         // フルーツはおいしいものだけ保存
                m.addFruit(f);
            }
        }
        return m;
    }
    public  void createnewMemento() {                // スナップショットをとる
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String)it.next();
            if (f.startsWith("おいしい")) {         // フルーツはおいしいものだけ保存
                m.addFruit(f);
            }
        }
        this.memento = m;
    }
    
    public void restoreMemento() {   // アンドゥを行う
        this.money = this.memento.money;
        this.fruits = this.memento.getFruits();
    }
    public String toString() {                      // 文字列表現
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit() {                     // フルーツを1個得る
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "おいしい";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
    
    public boolean getState(){
    	if (this.getMoney() > memento.getMoney())
    		return true;
    	else if (this.getMoney() < memento.getMoney() / 2) {
    		return false;
    	}
    	return false;
    }
    
    protected class Memento {
        int money;                              // ŠŽ‹à
        ArrayList fruits;                       // ƒtƒ‹[ƒc
        public int getMoney() {                 // ŠŽ‹à‚ð“¾‚é(narrow interface)
            return money;
        }
        Memento(int money) {                    // ƒRƒ“ƒXƒgƒ‰ƒNƒ^(wide interface)
            this.money = money;
            this.fruits = new ArrayList();
        }
        void addFruit(String fruit) {           // ƒtƒ‹[ƒc‚ð’Ç‰Á‚·‚é(wide interface)
            fruits.add(fruit);
        }
        List getFruits() {                    // ƒtƒ‹[ƒc‚ð“¾‚é(wide interface)
             return (List)fruits.clone();
        }
    }

}
