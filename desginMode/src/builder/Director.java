package builder;

/**
 * construct是编写文档的方法  construct所用的方法都是 builder中声明的 方法
 */
public class Director {
   private Builder builder;
   public Director(Builder builder){
       this.builder = builder;
   }
   public void construct(){
            builder.makeTitle("Greeting");
            builder.makeString("从早上至下午");
            builder.makeItem(new String[]{
                    "晚上好。",
                    "晚安。",
                    "再见。"
            });
            builder.close();
   }
}
