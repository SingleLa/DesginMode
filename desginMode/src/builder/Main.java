package builder;

public class Main {
    public static void main(String[] args){
      /* if(args.length != 1){
           usage();
           System.exit(0);
       }
       if(args[0].equals("plain")){*/
           TextBuilder textBuilder = new TextBuilder();
           Director director = new Director(textBuilder);
           director.construct();
           String res = textBuilder.getRes();
           System.out.println(res);
      /* }else if(args[0].equals("html")){*/
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director2 = new Director(htmlBuilder);
            director2.construct();
            String res2 = htmlBuilder.getRes();
            System.out.println(res2);
       /* }else{
           usage();
           System.exit(0);
       }*/
    }
    public static  void  usage(){
        System.out.println("Usage : java main plain    编写纯文本文档");
        System.out.println("Usage : java main html    编写html文档");
    }
}
