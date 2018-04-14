package builder;

public class TextBuilder  extends Builder{
    private StringBuffer buffer = new StringBuffer();
    @Override
    public void makeTitle(String title) {
        buffer.append("===================================\n");
        buffer.append("【"+title+"】\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String string) {
        buffer.append("#"+string+"\n");
        buffer.append("\n");
    }

    @Override
    public void makeItem(String[] item) {
        for (String s:item
             ) {
            buffer.append("    ·"+s+"\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("===========================");
    }
    public String getRes(){
        return buffer.toString();
    }
}
