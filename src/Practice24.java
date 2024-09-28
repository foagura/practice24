/* メンバ同士の呼び出しルールの確認練習 */

public class Practice24 {
    int instanceVal;
    static int staticVal;

    void instanceMethodA() {    // インスタンスメンバ同士で呼び出せる
        System.out.println("インスタンス変数の値：" + instanceVal);
    }
    void instanceMethodB() {    // インスタンスメンバからstaticメンバを呼び出せる
        System.out.println("static変数の値：" + staticVal);
    }

    static void staticMethodA() {    // staticメンバ同士で呼び出せる
        System.out.println("static変数の値：" + staticVal);
    }
    static void staticMethodB(Practice24 obj) {    // インスタンス化すれば、staticメンバからでもインスタンスメンバを呼び出せる
        System.out.println("インスタンス変数の値：" + obj.instanceVal);
    }

    public static void main(String[] args){
        Practice24 obj = new Practice24();

        obj.instanceMethodA();
        obj.instanceMethodB();
        staticMethodA();
        staticMethodB(obj);
    }
}
