package md_1;

interface ptah {
    void ruhatysya();
    void yisty();
}

class orel implements ptah {
    @Override
    public void ruhatysya() {
        System.out.println("Eagle flies high in the sky.");
    }

    @Override
    public void yisty() {
        System.out.println("Eagle eats prey.");
    }
}

class kachka implements ptah {
    @Override
    public void ruhatysya() {
        System.out.println("Duck swims in the water.");
    }

    @Override
    public void yisty() {
        System.out.println("Duck eats plants and small insects.");
    }
}

public class t16 {
    public static void main(String[] args) {
        ptah[] ptakhy = {
            new orel(),
            new kachka()
        };

        for (ptah p : ptakhy) {
            p.yisty();
            p.ruhatysya();
            System.out.println("----------------------------------------");
        }
    }
}
