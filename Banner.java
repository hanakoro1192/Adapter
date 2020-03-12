//このクラスは予め提供されているクラスとする
public class Banner{
    private String string; //フィールドの設定

    //コンストラクタの設定
    public Banner(String string){
        this.string = string;
    }

    public void showWithParen(){ //ここの処炉は他のフォルダで記入する
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}