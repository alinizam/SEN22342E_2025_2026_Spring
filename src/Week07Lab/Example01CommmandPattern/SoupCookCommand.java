package Week07Lab.Example01CommmandPattern;

public class SoupCookCommand implements Command{
    Soup soup;
    public SoupCookCommand(Soup soup){
        this.soup = soup;
    }
    @Override
    public void execute() {
        soup.cook();
    }

}
