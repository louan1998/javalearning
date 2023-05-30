package day1;

public class DogHeightComparetor implements Comparetor<Dog>{

    @Override
    public int compara(Dog t1, Dog t2) {
        if (t1.height<t2.height)
            return -1;
        else if (t1.height>t2.height) {
            return 1;
        }
        return 0;
    }
}
