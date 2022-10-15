package Tree_family;

public class TextDocument {
    public static final String add = null;
    StringBuilder sb;
    public TextDocument() {
        sb = new StringBuilder();
    }

    public TextDocument(String data) {
        this();
        addAllText(data);        
    }

    public void addAllText(Object object){
        sb.append(object + "\n");
    }

    public void addAllLines(String[] lines){
        for (String line : lines) {
            addAllText(line);
            
        }
    }
    
    public String getData(){
        return sb.toString();
    }

    public void addAllText(Human dad) {
    }

}
