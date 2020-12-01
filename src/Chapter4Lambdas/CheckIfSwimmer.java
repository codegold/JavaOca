package JavaOca.src.Chapter4Lambdas;

public class CheckIfSwimmer implements CheckTrait {
    @Override
    public boolean test(Animal a) {
        return a.canSwim();
    }
}
