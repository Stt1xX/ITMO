import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {

    public Tackle() {super(Type.NORMAL, 40, 100);}

    @Override
    protected String describe() {
        return "пытается закутать противника в кокон";
    }
}


