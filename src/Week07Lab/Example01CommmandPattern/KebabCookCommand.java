package Week07Lab.Example01CommmandPattern;

public class KebabCookCommand implements Command{
    Kebab kebab;
    KebabCookCommand(Kebab kebab){
        this.kebab = kebab;
    }
    @Override
    public void execute() {
        kebab.cook();
    }
}
